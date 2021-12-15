package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='txtPword']  ")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@id='login']  ")).click();
		driver.switchTo().alert().accept();
		
	}

}
