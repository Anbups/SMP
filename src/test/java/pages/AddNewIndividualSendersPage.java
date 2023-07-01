package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pom.AddNewIndividualSendersPOM;
import utilities.LocalHelper;
import utilities.TestUtil;

public class AddNewIndividualSendersPage extends AddNewIndividualSendersPOM {
	protected static final Logger logger = LoggerFactory.getLogger(AddNewIndividualSendersPage.class);

	private final LocalHelper localHelper = new LocalHelper();

	private final WebDriver driver;

	public AddNewIndividualSendersPage(WebDriver driver) {
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

	public void clickClientDropdownButton() {
		try {
			localHelper.jsExecutorHighlight(clientDownArrowButton, driver);
			localHelper.clickElement(clientDownArrowButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(clientDownArrowButton, driver);
		}
		logger.info("Client dropdown is clicked");
	}

	public void clickSenderButton() {
		try {
			localHelper.jsExecutorHighlight(senderButton, driver);
			localHelper.clickElement(senderButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(senderButton, driver);
		}
		logger.info("Sender button is clicked");
	}

	public void clickSenderIndividualButton() {
		try {
			localHelper.jsExecutorHighlight(senderIndividualButton, driver);
			localHelper.clickElement(senderIndividualButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(senderIndividualButton, driver);
		}
		logger.info("Individual Sender button is clicked");
	}

	public String CheckindividualSenderClientPage() {
		localHelper.jsExecutorHighlight(individualSenderClientPage, driver);
		return localHelper.getText(individualSenderClientPage, driver);
	}

	public String checkIndividualSenderTitle() {
		localHelper.jsExecutorHighlight(Title, driver);
		return localHelper.getText(Title, driver);
	}

	public boolean checkIndividualSenderSearchBoxIsPresent() {
		localHelper.jsExecutorHighlight(searchBox, driver);
		return driver.findElement(searchBox).isEnabled();
	}

	public boolean checkIndividualSenderPageNewSenderButtonIsPresent() {
		localHelper.jsExecutorHighlight(newSenderButton, driver);
		return driver.findElement(newSenderButton).isEnabled();
	}

	public String checkIndividualSenderPageInfoId() {
		localHelper.jsExecutorHighlight(idBox, driver);
		return localHelper.getText(idBox, driver);
	}

	public String checkIndividualSenderPageInfoName() {
		localHelper.jsExecutorHighlight(nameBox, driver);
		return localHelper.getText(nameBox, driver);
	}
	public String checkIndividualSenderPageInfoBalance() {
		localHelper.jsExecutorHighlight(balanceBox, driver);
		return localHelper.getText(balanceBox, driver);
	}


	public String checkIndividualSenderPageInfoXrplTag() {
		localHelper.jsExecutorHighlight(xrplBox, driver);
		return localHelper.getText(xrplBox, driver);
	}

	public String checkIndividualSenderPageInfocity() {
		localHelper.jsExecutorHighlight(cityBox, driver);
		return localHelper.getText(cityBox, driver);
	}

	public String checkIndividualSenderPageInfoProvince() {
		localHelper.jsExecutorHighlight(provinceBox, driver);
		return localHelper.getText(provinceBox, driver);
	}

	public String checkIndividualSenderPageInfoStatus() {
		
		localHelper.jsExecutorHighlight(statusBox, driver);
		return localHelper.getText(statusBox, driver);
	}

	public String checkIndividualSenderPageInfoPhoneNum() throws AWTException {
		try {
			localHelper.jsExecutorHighlight(phoneNumBox, driver);
			return localHelper.getText(phoneNumBox, driver);
		} catch (TimeoutException e) {
			localHelper.robotZoomout();
			logger.info("Zoomout using robot");
			localHelper.jsExecutorHighlight(phoneNumBox, driver);
			return localHelper.getText(phoneNumBox, driver);
		}
	}
	public String checkIndividualSenderPageInfoMail() throws AWTException {
		try {
			localHelper.jsExecutorHighlight(mailBox, driver);
			return localHelper.getText(mailBox, driver);
		} catch (TimeoutException e) {
			localHelper.robotZoomout();
			logger.info("Zoomout using robot");
			localHelper.jsExecutorHighlight(mailBox, driver);
			return localHelper.getText(mailBox, driver);
		}
	}

	public String checkIndividualSenderPageInfoAction() {
		localHelper.jsExecutorHighlight(actionBox, driver);
		return localHelper.getText(actionBox, driver);
	}

	public boolean CheckIndividualSenderPageEditButton() {
		localHelper.jsExecutorHighlight(EditButton, driver);
		return driver.findElement(EditButton).isEnabled();
	}

	public void clickNewSenderButton() {
		try {
			localHelper.jsExecutorHighlight(newSenderButton, driver);
			localHelper.clickElement(newSenderButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(newSenderButton, driver);
		}
		logger.info("New Sender button is clicked");
	}

	public boolean CheckNewSenderFirstNameBox() {
		localHelper.jsExecutorHighlight(newSenderFirstName, driver);
		return driver.findElement(newSenderFirstName).isEnabled();
	}

	public boolean CheckNewSenderLastNameBox() {
		localHelper.jsExecutorHighlight(newSenderLastName, driver);
		return driver.findElement(newSenderLastName).isEnabled();
	}

	public boolean CheckNewSenderPhoneNumBox() {
		localHelper.jsExecutorHighlight(newSenderPhoneNum, driver);
		return driver.findElement(newSenderPhoneNum).isEnabled();
	}

	public boolean CheckNewSenderProvinceBox() {
		localHelper.jsExecutorHighlight(newSenderProvince, driver);
		return driver.findElement(newSenderProvince).isEnabled();
	}

	public boolean CheckNewSenderCityBox() {
		localHelper.jsExecutorHighlight(newSenderCity, driver);
		return driver.findElement(newSenderCity).isEnabled();
	}
	public boolean CheckNewSenderDOBBox() {
		localHelper.jsExecutorHighlight(newSenderDOB, driver);
		return driver.findElement(newSenderDOB).isEnabled();
	}

	public boolean CheckNewSenderMailBox() {
		localHelper.jsExecutorHighlight(newSenderMail, driver);
		return driver.findElement(newSenderMail).isEnabled();
	}

	public boolean CheckNewSenderAddressBox() {
		localHelper.jsExecutorHighlight(newSenderAddress, driver);
		return driver.findElement(newSenderAddress).isEnabled();
	}

	public boolean CheckNewSenderNextButton() {
		// localHelper.jsExecutorHighlight(newSenderNextButton, driver);
		return driver.findElement(newSenderNextButton).isEnabled();
	}

	public boolean CheckNewSenderCancelButton() {
		localHelper.jsExecutorHighlight(newSenderCacelButton, driver);
		return driver.findElement(newSenderCacelButton).isEnabled();
	}

	public void enternewSenderFirstName(String newsenderfirstname) {
		localHelper.jsExecutorHighlight(newSenderFirstName, driver);
		localHelper.sendKeys(newSenderFirstName, newsenderfirstname, driver);
		logger.info("New Sender Firstname is entered");
	}

	public void enternewSenderLastName(String newsenderlastname) {
		localHelper.jsExecutorHighlight(newSenderLastName, driver);
		localHelper.sendKeys(newSenderLastName, newsenderlastname, driver);
		logger.info("New Sender Lastname is entered");
	}

	public void enternewSenderPhoneNum(String phonenum) {
		localHelper.jsExecutorHighlight(newSenderPhoneNum, driver);
		localHelper.jsExecutorSendValue(newSenderPhoneNum, phonenum, driver);
		logger.info("New Sender PhoneNumber is entered");

	}

	public void enternewSenderProvince() {
		
		localHelper.clickElement(newSenderProvince, driver);
		localHelper.clickElement(provinceState, driver);
		logger.info("New Sender Province is selected");
	}

	public void enternewSenderCity() {
	
		localHelper.clickElement(newSenderCity, driver);
		localHelper.clickElement(newSenderCityName, driver);
		logger.info("New Sender City is selected");
	}
	public void enternewSenderDOB() {
		
		localHelper.clickElement(newSenderDOBChooseDateButton, driver);
		localHelper.clickElement(newSenderDOBDate, driver);
		logger.info("New Sender DOB is selected");
	}

	public void enternewSenderMail(String emailid) {
		localHelper.jsExecutorHighlight(newSenderMail, driver);
		localHelper.sendKeys(newSenderMail, emailid, driver);
		logger.info("New Sender Email Id is entered");
	}

	public void enternewSenderAddress(String address) {
		localHelper.jsExecutorHighlight(newSenderAddress, driver);
		localHelper.jsExecutorSendValue(newSenderAddress, address, driver);
		logger.info("New Sender Address is entered");
	}

	public void clickNewSenderNextButton() {
		try {
			localHelper.jsExecutorHighlight(newSenderNextButton, driver);
			localHelper.clickElement(newSenderNextButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(newSenderNextButton, driver);
		}
		logger.info("New Sender Next button is clicked");
	}

	public void enternewSenderFinanceType1() {
		localHelper.jsExecutorHighlight(newSenderFinanceType, driver);
		localHelper.clickElement(newSenderFinanceType, driver);
		localHelper.clickElement(paypalFinance, driver);
		logger.info("Finance type Paypal is selected");
	}

	public boolean checknewSenderPaypalMailBoxIsEnabled() {
		localHelper.jsExecutorHighlight(newSenderPaypalMailBox, driver);
		return driver.findElement(newSenderPaypalMailBox).isEnabled();
	}

	public void enternewSenderPaypalMail(String paypalmail) {
		localHelper.jsExecutorHighlight(newSenderPaypalMailBox, driver);
		localHelper.sendKeys(newSenderPaypalMailBox, paypalmail, driver);
	}

	public void enternewSenderFinanceType2() {
		localHelper.jsExecutorHighlight(newSenderFinanceType, driver);
		localHelper.clickElement(newSenderFinanceType, driver);
		localHelper.clickElement(venmoFinance, driver);
		logger.info("Finance type Venmo is selected");
	}

	public boolean ChecknewSenderVenmoIdBoxIsEnabled() {
		localHelper.jsExecutorHighlight(newSenderVenmoId, driver);
		return driver.findElement(newSenderVenmoId).isEnabled();
	}

	public void enternewSenderFinanceType3() {
		localHelper.jsExecutorHighlight(newSenderFinanceType, driver);
		localHelper.clickElement(newSenderFinanceType, driver);
		localHelper.clickElement(bankFinance, driver);
		logger.info("Finance type Bank is selected");
	}

	public boolean CheckBankNameBoxIsEnabled() {
		localHelper.jsExecutorHighlight(Bankname, driver);
		return driver.findElement(Bankname).isEnabled();
	}

	public void enternewBankName(String bankname) {
		localHelper.jsExecutorHighlight(Bankname, driver);
		localHelper.sendKeys(Bankname, bankname, driver);
		logger.info("Bank name is entered");
	}

	public boolean CheckBankAccountNumBoxIsEnabled() {
		localHelper.jsExecutorHighlight(bankAccountNum, driver);
		return driver.findElement(bankAccountNum).isEnabled();
	}

	public void enterBankaccountNum(String bankccountnum) {
		localHelper.jsExecutorHighlight(bankAccountNum, driver);
		localHelper.sendKeys(bankAccountNum, bankccountnum, driver);
		logger.info("Bank Account number is entered");
	}

	public boolean CheckBankIbanIsEnabled() {
		localHelper.jsExecutorHighlight(bankIban, driver);
		return driver.findElement(bankIban).isEnabled();
	}

	public void enterBankIBan(String iban) {
		localHelper.jsExecutorHighlight(bankIban, driver);
		localHelper.sendKeys(bankIban, iban, driver);
		logger.info("Bank IBAN is entered");
	}

	public boolean CheckBankSwiftBICCodeBoxIsEnabled() {
		localHelper.jsExecutorHighlight(bankSwiftBICCode, driver);
		return driver.findElement(bankSwiftBICCode).isEnabled();
	}

	public void enterBankSwiftBICCode(String swiftcode) {
		localHelper.jsExecutorHighlight(bankSwiftBICCode, driver);
		localHelper.sendKeys(bankSwiftBICCode, swiftcode, driver);
		logger.info("Bank Swift BIC code is entered");
	}

	public boolean CheckBankBranchNumBoxIsEnabled() {
		localHelper.jsExecutorHighlight(bankBranchNum, driver);
		return driver.findElement(bankBranchNum).isEnabled();
	}

	public void enternewBankBranchNum(String branchname) {
		localHelper.jsExecutorHighlight(bankBranchNum, driver);
		localHelper.sendKeys(bankBranchNum, branchname, driver);
		logger.info("Bank Branch is entered");
	}

	public boolean CheckBankTransitNumBoxIsEnabled() {
		localHelper.jsExecutorHighlight(bankTransitNum, driver);
		return driver.findElement(bankTransitNum).isEnabled();
	}

	public void enterBankTransitNum(String transitnum) {
		localHelper.jsExecutorHighlight(bankTransitNum, driver);
		localHelper.sendKeys(bankTransitNum, transitnum, driver);
		logger.info("Bank Transit number is entered");
	}

	public boolean CheckBankABARoutingNumIsEnabled() {
		localHelper.jsExecutorHighlight(bankABARoutingNum, driver);
		return driver.findElement(bankABARoutingNum).isEnabled();
	}

	public void enterBankABARoutingNum(String abanum) {
		localHelper.jsExecutorHighlight(bankABARoutingNum, driver);
		localHelper.sendKeys(bankABARoutingNum, abanum, driver);
		logger.info("Bank ABA Routing number is entered");
	}

	public boolean CheckBankIFSCIsEnabled() {
		localHelper.jsExecutorHighlight(bankIFSC, driver);
		return driver.findElement(bankIFSC).isEnabled();
	}

	public void enterBankIFSCInum(String ifscnum) {
		localHelper.jsExecutorHighlight(bankIFSC, driver);
		localHelper.sendKeys(bankIFSC, ifscnum, driver);
		logger.info("Bank IFSC code is entered");
	}

	public boolean CheckbankLEICodeIsEnabled() {
		localHelper.jsExecutorHighlight(bankLEICode, driver);
		return driver.findElement(bankLEICode).isEnabled();
	}

	public void enterBankLEINUM(String leicode) {
		localHelper.jsExecutorHighlight(bankLEICode, driver);
		localHelper.sendKeys(bankLEICode, leicode, driver);
		logger.info("Bank LEI number is entered");
	}

	public boolean CheckBankAddressIsEnabled() {
		localHelper.jsExecutorHighlight(bankAddress, driver);
		return driver.findElement(bankAddress).isEnabled();
	}

	public void enterBankAddress(String address) {
		localHelper.jsExecutorHighlight(bankAddress, driver);
		localHelper.sendKeys(bankAddress, address, driver);
		logger.info("Bank Address is entered");
	}

	public boolean CheckCancelButtonIsEnabled() {
		localHelper.jsExecutorHighlight(cancelButton, driver);
		return driver.findElement(cancelButton).isEnabled();
	}

	public boolean checkBackButtonIsEnabled() {
		localHelper.jsExecutorHighlight(backButton, driver);
		return driver.findElement(backButton).isEnabled();
	}

	public boolean CheckSaveAsDraftButtonIsEnabled() {
		localHelper.jsExecutorHighlight(saveAsDraftButton, driver);
		return driver.findElement(saveAsDraftButton).isEnabled();
	}

	public boolean checkSaveAndActivateButtonIsEnabled() {
		localHelper.jsExecutorHighlight(saveActivateButton, driver);
		return driver.findElement(saveActivateButton).isEnabled();
	}

	public void clickBackButton() {
		try {
			localHelper.jsExecutorHighlight(backButton, driver);
			localHelper.clickElement(backButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(backButton, driver);
		}
		logger.info("Back button is Clicked");
	}

	public void clickNextButton() {
		try {
			localHelper.jsExecutorHighlight(newSenderNextButton, driver);
			localHelper.clickElement(newSenderNextButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(newSenderNextButton, driver);
		}
		logger.info("Next button is Clicked");

	}

	public void clickSaveAsDraftButton() {
		try {
			localHelper.jsExecutorHighlight(saveAsDraftButton, driver);
			localHelper.clickElement(saveAsDraftButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(saveAsDraftButton, driver);
		}
		logger.info("SaveAsDraft button is Clicked");

	}

	public void clickEditButton(String firstname, String lastName) throws InterruptedException {
		By xpath=By.xpath ("//p[contains(text(),'" + firstname + "')]//ancestor::div[contains(@class,'MuiDataGrid-cell')]//following-sibling::div[contains(@data-field,'actions')]//button");
		
		try {
			localHelper.jsExecutorHighlight(xpath, driver);
			localHelper.clickElement(xpath, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(xpath, driver);
		}
		logger.info("Edit button is Clicked");

	}

	public void clickSaveAndActivateButton() {
		try {
			localHelper.jsExecutorHighlight(saveActivateButton, driver);
			localHelper.clickElement(saveActivateButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(saveActivateButton, driver);
		}
		logger.info("SaveAndActivate button is Clicked");

	}

}
