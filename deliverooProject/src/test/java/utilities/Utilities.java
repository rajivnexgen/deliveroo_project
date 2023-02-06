package utilities;

import org.openqa.selenium.By;

import deliveroo.TestBase;

public class  Utilities extends TestBase {
	public static void acceptCookies() {
		driver.findElement(By.xpath("//button[contains(text(),'Accept All Cookies')]")).click();
	}
}
