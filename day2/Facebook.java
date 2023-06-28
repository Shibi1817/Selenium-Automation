package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Shibi");
        driver.findElement(By.name("lastname")).sendKeys("Shibi");
        driver.findElement(By.name("reg_email__")).sendKeys("8500567504");
        driver.findElement(By.id("password_step_input")).sendKeys("8500567504");
        WebElement source = driver.findElement(By.id("day"));
        Select day=new Select(source);
        day.selectByValue("6");
        WebElement source1 = driver.findElement(By.id("month"));
        Select month=new Select(source1);
        month.selectByVisibleText("Dec");
        WebElement source2 = driver.findElement(By.id("year"));
        Select year=new Select(source2);
        year.selectByValue("1994");
        driver.findElement(By.xpath("//input[@value='2']")).click();      
        driver.close();
	}

}
