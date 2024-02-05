package Amazon.pages5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	public WebDriver driver;
	@FindBy(id = "ap_email")WebElement email;
	@FindBy(id = "continue")WebElement Continue;
	public Sign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void emailsendkeys() {
		email.sendKeys("john@gmail.com");
	}
	public void continuebuttonClick() {
		Continue.click();
	}

}
