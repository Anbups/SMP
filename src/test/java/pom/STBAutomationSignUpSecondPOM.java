package pom;

import org.openqa.selenium.By;

public class STBAutomationSignUpSecondPOM {
	public By mtoNameBox=By.id("mto_name");
	public By countryDropdown=By.xpath("//button[@id='rfs-btn']");
	public By countrySearchBox=By.xpath("//input[@name='rfs-q']");
	public By country=By.xpath("//span[text()='Italy']");
	public By provinceDropdown=By.xpath("//div[@id='province']");
	public By province=By.xpath("//li[text()='Abruzzo']");
	public By cityDropDown=By.xpath("//div[@id='city']");
	public By cityName=By.xpath("//li[text()='Avezzano']");
	
	public By postalCodeBox=By.xpath("//input[@name='postal_code']");
	public By phoneNoBox=By.xpath("//input[@class='form-control ']");
	public By acceptTermsTickBox=By.id("acceptTerms");
	public By signUpButton=By.xpath("//button[@type='submit']");
	public By signUpCountry=By.xpath("//div[@data-testid='rfs']");
	public By signUpProvince=By.xpath("//div[@id='province']");
	public By signUpTimezone=By.xpath("//input[@id='timezone']");
	public By timeZoneValue=By.xpath("//li[text()='Europe/Rome']");
	public By signUpAddress=By.xpath("//textarea[@id='address']");
	public By acceptTerms=By.xpath("//input[@id='acceptTerms']");
	public By checkMessage=By.xpath("//p[text()='A temporary password has been emailed']");
}
