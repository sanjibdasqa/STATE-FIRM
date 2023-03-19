package statefirm.tdd.objects;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import statefirm.tdd.common.CommonActions;

public class AddressPage {
	WebDriver driver;

	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(tagName ="h1")
	WebElement addresspagetitle;
	
	@FindBy(xpath  = "(//input[@class='-oneX-textfield--floating-input'])[1]")
	WebElement firstName;
	
	@FindBy(xpath = "(//input[@class='-oneX-textfield--floating-input'])[3]")
	WebElement lastName;
	
	@FindBy(xpath   = "(//input[@class='-oneX-textfield--floating-input'])[4]")
	WebElement address;
	
	@FindBy(css  = "input.-oneX-textfield--floating-input.pac-target-input")
	WebElement homeownerStatus;
	
	//@FindBy(id = "nyLegacyCloseLinkId")
	//WebElement popUp;
	
	@FindBy(xpath = "//input[@class='-oneX-textfield__input']")
	WebElement DateofBirth;
	
	@FindBy(xpath = "//label[@for='termsIDCheckbox']")
	WebElement ClickAgreement;
	
	@FindBy(id = "btnContinue")
	WebElement next;

	@FindBy(xpath = "//title[text()='State Farm Insurance Companies | Like a Good Neighbor  | State Farm®']")
	WebElement validateTitlePet;
	
	@FindBy(xpath = "//input[@id='sfx_firstName_input']")
	WebElement firstNamePet;
	
	@FindBy(xpath = "//input[@id='sfx_lastName_input']")
	WebElement lastNamePet;
	
	@FindBy(xpath   = "(//input[@id='sfx_userAddress.streetAddress_input']")
	WebElement addressPet;
	
	@FindBy(xpath   = "//button[@name='continue']")
	WebElement continueBtn;
	
	
	
	

	
	//public void title(String expectedTitle) {
	//	CommonActions.validate(addressPageTitle, expectedTitle);
	
	
	public void pagetitle(String Expectedtitle) {
		CommonActions.validate(addresspagetitle, Expectedtitle);
		
	}
	

	public void firstNameInput(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Sanjib'", firstName);
	//CommonActions.inputElement(firstName, "Sanjib");
		
	}

	public void lastNameInput( WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Das'", lastName);
		//CommonActions.inputElement(lastName, value);
	}

	public void addressInput( WebDriver driver) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].value='1385 little john way'", address);
		//CommonActions.inputElement(address, value);
	}
	
	public void dateOfBirthInput( WebDriver driver) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].value='12-12-1988'", DateofBirth);
		//CommonActions.inputElement(address, value);
	}
	
	public void clickAgreement( WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(ClickAgreement));
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click()", ClickAgreement);
		//ClickAgreement.click();
		//System.out.println("Is selected: "+ClickAgreement.isSelected());
	}
		
		public void clickNext( WebDriver driver) {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", next);
		
	}
	public void validateTitlePet(String expectedTitle) {
		CommonActions.validate(validateTitlePet, expectedTitle);
	}
	
	public void firstNameInputPet(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Sanjib'", firstNamePet);
	}
	
	public void lastNameInputPet(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Das'", lastNamePet);
	}
	
	
	public void addressInputPet(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='1389 Little John Way'", addressPet);
	}
	
	public void clickContinueBtn(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", continueBtn);
	}
	
	
	
	
	

	//public void dropDownBtn(WebDriver driver ) {
	//	CommonActions.click(popUp);
	//	CommonActions.dropDown(homeownerStatus, "OWN",driver); 
	//}*/


/*
 * public void dateof birth input(String ) {
 * CommonActions.sendkeys("10/10/1990");}
 * 
 * public void clickagreement (String ) { CommonActions.click("select method");}
 * 
 * public void clickastartabuttont (String ) {
 * CommonActions.click("select method");
 */
}
