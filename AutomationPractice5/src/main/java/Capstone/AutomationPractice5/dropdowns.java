package Capstone.AutomationPractice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice5\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement createaccount = driver.findElement(By.xpath("//*[text()='Create new account']"));
		createaccount.click();
		Thread.sleep(3000);
		WebElement dayofbirth = driver.findElement(By.name("birthday_day"));
		Select ob = new Select(dayofbirth);
		ob.selectByIndex(9);
		Thread.sleep(3000);
		WebElement monthofbirth = driver.findElement(By.name("birthday_month"));
		Select om = new Select(monthofbirth);
		om.selectByValue("7");
		Thread.sleep(3000);
		WebElement yearofbirth = driver.findElement(By.name("birthday_year"));
		Select oy = new Select(yearofbirth);
		Thread.sleep(3000);
		WebElement genderfield = driver.findElement(By.xpath("(//*[@name='sex'])[3]"));
		genderfield.click();
		oy.selectByVisibleText("2010");
		

	}

}
