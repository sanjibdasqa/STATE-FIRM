package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="quote-main-zip-btn")
	WebElement startAQuote;

	
	
	public void clickstartAQuoteButton() {
		startAQuote.click();
	}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

