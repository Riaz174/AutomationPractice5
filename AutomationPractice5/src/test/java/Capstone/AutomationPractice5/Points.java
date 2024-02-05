package Capstone.AutomationPractice5;
import org.testng.annotations.Test;

import Amazon.pages5.HomeOfFacebook;
import Common.Utilities5;

import org.testng.annotations.DataProvider;

public class Points extends Utilities5 {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  home.Username(n);
	  home.Password(s);
	  home.login();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Ali", "abcdef" },
      new Object[] { "Saleem", "ghijk" },
      new Object[] { "Ahmad", "lmnopq" },
    };
  }
}
