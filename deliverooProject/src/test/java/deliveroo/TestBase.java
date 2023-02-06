package deliveroo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static void launchBrowser() throws IOException {
		Properties configProp = new Properties();
		FileInputStream configPropFile= new FileInputStream("resources\\config.properties");
		configProp.load(configPropFile);
		String Browser = configProp.getProperty("Browser");
		
		if(Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\software\\java software\\selenium\\chrome_driver\\chromedriver109.exe");
			driver = new ChromeDriver();
		}
		else if(Browser.equals("edge")) {
			System.out.println("Microsoft edge will be open");
		}
		
		driver.get("https://deliveroo.co.uk/");
		driver.manage().window().maximize();
	}
}
