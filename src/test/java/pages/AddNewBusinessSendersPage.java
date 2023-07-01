package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pom.AddNewBusinessSendersPOM;
import utilities.LocalHelper;
import utilities.TestUtil;

public class AddNewBusinessSendersPage extends AddNewBusinessSendersPOM {
	protected static final Logger logger = LoggerFactory.getLogger(AddNewBusinessSendersPage.class);

	private final LocalHelper localHelper = new LocalHelper();

	private final WebDriver driver;

	public AddNewBusinessSendersPage(WebDriver driver) {
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

	public void clickSenderBusinessButton() {
		try {
			localHelper.jsExecutorHighlight(senderBusinessButton, driver);
			localHelper.clickElement(senderBusinessButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(senderBusinessButton, driver);
		}
		logger.info("Business Sender button is clicked");
	}

	public String CheckingBusinessSenderClientPage() {
		localHelper.jsExecutorHighlight(businessSenderClientPage, driver);
		return localHelper.getText(businessSenderClientPage, driver);
	}

	public String checkBusinessSenderTitle() {
		localHelper.jsExecutorHighlight(Title, driver);
		return localHelper.getText(Title, driver);
	}

	public boolean checkBusinessSenderSearchBoxIsPresent() {
		localHelper.jsExecutorHighlight(searchBox, driver);
		return driver.findElement(searchBox).isEnabled();
	}

	public boolean checkBusinessSenderPageNewSenderButtonIsPresent() {
		localHelper.jsExecutorHighlight(newSenderButton, driver);
		return driver.findElement(newSenderButton).isEnabled();
	}

	public String checkBusinessSenderPageInfoId() {
		localHelper.jsExecutorHighlight(idBox, driver);
		return localHelper.getText(idBox, driver);
	}

	public String checkBusinessSenderPageInfoName() {
		localHelper.jsExecutorHighlight(nameBox, driver);
		return localHelper.getText(nameBox, driver);
	}
	public String checkBusinessSenderPageInfoBalance() {
		localHelper.jsExecutorHighlight(balanceBox, driver);
		return localHelper.getText(balanceBox, driver);
	}

	public String checkBusinessSenderPageInfoXrplTag() {
		localHelper.jsExecutorHighlight(xrplBox, driver);
		return localHelper.getText(xrplBox, driver);
	}

	public String checkBusinessSenderPageInfocity() {
		localHelper.jsExecutorHighlight(cityBox, driver);
		return localHelper.getText(cityBox, driver);
	}

	public String checkBusinessSenderPageInfoProvince() {
		localHelper.jsExecutorHighlight(provinceBox, driver);
		return localHelper.getText(provinceBox, driver);
	}

	public String checkBusinessSenderPageInfoStatus() {
		localHelper.jsExecutorHighlight(statusBox, driver);
		return localHelper.getText(statusBox, driver);
	}

	public String checkBusinessSenderPageInfoPhoneNum() throws AWTException {
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
	public String checkBusinessSenderPageInfoMail() throws AWTException {
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

	public String checkBusinessSenderPageInfoAction() {
		localHelper.jsExecutorHighlight(actionBox, driver);
		return localHelper.getText(actionBox, driver);
	}

	public boolean CheckBusinessSenderPageEditButton() {
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

	public boolean checkNewSenderBusinessNameBox() {
		localHelper.jsExecutorHighlight(newSenderBusinessName, driver);
		return driver.findElement(newSenderBusinessName).isEnabled();
	}

	public boolean checkNewSenderFirstNameBox() {
		localHelper.jsExecutorHighlight(newSenderFirstName, driver);
		return driver.findElement(newSenderFirstName).isEnabled();
	}

	public boolean checkNewSenderLastNameBox() {
		localHelper.jsExecutorHighlight(newSenderLastName, driver);
		return driver.findElement(newSenderLastName).isEnabled();
	}

	public boolean checkPrimaryContactDesignationBox() {
		localHelper.jsExecutorHighlight(primaryContactDesignation, driver);
		return driver.findElement(primaryContactDesignation).isEnabled();
	}

	public boolean checkPrimaryContact1Box() {
		localHelper.jsExecutorHighlight(primaryContact1, driver);
		return driver.findElement(primaryContact1).isEnabled();
	}

	public boolean checkPrimaryContact2Box() {
		localHelper.jsExecutorHighlight(primaryContact2, driver);
		return driver.findElement(primaryContact2).isEnabled();
	}

	public boolean checkNewSenderCountryBox() {
		localHelper.jsExecutorHighlight(country, driver);
		return driver.findElement(country).isEnabled();
	}

	public boolean checkNewSenderProvinceBox() {
		localHelper.jsExecutorHighlight(province, driver);
		return driver.findElement(province).isEnabled();
	}

	public boolean checkNewSenderCityBox() {
		localHelper.jsExecutorHighlight(city, driver);
		return driver.findElement(city).isEnabled();
	}
	public boolean CheckNewSenderDOBBox() {
		localHelper.jsExecutorHighlight(newSenderDOB, driver);
		return driver.findElement(newSenderDOB).isEnabled();
	}

	public boolean checkNewSenderMailBox() {
		localHelper.jsExecutorHighlight(eMail, driver);
		return driver.findElement(eMail).isEnabled();
	}
	
	public boolean checkNewSenderAddressBox() {
		localHelper.jsExecutorHighlight(senderAddress, driver);
		return driver.findElement(senderAddress).isEnabled();
	}

	public boolean checkNewSenderNextButton() {
		// localHelper.jsExecutorHighlight(newSenderNextButton, driver);
		return driver.findElement(businessNextButton).isEnabled();
	}

	public boolean checkNewSenderCancelButton() {
		localHelper.jsExecutorHighlight(businessCancelButton, driver);
		return driver.findElement(businessCancelButton).isEnabled();
	}

	public void enternewSenderBusinessName(String newsenderbusinessname) {
		localHelper.jsExecutorHighlight(newSenderBusinessName, driver);
		localHelper.sendKeys(newSenderBusinessName, newsenderbusinessname, driver);
		logger.info("New Sender Business name is entered");
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

	public void enternewSenderContactDesignation(String designation) {
		localHelper.jsExecutorHighlight(primaryContactDesignation, driver);
		localHelper.jsExecutorSendValue(primaryContactDesignation, designation, driver);
		logger.info("New Sender Contact Person Designation is entered");
	}

	public void enternewSenderPrimaryContact1(String phonenum1) {
		localHelper.jsExecutorHighlight(primaryContact1, driver);
		localHelper.jsExecutorSendValue(primaryContact1, phonenum1, driver);
		logger.info("New Sender Primary contact1 is entered");
	}

	public void enternewSenderPrimaryContact2(String phonenum2) {
		localHelper.jsExecutorHighlight(primaryContact2, driver);
		localHelper.jsExecutorSendValue(primaryContact2, phonenum2, driver);
		logger.info("New Sender Primary contact2 is entered");
	}

	public void enternewSenderProvince() {
		localHelper.clickElement(province, driver);
		localHelper.clickElement(provinceState, driver);
		logger.info("New Sender Province is selected");
	}

	public void enternewSenderCity() {
		localHelper.clickElement(city, driver);
		localHelper.clickElement(cityName, driver);
		logger.info("New Sender City is selected");
	}
    public void enternewSenderDOB() {
		
		localHelper.clickElement(newSenderDOBChooseDateButton, driver);
		localHelper.clickElement(newSenderDOBDate, driver);
		logger.info("New Sender DOB is selected");
	}
	public void enternewSenderMail(String emailid) {
		localHelper.jsExecutorHighlight(eMail, driver);
		localHelper.sendKeys(eMail, emailid, driver);
		logger.info("New Sender Mail Id is entered");
	}

	public void enternewSenderAddress(String address) {
		localHelper.jsExecutorHighlight(senderAddress, driver);
		localHelper.jsExecutorSendValue(senderAddress, address, driver);
		logger.info("New Sender Address is entered");
	}

	public void clickNewSenderNextButton() {
		try {
			localHelper.jsExecutorHighlight(businessNextButton, driver);
			localHelper.clickElement(businessNextButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(businessNextButton, driver);
		}
		logger.info("New Sender Next button is clicked");
	}

	public void enternewSenderBusinessFinanceType1() {
		localHelper.jsExecutorHighlight(businessSenderFinanceType, driver);
		localHelper.clickElement(businessSenderFinanceType, driver);
		localHelper.clickElement(paypalFinance, driver);
		logger.info("Finance type Paypal is selected");
	}

	public boolean checknewSenderPaypalMailBoxIsEnabled() {
		localHelper.jsExecutorHighlight(paypalMailBox, driver);
		return driver.findElement(paypalMailBox).isEnabled();
	}

	public void enternewSenderPaypalMail(String paypalmail) {
		localHelper.jsExecutorHighlight(paypalMailBox, driver);
		localHelper.sendKeys(paypalMailBox, paypalmail, driver);
	}

	public void enternewSenderFinanceType2() {
		localHelper.jsExecutorHighlight(businessSenderFinanceType, driver);
		localHelper.clickElement(businessSenderFinanceType, driver);
		localHelper.clickElement(venmoFinance, driver);
		logger.info("Finance type Venmo is selected");
	}

	public boolean ChecknewSenderVenmoIdBoxIsEnabled() {
		localHelper.jsExecutorHighlight(venmoId, driver);
		return driver.findElement(venmoId).isEnabled();
	}

	public void enternewSenderFinanceType3() {
		localHelper.jsExecutorHighlight(businessSenderFinanceType, driver);
		localHelper.clickElement(businessSenderFinanceType, driver);
		localHelper.clickElement(bankFinance, driver);
		logger.info("Finance type Bank is selected");
	}

	public boolean CheckBankNameBoxIsEnabled() {
		localHelper.jsExecutorHighlight(bankName, driver);
		return driver.findElement(bankName).isEnabled();
	}

	public void enternewBankName(String bankname) {
		localHelper.jsExecutorHighlight(bankName, driver);
		localHelper.sendKeys(bankName, bankname, driver);
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
		logger.info("Bank branch is entered");
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
		logger.info("Bank IFSC is entered");
	}

	public boolean CheckbankLEICodeIsEnabled() {
		localHelper.jsExecutorHighlight(bankLEICode, driver);
		return driver.findElement(bankLEICode).isEnabled();
	}

	public void enterBankLEINUM(String leicode) {
		localHelper.jsExecutorHighlight(bankLEICode, driver);
		localHelper.sendKeys(bankLEICode, leicode, driver);
		logger.info("Bank LEI code is entered");
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
			localHelper.jsExecutorHighlight(businessNextButton, driver);
			localHelper.clickElement(businessNextButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(businessNextButton, driver);
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

	public void clickEditButton(String businessName) throws InterruptedException {
		By xpath=By.xpath ("//p[text()='" + businessName+ "']//ancestor::div[contains(@class,'MuiDataGrid-cell')]//following-sibling::div[contains(@data-field,'actions')]//button");
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