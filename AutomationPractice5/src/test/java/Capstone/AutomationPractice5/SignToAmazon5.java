package Capstone.AutomationPractice5;

import org.testng.annotations.Test;

import Amazon.pages5.Home5;
import Amazon.pages5.Sign;
import Common.Utilities5;
import facebook.pages.Home;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignToAmazon5 extends Utilities5 {
	
  @Test
  public void f() {
	Home5 home = new Home5(driver);
	home.signInClick();
	Sign sign5 = new Sign(driver);
	sign5.emailsendkeys();
	sign5.continuebuttonClick();
	
  }
    
  }
