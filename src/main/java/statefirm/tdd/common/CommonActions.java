package statefirm.tdd.common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import satefirm.tdd.reporting.Logs;

public class CommonActions {

	public static void click(WebElement element) {
		element.click();
		Logs.log(element + "---->has been clicked");

	}

	public static void validate(WebElement element, String expected) {
		String actual = element.getText();
		Logs.log("Validating ----> Actual : ***" + actual + "*** Expected :***" + expected + "***");
		Assert.assertEquals(actual, expected);
	}

	public static void insert(WebElement element, String value) {
		try {
			element.sendKeys(value);
			Logs.log(value + " <--- This value has been passed into ---> " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + " ---> Element Not Found");
			Assert.fail();	
		}
		
	}

	public static void dropDown(WebElement element, String value) {
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		// wait.until(ExpectedConditions.elementToBeClickable(element));
		Select select = new Select(element);
		select.selectByValue(value);
		Logs.log(value + " <--- This value has been passed into ---> " + element);

	}
}
