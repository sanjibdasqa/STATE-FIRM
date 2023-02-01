package statefirm.tdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import statefirm.tdd.common.CommonActions;

public class LandingPage {

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(tagName = "p")
	WebElement landingPageTitle;
	@FindBy(xpath = "//input[@id='quote-main-zip-code-input']")
	WebElement zipCodeBtn;
	@FindBy(id = "quote-main-zip-btn")
	WebElement startAQuoteBtn;

	public void validateLandingPageTitle(String expectedTitle) {
		CommonActions.validate(landingPageTitle, expectedTitle);

	}

	public void inputZipCodeBtn() {
		CommonActions.validate(zipCodeBtn, "11230");
	}

	public void clickStartAQuoteBtn() {
		CommonActions.click(startAQuoteBtn);
	}

}
