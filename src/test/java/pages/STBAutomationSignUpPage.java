package pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pom.STBAutomationSignInPOM;
import pom.STBAutomationSignUpPOM;
import utilities.LocalHelper;

public class STBAutomationSignUpPage extends STBAutomationSignUpPOM {
		protected static final Logger logger = LoggerFactory.getLogger(STBAutomationSignUpPage.class);

		private final LocalHelper localHelper = new LocalHelper();

		private final WebDriver driver;

		public  STBAutomationSignUpPage(WebDriver driver) {
			this.driver=driver;
		}
		 public boolean CheckMTOSignupFirstNameBox() {
			 localHelper.jsExecutorHighlight(firstNameBox, driver);
			 return driver.findElement(firstNameBox).isEnabled();
		 }
		 public boolean CheckMTOSignupLastNameBox() {
			 localHelper.jsExecutorHighlight(lastNameBox, driver);
			 return driver.findElement(lastNameBox).isEnabled();
		 }
		 public boolean CheckMTOSignupEmailBox() {
			 localHelper.jsExecutorHighlight(emailBox, driver);
			 return driver.findElement(emailBox).isEnabled();
		 }
		 public boolean CheckMTOSignupDOBBox() {
			 localHelper.jsExecutorHighlight(dobBox, driver);
			 return driver.findElement(dobBox).isEnabled();
		 }
		 public boolean CheckMTOSignupNextbutton() {
			 localHelper.jsExecutorHighlight(nextButton, driver);
			 return driver.findElement(nextButton).isEnabled();
		 }
		
		 public void enterFirstname(String firstname) {
				localHelper.jsExecutorHighlight(firstNameBox, driver);
				localHelper.sendKeys(firstNameBox, firstname,driver);
				logger.info("Name passed in the Firstname box");
			}
			public void enterLastname(String lastname) {
				localHelper.jsExecutorHighlight(lastNameBox, driver);
				localHelper.sendKeys(lastNameBox,lastname, driver);
				logger.info("Name passed in the Lastname box");
			}
			public void enterEmailId(String emailid) {
				localHelper.jsExecutorHighlight(emailBox, driver);
				localHelper.sendKeys(emailBox,emailid, driver);
				logger.info("Email id passed in the Email box");
			}
			public void enterDob() {
				localHelper.jsExecutorHighlight(dobBox, driver);
				localHelper.clickElement(calender,driver);
				localHelper.clickElement(yearArrowClick,driver);
				localHelper.clickParticularValue(yearValues,"1995",driver);
				localHelper.clickElement(date,driver);
				logger.info("Entered DOB ");
			}
			public void clickNextButton() {
				try {
					localHelper.jsExecutorHighlight(nextButton, driver);
					localHelper.clickElement(nextButton, driver);
				}catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(nextButton, driver);
				}
				logger.info("Signup page Next button is clicked");
			}
			

}
