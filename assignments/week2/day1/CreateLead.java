package assignments.week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sandy's Co");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sangeetha");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
	Select dd;
	WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
	dd=new Select(dropdown1);
	dd.selectByValue("LEAD_EMPLOYEE");
	WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
	dd=new Select(dropdown2);
	dd.selectByVisibleText("Pay Per Click Advertising");
	WebElement dropdown3 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
	dd=new Select(dropdown3);
	dd.selectByIndex(5);
	//selectByIndex("6");
	WebElement dropdown4 = driver.findElement(By.xpath("//select[@name='generalCountryGeoId']"));
	dd=new Select(dropdown4);
	dd.selectByValue("IND");
	driver.findElement(By.name("submitButton")).click();
	System.out.println(driver.getTitle());
}
}
