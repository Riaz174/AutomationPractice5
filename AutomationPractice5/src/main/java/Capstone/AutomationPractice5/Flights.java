package Capstone.AutomationPractice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flights {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice5\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement flights = driver.findElement(By.xpath("//*[@aria-controls='search_form_product_selector_flights']"));
		flights.click();
		Thread.sleep(6000);
		WebElement dates = driver.findElement(By.name("EGDSDateRange-date-selector-trigger"));
		dates.click();
//		WebDriverWait sk = new WebDriverWait(driver, 10);
//		sk.until(ExpectedConditions.elementToBeClickable(dates));
		Thread.sleep(6000);
		WebElement depart = driver.findElement(By.xpath("//*[@aria-label='Thursday, January 25, 2024']"));
		depart.click();
//		WebDriverWait sd = new WebDriverWait(driver, 10);
//		sk.until(ExpectedConditions.elementToBeClickable(depart));
		Thread.sleep(6000);
		WebElement arrival = driver.findElement(By.xpath("//*[@aria-label='Friday, February 9, 2024']"));
		arrival.click();
//		WebDriverWait sa = new WebDriverWait(driver, 10);
//		sa.until(ExpectedConditions.elementToBeClickable(arrival));
		

	}

}
