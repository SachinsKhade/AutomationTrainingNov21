package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://primusbank.qedgetech.com/");
		Select branch_List =new Select(driver.findElement(By.xpath("//select[@id='drlist']")));
		branch_List.selectByVisibleText("QEdgeTech");
		List<WebElement> list=branch_List.getOptions();
		System.out.println(list.size()-1);
}
}
