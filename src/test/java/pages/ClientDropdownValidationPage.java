package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pom.ClientDropdownValidationPOM;
import utilities.LocalHelper;

public class ClientDropdownValidationPage extends ClientDropdownValidationPOM{
	protected static final Logger logger = LoggerFactory.getLogger(ClientDropdownValidationPage.class);

	private final LocalHelper localHelper = new LocalHelper();

	private final WebDriver driver;

	public ClientDropdownValidationPage(WebDriver driver) {
		this.driver=driver;
	}
	 public void enterUserEmailId(String username) {
			localHelper.jsExecutorHighlight(userEmailBox, driver);
			localHelper.sendKeys(userEmailBox, username,driver);
			logger.info("Text passed in the username field");
		}
		public void enterPassword(String password) {
			localHelper.jsExecutorHighlight(passwordBox, driver);
			localHelper.sendKeys(passwordBox,password, driver);
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
	 public void clickClientDropdownButton() {
			try {
				localHelper.jsExecutorHighlight(clientDownArrowButton, driver);
				localHelper.clickElement(clientDownArrowButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(clientDownArrowButton, driver);
			}
			logger.info("Client dropdown is clicked");
		}
	 public boolean checkSenderButtonIsDisplayed() {
		 localHelper.jsExecutorHighlight(senderButton, driver);
		 return driver.findElement(senderButton).isDisplayed();
	 }
	 public boolean checkReceiverButtonIsDisplayed() {
		 localHelper.jsExecutorHighlight(senderButton, driver);
		 return driver.findElement(senderButton).isDisplayed();
	 }
	 public void clickSenderButton() {
			try {
				localHelper.jsExecutorHighlight(senderButton, driver);
				localHelper.clickElement(senderButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(senderButton, driver);
			}
			logger.info("Sender button is clicked");
		}
	 public boolean checkSenderIndividualButtonIsDisplayed() {
		 localHelper.jsExecutorHighlight(senderIndividualButton, driver);
		 return driver.findElement(senderIndividualButton).isDisplayed();
	 }
	 public boolean checkSenderBusinessButtonIsDisplayed() {
		 localHelper.jsExecutorHighlight(senderBusinessButton, driver);
		 return driver.findElement(senderBusinessButton).isDisplayed();
	 }
	 public void clickSenderIndividualButton() {
			try {
				localHelper.jsExecutorHighlight(senderIndividualButton, driver);
				localHelper.clickElement(senderIndividualButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(senderIndividualButton, driver);
			}
			logger.info("Individual Sender button is clicked");
		}
	 public String CheckindividualSenderClientPage() {
		 localHelper.jsExecutorHighlight(individualSenderClientPage, driver);
			return localHelper.getText(individualSenderClientPage,driver);
	 }
	 public void clickSenderBusinessButton() {
			try {
				localHelper.jsExecutorHighlight(senderBusinessButton, driver);
				localHelper.clickElement(senderBusinessButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(senderBusinessButton, driver);
			}
			logger.info("Business Sender button is clicked");
		}
	 
	 public String CheckBusinessSenderClientPage() {
		 localHelper.jsExecutorHighlight(businessSendersClientPage, driver);

			return localHelper.getText(businessSendersClientPage,driver);
	 }
	 public void clickReceiverButton() {
			try {
				localHelper.jsExecutorHighlight(receiverButton, driver);
				localHelper.clickElement(receiverButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(receiverButton, driver);
			}
			logger.info("Receiver button is clicked");
		}
	 public boolean checkReceiverIndividualButtonIsDisplayed() {
		 localHelper.jsExecutorHighlight(receiverIndividualButton, driver);
		 return driver.findElement(receiverIndividualButton).isDisplayed();
	 }
	 public boolean ReceiverBusinessButtonIsDisplayed() {
		 localHelper.jsExecutorHighlight(receiverBusinessButton, driver);
		 return driver.findElement(receiverBusinessButton).isDisplayed();
	 }
	 public void clickReceiverIndividualButton() {
			try {
				localHelper.jsExecutorHighlight(receiverIndividualButton, driver);
				localHelper.clickElement(receiverIndividualButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(receiverIndividualButton, driver);
			}
			logger.info("Individual Receiver button is clicked");
		}
	 public String CheckindividualReceiverClientPage() {
		 localHelper.jsExecutorHighlight(individualReceiverClientPage, driver);

			return localHelper.getText(individualReceiverClientPage,driver);
	 }
	 public void clickReceiverBusinessButton() {
			try {
				localHelper.jsExecutorHighlight(receiverBusinessButton, driver);
				localHelper.clickElement(receiverBusinessButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(receiverBusinessButton, driver);
			}
			logger.info("Business Receiver button is clicked");
		}
	 public String CheckBusinessReceiverClientPage() {
		 localHelper.jsExecutorHighlight(businessReceiverClientPage, driver);

			return localHelper.getText(businessReceiverClientPage,driver);
	 }

}
