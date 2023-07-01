package pom;

import org.openqa.selenium.By;

public class ValidateNewRemittanceButtonFunctionPOM {
	public By userEmailBox=By.xpath("//input[@id='email']");
	public By passwordBox=By.xpath("//input[@id='password']");
	public By loginButton=By.xpath("//button[@id='login-button']");
	public By RemittanceDownArrowButton=By.xpath("//span[text()='Remittances']");
	public By outwardButton=By.xpath("//span[text()='Outward' and @class='sidebar-text light_color colr font-fam']");
	public By inwardButton=By.xpath("//span[text()='Inward' and @class='sidebar-text light_color font-fam']");
	public By allRemittance=By.xpath("//span[text()='All Remittances']");
	public By pendingCustomerRemittance=By.xpath("//span[text()='Pending Customer Remittances']");
	public By Title=By.xpath("//div/h3[text()='Outward Remittance']");
	public By titleSubmsg=By.xpath("//div/p[text()='View your remittance requests']");
	public By newRemittanceButton=By.xpath("//button[text()='New Remittance']");
	public By clientInfo=By.xpath("//span[text()='Client Info']");
	
	public By remittanceTypeP2P=By.xpath("//input[@name='type']");
	
	public By remittanceTypeP2B=By.xpath("(//input[@name='type'])[2]");
	public By remittanceTypeB2B=By.xpath("(//input[@name='type'])[3]");
	public By remittanceTypeB2P=By.xpath("(//input[@name='type'])[4]");
	public By purposeOfRemittance=By.xpath("//div[@id='purpose']");
	public By purposeSalary=By.xpath("//li[text()='Salary']");
	public By purposeBusinessFund=By.xpath("//li[text()='Business Fund']");
	public By purposePesonel=By.xpath("//li[text()='Personal']");
	public By purposeOther=By.xpath("//li[@id='Other']");
	public By inputBoxOtherPurpose=By.xpath("//input[@id='other_purpose']");
	public By senderBox=By.xpath("//input[@name='sender']");
	public By senderName=By.xpath("//li[@id='search-option-0']//p[1]");
	public By targetCountry=By.xpath("//button[@id='rfs-btn']");
	public By targetCountryName=By.xpath("//span[text()='Denmark']");
	public By senderDetailsBox=By.xpath("//h6[text()='Sender Details']");
	public By senderDetailFirstName=By.xpath("//span[text()='First Name']");
	public By senderDetailLastName=By.xpath("//span[text()='Last Name']");
	public By senderDetailBusinessName=By.xpath("//span[text()='Business Name']");
	public By senderDetailPrimaryContactName=By.xpath("//span[text()='Primary Contact Name']");
	
	public By senderDetailPhone=By.xpath("//span[text()='Phone']");
	public By senderDetailCity=By.xpath("//span[text()='City']");
	public By senderDetailProvince=By.xpath("//span[text()='Province']");
	public By senderDetailCountry=By.xpath("//span[text()='Country']");
	public By senderDetailAddress=By.xpath("//span[text()='Address']");
	public By addNewDocument=By.xpath("//div[@aria-label='Add New Document']");
	
	public By documentType=By.xpath("//div[@id='document_type']");
	public By documentAdhaar=By.xpath("//li[text()='Adhaar Card']");
	public By documentPassport=By.xpath("//li[text()='Passport']");
	public By documentDrivingLicence=By.xpath("//li[text()='Driving Licence']");
	public By documentPanCard=By.xpath("//li[text()='Pan Card']");
	public By documentNameInputbox=By.xpath("//input[@id='name']");
	
	public By documentUploadInputbox=By.xpath("//h5[text()='Drop or Select file']");
	public By uploadButton=By.xpath("//button[text()='Upload']");
	public By cancelButton=By.xpath("//button[text()='Cancel']");
	public By senderDeclaration=By.xpath("//h6[text()='Sender Declaration']");
	public By senderDeclarationCheckbox=By.xpath("//input[@type='checkbox']//following-sibling::span");
	
	public By filePreviewButton=By.xpath("//button[text()='Preview']");
	public By fileDeleteButton=By.xpath("(//button[@class='rs-btn rs-btn-subtle btn white-btn'])[2]");
	public By clickOnImage=By.xpath("//img[@alt='file preview']");
	public By clientInfoPageNextButton=By.xpath("//button[text()='Next']");
	
	public By recipientInfo=By.xpath("//span[text()='Recipient Info']");
	public By endBenefieciaryInputbox=By.xpath("//input[@id='search']");
	public By endBenefieciaryName=By.xpath("//p[contains(@class,'MuiTypography-root MuiTypography-body2')]");
	
	public By endBenefieciaryAccountInputbox=By.xpath("//input[@id='account']");
	public By endBenefieciaryAccountNumber=By.xpath("//ul[@role='listbox']//li[1]");
	
	public By recipientDetails=By.xpath("//h6[text()='Recipient Details']");
	public By recipientFirstname=By.xpath("//span[text()='First Name']");
	public By recipientLastname=By.xpath("//span[text()='Last Name']");
	public By recipientBusinessname=By.xpath("//span[text()='Business Name']");
	public By recipientPrimaryContactname=By.xpath("//span[text()='Primary Contact Name']");
	public By recipientPhone=By.xpath("//span[text()='Phone']");
	public By recipientCity=By.xpath("//span[text()='City']");
	public By recipientProvince=By.xpath("//span[text()='Province']");
	public By recipientCountry=By.xpath("//span[text()='Country']");
	public By recipientAddress=By.xpath("(//span[text()='Address'])[1]");
	
	
	public By recipientFinancialDetails=By.xpath("//h6[text()='Financial Details']");
	public By recipientBankName=By.xpath("//span[text()='Bank Name']");
	public By recipientBankBranch=By.xpath("//span[text()='Branch']");
	public By recipientBankAcNum=By.xpath("//span[text()='Account Number']");
	public By recipientBankLEICode=By.xpath("//span[text()='LEI Code']");
	public By recipientBankIBAN=By.xpath("//span[text()='IBAN']");
	public By recipientBankSwiftBICcode=By.xpath("//span[text()='SWIFT BIC Code']");
	public By recipientBankTransitNum=By.xpath("//span[text()='Transit Number']");
	public By recipientBankABARoutingNum=By.xpath("//span[text()='ABA Routing Number']");
	public By recipientBankIFSCcode=By.xpath("//span[text()='IFSC Code']");
	public By recipientBankAddress=By.xpath("(//span[text()='Address'])[2]");
	public By recipientInfoBackButton=By.xpath("//button[text()='Back']");
	public By recipientInfoNextButton=By.xpath("//button[text()='Next']");
	
	
	
	public By transferDetail=By.xpath("//span[text()='Transfer Details']");
	public By recipientMTOBox=By.xpath("//input[@id='mto']");
	public By recipientMTOValue=By.xpath("//ul[@id='mto-listbox']//li[1]"); 
	public By amountToRemit=By.xpath("//input[@id='send_amount']");
	public By remitCurrency=By.xpath("//div[@id='send_currency']");	
	public By amountToReceive=By.xpath("//input[@id='receive_amount']");
	public By receiveCurrency=By.xpath("//div[@id='receive_currency']");
	
	public By operatingWallet=By.xpath("//input[@id='sender']");
	public By operatingWalletValue=By.xpath("//li[@data-option-index='0']");
	public By customerPaidIn=By.xpath("//div[@id='deposit_type']");
	public By customerPaidInTypeCash=By.xpath("//li[text()='Cash']");
	public By customerPaidInTypePaypal=By.xpath("//li[text()='Paypal']");
	public By customerPaidInTypeBank=By.xpath("//li[text()='Bank']");
	public By customerPaidInTypeOthers=By.xpath("//li[text()='Others']");
	public By customerPaidInTypeOthersSpec=By.xpath("//textarea[@id='other_deposit']");
	
	public By balance=By.xpath("//span[text()='MTO Balance']");
	public By balanceValue=By.xpath("//h6[contains(text(), 'EUR')]");
	public By addMoneyButton=By.xpath("//button[@aria-label='add']");
	public By balanceRefreshButton=By.xpath("//button[@aria-label='refresh']");
	public By transferDetailCancelButton=By.xpath("//button[text()='Back']");
	public By transferDetailNextButton=By.xpath("//button[text()='Next']");
	public By addMoneyFromAmountInputbox=By.xpath("//input[@id='fromAmount']");
	public By addMoneyRemarksInputbox=By.xpath("//textarea[@id='remarks']");
	public By addMoneyNextButton=By.xpath("//button[text()='Next' and @type='submit']");
	public By passwordInputbox=By.xpath("//input[@type='password']");
	public By senderMTOFeeInputbox=By.xpath("//input[@id='new_rate']");
	public By transferButton=By.xpath("//button[text()='Transfer']");
	
	
	public By previewAndSubmitPage=By.xpath("//span[text()='Preview and Submit']");
	public By remittanceDetails=By.xpath("//h6[text()='Remittance Details']");
	public By remittanceAmount=By.xpath("//span[text()='Remittance Amount']");
	public By senderMTOfee=By.xpath("//span[text()='Sender MTO Fee']");
	public By totalDepositAmount=By.xpath("//span[text()='Total Deposit Amount']");
	public By amountPayout=By.xpath("//span[text()='Amount to Payout']");
	public By depositType=By.xpath("//span[text()='Deposit Type']");
	public By remittancePurpose=By.xpath("//span[text()='Purpose of Remittance']");
	public By conversionRate=By.xpath("//span[text()='Conversion Rate']");
	public By remittanceType=By.xpath("//span[text()='Type']");
	public By remittaneDate=By.xpath("//span[text()='Date of Remittance']");
	public By createdby=By.xpath("//span[text()='Created By']");
	public By senderDocuments=By.xpath("//span[text()='Documents']");
	
	public By recipientDetailsFinalPreview=By.xpath("//h6[text()='Recipient Details']");
	public By recipientFirstnameFinalPreview=By.xpath("(//span[text()='First Name'])[2]");
	public By recipientLastnameFinalPreview=By.xpath("(//span[text()='Last Name'])[2]");
	public By recipientBusinessnameFinalPreview=By.xpath("//span[text()='Business Name']");
	public By recipientPrimaryContactNameFinalPreview=By.xpath("//span[text()='Primary Contact Name']");
	public By recipientPhoneFinalPreview=By.xpath("(//span[text()='Phone'])[2]");
	public By recipientCityFinalPreview=By.xpath("(//span[text()='City'])[2]");
	public By recipientProvinceFinalPreview=By.xpath("(//span[text()='Province'])[2]");
	public By recipientCountryFinalPreview=By.xpath("(//span[text()='Country'])[2]");
	public By recipientAddressFinalPreview=By.xpath("(//span[text()='Address'])[2]");
	
	public By finacialDetailsAddressFinalPreview=By.xpath("(//span[text()='Address'])[3]");
	public By confirmAndSubmitButton=By.xpath("//button[text()='Confirm and Submit']");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
