package Capstone.AutomationPractice5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers5 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice5\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
	 String windowOfHandle = driver.getWindowHandle();
	 System.out.println(windowOfHandle);
	 Thread.sleep(3000);
	 String currenturl = driver.getCurrentUrl();
	 System.out.println(currenturl);
	 Thread.sleep(3000);
	 driver.close();
			}

}
