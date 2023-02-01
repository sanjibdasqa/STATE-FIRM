package statefirm.tdd.base;

import java.net.URL;
import java.security.PublicKey;

import static statefirm.tdd.util.IConstant.*;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.google.common.base.CaseFormat;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;
import statefirm.tdd.util.ReadProperties;

public class BaseClass {

	protected WebDriver driver;
	ReadProperties envVar;

	@BeforeSuite
	public void setupSuite() {
		envVar = new ReadProperties();
	}

	@BeforeMethod
	public void setUpDriver() {
		String browser = envVar.getProperty(BROWSER);
		String url = envVar.getProperty(URL);
		long pageLoadWait = envVar.getNumProperty(PAGELOAD_WAIT);

		initDriver(browser);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
	}

	private void initDriver(String driverName) {
		switch (driverName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;

		case EDGE:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;

		}
	}

	/*
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.manage().deleteAllCookies(); driver.get("https://www.statefarm.com/");
	 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); homepage =
	 * new Homepage(driver);
	 * 
	 */

	@AfterMethod
	public void tearUp() {

	}

}
