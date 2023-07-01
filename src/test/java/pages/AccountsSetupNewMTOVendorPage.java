package pages;

import java.io.IOException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pom.AccountsSetupNewMTOVendorPOM;
import utilities.LocalHelper;
import utilities.TestUtil;

public class AccountsSetupNewMTOVendorPage extends AccountsSetupNewMTOVendorPOM {
	protected static final Logger logger = LoggerFactory.getLogger(AccountsSetupNewMTOVendorPage.class);

	private final LocalHelper localHelper = new LocalHelper();
	private final TestUtil testUtil = new TestUtil();

	private final WebDriver driver;

	public AccountsSetupNewMTOVendorPage(WebDriver driver) {
		this.driver=driver;
	}
	 public void enterUserEmailId(String username) {
			localHelper.jsExecutorHighlight(userEmailBox, driver);
			localHelper.sendKeys(userEmailBox, username,driver);
			logger.info("Text passed in the username field");
		}
		public void enterPassword(String password) {
			localHelper.jsExecutorHighlight(passwordBox, driver);
			localHelper.sendKeys(passwordBox,password, driver);
			logger.info("Text passed in the password field");
		}
		 public void clickSignupButton() {
				try {
					localHelper.jsExecutorHighlight(loginButton, driver);
					localHelper.clickElement(loginButton, driver);
				}catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(loginButton, driver);
				}
				logger.info("SignIn button is clicked");
			}
	 public void clickAccountsDropdown() {
			try {
				localHelper.jsExecutorHighlight(accountsDropdown, driver);
				localHelper.clickElement(accountsDropdown, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(accountsDropdown, driver);
			}
			logger.info("Accounts dropdown is clicked");
		}
	 public void clickCurrenciesButton() {
			try {
				localHelper.jsExecutorHighlight(currencies, driver);
				localHelper.clickElement(currencies, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(currencies, driver);
			}
			logger.info("Currencies option is clicked");
		}
	 public void clickCurrencyActivateButton() {
			try {
				localHelper.jsExecutorHighlight(currencyActivateButton, driver);
				localHelper.clickElement(currencyActivateButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(currencyActivateButton, driver);
			}
			logger.info("Currency Activate button is clicked");
		}
	 public void enterPassPhraseSecretKey() throws IOException {
			localHelper.jsExecutorHighlight(passphraseSecretKeyInputbox, driver);
			localHelper.sendKeys(passphraseSecretKeyInputbox, TestUtil.readExcelWithGivenCellValue(), driver);
			//localHelper.jsExecutorSendValue(passphraseSecretKeyInputbox, secretkey, driver);
			logger.info("PassPhrase secretkey is entered");

		}
	 public void clickCurrencySubmitButton() {
			try {
				localHelper.jsExecutorHighlight(submitButton, driver);
				localHelper.clickElement(submitButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(submitButton, driver);
			}
			logger.info("Currency submitButton button is clicked");
		}
	 public String KeyVerificationSuccessMessage() {
			return localHelper.getText(keyVerificationSuccessMsg,driver);
		}
	 public void clickLiquidityButton() {
			try {
				localHelper.jsExecutorHighlight(liquidity, driver);
				localHelper.clickElement(liquidity, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(liquidity, driver);
			}
			logger.info("Liquidity option is clicked");
		}
	 public void clickAddLiquidityButton() {
			try {
				localHelper.jsExecutorHighlight(AddLiquidityButton, driver);
				localHelper.clickElement(AddLiquidityButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(AddLiquidityButton, driver);
			}
			logger.info("Add Liquidity Button is clicked");
		}
	 public void enterLiquidityAmountInputbox() {
			localHelper.jsExecutorHighlight(liquidityAmountInputbox, driver);
			localHelper.sendKeys(liquidityAmountInputbox,new TestUtil().init_Properties().getProperty("liquidityAmount"),driver);
			//localHelper.sendKeys(liquidityAmountInputbox, liquidityAmount,driver);
			 logger.info("Liquidity amount passed in the Amount box");
		}
	 public void enterLiquidityRemarksInputbox() {
			localHelper.jsExecutorHighlight(liquidityRemarksInputbox, driver);
			localHelper.sendKeys(liquidityRemarksInputbox,new TestUtil().init_Properties().getProperty("liquidityRemarks"),driver);
			//localHelper.sendKeys(liquidityRemarksInputbox, liquidityRemarks,driver);
			 logger.info("Liquidity remarks passed in the remarks box");
		}
	 public void clickRequestButton() {
			try {
				localHelper.jsExecutorHighlight(requestButton, driver);
				localHelper.clickElement(requestButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(requestButton, driver);
			}
			logger.info("Request Button is clicked");
		}
	 public void clickConfigurationDropdown() {
			try {
				localHelper.jsExecutorHighlight(configurationsDropdown, driver);
				localHelper.clickElement(configurationsDropdown, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(configurationsDropdown, driver);
			}
			logger.info("configurations dropdown is clicked");
		}
	 public void clickExchangeOffersButton() {
			try {
				localHelper.jsExecutorHighlight(exchangeOffersButton, driver);
				localHelper.clickElement(exchangeOffersButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(exchangeOffersButton, driver);
			}
			logger.info("Exchange Offers Button option is clicked");
		}
	 public void clickNewCurrencyButton() {
			try {
				localHelper.jsExecutorHighlight(newCurrencyButton, driver);
				localHelper.clickElement(newCurrencyButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(newCurrencyButton, driver);
			}
			logger.info("New Currency Button option is clicked");
		}
	 public void enterBaseCurrencyValue() {
			localHelper.clickElement(baseCurrencyInputbox, driver);
			localHelper.clickElement(baseCurrencyValue, driver);
			logger.info("Base Currency Value is selected");
		}
	 public void enterCurrencyRate() {
			localHelper.jsExecutorHighlight(CurrencyRateInputbox, driver);
			localHelper.sendKeys(CurrencyRateInputbox,new TestUtil().init_Properties().getProperty("currencyRate"),driver);
			//localHelper.sendKeys(liquidityRemarksInputbox, liquidityRemarks,driver);
			 logger.info("Currency Rate passed in the rate box");
		}
	 
	 public void clickAddButton() {
			try {
				localHelper.jsExecutorHighlight(addButton, driver);
				localHelper.clickElement(addButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(addButton, driver);
			}
			logger.info("Add Button is clicked");
		}
	 public void clickSetupTrustlineLink() {
			try {
				localHelper.clickElement(clicksetupTrustlineLink, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(clicksetupTrustlineLink, driver);
			}
			logger.info("Setup Trust line Link is clicked");
		}
	 public void clickCurrencyActivateButton1() {
			try {
				localHelper.jsExecutorHighlight(currencyActivateButton, driver);
				localHelper.clickElement(currencyActivateButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(currencyActivateButton, driver);
			}
			logger.info("Currency ActivateButton is clicked");
		}
	 public void enterPassPhraseSecretKey1() throws IOException {
			localHelper.jsExecutorHighlight(passphraseSecretKeyInputbox, driver);
			localHelper.sendKeys(passphraseSecretKeyInputbox, TestUtil.readExcelWithGivenCellValue(), driver);
			//localHelper.jsExecutorSendValue(passphraseSecretKeyInputbox, secretkey, driver);
			logger.info("PassPhrase secretkey is entered");

		}
	 public void clickCurrencySubmitButton1() {
			try {
				localHelper.jsExecutorHighlight(submitButton, driver);
				localHelper.clickElement(submitButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(submitButton, driver);
			}
			logger.info("Currency submitButton button is clicked");
		}
	 public void clickFeesDropdown() {
			try {
				localHelper.jsExecutorHighlight(feesDropdown, driver);
				localHelper.clickElement(feesDropdown, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(feesDropdown, driver);
			}
			logger.info("fees option is clicked");
		}
	 public void clickInwardRemittanceFeesButton() {
			try {
				localHelper.jsExecutorHighlight(inwardRemittanceFeesButton, driver);
				localHelper.clickElement(inwardRemittanceFeesButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(inwardRemittanceFeesButton, driver);
			}
			logger.info("Inward Remittance Fees option is clicked");
		}
	 public void clickOutwardRemittanceFeesButton() {
			try {
				localHelper.jsExecutorHighlight(outwardRemittanceFeesButton, driver);
				localHelper.clickElement(outwardRemittanceFeesButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(outwardRemittanceFeesButton, driver);
			}
			logger.info("Outward Remittance Fees option is clicked");
		}
	 public void clickNewSlabButton() {
			try {
				localHelper.jsExecutorHighlight(newSlabButton, driver);
				localHelper.clickElement(newSlabButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(newSlabButton, driver);
			}
			logger.info("New Slab Button is clicked");
		}
	 public void enterNewSlabFromValue() {
			localHelper.jsExecutorHighlight(addNewSlabfromInputbox, driver);
			localHelper.sendKeys(addNewSlabfromInputbox,new TestUtil().init_Properties().getProperty("fromValue"),driver);
			//localHelper.sendKeys(addNewSlabfromInputbox, fromValue,driver);
			 logger.info("New Slab value amount passed in the value box");
		}
	 public void enterNewSlabToValue() {
			localHelper.jsExecutorHighlight(addNewSlabToInputbox, driver);
			localHelper.sendKeys(addNewSlabToInputbox,new TestUtil().init_Properties().getProperty("toValue"),driver);

			//localHelper.sendKeys(addNewSlabToInputbox, toValue,driver);
			 logger.info("New Slab To value passed in the value box");
		}
	 public void enterNewSlabFixedCost() {
			localHelper.jsExecutorHighlight(addNewSlabFixedCostInputbox, driver);
			localHelper.sendKeys(addNewSlabFixedCostInputbox,new TestUtil().init_Properties().getProperty("fixedCost"),driver);

			//localHelper.sendKeys(addNewSlabFixedCostInputbox, fixedCost,driver);
			 logger.info("New Slab  Fixed cost value passed in the value box");
		}
	 public void enterNewSlabPercentageCharge() {
			localHelper.jsExecutorHighlight(addNewSlabPercentageChargeInputbox, driver);
			localHelper.sendKeys(addNewSlabPercentageChargeInputbox,new TestUtil().init_Properties().getProperty("chargePercentage"),driver);

			//localHelper.sendKeys(addNewSlabPercentageChargeInputbox, chargePercentage,driver);
			 logger.info("New Slab  Percentage charge value passed in the value box");
		}

public void clickAddButton1() {
		try {
			localHelper.jsExecutorHighlight(newSlabButton, driver);
			localHelper.clickElement(addButton, driver);
		}catch (ElementClickInterceptedException m) {
			localHelper.jsExecutorClick(addButton1, driver);
		}
		logger.info("Add Button is clicked");
	}

	 
}
