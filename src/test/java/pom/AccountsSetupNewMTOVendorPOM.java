package pom;

import org.openqa.selenium.By;

public class AccountsSetupNewMTOVendorPOM {
	public By userEmailBox=By.xpath("//input[@id='email']");
	public By passwordBox=By.xpath("//input[@id='password']");
	public By loginButton=By.xpath("//button[@id='login-button']");
	public By accountsDropdown=By.xpath("//span[text()='Accounts' and @class='sidebar-text light_color colr font-fam']");
	public By currencies=By.xpath("//span[text()='Currencies']");
	
	public By currencyActivateButton=By.xpath("//span[text()='Activate']");
	public By passphraseSecretKeyInputbox=By.xpath("//input[@id='passphrase']");
	public By submitButton=By.xpath("//button[text()='Submit']");
	
	public By keyVerificationSuccessMsg=By.xpath("//div[text()='Trust line is activated for EUR coin']");
	public By liquidity=By.xpath("//span[text()='Liquidity Requests']");
	public By AddLiquidityButton=By.xpath("//button[text()='Add Liquidity']");
	public By liquidityAmountInputbox=By.xpath("//input[@id='liquidityAmount']");
	public By liquidityRemarksInputbox=By.xpath("//textarea[@id='remarks']");
	public By requestButton=By.xpath("//button[text()='Request']");
	public By configurationsDropdown=By.xpath("//span[text()='Configurations']");
	public By exchangeOffersButton=By.xpath("//span[text()='Exchange Offers']");
	public By newCurrencyButton=By.xpath("//button[text()='New Currency']");
	public By baseCurrencyInputbox=By.xpath("//input[@id='base_currency']");
	public By baseCurrencyValue=By.xpath("//li[text()='DKK']");
	public By CurrencyRateInputbox=By.xpath("//input[@id='rate']");
	public By addButton=By.xpath("//button[text()='Add']");
	public By clicksetupTrustlineLink=By.xpath("//p[text()='Click ']/a[text()='here']");
	
	public By currencyActivateButton1=By.xpath("//span[text()='Activate']");
	public By passphraseSecretKeyInputbox1=By.xpath("//input[@id='passphrase']");
	public By submitButton1=By.xpath("//button[text()='Submit']");
	
	public By feesDropdown=By.xpath("//span[text()='Fees']");
	public By inwardRemittanceFeesButton=By.xpath("//span[text()='Inward Remittance Fees']");
	public By outwardRemittanceFeesButton=By.xpath("//span[text()='Outward Remittance Fees']");
	public By newSlabButton=By.xpath("//button[text()='New Slab']");
	public By addNewSlabfromInputbox=By.xpath("//input[@id='from']");
	public By addNewSlabToInputbox=By.xpath("//input[@id='to']");
	public By addNewSlabFixedCostInputbox=By.xpath("//input[@id='fixed_cost']");
	public By addNewSlabPercentageChargeInputbox=By.xpath("//input[@id='percentage_charge']");
	
	public By addButton1=By.xpath("//button[text()='Add']");

	

	
	
	
}
