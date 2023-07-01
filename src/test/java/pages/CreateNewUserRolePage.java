package pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pom.CreateNewPortalUserRolePOM;
import utilities.LocalHelper;

public class CreateNewUserRolePage extends CreateNewPortalUserRolePOM {
	protected static final Logger logger = LoggerFactory.getLogger(CreateNewUserRolePage.class);

	private final LocalHelper localHelper = new LocalHelper();

	private final WebDriver driver;

	public CreateNewUserRolePage(WebDriver driver) {
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
		 public void clickAdministrationDropdownButton() {
				try {
					localHelper.jsExecutorHighlight(administrationDropdown, driver);
					localHelper.clickElement(administrationDropdown, driver);
				}catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(administrationDropdown, driver);
				}
				logger.info("Administration dropdown is clicked");
			}
		 public void clickPortalUserButton() {
				try {
					localHelper.jsExecutorHighlight(portalUserButton, driver);
					localHelper.clickElement(portalUserButton, driver);
				}catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(portalUserButton, driver);
				}
				logger.info("Portal button is clicked");
			}
		 public void clickAddNewUserButton() {
				try {
					localHelper.jsExecutorHighlight(addNewUserButton, driver);
					localHelper.clickElement(addNewUserButton, driver);
				}catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(addNewUserButton, driver);
				}
				logger.info("Add new user button is clicked");
			}
		 public void enterNewUserFirstName(String newuserfirstname) {
				localHelper.jsExecutorHighlight(firstNameBox, driver);
				localHelper.sendKeys(firstNameBox, newuserfirstname, driver);
				logger.info("New User Firstname is entered");
			}

			public void enterNewUserLastName(String newuserlastname) {
				localHelper.jsExecutorHighlight(lastNameBox, driver);
				localHelper.sendKeys(lastNameBox, newuserlastname, driver);
				logger.info("New User Lastname is entered");
			}

			public void enterNewUserEmail(String email) {
				localHelper.jsExecutorHighlight(emailBox, driver);
				localHelper.jsExecutorSendValue(emailBox, email, driver);
				logger.info("New User Email is entered");

			}
			public void enterNewUserPhoneNumber(String phonenumber) {
				localHelper.jsExecutorHighlight(phoneNumberBox, driver);
				localHelper.jsExecutorSendValue(phoneNumberBox, phonenumber, driver);
				logger.info("New User PhoneNumber is entered");

			}

			public void enterNewUserDOB(String dop) {
				localHelper.jsExecutorHighlight(dobBox, driver);
				localHelper.clickElement(dobBox, driver);
				localHelper.jsExecutorSendValue(dobBox, dop, driver);
				logger.info("New User DOB is selected");
			}
			 public void enterNewUserRoleAdministrator() {
					
					localHelper.clickElement(userRoleBox, driver);
					localHelper.clickElement(userRoleAdministrator, driver);
					logger.info("New User Role Administrator is selected");
				}
            public void enterNewUserRoleManager() {
				
				localHelper.clickElement(userRoleBox, driver);
				localHelper.clickElement(userRoleManager, driver);
				logger.info("New User Role Manager is selected");
			}
            public void enterNewUserRoleComplaince() {
				
				localHelper.clickElement(userRoleBox, driver);
				localHelper.clickElement(userRoleComplaince, driver);
				logger.info("New User Role Complaince is selected");
			}
           public void enterNewUserRoleOperator() {
		
	        	localHelper.clickElement(userRoleBox, driver);
	        	localHelper.clickElement(userOperator, driver);
	        	logger.info("New User Role Operator is selected");
	        }
           public void enterNewUserDocumentType() {
       		
	        	localHelper.clickElement(userDocumentTypeBox, driver);
	        	localHelper.clickElement(userDocumentValue, driver);
	        	logger.info("New User Document type is selected");
	        }
           public void enterNewUserDocumentNumber(String newuserdocumentnumber) {
				localHelper.jsExecutorHighlight(userDocumentNumber, driver);
				localHelper.sendKeys(userDocumentNumber, newuserdocumentnumber, driver);
				logger.info("New User Document number is entered");
			}
			public void clickCreateNewUserButton() {
				try {
					localHelper.jsExecutorHighlight(createUserButton, driver);
					localHelper.clickElement(createUserButton, driver);
				} catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(createUserButton, driver);
				}
				logger.info("Create new user button is clicked");
			}
			public void enterNewUserPassword(String password) {
				localHelper.jsExecutorHighlight(userAddPasswordBox, driver);
				localHelper.sendKeys(userAddPasswordBox,password, driver);
				logger.info("Text passed in the password field");
			}
			public void clickCreateNewUserSubmitButton() {
				try {
					localHelper.jsExecutorHighlight(submitButton, driver);
					localHelper.clickElement(submitButton, driver);
				} catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(submitButton, driver);
				}
				logger.info("Create new user submit button is clicked");
			}
			public void clickUserProfileDropdown() {
				try {
					localHelper.jsExecutorHighlight(userProfileDownArow, driver);
					localHelper.clickElement(userProfileDownArow, driver);
				} catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(userProfileDownArow, driver);
				}
				logger.info("User profile dropdown button is clicked");
			}
			public void clickUserProfile() {
				try {
					localHelper.jsExecutorHighlight(userMyProfile, driver);
					localHelper.clickElement(userMyProfile, driver);
				} catch (ElementClickInterceptedException m) {
					localHelper.jsExecutorClick(userMyProfile, driver);
				}
				logger.info("User profile button is clicked");
			}
			 public String VerifyUserRoleAsAdministrator() {
				 localHelper.jsExecutorHighlight(adminRoleVerification, driver);
					return localHelper.getText(adminRoleVerification,driver);
				}
			 public String VerifyUserRoleAsManager() {
				 localHelper.jsExecutorHighlight(managerRoleVerification, driver);
					return localHelper.getText(managerRoleVerification,driver);
				}
			 public String VerifyUserRoleAsComplaince() {
				 localHelper.jsExecutorHighlight(complainceRoleVerification, driver);
					return localHelper.getText(complainceRoleVerification,driver);
				}
			 public String VerifyUserRoleAsOperator() {
				 localHelper.jsExecutorHighlight(operatorRoleVerification, driver);
					return localHelper.getText(operatorRoleVerification,driver);
				}


}
