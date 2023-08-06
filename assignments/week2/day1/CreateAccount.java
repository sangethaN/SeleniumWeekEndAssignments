package assignments.week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("sandy");
	driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("chennai");
	driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("52");
	driver.findElement(By.xpath("//select[@name='industryEnumId']/option[4]")).click();
	
	WebElement dropdown1 = driver.findElement(By.name("ownershipEnumId"));
	Select dd;
	dd= new Select(dropdown1);
	dd.selectByVisibleText("S-Corporation");
	
	WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
	dd=new Select(dropdown2);
	dd.selectByValue("LEAD_EMPLOYEE");
	
	WebElement dropdown3 = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
	dd=new Select(dropdown3);
	dd.selectByIndex(7);
	
	WebElement dropdown4 = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
	dd=new Select(dropdown4);
	dd.selectByValue("TX");
	
	//driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	
	
	
	
	
}
}
