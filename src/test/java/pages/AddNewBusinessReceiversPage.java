package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pom.AddNewBusinessReceiversPOM;
import utilities.LocalHelper;
import utilities.TestUtil;

public class AddNewBusinessReceiversPage extends AddNewBusinessReceiversPOM {
	protected static final Logger logger = LoggerFactory.getLogger(AddNewBusinessReceiversPage.class);

	private final LocalHelper localHelper = new LocalHelper();

	private final WebDriver driver;

	public AddNewBusinessReceiversPage(WebDriver driver) {
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

	public void clickReceiverButton() {
		try {
			localHelper.jsExecutorHighlight(receiverButton, driver);
			localHelper.clickElement(receiverButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(receiverButton, driver);
		}
		logger.info("Receiver button is clicked");
	}

	public void clickReceiverBusinessButton() {
		try {
			localHelper.jsExecutorHighlight(receiverBusinessButton, driver);
			localHelper.clickElement(receiverBusinessButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(receiverBusinessButton, driver);
		}
		logger.info("Business Receiver button is clicked");
	}

	public String CheckingBusinessReceiverClientPage() {
		localHelper.jsExecutorHighlight(businessReceiverClientPage, driver);
		return localHelper.getText(businessReceiverClientPage, driver);
	}

	public String checkBusinessReceiverTitle() {
		localHelper.jsExecutorHighlight(Title, driver);
		return localHelper.getText(Title, driver);
	}

	public boolean checkBusinessReceiverSearchBoxIsPresent() {
		localHelper.jsExecutorHighlight(searchBox, driver);
		return driver.findElement(searchBox).isEnabled();
	}

	public boolean checkBusinessReceiverPageNewReceiverButtonIsPresent() {
		localHelper.jsExecutorHighlight(newReceiverButton, driver);
		return driver.findElement(newReceiverButton).isEnabled();
	}

	public String checkBusinessReceiverPageInfoId() {
		localHelper.jsExecutorHighlight(idBox, driver);
		return localHelper.getText(idBox, driver);
	}

	public String checkBusinessReceiverPageInfoName() {
		localHelper.jsExecutorHighlight(nameBox, driver);
		return localHelper.getText(nameBox, driver);
	}

	public String checkBusinessReceiverPageInfoXrplTag() {
		localHelper.jsExecutorHighlight(xrplBox, driver);
		return localHelper.getText(xrplBox, driver);
	}
	public String checkBusinessReceiverPageInfoBelongsTo() {
		localHelper.jsExecutorHighlight(belongsToBox, driver);
		return localHelper.getText(belongsToBox, driver);
	}

	public String checkBusinessReceiverPageInfoCity() {
		localHelper.jsExecutorHighlight(cityBox, driver);
		return localHelper.getText(cityBox, driver);
	}

	public String checkBusinessReceiverPageInfoProvince() {
		localHelper.jsExecutorHighlight(provinceBox, driver);
		return localHelper.getText(provinceBox, driver);
	}

	public String checkBusinessReceiverPageInfoStatus() throws AWTException {
		try {
			localHelper.jsExecutorHighlight(statusBox, driver);
			return localHelper.getText(statusBox, driver);
		} catch (TimeoutException e) {
			localHelper.robotZoomout();
			logger.info("Zoomout using robot");
			localHelper.jsExecutorHighlight(statusBox, driver);
			return localHelper.getText(statusBox, driver);
		}
	}
	public String checkBusinessReceiverPageInfoPhoneNum() throws AWTException {
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
	public String checkBusinessReceiverPageInfoAction() throws AWTException {
		try {
			localHelper.jsExecutorHighlight(actionBox, driver);
			return localHelper.getText(actionBox, driver);
		} catch (TimeoutException e) {
			localHelper.robotZoomout();
			logger.info("Zoomout using robot");
			localHelper.jsExecutorHighlight(actionBox, driver);
			return localHelper.getText(actionBox, driver);
		}
	}

	public boolean CheckBusinessReceiverPageEditButton() {
		localHelper.jsExecutorHighlight(EditButton, driver);
		return driver.findElement(EditButton).isEnabled();
	}

	public void clickNewReceiverButton() {
		try {
			localHelper.jsExecutorHighlight(newReceiverButton, driver);
			localHelper.clickElement(newReceiverButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(newReceiverButton, driver);
		}
		logger.info("New Receiver button is clicked");
	}

	public boolean checkNewReceiverBusinessNameBox() {
		localHelper.jsExecutorHighlight(newReceiverBusinessName, driver);
		return driver.findElement(newReceiverBusinessName).isEnabled();
	}

	public boolean checkNewReceiverFirstNameBox() {
		localHelper.jsExecutorHighlight(newReceiverFirstName, driver);
		return driver.findElement(newReceiverFirstName).isEnabled();
	}

	public boolean checkNewReceiverLastNameBox() {
		localHelper.jsExecutorHighlight(newReceiverLastName, driver);
		return driver.findElement(newReceiverLastName).isEnabled();
	}
	public boolean checkNewReceiverBelongsToBox() {
		localHelper.jsExecutorHighlight(newReceiverBelongsTo, driver);
		return driver.findElement(newReceiverBelongsTo).isEnabled();
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

	public boolean checkNewReceiverCountryBox() {
		localHelper.jsExecutorHighlight(country, driver);
		return driver.findElement(country).isEnabled();
	}

	public boolean checkNewReceiverProvinceBox() {
		localHelper.jsExecutorHighlight(province, driver);
		return driver.findElement(province).isEnabled();
	}

	public boolean checkNewReceiverCityBox() {
		localHelper.jsExecutorHighlight(city, driver);
		return driver.findElement(city).isEnabled();
	}

	public boolean checkNewReceiverAddressBox() {
		localHelper.jsExecutorHighlight(addressBusiness, driver);
		return driver.findElement(addressBusiness).isEnabled();
	}

	public boolean checkNewReceiverNextButton() {
		// localHelper.jsExecutorHighlight(newReceiverNextButton, driver);
		return driver.findElement(businessNextButton).isEnabled();
	}

	public boolean checkNewReceiverCancelButton() {
		localHelper.jsExecutorHighlight(businessCancelButton, driver);
		return driver.findElement(businessCancelButton).isEnabled();
	}

	public void enternewReceiverBusinessName(String newReceiverBusinessname) {
		localHelper.jsExecutorHighlight(newReceiverBusinessName, driver);
		localHelper.sendKeys(newReceiverBusinessName, newReceiverBusinessname, driver);
		logger.info("New Receiver Business name is entered");
	}

	public void enternewReceiverFirstName(String newReceiverfirstname) {
		localHelper.jsExecutorHighlight(newReceiverFirstName, driver);
		localHelper.sendKeys(newReceiverFirstName, newReceiverfirstname, driver);
		logger.info("New Receiver Firstname is entered");
	}

	public void enternewReceiverLastName(String newReceiverlastname) {
		localHelper.jsExecutorHighlight(newReceiverLastName, driver);
		localHelper.sendKeys(newReceiverLastName, newReceiverlastname, driver);
		logger.info("New Receiver Lirstname is entered");
	}
	public void enternewReceiverBelongsTo() {
		localHelper.clickElement(newReceiverBelongsTo, driver);
		localHelper.clickElement(belongsToValue, driver);
		logger.info("New Receiver Belongs to value is selected");
	}

	public void enternewReceiverContactDesignation(String designation) {
		localHelper.jsExecutorHighlight(primaryContactDesignation, driver);
		localHelper.jsExecutorSendValue(primaryContactDesignation, designation, driver);
		logger.info("New Receiver Contact Person Designation is entered");
	}

	public void enternewReceiverPrimaryContact1(String phonenum1) {
		localHelper.jsExecutorHighlight(primaryContact1, driver);
		localHelper.jsExecutorSendValue(primaryContact1, phonenum1, driver);
		logger.info("New Receiver Primary contact1 is entered");
	}

	public void enternewReceiverPrimaryContact2(String phonenum2) {
		localHelper.jsExecutorHighlight(primaryContact2, driver);
		localHelper.jsExecutorSendValue(primaryContact2, phonenum2, driver);
		logger.info("New Receiver Primary contact2 is entered");
	}

	public void enternewReceiverCountry() {
		localHelper.clickElement(country, driver);
		localHelper.clickElement(countryName, driver);
		logger.info("New Receiver Country is selected");
	}

	public void enternewReceiverProvince() {
		localHelper.clickElement(province, driver);
		localHelper.clickElement(provinceState, driver);
		logger.info("New Receiver Province is selected");
	}

	public void enternewReceiverCity() {
		localHelper.clickElement(city, driver);
		localHelper.clickElement(cityName, driver);
		logger.info("New Receiver City is selected");
	}

	public void enternewReceiverAddress(String address) {
		localHelper.jsExecutorHighlight(addressBusiness, driver);
		localHelper.jsExecutorSendValue(addressBusiness, address, driver);
		logger.info("New Receiver Address is entered");
	}

	public void clickNewReceiverNextButton() {
		try {
			localHelper.jsExecutorHighlight(businessNextButton, driver);
			localHelper.clickElement(businessNextButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(businessNextButton, driver);
		}
		logger.info("New Sender Next button is clicked");
	}

	public void enternewReceiverBusinessFinanceType1() {
		localHelper.jsExecutorHighlight(businessReceiverFinanceType, driver);
		localHelper.clickElement(businessReceiverFinanceType, driver);
		localHelper.clickElement(paypalFinance, driver);
		logger.info("Finance type Paypal is selected");
	}

	public boolean checknewReceiverPaypalMailBoxIsEnabled() {
		localHelper.jsExecutorHighlight(paypalMailBox, driver);
		return driver.findElement(paypalMailBox).isEnabled();
	}

	public void enternewReceiverPaypalMail(String paypalmail) {
		localHelper.jsExecutorHighlight(paypalMailBox, driver);
		localHelper.sendKeys(paypalMailBox, paypalmail, driver);
	}

	public void enternewReceiverFinanceType2() {
		localHelper.jsExecutorHighlight(businessReceiverFinanceType, driver);
		localHelper.clickElement(businessReceiverFinanceType, driver);
		localHelper.clickElement(venmoFinance, driver);
		logger.info("Finance type Venmo is selected");
	}

	public boolean ChecknewReceiverVenmoIdBoxIsEnabled() {
		localHelper.jsExecutorHighlight(venmoId, driver);
		return driver.findElement(venmoId).isEnabled();
	}

	public void enternewReceiverFinanceType3() {
		localHelper.jsExecutorHighlight(businessReceiverFinanceType, driver);
		localHelper.clickElement(businessReceiverFinanceType, driver);
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
