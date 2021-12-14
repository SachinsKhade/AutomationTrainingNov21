package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOperations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		
		Select dlist=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		dlist.selectByVisibleText("24");
		List<WebElement> allDays=dlist.getOptions();
		System.out.println(allDays.size()-1);
		for(int i=1;i<allDays.size();i++)
			
		{
			System.out.println(allDays.get(i).getText());
		}
		
		
		WebElement monthlist=driver.findElement(By.xpath("//select[@id='month']"));
		Select month_list= new Select(monthlist);
		month_list.selectByVisibleText("Jan");
		
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByIndex(7);
		
}
}