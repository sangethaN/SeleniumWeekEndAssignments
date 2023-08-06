package assignments.week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicate_Lead {

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
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("san");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']"));
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("lbg@123mail.com");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("San's Co");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println(driver.getTitle());
		
		
	}

}
