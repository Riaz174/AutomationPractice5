package Capstone.AutomationPractice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice5\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement sbutton = driver.findElement(By.id("nav-search-submit-button"));
		sbutton.click();
		Thread.sleep(3000);
		WebElement customerservice = driver.findElement(By.linkText("Customer Service"));
		customerservice.click();
		Thread.sleep(3000);
		WebElement deals = driver.findElement(By.partialLinkText("Today's"));
		deals.click();
		Thread.sleep(3000);
		WebElement fieldsOf = driver.findElement(By.name("field-keywords"));
		fieldsOf.sendKeys("Copmuter");
	}

}
