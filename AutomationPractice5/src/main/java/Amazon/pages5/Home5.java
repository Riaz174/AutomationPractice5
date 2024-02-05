package Amazon.pages5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home5 {
	public WebDriver driver;
	@FindBy(id = "email") WebElement sigIn;
	public Home5(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void signInClick() {
		sigIn.sendKeys("doe@gmail.com");
	}

}
