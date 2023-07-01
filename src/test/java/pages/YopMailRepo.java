package pages;

import org.openqa.selenium.By;

public class YopMailRepo {
	public By mailNameBox=By.xpath("//input[@id='login']");
	public By clickMail=By.xpath("//button[@class='md']");
	public By firstMail=By.xpath("//span[text()='Spend The Bits']");
	public By setPassword=By.xpath("//a[text()='Set Password']");
	public By newPassword=By.xpath("//input[@id='password']");
	public By confirmPassword=By.xpath("//input[@id='confirmpassword']");
	public By changePasswordButton=By.xpath("//button[text()='Change Password']");
	public By successToastMessage=By.xpath("//div[text()='Congratulations, your password has been successfully updated']");
	public By checkMailBox=By.xpath("//button[text()='Check the mail!']");
	public By signInButton=By.xpath("//button[text()='Sign In']");
	

}
