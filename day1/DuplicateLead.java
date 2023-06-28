package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aaaa");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bbbb");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Cccc");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Dddd");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Dddd");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aaa@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf New");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aaaabb");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		

	}

}
