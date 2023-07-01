package pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dev.STB.STBAutomationMTOVendorSignup;

import pom.STBAutomationSignInPOM;
import utilities.LocalHelper;

public class STBAutomationSignInPage extends STBAutomationSignInPOM {
	protected static final Logger logger = LoggerFactory.getLogger(STBAutomationSignInPage.class);

	private final LocalHelper localHelper = new LocalHelper();

	private final WebDriver driver;

	public STBAutomationSignInPage(WebDriver driver) {
		this.driver=driver;
	}
	 public void clickSignupButton() {
			try {
				localHelper.jsExecutorHighlight(signupButton, driver);
				localHelper.clickElement(signupButton, driver);
			}catch (ElementClickInterceptedException m) {
				localHelper.jsExecutorClick(signupButton, driver);
			}
			logger.info("Signup Button is Clicked");
		}
	
	
	

}
