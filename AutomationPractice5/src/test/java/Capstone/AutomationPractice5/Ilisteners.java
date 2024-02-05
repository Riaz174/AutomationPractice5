package Capstone.AutomationPractice5;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.Utilities5;



public class Ilisteners extends Utilities5 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utilities5)result.getInstance()).driver;
		Date is = new Date();
		 System.out.println(is);
		 String sd = is.toString().replace(" ", "_").replace(":","_");
		 System.out.println(sd);
		 File ks = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileHandler.copy(ks, new File("C:\\Users\\riaz_\\git\\repository10\\AutomationPractice5\\Pictures\\Pass\\"+sd+"pictureofwebsite.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		Date is = new Date();
		 System.out.println(is);
		 String sd = is.toString().replace(" ", "_").replace(":","_");
		 System.out.println(sd);
		 File ks = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileHandler.copy(ks, new File("C:\\Users\\riaz_\\git\\repository10\\AutomationPractice5\\Pictures\\Fail\\"+sd+"pictureofwebsite.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	

}


