package pom;

import org.openqa.selenium.By;

public class MTOVendorFirstLoginPOM {
	public By userEmailBox=By.xpath("//input[@id='email']");
	public By passwordBox=By.xpath("//input[@id='password']");
	public By loginButton=By.xpath("//button[@id='login-button']");
	public By signinSucessMsg=By.xpath("//div[text()='Signed in successfully']");
	public By welcomeMsg=By.xpath("//p[contains(text(),'Welcome')]");
	public By popup1contentMsg1=By.xpath("//span[contains(text(),'Please note down your secret')]");
	public By popup1contentMsg2=By.xpath("//span[contains(text(),'Please keep this hand')]");
	public By popup1contentMsg3=By.xpath("//span[contains(text(),'Please note that no one')]");
	public By copyButton=By.xpath("//button[@class='rs-btn rs-btn-default primary_color text-white copy-btn']");
	public By copiedSuccessMsg=By.xpath("//div[text()='PassPhrase copied successfully!']");
	public By acceptTerms=By.xpath("//input[@id='acceptTerms']");
	public By continueButton=By.xpath("//button[text()='Continue']");
	public By walletCreatedSuccessMsg=By.xpath("//div[text()='Wallets created successfully']");
	public By popupBox2HeaderText=By.xpath("//div//p[@class='dialog-title']");
	public By welcomeJourney=By.xpath("//p[text()='Welcome to a journey of next-gen transactions. You are all set to go.']");
	public By popup2ContentMsg1=By.xpath("//span[text()='Please note down your XRPL address which stores all your funds. This is not a secret and can be re accessed via the Profile section in accounts.']");
	public By popup2ContentMsg2=By.xpath("//span[text()='To activate your wallet, you need to deposit a minimum of 10XRP to this XRPL address. To know why this is needed click']");
	public By popup2ContentMsg3=By.xpath("	//span[text()='For your convenience, STB also provides an option to fund your wallet from SpendTheBits for an easy start. You need to make a payment worth 10XRP for us to fund the XRP and activate Your wallet.']");
	public By qrCode=By.xpath("//div[@class='merchant-wallet-key']//*[local-name()='svg']");
	public By copyButton2=By.xpath("//button[text()='Copy']");
	public By AddressCopySuccessMsg=By.xpath("//div[text()='Address copied successfully!']");
	public By walletActivateButton=By.xpath("//span[@class='wallet-activate']");
	public By alreadyactivatedButton=By.xpath("//button[text()='Already activated']");
	public By laterButton=By.xpath("//button[text()='Later']");
	public By secretkey1=By.xpath("//p[@class='secretkey']");
	public By secretkey2=By.xpath("//p[@class='secretkey']");

}
