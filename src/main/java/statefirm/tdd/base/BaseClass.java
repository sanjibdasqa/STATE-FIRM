package statefirm.tdd.base;



import static statefirm.tdd.util.IConstant.*;


import java.time.Duration;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;
import statefirm.tdd.objects.AddressPage;
import statefirm.tdd.objects.LandingPage;
import statefirm.tdd.util.ReadProperties;

public class BaseClass {
 protected LandingPage landingPage;
 protected AddressPage addressPage;
	protected WebDriver driver;
	ReadProperties envVar  = new ReadProperties();;
	protected Select select;
	protected WebDriverWait wait;

	@BeforeSuite
	public void setupSuite() {
		
	}
   
	@BeforeMethod
	public void setUpDriver() {
		String browser = envVar.getProperty(BROWSER);
		String url = envVar.getProperty(URL);
		//long pageLoadWait = envVar.getNumProperty(PAGELOAD_WAIT);

		initDriver(browser);
		//wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.elementToBeClickable(WebElement));
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
		
		initClasses(driver);
		
	}
	
	private void initClasses(WebDriver driver) {
		landingPage = new LandingPage(driver);
		addressPage = new AddressPage(driver);
		
		
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

	
	@AfterMethod
	public void tearUp() {
		driver.quit();
		
		
	}
}

