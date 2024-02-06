package Capstone.AutomationPractice5;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Amazon.pages5.HomeOfFacebook;
import Common.Utilities5;
import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class TextOfVerification5 extends Utilities5 {
	
  
@Test(priority = 2, dependsOnMethods = "signin")
  public void f() {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  String tx = home.VerificationOfText();
	 System.out.println(tx);
	 // Assert.assertEquals(tx, "Connect with friends and the world around you on Facebook.");
	  SoftAssert st = new SoftAssert();
	 
	  st.assertEquals(tx, "Connect with friends and the world around you on Facebook.");
	  System.out.println("This is after assertion");
	  st.assertAll();
	  }
 	 @Test(priority = 1)
  public void signin() {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  home.Username("id");
	  home.Password("id");
	  home.login();
	  //New Repository
  }
  	  }


