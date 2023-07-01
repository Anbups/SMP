package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import constants.Constants;
import utilities.LocalHelper;
import utilities.TestUtil;

public class YopMail extends YopMailRepo{
	protected static final Logger logger = LoggerFactory.getLogger(YopMail.class);

	private final LocalHelper localHelper = new LocalHelper();

	private final WebDriver driver;
	public YopMail(WebDriver driver) {
		this.driver=driver;
	}
	public void launchYopMail(WebDriver driver) {
		driver.get(Constants.yopmail);
	}
	
	
	
	public void enterEmail(String email) {
		localHelper.sendKeys(mailNameBox,email,driver);
		localHelper.clickElement(clickMail,driver);
	}
	public void switchToFrameYopMail(WebDriver driver) {
		driver.switchTo().frame("ifmail");
	}	
	public void openMail() {
		localHelper.clickElement(firstMail,driver);
	}
	
	public void clickSetPassword() {
		 localHelper.scrollIntoView(setPassword, driver);
		localHelper.clickElement(setPassword,driver);
	}
	
public void switchToNewPasswordWindow(WebDriver driver) {
		
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if(!string.contains(windowHandle)) {
				driver.switchTo().window(string);
			}
		}
	}
	public void setNewPassword() {
		localHelper.sendKeys(newPassword,new TestUtil().init_Properties().getProperty("commonPassword"),driver);
		localHelper.sendKeysAndPressEnter(confirmPassword,new TestUtil().init_Properties().getProperty("commonPassword"),driver);

	}
	public void clickChanagePassword() {
		localHelper.clickElement(changePasswordButton,driver);

	}
	public String checkSuccessToastMessage() {
		return localHelper.getText(successToastMessage,driver);
	}
	
}



