package Capstone.AutomationPractice5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGOfAnnotation5 {
  @Test
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method annotration");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class annotaion");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class annotaion");
  }
  @Test
  public void f2() {
	  System.out.println("This is second test annotation");
  }


  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test annotaion");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test annotaion");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite annotaion");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite annotaion");
  }

}
