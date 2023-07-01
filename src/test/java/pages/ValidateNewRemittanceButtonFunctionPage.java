package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pom.ValidateNewRemittanceButtonFunctionPOM;
import utilities.LocalHelper;
import utilities.TestUtil;


public class ValidateNewRemittanceButtonFunctionPage extends ValidateNewRemittanceButtonFunctionPOM  {
	protected static final Logger logger = LoggerFactory.getLogger(ValidateNewRemittanceButtonFunctionPage.class);

	private final LocalHelper localHelper = new LocalHelper();

	private final WebDriver driver;

	public ValidateNewRemittanceButtonFunctionPage(WebDriver driver) {
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
	public void clickNewRemittanceButton() {
		try {
			localHelper.jsExecutorHighlight(newRemittanceButton, driver);
			localHelper.clickElement(newRemittanceButton, driver);
		} catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(newRemittanceButton, driver);
		}
		logger.info("New Remittance button is clicked");
	}
	public String CheckClientInfoPage() {
		localHelper.jsExecutorHighlight(clientInfo, driver);
		return localHelper.getText(clientInfo, driver);
	}
	public boolean checkRemittanceTypeRadioButtonP2P() {
		
		return driver.findElement(remittanceTypeP2P).isSelected();
	}
	public boolean checkRemittanceTypeRadioButtonP2B() {
	
		return driver.findElement(remittanceTypeP2B).isSelected();
	}
	public boolean checkRemittanceTypeRadioButtonB2B() {
		return driver.findElement(remittanceTypeB2B).isSelected();
	}
	public boolean checkRemittanceTypeRadioButtonB2P() {
		return driver.findElement(remittanceTypeB2P).isSelected();
	}
	 public void clickRemittanceTypeRadioButtonP2B() {
			try {
				driver.findElement(By.xpath("(//input[@name='type'])[2]")).sendKeys(Keys.SPACE);
				//localHelper.clickElement(remittanceTypeP2B, driver);
			} catch (ElementClickInterceptedException m) {
				//localHelper.jsExecutorClick(remittanceTypeP2B, driver);
				driver.findElement(By.xpath("(//input[@name='type'])[2]")).sendKeys(Keys.SPACE);
			}
			 logger.info("Remittance type P2B radio button is selected");
	 }
	 public void clickRemittanceTypeRadioButtonB2B() {
			try {
				driver.findElement(By.xpath("(//input[@name='type'])[3]")).sendKeys(Keys.SPACE);
				//localHelper.clickElement(remittanceTypeB2B, driver);
			} catch (ElementClickInterceptedException m) {
				driver.findElement(By.xpath("(//input[@name='type'])[3]")).sendKeys(Keys.SPACE);
				//localHelper.jsExecutorClick(remittanceTypeB2B, driver);
			}
			 logger.info("Remittance type B2B radio button is selected");
	 }
	 public void clickRemittanceTypeRadioButtonB2P() {
			try {
				driver.findElement(By.xpath("(//input[@name='type'])[4]")).sendKeys(Keys.SPACE);
				//localHelper.clickElement(remittanceTypeB2P, driver);
			} catch (ElementClickInterceptedException m) {
				driver.findElement(By.xpath("(//input[@name='type'])[4]")).sendKeys(Keys.SPACE);
				//localHelper.jsExecutorClick(remittanceTypeB2P, driver);
			}
			 logger.info("Remittance type B2P radio button is selected");
	 }
	public boolean checkPurposeOfRemittanceInputBox() {
		localHelper.jsExecutorHighlight(purposeOfRemittance, driver);
		return driver.findElement(purposeOfRemittance).isDisplayed();
	}
	 public void enterPurposeOfRemittanceInputboxWithSalary() {
		 localHelper.jsExecutorHighlight(purposeOfRemittance, driver);
		 localHelper.clickElement(purposeOfRemittance,driver);
		 localHelper.clickElement(purposeSalary,driver);
		 logger.info("Purpose of Remittance Salary option is selected");
	 }
	 public void enterPurposeOfRemittanceInputboxWithBusinessFund() {
		 localHelper.jsExecutorHighlight(purposeOfRemittance, driver);
		 localHelper.clickElement(purposeOfRemittance,driver);
		 localHelper.clickElement(purposeBusinessFund,driver);
		 logger.info("Purpose of Remittance BusinessFund option is selected");
	 }
	 public void enterPurposeOfRemittanceInputboxWithPesonel() {
		 localHelper.jsExecutorHighlight(purposeOfRemittance, driver);
		 localHelper.clickElement(purposeOfRemittance,driver);
		 localHelper.clickElement(purposePesonel,driver);
		 logger.info("Purpose of Remittance Personel option is selected");
	 }
	 public void enterPurposeOfRemittanceInputboxWithOther() {
		 localHelper.jsExecutorHighlight(purposeOfRemittance, driver);
		 localHelper.clickElement(purposeOfRemittance,driver);
		 localHelper.clickElement(purposeOther,driver);
		 logger.info("Purpose of Remittance Other option is selected");
	 }
	 public boolean checkPurposeOtherInputbox() {
			localHelper.jsExecutorHighlight(inputBoxOtherPurpose, driver);
			return driver.findElement(inputBoxOtherPurpose).isDisplayed();
		}
	 public boolean checkSenderDropdownIsPresent() {
			localHelper.jsExecutorHighlight(senderBox, driver);
			return driver.findElement(senderBox).isDisplayed();
		}
	 
	 public void enterSenderName() {
		 localHelper.jsExecutorHighlight(senderBox, driver);
		 localHelper.clickElement(senderBox,driver);
		 localHelper.clickElement(senderName,driver);
		 logger.info("Sender is selected");
	 }
	 public boolean checkTargetCountryDropdownIsPresent() {
			localHelper.jsExecutorHighlight(targetCountry, driver);
			return driver.findElement(targetCountry).isDisplayed();
		}
	 public void enterTargetCountryName() {
		 localHelper.jsExecutorHighlight(targetCountry, driver);
		 localHelper.clickElement(targetCountry,driver);
		 localHelper.clickElement(targetCountryName,driver);
		 logger.info("Target country is selected");
	 }
	 public boolean checkSenderDetails() {
			localHelper.jsExecutorHighlight(senderDetailsBox, driver);
			return driver.findElement(senderDetailsBox).isDisplayed();
		}
	 public boolean checkSenderDetailFirstName() {
			localHelper.jsExecutorHighlight(senderDetailFirstName, driver);
			return driver.findElement(senderDetailFirstName).isDisplayed();
		}
	 public boolean checkSenderDetailLastName() {
			localHelper.jsExecutorHighlight(senderDetailLastName, driver);
			return driver.findElement(senderDetailLastName).isDisplayed();
		}
	 public boolean checkSenderDetailBusinessName() {
			localHelper.jsExecutorHighlight(senderDetailBusinessName, driver);
			return driver.findElement(senderDetailBusinessName).isDisplayed();
		}
	 public boolean checkSenderDetailPrimaryContactName() {
			localHelper.jsExecutorHighlight(senderDetailPrimaryContactName, driver);
			return driver.findElement(senderDetailPrimaryContactName).isDisplayed();
		}
	 public boolean checkSenderDetailPhone() {
			localHelper.jsExecutorHighlight(senderDetailPhone, driver);
			return driver.findElement(senderDetailPhone).isDisplayed();
		}
	 public boolean checkSenderDetailCity() {
			localHelper.jsExecutorHighlight(senderDetailCity, driver);
			return driver.findElement(senderDetailCity).isDisplayed();
		}
	 public boolean checkSenderDetailProvince() {
			localHelper.jsExecutorHighlight(senderDetailProvince, driver);
			return driver.findElement(senderDetailProvince).isDisplayed();
		}
	 public boolean checkSenderDetailCountry() {
			localHelper.jsExecutorHighlight(senderDetailCountry, driver);
			return driver.findElement(senderDetailCountry).isDisplayed();
		}
	 public boolean checkSenderDetailAddress() {
			localHelper.jsExecutorHighlight(senderDetailAddress, driver);
			return driver.findElement(senderDetailAddress).isDisplayed();
		}
	 public void clickAddNewDocument() {
			try {
				localHelper.jsExecutorHighlight(addNewDocument, driver);
				localHelper.clickElement(addNewDocument, driver);
			} catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(addNewDocument, driver);
			}
			 logger.info("Add new document button is clicked");
		}
	 public boolean checkDocumentTypeInputbox() {
			localHelper.jsExecutorHighlight(documentType, driver);
			return driver.findElement(documentType).isDisplayed();
		}
	 public void checkAddDocumentAdhaar() {
		 localHelper.jsExecutorHighlight(documentType, driver);
		 localHelper.clickElement(documentType,driver);
		 localHelper.clickElement(documentAdhaar,driver);
		 logger.info("Document option Adhaar is selected");
	 }
	 public void checkAddDocumentPassport() {
		 localHelper.jsExecutorHighlight(documentType, driver);
		 localHelper.clickElement(documentType,driver);
		 localHelper.clickElement(documentPassport,driver);
		 logger.info("Document option Passport is selected");
	 }
	 public void checkAddDocumentDrivingLicence() {
		 localHelper.jsExecutorHighlight(documentType, driver);
		 localHelper.clickElement(documentType,driver);
		 localHelper.clickElement(documentDrivingLicence,driver);
		 logger.info("Document option DrivingLicence is selected");
	 }
	 public void checkAddDocumentPanCard() {
		 localHelper.jsExecutorHighlight(documentType, driver);
		 localHelper.clickElement(documentType,driver);
		 localHelper.clickElement(documentPanCard,driver);
		 logger.info("Document option Pancard is selected");
	 }
	 public boolean checkDocumentNameInputbox() {
			localHelper.jsExecutorHighlight(documentNameInputbox, driver);
			return driver.findElement(documentNameInputbox).isDisplayed();
		}
	 public void enterDocumentName(String documentname) {
			localHelper.jsExecutorHighlight(documentNameInputbox, driver);
			localHelper.sendKeys(documentNameInputbox,documentname, driver);
			 logger.info("Document name is entered");
		}
	 public boolean checkDocumentUploadBox() {
			localHelper.jsExecutorHighlight(documentUploadInputbox, driver);
			return driver.findElement(documentUploadInputbox).isDisplayed();
		}
	 public void uploadDocumentFromLocal() throws AWTException, InterruptedException {
			
			localHelper.clickElement(documentUploadInputbox, driver);
			String file=System.getProperty("user.dir")+"\\UploadDocuments\\Pancard.jpg";
			//String file=System.setproperty("C:\\Users\\chennai\\Documents\\Pancard.jpg";
			localHelper.uploadUsingRobot(file, driver, documentUploadInputbox);
			 logger.info("Document uploaded");
		}
	 
	 public boolean checkCancelButton() {
			localHelper.jsExecutorHighlight(cancelButton, driver);
			return driver.findElement(cancelButton).isDisplayed();
		}
	 public boolean checkUploadButton() {
			localHelper.jsExecutorHighlight(uploadButton, driver);
			return driver.findElement(uploadButton).isDisplayed();
		}
	 public void clickUploadButton() throws InterruptedException {
			try {
				localHelper.jsExecutorHighlight(uploadButton, driver);
				localHelper.clickElement(uploadButton, driver);
			} catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(uploadButton, driver);
			}
			 logger.info("Upload button is clicked");
	 }
	 public boolean checkFilePreviewButton() {
			//localHelper.jsExecutorHighlight(filePreviewButton, driver);
			return driver.findElement(filePreviewButton).isEnabled();
		}
	 public boolean checkFileDeleteButton() {
			localHelper.jsExecutorHighlight(fileDeleteButton, driver);
			return driver.findElement(fileDeleteButton).isEnabled();
		}
	 public boolean checkSenderDeclarationCheckbox() {
			//localHelper.jsExecutorHighlight(senderDeclarationCheckbox, driver);
		 localHelper.scrollIntoView(senderDeclaration, driver);
			return driver.findElement(senderDeclarationCheckbox).isSelected();
		}
	 public void clickSenderDeclarationCheckbox() {
			try {
				localHelper.clickElement(senderDeclarationCheckbox, driver);
			} catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(senderDeclarationCheckbox, driver);
			}
			 logger.info("Sender Declaration checkbox is selected");
	 }
	 public void clickUploadedFileImage() {
			try {
				localHelper.clickElement(clickOnImage, driver);
			} catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(clickOnImage, driver);
			}
			 logger.info("Uploaded document image is clicked");
	 }
	 public void clickClientInfoPageNextButton() {
			try {
				localHelper.jsExecutorHighlight(clientInfoPageNextButton, driver);
				localHelper.clickElement(clientInfoPageNextButton, driver);
			} catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(clientInfoPageNextButton, driver);
			} 
			logger.info("Client info page Next button is clicked");
	 }
	 public boolean checkRecipientInfoPage() {
			localHelper.jsExecutorHighlight(recipientInfo, driver);
			return driver.findElement(recipientInfo).isDisplayed();
		}
	 public boolean checkEndBenificiaryNameBox() {
			localHelper.jsExecutorHighlight(endBenefieciaryInputbox, driver);
			return driver.findElement(endBenefieciaryInputbox).isDisplayed();
		}
	 public void enterEndBenificiaryName() throws InterruptedException {
		 try {
		 Thread.sleep(2000);
		 localHelper.clickElement(endBenefieciaryInputbox,driver);
		 localHelper.clickElement(endBenefieciaryName,driver);
		 }
		 catch(StaleElementReferenceException s) {
			 localHelper.clickElement(endBenefieciaryInputbox,driver);
			 localHelper.clickElement(endBenefieciaryName,driver);
		 }
		 logger.info("End Beneficiary name is entered");
	 }
	 public boolean checkEndBenificiaryAccountNumBox() {
			localHelper.jsExecutorHighlight(endBenefieciaryAccountInputbox, driver);
			return driver.findElement(endBenefieciaryAccountInputbox).isDisplayed();
		}
	 public void enterEndBenificiaryAccountNum() throws InterruptedException {
		 Thread.sleep(2000);
		 localHelper.clickElement(endBenefieciaryAccountInputbox,driver);
		 localHelper.clickElement(endBenefieciaryAccountNumber,driver);
		 logger.info("End Beneficiary Account number is entered");
	 }
	 public String CheckRecipientDetails() {
			localHelper.jsExecutorHighlight(recipientDetails, driver);
			return localHelper.getText(recipientDetails, driver);
		}
	 public String CheckRecipientFirstname() {
			localHelper.jsExecutorHighlight(recipientFirstname, driver);
			return localHelper.getText(recipientFirstname, driver);
		}
	 public String CheckRecipientLastname() {
			localHelper.jsExecutorHighlight(recipientLastname, driver);
			return localHelper.getText(recipientLastname, driver);
		}
	 public String CheckRecipientBusinessname() {
			localHelper.jsExecutorHighlight(recipientBusinessname, driver);
			return localHelper.getText(recipientBusinessname, driver);
		}
	 public String CheckRecipientPrimaryContactname() {
			localHelper.jsExecutorHighlight(recipientPrimaryContactname, driver);
			return localHelper.getText(recipientPrimaryContactname, driver);
		}
	 public String CheckRecipientPhone() {
			localHelper.jsExecutorHighlight(recipientPhone, driver);
			return localHelper.getText(recipientPhone, driver);
		}
	 public String CheckRecipientCity() {
			localHelper.jsExecutorHighlight(recipientCity, driver);
			return localHelper.getText(recipientCity, driver);
		}
	 public String CheckRecipientProvince() {
			localHelper.jsExecutorHighlight(recipientProvince, driver);
			return localHelper.getText(recipientProvince, driver);
		}
	 public String CheckRecipientCountry() {
			localHelper.jsExecutorHighlight(recipientCountry, driver);
			return localHelper.getText(recipientCountry, driver);
		}
	 public String CheckRecipientAddress() {
			localHelper.jsExecutorHighlight(recipientAddress, driver);
			return localHelper.getText(recipientAddress, driver);
		}
	 public String CheckRecipientFinancialDetails() {
			localHelper.jsExecutorHighlight(recipientFinancialDetails, driver);
			return localHelper.getText(recipientFinancialDetails, driver);
		}
	 public String CheckRecipientBankNames() {
			localHelper.jsExecutorHighlight(recipientBankName, driver);
			return localHelper.getText(recipientBankName, driver);
		}
	 public String CheckRecipientBankBranch() {
			localHelper.jsExecutorHighlight(recipientBankBranch, driver);
			return localHelper.getText(recipientBankBranch, driver);
		}
	 public String CheckRecipientBankAcNum() {
			localHelper.jsExecutorHighlight(recipientBankAcNum, driver);
			localHelper.scrollIntoView(recipientInfoNextButton, driver);
			return localHelper.getText(recipientBankAcNum, driver);
		}
	 public String CheckRecipientBankLEICode() {
			localHelper.jsExecutorHighlight(recipientBankLEICode, driver);
			return localHelper.getText(recipientBankLEICode, driver);
		}
	 public String CheckRecipientBankIBAN() {
			localHelper.jsExecutorHighlight(recipientBankIBAN, driver);
			return localHelper.getText(recipientBankIBAN, driver);
		}
	 public String CheckRecipientBankSwiftBICcode() {
			localHelper.jsExecutorHighlight(recipientBankSwiftBICcode, driver);
			return localHelper.getText(recipientBankSwiftBICcode, driver);
		}
	 public String CheckRecipientBankTransitNum() {
			localHelper.jsExecutorHighlight(recipientBankTransitNum, driver);
			return localHelper.getText(recipientBankTransitNum, driver);
		}
	 public String CheckRecipientBankABARoutingNum() {
			localHelper.jsExecutorHighlight(recipientBankABARoutingNum, driver);
			return localHelper.getText(recipientBankABARoutingNum, driver);
		}
	 public String CheckRecipientBankIFSCcode() {
			localHelper.jsExecutorHighlight(recipientBankIFSCcode, driver);
			return localHelper.getText(recipientBankIFSCcode, driver);
		}
	 public String CheckRecipientBankAddress() {
			localHelper.jsExecutorHighlight(recipientBankAddress, driver);
			return localHelper.getText(recipientBankAddress, driver);
		}
	 public boolean CheckRecipientInfoBackButton() {
			localHelper.jsExecutorHighlight(recipientInfoBackButton, driver);
			return driver.findElement(recipientInfoBackButton).isDisplayed();
		}
	 public boolean CheckRecipientInfoNextButton() {
			localHelper.jsExecutorHighlight(recipientInfoNextButton, driver);
			return driver.findElement(recipientInfoNextButton).isDisplayed();
		}
	 public void clickRecipientInfoPageNextButton() {
			try {
				localHelper.jsExecutorHighlight(recipientInfoNextButton, driver);
				localHelper.clickElement(recipientInfoNextButton, driver);
			} catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(recipientInfoNextButton, driver);
			} 
			logger.info("Recipient info page Next button is clicked");
	 }
	 
	 public String CheckTransferDetailPage() {
			localHelper.jsExecutorHighlight(transferDetail, driver);
			return localHelper.getText(transferDetail, driver);
		}
	 public boolean CheckRecipientMTObox() {
			localHelper.jsExecutorHighlight(recipientMTOBox, driver);
			return driver.findElement(recipientMTOBox).isDisplayed();
		}
	 public boolean CheckAmountToRemitbox() {
			localHelper.jsExecutorHighlight(amountToRemit, driver);
			return driver.findElement(amountToRemit).isDisplayed();
		}
	 public boolean CheckCurrencyRemitbox() {
			localHelper.jsExecutorHighlight(remitCurrency, driver);
			return driver.findElement(remitCurrency).isDisplayed();
		}
	 public boolean CheckamountToReceivebox() {
			localHelper.jsExecutorHighlight(amountToReceive, driver);
			return driver.findElement(amountToReceive).isDisplayed();
		}
	 public boolean CheckCurrencyReceivebox() {
			localHelper.jsExecutorHighlight(receiveCurrency, driver);
			return driver.findElement(receiveCurrency).isDisplayed();
		}
	 public boolean CheckOperatingWalletbox() {
			localHelper.jsExecutorHighlight(operatingWallet, driver);
			return driver.findElement(operatingWallet).isDisplayed();
		}
	 public boolean CheckBalance() {
			localHelper.jsExecutorHighlight(balance, driver);
			return driver.findElement(balance).isDisplayed();
		}
	 public boolean CheckBalanceAmount() {
			localHelper.jsExecutorHighlight(balanceValue, driver);
			return driver.findElement(balanceValue).isDisplayed();
		}
	 public boolean CheckAddMoneyButton() {
			localHelper.jsExecutorHighlight(addMoneyButton, driver);
			return driver.findElement(addMoneyButton).isDisplayed();
		}
	 public boolean CheckRefreshButton() {
			localHelper.jsExecutorHighlight(balanceRefreshButton, driver);
			return driver.findElement(balanceRefreshButton).isDisplayed();
		}
	 public boolean CheckTransferPageCancelButton() {
			localHelper.jsExecutorHighlight(transferDetailCancelButton, driver);
			return driver.findElement(transferDetailCancelButton).isDisplayed();
		}
	 public boolean CheckTransferPageNextButton() {
			localHelper.jsExecutorHighlight(transferDetailNextButton, driver);
			return driver.findElement(transferDetailNextButton).isDisplayed();
		}
	 public void enterRecipientMTOBox() {
		 localHelper.jsExecutorHighlight(recipientMTOBox, driver);
		 localHelper.clickElement(recipientMTOBox,driver);
		 localHelper.clickElement(recipientMTOValue,driver);
		 logger.info("Recipient MTO is selected");
	 }
	 public void enterAmountToRemit() {
			localHelper.jsExecutorHighlight(amountToRemit, driver);
			localHelper.sendKeys(amountToRemit,new TestUtil().init_Properties().getProperty("remitamount"),driver);
			logger.info("Remit amount is entered");
		}
	 public void enterAmountToReceive(String receiveamount) {
			localHelper.jsExecutorHighlight(amountToReceive, driver);
			localHelper.sendKeys(amountToReceive,receiveamount,driver);
			logger.info("Receive amount is displayed");
		}
	 public void enterOperatingWallet() {
		 localHelper.jsExecutorHighlight(operatingWallet, driver);
		 localHelper.clickElement(operatingWallet,driver);
		 localHelper.clickElement(operatingWalletValue,driver);
		 logger.info("Oprating Wallet is selected");
	 }
	 public void enterCustomerPaidTypeCash() {
		 localHelper.jsExecutorHighlight(customerPaidIn, driver);
		 localHelper.clickElement(customerPaidIn,driver);
		 localHelper.clickElement(customerPaidInTypeCash,driver);
		 logger.info("Customer Paid type Cash is selected");
	 }
	 public void enterCustomerPaidTypePaypal() {
		 localHelper.jsExecutorHighlight(customerPaidIn, driver);
		 localHelper.clickElement(customerPaidIn,driver);
		 localHelper.clickElement(customerPaidInTypePaypal,driver);
		 logger.info("Customer Paid type Paypal is selected");
	 }
	 public void enterCustomerPaidTypeOthers() {
		 localHelper.jsExecutorHighlight(customerPaidIn, driver);
		 localHelper.clickElement(customerPaidIn,driver);
		 localHelper.clickElement(customerPaidInTypeOthers,driver);
		 logger.info("Customer Paid type Others is selected");
	 }
	 public boolean CheckCustomerPaidTypeOtherSpecBox() {
			localHelper.jsExecutorHighlight(customerPaidInTypeOthersSpec, driver);
			return driver.findElement(customerPaidInTypeOthersSpec).isDisplayed();
		}
	 public void enterCustomerPaidTypeBank() {
		 localHelper.jsExecutorHighlight(customerPaidIn, driver);
		 localHelper.clickElement(customerPaidIn,driver);
		 localHelper.clickElement(customerPaidInTypeBank,driver);
		 logger.info("Customer Paid type Bank is selected");
	 }
	 public String CheckWalletBalanceIsDisplayed() {
			localHelper.jsExecutorHighlight(balance, driver);
			localHelper.jsExecutorHighlight(balanceValue, driver);
			return localHelper.getText(balance, driver);
		}
	 public void clickAddMoneyButton() {
			try {
				localHelper.clickElement(addMoneyButton, driver);
				localHelper.clickElement(addMoneyButton, driver);
			} catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(addMoneyButton, driver);
				localHelper.jsExecutorClick(addMoneyButton, driver);
			} 
			logger.info("Add money button is clicked");
	 }
	 public void enterAddMoneyFromAmount() throws InterruptedException {
			localHelper.jsExecutorHighlight(addMoneyFromAmountInputbox, driver);
			Thread.sleep(3000);
			localHelper.jsExecutorSendValue(addMoneyFromAmountInputbox,new TestUtil().init_Properties().getProperty("addmoneyfromamount"),driver);
			
			logger.info("Add money from amount is entered");
		}
	 public void enterAddMoneyRemark() {
			localHelper.jsExecutorHighlight(addMoneyRemarksInputbox, driver);
			localHelper.sendKeys(addMoneyRemarksInputbox,new TestUtil().init_Properties().getProperty("addmoneyremark"),driver);
			logger.info("Add money Remark is entered");
		}
	 public void clickAddMoneyNextButton() {
			try {
				localHelper.jsExecutorHighlight(addMoneyNextButton, driver);
				localHelper.clickElement(addMoneyNextButton, driver);
			} catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(addMoneyNextButton, driver);
			} 
			logger.info("Add money Next button is clicked");
	 }
	 public void enterUserPassword() {
			localHelper.jsExecutorHighlight(passwordInputbox, driver);
			localHelper.sendKeys(passwordInputbox,new TestUtil().init_Properties().getProperty("commonPassword"),driver);
			logger.info("Password is entered");
		}
	 
	 public void clickTransferButton() {
			try {
				localHelper.jsExecutorHighlight(transferButton, driver);
				localHelper.clickElement(transferButton, driver);
			} catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(transferButton, driver);
			} 
			logger.info("Transfer button is clicked");
	 }
	 public void enterSenderMTOFeeAmount() {
			localHelper.jsExecutorHighlight(senderMTOFeeInputbox, driver);
			localHelper.sendKeys(senderMTOFeeInputbox,new TestUtil().init_Properties().getProperty("sendermtofee"),driver);
			logger.info("Sender MTO fee is entered");
		}
	 public void clickTransferPageNextButton() {
			try {
				localHelper.jsExecutorHighlight(transferDetailNextButton, driver);
				localHelper.clickElement(transferDetailNextButton, driver);
			} catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(transferDetailNextButton, driver);
			} 
			logger.info("Transfer Page Next button is clicked");
	 }
	 public boolean checkPreviewAndSubmitPage() {
			localHelper.jsExecutorHighlight(previewAndSubmitPage, driver);
			return driver.findElement(previewAndSubmitPage).isDisplayed();
		}
	 public boolean checkRemittanceDetails() {
			localHelper.jsExecutorHighlight(remittanceDetails, driver);
			return driver.findElement(remittanceDetails).isDisplayed();
		}
	 public boolean checkRemittanceAmount() {
			localHelper.jsExecutorHighlight(remittanceAmount, driver);
			return driver.findElement(remittanceAmount).isDisplayed();
		}
	 public boolean checkSenderMTOfee() {
			localHelper.jsExecutorHighlight(senderMTOfee, driver);
			return driver.findElement(senderMTOfee).isDisplayed();
		}
	 public boolean checkTotalDepositAmount() {
			localHelper.jsExecutorHighlight(totalDepositAmount, driver);
			return driver.findElement(totalDepositAmount).isDisplayed();
		}
	 public boolean checkAmountPayout() {
			localHelper.jsExecutorHighlight(amountPayout, driver);
			return driver.findElement(amountPayout).isDisplayed();
		}
	 public boolean checkDepositType() {
			localHelper.jsExecutorHighlight(depositType, driver);
			return driver.findElement(depositType).isDisplayed();
		}
	 public boolean checkRemittancePurpose() {
			localHelper.jsExecutorHighlight(remittancePurpose, driver);
			return driver.findElement(remittancePurpose).isDisplayed();
		}
	 public boolean checkConversionRate() {
			localHelper.jsExecutorHighlight(conversionRate, driver);
			return driver.findElement(conversionRate).isDisplayed();
		}
	 public boolean checkRemittanceType() {
			localHelper.jsExecutorHighlight(remittanceType, driver);
			return driver.findElement(remittanceType).isDisplayed();
		}
	 public boolean checkRemittaneDate() {
			localHelper.jsExecutorHighlight(remittaneDate, driver);
			return driver.findElement(remittaneDate).isDisplayed();
		}
	 public boolean checkRemittanceCreatedby() {
			localHelper.jsExecutorHighlight(createdby, driver);
			return driver.findElement(createdby).isDisplayed();
		}
	  
	 public boolean checkSenderDetailsFinalPreview() {
			localHelper.jsExecutorHighlight(senderDetailsBox, driver);
			return driver.findElement(senderDetailsBox).isDisplayed();
		}
	 public boolean checkSenderDetailFirstNameFinalPreview() {
			localHelper.jsExecutorHighlight(senderDetailFirstName, driver);
			return driver.findElement(senderDetailFirstName).isDisplayed();
		}
	 public boolean checkSenderDetailLastNameFinalPreview() {
			localHelper.jsExecutorHighlight(senderDetailLastName, driver);
			return driver.findElement(senderDetailLastName).isDisplayed();
		}
	 public boolean checkSenderBusinessNameFinalPreview() {
			localHelper.jsExecutorHighlight(senderDetailBusinessName, driver);
			return driver.findElement(senderDetailBusinessName).isDisplayed();
		}
	 public boolean checkSenderDetailPrimaryContactNameFinalPreview() {
			localHelper.jsExecutorHighlight(senderDetailPrimaryContactName, driver);
			return driver.findElement(senderDetailPrimaryContactName).isDisplayed();
		}
	 public boolean checkSenderDetailPhoneFinalPreview() {
			localHelper.jsExecutorHighlight(senderDetailPhone, driver);
			return driver.findElement(senderDetailPhone).isDisplayed();
		}
	 public boolean checkSenderDetailCityFinalPreview() {
			localHelper.jsExecutorHighlight(senderDetailCity, driver);
			return driver.findElement(senderDetailCity).isDisplayed();
		}
	 public boolean checkSenderDetailProvinceFinalPreview() {
			localHelper.jsExecutorHighlight(senderDetailProvince, driver);
			return driver.findElement(senderDetailProvince).isDisplayed();
		}
	 public boolean checkSenderDetailCountryFinalPreview() {
			localHelper.jsExecutorHighlight(senderDetailCountry, driver);
			return driver.findElement(senderDetailCountry).isDisplayed();
		}
	 public boolean checkSenderDetailAddressFinalPreview() {
			localHelper.jsExecutorHighlight(senderDetailAddress, driver);
			return driver.findElement(senderDetailAddress).isDisplayed();
		}
	 public boolean checkSenderDetailDocumentsFinalPreview() {
			localHelper.jsExecutorHighlight(senderDocuments, driver);
			return driver.findElement(senderDocuments).isDisplayed();
		}
	 
	 public boolean checkRecipientDetailsFinalPreview() {
			localHelper.jsExecutorHighlight(recipientDetailsFinalPreview, driver);
			return driver.findElement(recipientDetailsFinalPreview).isDisplayed();
		}
	 public boolean checkRecipientFirstnameFinalPreview() {
			localHelper.jsExecutorHighlight(recipientFirstnameFinalPreview, driver);
			return driver.findElement(recipientFirstnameFinalPreview).isDisplayed();
		}
	 public boolean checkRecipientLastnameFinalPreview() {
			localHelper.jsExecutorHighlight(recipientLastnameFinalPreview, driver);
			return driver.findElement(recipientLastnameFinalPreview).isDisplayed();
		}
	 public boolean checkRecipientFirstnameFinalPreviewB2P() {
			localHelper.jsExecutorHighlight(recipientFirstname, driver);
			return driver.findElement(recipientFirstname).isDisplayed();
		}
	 public boolean checkRecipientLastnameFinalPreviewB2P() {
			localHelper.jsExecutorHighlight(recipientLastname, driver);
			return driver.findElement(recipientLastname).isDisplayed();
		}
	 public boolean checkRecipientBusinessNameFinalPreview() {
			localHelper.jsExecutorHighlight(recipientBusinessnameFinalPreview, driver);
			return driver.findElement(recipientBusinessnameFinalPreview).isDisplayed();
		}
	 public boolean checkRecipientPrimaryContactNameFinalPreview() {
			localHelper.jsExecutorHighlight(recipientPrimaryContactNameFinalPreview, driver);
			return driver.findElement(recipientPrimaryContactNameFinalPreview).isDisplayed();
		}
	
	 public boolean checkRecipientPhoneFinalPreview() {
			localHelper.jsExecutorHighlight(recipientPhoneFinalPreview, driver);
			return driver.findElement(recipientPhoneFinalPreview).isDisplayed();
		}
	 public boolean checkRecipientCityFinalPreview() {
			localHelper.jsExecutorHighlight(recipientCityFinalPreview, driver);
			return driver.findElement(recipientCityFinalPreview).isDisplayed();
		}
	 public boolean checkRecipientProvinceFinalPreview() {
			localHelper.jsExecutorHighlight(recipientProvinceFinalPreview, driver);
			return driver.findElement(recipientProvinceFinalPreview).isDisplayed();
		}
	 public boolean checkRecipientCountryFinalPreview() {
			localHelper.jsExecutorHighlight(recipientCountryFinalPreview, driver);
			return driver.findElement(recipientCountryFinalPreview).isDisplayed();
		}
	 public boolean checkRecipientAddressFinalPreview() {
			localHelper.jsExecutorHighlight(recipientAddressFinalPreview, driver);
			localHelper.scrollIntoView(confirmAndSubmitButton, driver);
			return driver.findElement(recipientAddressFinalPreview).isDisplayed();
		}
	 
	 public boolean checkFinancialDetailsFinalPreview() {
			localHelper.jsExecutorHighlight(recipientFinancialDetails, driver);
			return driver.findElement(recipientFinancialDetails).isDisplayed();
		}
	 public boolean checkBankNameFinalPreview() {
			localHelper.jsExecutorHighlight(recipientBankName, driver);
			return driver.findElement(recipientBankName).isDisplayed();
		}
	 public boolean checkRecipientBankBranchFinalPreview() {
			localHelper.jsExecutorHighlight(recipientBankBranch, driver);
			return driver.findElement(recipientBankBranch).isDisplayed();
		}
	 public boolean checkBankAcNumFinalPreview() {
			localHelper.jsExecutorHighlight(recipientBankAcNum, driver);
			return driver.findElement(recipientBankAcNum).isDisplayed();
		}
	 public boolean checkBankLEICodeFinalPreview() {
			localHelper.jsExecutorHighlight(recipientBankLEICode, driver);
			return driver.findElement(recipientBankLEICode).isDisplayed();
		}
	 public boolean checkBankIBANFinalPreview() {
			localHelper.jsExecutorHighlight(recipientBankIBAN, driver);
			return driver.findElement(recipientBankIBAN).isDisplayed();
		}
	 public boolean checkBankSwiftBICcodeFinalPreview() {
			localHelper.jsExecutorHighlight(recipientBankSwiftBICcode, driver);
			return driver.findElement(recipientBankSwiftBICcode).isDisplayed();
		}
	 public boolean checkBankTransitNumFinalPreview() {
			localHelper.jsExecutorHighlight(recipientBankTransitNum, driver);
			return driver.findElement(recipientBankTransitNum).isDisplayed();
		}
	 public boolean checkBankABARoutingNumFinalPreview() {
			localHelper.jsExecutorHighlight(recipientBankABARoutingNum, driver);
			return driver.findElement(recipientBankABARoutingNum).isDisplayed();
		}
	 public boolean checkBankIFSCcodeFinalPreview() {
			localHelper.jsExecutorHighlight(recipientBankIFSCcode, driver);
			return driver.findElement(recipientBankIFSCcode).isDisplayed();
		}
	 public boolean checkBankAddressFinalPreview() {
			localHelper.jsExecutorHighlight(finacialDetailsAddressFinalPreview, driver);
			return driver.findElement(finacialDetailsAddressFinalPreview).isDisplayed();
		}
	 
	 public void clickConfirmAndSubmitButton() {
			try {
				localHelper.jsExecutorHighlight(confirmAndSubmitButton, driver);
				localHelper.clickElement(confirmAndSubmitButton, driver);
			} catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(confirmAndSubmitButton, driver);
			} 
			logger.info("Confirm And Submit button is clicked");
	 }

}
