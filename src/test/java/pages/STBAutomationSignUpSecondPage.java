package pages;

import java.awt.AWTException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pom.STBAutomationSignUpSecondPOM;
import utilities.LocalHelper;

public class STBAutomationSignUpSecondPage extends STBAutomationSignUpSecondPOM {
	protected static final Logger logger = LoggerFactory.getLogger(STBAutomationSignUpSecondPage.class);

	private final LocalHelper localHelper = new LocalHelper();

	private final WebDriver driver;

	public  STBAutomationSignUpSecondPage(WebDriver driver) {
		this.driver=driver;
	}
	 public boolean CheckMTOSignupMTONameBox() {
		 localHelper.jsExecutorHighlight(mtoNameBox, driver);
		 return driver.findElement(mtoNameBox).isEnabled();
	 }
	 public boolean CheckMTOSignupCountryBox() {
		 localHelper.jsExecutorHighlight(signUpCountry, driver);
		 return driver.findElement(signUpCountry).isEnabled();
	 }
	 public boolean CheckMTOSignupProvince() {
		 localHelper.jsExecutorHighlight(signUpProvince, driver);
		 return driver.findElement(signUpProvince).isEnabled();
	 }
	 public boolean CheckMTOSignupTimeZoneBox() {
		 localHelper.jsExecutorHighlight(signUpTimezone, driver);
		 return driver.findElement(signUpTimezone).isEnabled();
	 }
	 public boolean CheckMTOSignupAddress() {
		 localHelper.jsExecutorHighlight(signUpAddress, driver);
		 return driver.findElement(signUpAddress).isEnabled();
	 }
	 public boolean CheckMTOSignupCityBox() {
		 localHelper.jsExecutorHighlight(cityDropDown, driver);
		 return driver.findElement(cityDropDown).isEnabled();
	 }
	 public boolean CheckMTOSignupPostalCodeBox() {
		 localHelper.jsExecutorHighlight(postalCodeBox, driver);
		 return driver.findElement(postalCodeBox).isEnabled();
	 }
	 public boolean CheckMTOSignupPhoneBox() {
		 localHelper.jsExecutorHighlight(phoneNoBox, driver);
		 return driver.findElement(phoneNoBox).isEnabled();
	 }
	 public void enterMtoName(String mtoname) {
			localHelper.jsExecutorHighlight(mtoNameBox, driver);
			localHelper.sendKeys(mtoNameBox, mtoname,driver);
			logger.info("MTO Name passed in the MTO Name box");
		}
	 public void selectCountry() {
		 localHelper.clickElement(countryDropdown,driver);
		 localHelper.clickElement(country,driver);
		 logger.info("Country is selected");
	 }
	 public void selectProvince() {
		 localHelper.clickElement(provinceDropdown,driver);
		 localHelper.clickElement(province,driver);
		 logger.info("Province is selected");
	 }
	 
	 public void selectCity() {
		 localHelper.clickElement(cityDropDown,driver);
		 localHelper.clickElement(cityName,driver);
		 logger.info("City is selected");
	 }
	 public void acceptTermsAndConditions() {
		 localHelper.clickElement(acceptTerms,driver);
		 logger.info("AcceptTerms checkbox clicked");
	 }
		public void enterPostalCode(String postalcode) {
			localHelper.jsExecutorHighlight(postalCodeBox, driver);
			localHelper.sendKeys(postalCodeBox,postalcode, driver);
			logger.info("Postal code passed in the  inputbox");
		}
		public void enterPhoneNum(String phonenum) {
			localHelper.jsExecutorHighlight(phoneNoBox, driver);
			localHelper.sendKeys(phoneNoBox,phonenum, driver);
			logger.info("Phonenum code passed in the  inputbox");
		}
		 public void selectTimezone() {
			 localHelper.clickElement(signUpTimezone,driver);
			 localHelper.clickElement(timeZoneValue,driver);
			 logger.info("TimeZone  is selected");
		 }
		 public void enterAddress(String address) throws AWTException, InterruptedException {
				//localHelper.jsExecutorHighlight(signUpAddress, driver);
				localHelper.clearElement(signUpAddress,driver);
				localHelper.sendKeys(signUpAddress,address, driver);
				logger.info("Address passed in the  inputbox");
			}
		 
		public void clickAcceptTermsAndCondition() {
			try {
				localHelper.jsExecutorHighlight(acceptTermsTickBox, driver);
				localHelper.clickElement(acceptTermsTickBox, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(acceptTermsTickBox, driver);
			}
			 logger.info("AcceptTerms Tickbox clicked");
		}
		public void clickSignUpButton() {
			try {
				localHelper.jsExecutorHighlight(signUpButton, driver);
				localHelper.clickElement(signUpButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(signUpButton, driver);
			}
			 logger.info("Signup button is clicked");
		}
		public void clickFinalSignUpButton() {
			try {
				localHelper.jsExecutorHighlight(signUpButton, driver);
				localHelper.clickElement(signUpButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(signUpButton, driver);
			}	
			 logger.info("Final signup button is clicked");
		}
		public String checkSuccessMessage() {
			return localHelper.getText(checkMessage,driver);
		}

}
