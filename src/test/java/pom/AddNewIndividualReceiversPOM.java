package pom;

import org.openqa.selenium.By;

public class AddNewIndividualReceiversPOM {
	public By userEmailBox=By.xpath("//input[@id='email']");
	public By passwordBox=By.xpath("//input[@id='password']");
	public By loginButton=By.xpath("//button[@id='login-button']");
	public By clientDownArrowButton=By.xpath("//span[text()='Clients']");
	public By senderButton=By.xpath("//span[text()='Senders']");
	public By receiverButton=By.xpath("//span[text()='Receivers']");
	public By receiverIndividualButton=By.xpath("(//span[text()='Individual'])[2]");
	
	
	public By individualReceiverClientPage=By.xpath("//div/h3[text()='Individual Receivers']");
	public By Title=By.xpath("//div/p[text()='View your individual receiver clients']");
	public By searchBox=By.xpath("//input[@placeholder='Search']");
	public By newReceiverButton=By.xpath("//button[text()='New Receiver']");
	public By newReceiverFirstName=By.xpath("//input[@id='first_name']");
	public By newReceiverLastName=By.xpath("//input[@id='last_name']");
	public By newReceiverBelongsTo=By.xpath("//div/input[@id='sender']");
	public By belongsToValue=By.xpath("//ul[@role='listbox']//li[1]");
	public By newReceiverPhoneNum=By.xpath("//div[contains(@class,'phone-container')]//input");
	public By newReceiverCountry=By.xpath("//div[@data-testid='rfs']");
	public By countryName=By.xpath("//span[text()='Denmark']");
	
	public By newReceiverProvince=By.xpath("//div[@id='province']");
	public By provinceState=By.xpath("//li[text()='Capital Region']");
	public By newReceiverCity=By.xpath("//div[@id='city']");
	public By newReceiverCityName=By.xpath("//li[text()='Ballerup']");
	public By newReceiverAddress=By.xpath("//textarea[@id='address']");
	public By newReceiverNextButton=By.xpath("//button[text()='Next']");
	public By newReceiverCancelButton=By.xpath("//button[text()='Cancel']");
	
	public By newReceiverFinanceType=By.xpath("//div[@id='type']");
	public By paypalFinance=By.xpath("//li[text()='PAYPAL']");
	public By newReceiverPaypalMailBox=By.xpath("//input[@id='email']");
	public By venmoFinance=By.xpath("//li[text()='VENMO']");
	public By newReceiverVenmoId=By.xpath("//input[@id='venmo_id']");
	public By bankFinance=By.xpath("//li[text()='BANK']");
	public By Bankname=By.xpath("//input[@id='name']");
	public By bankAccountNum=By.xpath("//input[@id='account_no']");
	public By bankIban=By.xpath("//input[@id='iban']");
	public By bankSwiftBICCode=By.xpath("//input[@id='swift_code']");
	public By bankBranchNum=By.xpath("//input[@id='branch']");
	public By bankTransitNum=By.xpath("//input[@id='transit_number']");
	public By bankABARoutingNum=By.xpath("//input[@id='aba_number']");
	public By bankIFSC=By.xpath("//input[@id='ifsc_code']");
	public By bankLEICode=By.xpath("//input[@id='lei_code']");
	public By bankAddress=By.xpath("//textarea[@id='address']");
	public By cancelButton=By.xpath("//button[text()='Cancel']");
	public By backButton=By.xpath("//button[text()='Back']");
	public By saveAsDraftButton=By.xpath("//button[text()='Save as Draft']");
	public By saveActivateButton=By.xpath("//button[text()='Save and Activate']");
	
	public By idBox=By.xpath("//div[@data-field='id' and @aria-label='ID']");
	public By nameBox=By.xpath("//div[text()='Name']");
	public By firstNameBox=By.xpath("(//div[@class='css-1qvsmr0'])[1]");
	public By xrplBox=By.xpath("//div[text()='Xrpl tag']");
	public By belongsToBox=By.xpath("//div[text()='Belongs To']");
	public By cityBox=By.xpath("//div[text()='City']");
	public By firstCityBox=By.xpath("//div[@data-field='city']");
	public By provinceBox=By.xpath("//div[text()='Province']");
	public By firstProvinceBox=By.xpath("//div[@data-field='province']/p");
	public By statusBox=By.xpath("//div[text()='Status']");
	public By firstStatusBox=By.xpath("//div[@data-field='status']/span");
	public By phoneNumBox=By.xpath("//div[text()='Phone Number']");
	public By firstPhoneNumBox=By.xpath("//div[@data-field='phoneNumber']/p");
	public By mailBox=By.xpath("//div[text()='Email']");
	public By firstMailBox=By.xpath("//div[@data-field='email']/p");
	public By actionBox=By.xpath("//div[text()='Actions']");
	public By EditButton=By.xpath("(//button[@aria-label='Edit'])[1]");
	

	
	

}
