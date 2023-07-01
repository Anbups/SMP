package pages;

import java.awt.AWTException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pom.RemittanceDropdownValidationPOM;
import utilities.LocalHelper;

public class RemittanceDropdownValidationPage extends RemittanceDropdownValidationPOM {
	protected static final Logger logger = LoggerFactory.getLogger(RemittanceDropdownValidationPage.class);

	private final LocalHelper localHelper = new LocalHelper();

	private final WebDriver driver;

	public RemittanceDropdownValidationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserEmailId(String username) {
		localHelper.jsExecutorHighlight(userEmailBox, driver);
		localHelper.sendKeys(userEmailBox, username, driver);
		logger.info("Text passed in the username field");

	}

	public void enterPassword(String password) {
		localHelper.jsExecutorHighlight(passwordBox, driver);
		localHelper.sendKeys(passwordBox, password, driver);
		logger.info("Text passed in the password field");
	}

	public void clickSignupButton() {
		try {
			localHelper.jsExecutorHighlight(loginButton, driver);
			localHelper.clickElement(loginButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(loginButton, driver);
		}
		logger.info("SignIn button is clicked");
	}

	public void clickRemittanceDropdownButton() {
		try {
			localHelper.jsExecutorHighlight(RemittanceDownArrowButton, driver);
			localHelper.clickElement(RemittanceDownArrowButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(RemittanceDownArrowButton, driver);
		}
		logger.info("Remittance button is clicked");
	}

	public boolean checkOutwardButtonIsDisplayed() {
		localHelper.jsExecutorHighlight(outwardButton, driver);
		return driver.findElement(outwardButton).isDisplayed();
	}

	public boolean checkInwardButtonIsDisplayed() {
		localHelper.jsExecutorHighlight(inwardButton, driver);
		return driver.findElement(inwardButton).isDisplayed();
	}

	public void clickOutwardButton() {
		try {
			localHelper.jsExecutorHighlight(outwardButton, driver);
			localHelper.clickElement(outwardButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(outwardButton, driver);
		}
		logger.info("Outward button is clicked");
	}

	public boolean checkAllRemittanceButtonIsDisplayed() {
		localHelper.jsExecutorHighlight(allRemittance, driver);
		return driver.findElement(allRemittance).isDisplayed();
	}

	public boolean checkPendingCustomerRemittanceButtonIsDisplayed() {
		localHelper.jsExecutorHighlight(pendingCustomerRemittance, driver);
		return driver.findElement(pendingCustomerRemittance).isDisplayed();
	}

	public void clickallRemittanceButton() {
		try {
			localHelper.jsExecutorHighlight(allRemittance, driver);
			localHelper.clickElement(allRemittance, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(allRemittance, driver);
		}
		logger.info("AllRemittance button is clicked");
	}

	public String CheckOutwardRemittanceTitlePage() {
		localHelper.jsExecutorHighlight(Title, driver);
		return localHelper.getText(Title, driver);
	}

	public String CheckOutwardRemittanceTitleSubMessage() {
		localHelper.jsExecutorHighlight(titleSubmsg, driver);
		return localHelper.getText(titleSubmsg, driver);
	}

	public boolean checkNewRemittanceButtonIsDisplayed() {
		localHelper.jsExecutorHighlight(newRemittanceButton, driver);
		return driver.findElement(newRemittanceButton).isDisplayed();
	}

	public String checkOutwardRemittanceMonthBox() {
		localHelper.jsExecutorHighlight(monthBox, driver);
		return localHelper.getText(month, driver);
	}

	public String checkOutwardRemittanceTimePeriodBox1() {
		localHelper.jsExecutorHighlight(timePeriodBox1, driver);
		System.out.println(localHelper.getTextButSplitFirstLine(timePeriodBox1, driver));
		return localHelper.getTextButSplitFirstLine(timePeriodBox1, driver);
	}
	public void clickTimePeriodCalenderBox1() {
		try {
			localHelper.jsExecutorHighlight(timePeriodCalenderButton1, driver);
			localHelper.clickElement(timePeriodCalenderButton1, driver);
			localHelper.clickElement(date1, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(timePeriodCalendarBox1, driver);
			localHelper.clickElement(date1, driver);
		}
		logger.info("Time period calender box1 is clicked");
	}
	public String checkOutwardRemittanceTimePeriodBox2() {
		localHelper.jsExecutorHighlight(timePeriodBox2, driver);
		System.out.println(localHelper.getTextButSplitFirstLine(timePeriodBox2, driver));
		return localHelper.getTextButSplitFirstLine(timePeriodBox2, driver);
	}
	public void clickTimePeriodCalenderBox2() {
		try {
			localHelper.jsExecutorHighlight(timePeriodCalenderButton2, driver);
			localHelper.clickElement(timePeriodCalenderButton2, driver);
			localHelper.clickElement(date2, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(timePeriodCalendarBox2, driver);
			localHelper.clickElement(date2, driver);
		}
		logger.info("Time period calender box2 is clicked");
		logger.info("Time period calender box2 date is clicked");
	}
	public String checkOutwardRemittanceSelectCurrencyBox() {
		localHelper.jsExecutorHighlight(selectCurrency, driver);
		localHelper.clickElement(selectCurrency, driver);
		localHelper.clickElement(currency, driver);

		return localHelper.getText(selectCurrency, driver);
	}

	public String checkOutwardRemittanceSearchBox() {
		localHelper.jsExecutorHighlight(searchBox, driver);
		return localHelper.getText(searchBox, driver);
	}


	public String checkOutwardRemittanceSelectStatusBox() {
		localHelper.jsExecutorHighlight(selectStatusBox, driver);
		return localHelper.getText(selectStatusBox, driver);
	}

	public boolean checkOutwardRemittanceResetFilterButton() {
		localHelper.jsExecutorHighlight(resetFilter, driver);
		return driver.findElement(resetFilter).isDisplayed();
	}

	public String checkOutwardRemittanceIDBox() {
		localHelper.jsExecutorHighlight(idBox, driver);
		return localHelper.getText(idBox, driver);
	}

	public String checkOutwardRemittanceTypeBox() {
		localHelper.jsExecutorHighlight(typeBox, driver);
		return localHelper.getText(typeBox, driver);
	}

	public String checkOutwardRemittanceDateBox() {
		localHelper.jsExecutorHighlight(dateBox, driver);
		return localHelper.getText(dateBox, driver);
	}

	public String checkOutwardRemittanceSenderMTOBox() {
		localHelper.jsExecutorHighlight(senderMTOBox, driver);
		return localHelper.getText(senderMTOBox, driver);
	}

	public String checkOutwardRemittanceSenderBox() {
		localHelper.jsExecutorHighlight(senderBox, driver);
		return localHelper.getText(senderBox, driver);
	}

	public String checkOutwardRemittanceRecipientBox() {
		localHelper.jsExecutorHighlight(recipientBox, driver);
		return localHelper.getText(recipientBox, driver);
	}

	public String checkOutwardRemittanceEndBenificiaryBox() throws AWTException {
		try {
			localHelper.jsExecutorHighlight(endBenificiaryBox, driver);
			return localHelper.getText(endBenificiaryBox, driver);
		} catch (TimeoutException e) {
			localHelper.robotZoomout();
			logger.info("Zoomout using robot");
			localHelper.jsExecutorHighlight(endBenificiaryBox, driver);
			return localHelper.getText(endBenificiaryBox, driver);

		}
	}

	public String checkOutwardRemittanceSendValueBoxBox() {
		localHelper.jsExecutorHighlight(sendValueBox, driver);
		return localHelper.getText(sendValueBox, driver);
	}

	public String checkOutwardRemittanceRecValuBoxeBox() {
		localHelper.jsExecutorHighlight(recValuBoxe, driver);
		return localHelper.getText(recValuBoxe, driver);
	}

	public String checkOutwardRemittanceStatusBox() {
		localHelper.jsExecutorHighlight(statusBox, driver);
		return localHelper.getText(statusBox, driver);
	}

	public String checkOutwardRemittanceUpdateStatusBox() {
		localHelper.jsExecutorHighlight(updateStatusBox, driver);
		return localHelper.getText(updateStatusBox, driver);
	}

	public String checkIndividualSenderPageInfoAction() {
		localHelper.jsExecutorHighlight(actionBox, driver);
		return localHelper.getText(actionBox, driver);
	}

}
