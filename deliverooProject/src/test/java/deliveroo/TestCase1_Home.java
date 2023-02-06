package deliveroo;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Home;
import utilities.Utilities;

public class TestCase1_Home extends TestBase {
@Test
	public  void startTest() throws IOException, InterruptedException {
		
		TestBase.launchBrowser();
		Thread.sleep(1000);
		Home hp = new Home(driver);
		Utilities.acceptCookies();
		hp.enterProduct();
		Thread.sleep(3000);
		hp.dropDownClick();
		Thread.sleep(500);
		hp.searchClick();
	}
}
