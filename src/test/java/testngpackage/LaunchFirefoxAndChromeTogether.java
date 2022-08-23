package testngpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Parameters;


//import com.beust.jcommander.Parameter;
//import com.beust.jcommander.Parameters;

public class LaunchFirefoxAndChromeTogether {
	static{
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","D:\\Chromedriver\\geckodriver.exe");
	}
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void loginFFandCHROME(String browser) throws InterruptedException, IOException{
//		Reporter.log(browser, true);
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}

//		driver.get("https://www.cricbuzz.com/");
		driver.get("https://www.facebook.com/");
		WebElement un = driver.findElement(By.name("email"));
		for (int i = 0; i < 10; i++) {
			un.sendKeys("ashish" + i);
			Thread.sleep(2000);
			un.clear();
		}
		driver.close();
	}

}
