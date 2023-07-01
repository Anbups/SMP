package pages;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dev.STB.STBAutomationMTOVendorSignup;

import constants.Constants;
import pom.MTOVendorFirstLoginPOM;
import utilities.LocalHelper;
import utilities.TestUtil;

public class MTOVendorFirstLoginPage extends MTOVendorFirstLoginPOM{
	protected static final Logger logger = LoggerFactory.getLogger(MTOVendorFirstLoginPage.class);

	private final LocalHelper localHelper = new LocalHelper();
	private final TestUtil testUtil = new TestUtil();

	private final WebDriver driver;

	public MTOVendorFirstLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	String text1;
	String text2;
	
	 public void enterUserEmailId(String useremail) {
			localHelper.jsExecutorHighlight(userEmailBox, driver);
			localHelper.sendKeys(userEmailBox, useremail,driver);
			 logger.info("Text passed in the username field");
		}
		public void enterPassword(String commonPassword) {
			localHelper.jsExecutorHighlight(passwordBox, driver);
			localHelper.sendKeys(passwordBox,commonPassword, driver);
			 logger.info("Text passed in the password field");

		}
		 public void clickSignupButton() {
				try {
					localHelper.jsExecutorHighlight(loginButton, driver);
					localHelper.clickElement(loginButton, driver);
				}catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(loginButton, driver);
				}
				 logger.info("SignIn button is clicked");

			}
		 public String checkSuccessMessage() {
				return localHelper.getText(signinSucessMsg,driver);
			}
		 public String checkWelcomeMessage() {
				return localHelper.getText(welcomeMsg,driver);
			}
		 public String checkContentMessage1() {
				return localHelper.getText(popup1contentMsg1,driver);
			}
		 public String checkContentMessage2() {
				return localHelper.getText(popup1contentMsg2,driver);
			}
		 public String checkContentMessage3() {
				return localHelper.getText(popup1contentMsg3,driver);
			}
		
		 public void clickCopyButton() {
				try {
					localHelper.jsExecutorHighlight(copyButton, driver);
					localHelper.scrollIntoView(copyButton,driver);
					localHelper.clickElement(copyButton, driver);
				}catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(copyButton, driver);
				}
				 logger.info("Copy button is clicked");
			}
		 public String checkAfterCopySuccessMessage() {
				return localHelper.getText(copiedSuccessMsg,driver);
			}
		 
		 public  void CopySecterkey1ToExcelFile() throws IOException {

		    	WebElement textElement1 = driver.findElement(secretkey1);
		    	text1 = textElement1.getText();
		    		 
		 }
		 public void clickTermsButton() {
				try {
					localHelper.jsExecutorHighlight(acceptTerms, driver);
					localHelper.clickElement(acceptTerms, driver);
				}catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(acceptTerms, driver);
				}
				 logger.info("Terms checkbox is clicked");
			}
		 public void clickContinueButton() {
				try {
					localHelper.jsExecutorHighlight(continueButton, driver);
					localHelper.clickElement(continueButton, driver);
				}catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(continueButton, driver);
				}
				 logger.info("Continue button is clicked");
			}
		 public String checkWalletCreatedSuccessMessage() {
				return localHelper.getText(walletCreatedSuccessMsg,driver);
			}
		 public String checkPopupBox2Header() {
				return localHelper.getText(popupBox2HeaderText,driver);
			}
		 public String checkPopupBox2WelcomeMsg() {
				return localHelper.getText(welcomeJourney,driver);
			}
		 public String popupBox2ContentMessage1() {
				return localHelper.getText(popup2ContentMsg1,driver);
			}
		 public String popupBox2ContentMessage2() {
				return localHelper.getText(popup2ContentMsg2,driver);
			}
		 public String popupBox2ContentMessage3() {
				return localHelper.getText(popup2ContentMsg3,driver);
		 }
		 public boolean checkQRCode() {
			 localHelper.jsExecutorHighlight(qrCode, driver);
			 localHelper.scrollIntoView(laterButton, driver);
			 return driver.findElement(qrCode).isEnabled();
			 
		 }
		 
		 public void clickCopyButton2() {
				try {
					localHelper.jsExecutorHighlight(copyButton2, driver);
					localHelper.clickElement(copyButton2, driver);
				}catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(copyButton2, driver);
				}
				 logger.info("Copy button2 is clicked");
			}
		 public  void CopySecterkey2ToExcelFile() throws IOException {
			 WebElement textElement2 = driver.findElement(secretkey2);
	    	   text2 = textElement2.getText();
	    	 
		      TestUtil.writeExcel(text1,text2,STBAutomationMTOVendorSignup.mail,STBAutomationMTOVendorSignup.mtoName,driver);
		 }
		 public String addressSuccessMessage() {
				return localHelper.getText(AddressCopySuccessMsg,driver);
		 }
		 public boolean checkWalletActivateButton() {
			 localHelper.jsExecutorHighlight(walletActivateButton, driver);
			 return driver.findElement(walletActivateButton).isEnabled();
		 }
		 public boolean checkAlreadyActivateButton() {
			 localHelper.jsExecutorHighlight(alreadyactivatedButton, driver);
			 return driver.findElement(alreadyactivatedButton).isEnabled();
		 }
		 public boolean checkLaterButton() {
			 localHelper.jsExecutorHighlight(laterButton, driver);
			 return driver.findElement(laterButton).isEnabled();
		 }
		 
		
		 

}
