package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pom.AddNewIndividualReceiversPOM;
import utilities.LocalHelper;
import utilities.TestUtil;

public class AddNewIndividualReceiversPage extends AddNewIndividualReceiversPOM {
	protected static final Logger logger = LoggerFactory.getLogger(AddNewIndividualReceiversPage.class);

	private final LocalHelper localHelper = new LocalHelper();

	private final WebDriver driver;

	public AddNewIndividualReceiversPage(WebDriver driver) {
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
			logger.info("SignIn button is clicked");

		}
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

	public void clickReceiverIndividualButton() {
		try {
			localHelper.jsExecutorHighlight(receiverIndividualButton, driver);
			localHelper.clickElement(receiverIndividualButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(receiverIndividualButton, driver);
		}
		logger.info("Individual Receiver button is clicked");
	}

	public String CheckindividualReceiverClientPage() {
		localHelper.jsExecutorHighlight(individualReceiverClientPage, driver);
		return localHelper.getText(individualReceiverClientPage, driver);
	}

	public String checkIndividualReceiverTitle() {
		localHelper.jsExecutorHighlight(Title, driver);
		return localHelper.getText(Title, driver);
	}

	public boolean checkIndividualReceiverSearchBoxIsPresent() {
		localHelper.jsExecutorHighlight(searchBox, driver);
		return driver.findElement(searchBox).isEnabled();
	}

	public boolean checkIndividualReceiverPageNewReceiverButtonIsPresent() {
		localHelper.jsExecutorHighlight(newReceiverButton, driver);
		return driver.findElement(newReceiverButton).isEnabled();
	}

	public String checkIndividualReceiverPageInfoId() {
		localHelper.jsExecutorHighlight(idBox, driver);
		return localHelper.getText(idBox, driver);
	}

	public String checkIndividualReceiverPageInfoName() {
		localHelper.jsExecutorHighlight(nameBox, driver);
		return localHelper.getText(nameBox, driver);
	}

	public String checkIndividualReceiverPageInfoXrplTag() {
		localHelper.jsExecutorHighlight(xrplBox, driver);
		return localHelper.getText(xrplBox, driver);
	}
	public String checkIndividualReceiverPageInfoBelongsTo() {
		localHelper.jsExecutorHighlight(belongsToBox, driver);
		return localHelper.getText(belongsToBox, driver);
	}

	public String checkIndividualReceiverPageInfocity() {
		localHelper.jsExecutorHighlight(cityBox, driver);
		return localHelper.getText(cityBox, driver);
	}

	public String checkIndividualReceiverPageInfoProvince() {
		localHelper.jsExecutorHighlight(provinceBox, driver);
		return localHelper.getText(provinceBox, driver);
	}

	public String checkIndividualReceiverPageInfoStatus() throws AWTException {
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
	public String checkIndividualReceiverPageInfoPhoneNum() throws AWTException {
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
	public String checkIndividualReceiverPageInfoAction() throws AWTException {
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

	public boolean CheckIndividualReceiverPageEditButton() {
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

	public boolean CheckNewReceiverFirstNameBox() {
		localHelper.jsExecutorHighlight(newReceiverFirstName, driver);
		return driver.findElement(newReceiverFirstName).isEnabled();
	}

	public boolean CheckNewReceiverLastNameBox() {
		localHelper.jsExecutorHighlight(newReceiverLastName, driver);
		return driver.findElement(newReceiverLastName).isEnabled();
	}
	public boolean checkNewReceiverBelongsToBox() {
		localHelper.jsExecutorHighlight(newReceiverBelongsTo, driver);
		return driver.findElement(newReceiverBelongsTo).isEnabled();
	}

	public boolean CheckNewReceiverPhoneNumBox() {
		localHelper.jsExecutorHighlight(newReceiverPhoneNum, driver);
		return driver.findElement(newReceiverPhoneNum).isEnabled();
	}

	public boolean CheckNewReceiverCountryBox() {
		localHelper.jsExecutorHighlight(newReceiverCountry, driver);
		return driver.findElement(newReceiverCountry).isEnabled();
	}

	public boolean CheckNewReceiverProvinceBox() {
		localHelper.jsExecutorHighlight(newReceiverProvince, driver);
		return driver.findElement(newReceiverProvince).isEnabled();
	}

	public boolean CheckNewReceiverCityBox() {
		localHelper.jsExecutorHighlight(newReceiverCity, driver);
		return driver.findElement(newReceiverFirstName).isEnabled();
	}

	public boolean CheckNewReceiverAddressBox() {
		localHelper.jsExecutorHighlight(newReceiverAddress, driver);
		return driver.findElement(newReceiverAddress).isEnabled();
	}

	public boolean CheckNewReceiverNextButton() {
		// localHelper.jsExecutorHighlight(newReceiverNextButton, driver);
		return driver.findElement(newReceiverNextButton).isEnabled();
	}

	public boolean CheckNewReceiverCancelButton() {
		localHelper.jsExecutorHighlight(newReceiverCancelButton, driver);
		return driver.findElement(newReceiverCancelButton).isEnabled();
	}

	public void enternewReceiverFirstName(String newReceiverfirstname) {
		localHelper.jsExecutorHighlight(newReceiverFirstName, driver);
		localHelper.sendKeys(newReceiverFirstName, newReceiverfirstname, driver);
		logger.info("New Receiver Firstname is entered");
	}

	public void enternewReceiverLastName(String newReceiverlastname) {
		localHelper.jsExecutorHighlight(newReceiverLastName, driver);
		localHelper.sendKeys(newReceiverLastName, newReceiverlastname, driver);
		logger.info("New Receiver Lastname is entered");

	}
	public void enternewReceiverBelongsTo() {
		localHelper.clickElement(newReceiverBelongsTo, driver);
		localHelper.clickElement(belongsToValue, driver);
		logger.info("New Receiver Belongs To value is selected");
	}


	public void enternewReceiverPhoneNum(String phonenum) {
		localHelper.jsExecutorHighlight(newReceiverPhoneNum, driver);
		localHelper.jsExecutorSendValue(newReceiverPhoneNum, phonenum, driver);
		logger.info("New Receiver PhoneNumber is entered");

	}

	public void enternewReceiverCountry() {
		localHelper.clickElement(newReceiverCountry, driver);
		localHelper.clickElement(countryName, driver);
		logger.info("New Receiver Country is selected");
	}

	public void enternewReceiverProvince() {
		localHelper.clickElement(newReceiverProvince, driver);
		localHelper.clickElement(provinceState, driver);
		logger.info("New Receiver Province is selected");
	}

	public void enternewReceiverCity() {
		localHelper.clickElement(newReceiverCity, driver);
		localHelper.clickElement(newReceiverCityName, driver);
		logger.info("New Receiver City is selected");

	}

	public void enternewReceiverAddress(String address) {
		localHelper.jsExecutorHighlight(newReceiverAddress, driver);
		localHelper.jsExecutorSendValue(newReceiverAddress, address, driver);
		logger.info("New Receiver Address  is entered");

	}

	public void clickNewReceiverNextButton() {
		try {
			localHelper.jsExecutorHighlight(newReceiverNextButton, driver);
			localHelper.clickElement(newReceiverNextButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(newReceiverNextButton, driver);
		}
		logger.info("New Receiver Next button is clicked");
	}

	public void enternewReceiverFinanceType1() {
		localHelper.jsExecutorHighlight(newReceiverFinanceType, driver);
		localHelper.clickElement(newReceiverFinanceType, driver);
		localHelper.clickElement(paypalFinance, driver);
		logger.info("Finance type Paypal is selected");
	}

	public boolean checknewReceiverPaypalMailBoxIsEnabled() {
		localHelper.jsExecutorHighlight(newReceiverPaypalMailBox, driver);
		return driver.findElement(newReceiverPaypalMailBox).isEnabled();
	}

	public void enternewReceiverPaypalMail(String paypalmail) {
		localHelper.jsExecutorHighlight(newReceiverPaypalMailBox, driver);
		localHelper.sendKeys(newReceiverPaypalMailBox, paypalmail, driver);
	}

	public void enternewReceiverFinanceType2() {
		localHelper.jsExecutorHighlight(newReceiverFinanceType, driver);
		localHelper.clickElement(newReceiverFinanceType, driver);
		localHelper.clickElement(venmoFinance, driver);
		logger.info("Finance type Venmo is selected");
	}

	public boolean ChecknewReceiverVenmoIdBoxIsEnabled() {
		localHelper.jsExecutorHighlight(newReceiverVenmoId, driver);
		return driver.findElement(newReceiverVenmoId).isEnabled();
	}

	public void enternewReceiverFinanceType3() {
		localHelper.jsExecutorHighlight(newReceiverFinanceType, driver);
		localHelper.clickElement(newReceiverFinanceType, driver);
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

	public void enterBankaccountNum(String bankaccountnum) {
		localHelper.jsExecutorHighlight(bankAccountNum, driver);
		localHelper.sendKeys(bankAccountNum, bankaccountnum, driver);
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
			localHelper.jsExecutorHighlight(newReceiverNextButton, driver);
			localHelper.clickElement(newReceiverNextButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(newReceiverNextButton, driver);
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
		By xpath=By.xpath ("//p[text()='" + firstname + " " + lastName+ "']//ancestor::div[contains(@class,'MuiDataGrid-cell')]//following-sibling::div[contains(@data-field,'actions')]//button");
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
