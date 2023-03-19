package statefirm.tdd.test.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import satefirm.tdd.reporting.Logs;
import statefirm.tdd.base.BaseClass;
import statefirm.tdd.objects.AddressPage;

public class AutoQuoteTest extends BaseClass {
	
	@Test(enabled = true, groups= "auto")
	public void getAQuoteTest() throws InterruptedException {
		landingPage.validateLandingPageTitle("Create an affordable price, just for you" );
		landingPage. inputZipCodeBtn("30340");
		landingPage. clickStartAQuoteBtn();
		//addressPage.dropDownBtn(driver);
		Thread.sleep(7000);
		}
	
	
	
	@Test(enabled = false, groups = "auto")
		public void AddressPageTest() {
	    landingPage.validateLandingPageTitle("Create an affordable price, just for you" );
		landingPage. inputZipCodeBtn("30340");
		landingPage. clickStartAQuoteBtn();
		addressPage.pagetitle("Trust us. This won't take long.");
		addressPage.firstNameInput(driver);
		addressPage.lastNameInput(driver);
		addressPage.addressInput(driver);
		addressPage.dateOfBirthInput(driver);
		addressPage.clickAgreement(driver);
	
	}
	
}
	
	

	