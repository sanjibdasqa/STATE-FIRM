package statefirm.tdd.test.pet;

import org.testng.annotations.Test;

import statefirm.tdd.base.BaseClass;

public class PetQuoteTest extends BaseClass {
	

	@Test(enabled = false, priority = 1, groups = "pet")
	public void getAQuoteTest() throws InterruptedException {
		landingPage.validateLandingPageTitle("Create an affordable price, just for you" );
		landingPage.selectPetInsurance();
		landingPage. inputZipCodeBtn("30340");
		landingPage. clickStartAQuoteBtn();
		//addressPage.dropDownBtn(driver);
		Thread.sleep(7000);
		}
	
	
	
	@Test(enabled = true, priority = 2, groups = "pet")
		public void AddressPageTest() throws InterruptedException  {
	    //landingPage.validateLandingPageTitle("Create an affordable price, just for you" );
	    landingPage.selectPetInsurance();
	    Thread.sleep(7000);
	/*	landingPage. inputZipCodeBtn();
		landingPage. clickStartAQuoteBtn();
		addressPage.validateTitlePet("State Farm Insurance Companies | Like a Good Neighbor  | State Farm®");
		addressPage.firstNameInputPet(driver);
		addressPage.lastNameInputPet(driver);
		addressPage.addressInputPet(driver);
		addressPage.clickContinueBtn(driver); */


		
	
	


	
	}

}
