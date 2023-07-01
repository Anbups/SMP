package pom;

import org.openqa.selenium.By;

public class CreateNewPortalUserRolePOM {
	public By userEmailBox=By.xpath("//input[@id='email']");
	public By passwordBox=By.xpath("//input[@id='password']");
	public By loginButton=By.xpath("//button[@id='login-button']");
	public By administrationDropdown=By.xpath("//span[text()='Administration']");
	public By portalUserButton=By.xpath("//span[text()='Portal Users']");
	public By addNewUserButton=By.xpath("//button[text()='Add New User']");
	public By firstNameBox=By.xpath("//input[@id='first_name']");
	public By lastNameBox=By.xpath("//input[@id='last_name']");
	public By emailBox=By.xpath("//input[@id='email']");
	public By phoneNumberBox=By.xpath("//input[@type='tel']");
	public By dobBox=By.xpath("//input[@type='date']");
	public By dobCalenderButton=By.xpath("//input[id='dob']");
	public By dobDate=By.xpath("(//button[@role='gridcell'])[1]");
	public By userRoleBox=By.xpath("(//div[@role='button'])[2]");
	public By userRoleAdministrator=By.xpath("//li[text()='Administrator']");
	public By userRoleManager=By.xpath("//li[text()='Manager']");
	public By userRoleComplaince=By.xpath("//li[text()='Compliance']");
	public By userOperator=By.xpath("//li[text()='Operator']");
	public By userDocumentTypeBox=By.xpath("(//div[@role='button'])[3]");
	public By userDocumentValue=By.xpath("//li[text()='Passport']");
	public By userDocumentNumber=By.xpath("//input[@id='document_number']");
	public By createUserButton=By.xpath("//button[text()='Create User']");
	public By cancelButton=By.xpath("//button[text()='Cancel']");
	public By userAddPasswordBox=By.xpath("//input[@id='from']");
	public By submitButton=By.xpath("//button[text()='Submit']");
	public By submitCancelButton=By.xpath("(//button[text()='Cancel'])[2]");
	public By userProfileDownArow=By.xpath("//img[@alt='arrow down']");
	public By userMyProfile=By.xpath("//div[contains(@class,'user-dropdown dropdown-menu-right')]//a");
	public By adminRoleVerification=By.xpath("//p[contains(text(),'admin')]");
	public By managerRoleVerification=By.xpath("//p[contains(text(),'manager')]");
	public By complainceRoleVerification=By.xpath("//p[contains(text(),'compliance')]");
	public By operatorRoleVerification=By.xpath("//p[contains(text(),'operator')]");


	
}
