package statefirm.tdd.objects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import statefirm.tdd.common.CommonActions;
import statefirm.tdd.common.CommonActions.*;

public class LandingPage {

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath  = "//p[text()='Create an affordable price, just for you']")
	WebElement landingPageTitle;
	
	@FindBy(xpath = "//select[@id='popDropdown']")
	WebElement petIns;
	
	@FindBy(xpath = "//input[@id='quote-main-zip-code-input']")
	WebElement zipCodeBtn;
	
	@FindBy(id = "quote-main-zip-btn")
	WebElement startAQuoteBtn;

	public void validateLandingPageTitle(String expectedTitle) {
		CommonActions.validate(landingPageTitle, expectedTitle);

	}
	
	public void selectPetInsurance() {
	 CommonActions.dropDown(petIns, "PetInsurance");
	}	


	public void inputZipCodeBtn(String zip) {
		CommonActions.insert(zipCodeBtn, zip);
	}

	public void clickStartAQuoteBtn() {
		CommonActions.click(startAQuoteBtn);
	}

}
