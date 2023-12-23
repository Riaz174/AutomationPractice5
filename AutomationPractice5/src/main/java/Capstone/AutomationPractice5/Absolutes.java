package Capstone.AutomationPractice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice5\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		driver.manage().window().maximize();
		//WebElement searchto = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
		//searchto.click();
		Thread.sleep(3000);
		WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		emailField.sendKeys("john@gmail.com");
		Thread.sleep(3000);
		WebElement passwordField = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		passwordField.sendKeys("abcdef");
		Thread.sleep(3000);
		WebElement loginField = driver.findElement(By.xpath("//button[@type='submit']"));
		loginField.click();
		Thread.sleep(3000);
		WebElement forgotpField = driver.findElement(By.xpath("//*[text()='Forgotten password?']"));
		forgotpField.click();
		

	}

}
