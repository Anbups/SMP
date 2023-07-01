package pom;

import org.openqa.selenium.By;

public class STBAutomationSignUpPOM {
	public By firstNameBox=By.xpath("//input[@id='first_name']");
	public By lastNameBox=By.id("last_name");
	public By emailBox=By.id("email");
	public By dobBox=By.id("mui-3");
	public By dobBoxFirstClick=By.xpath("//button[@aria-label='Choose date']");
	public By dobBoxSecondClick=By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall MuiPickersCalendarHeader-switchViewButton css-1wjkg3']");
	public By yearBox=By.xpath("//div[@class='MuiYearCalendar-root css-1flha1h']/child::div");
	public By monthBox=By.xpath("//div[@class='MuiPickersCalendarHeader-label css-1v994a0']");
	public By monthNextButton=By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeStart MuiIconButton-sizeSmall MuiPickersArrowSwitcher-button css-fp6ecq']");
	public By dateBox=By.xpath("//button[@role='gridcell']");
	public By nextButton=By.xpath("//button[@type='submit']");
	public By calender=By.xpath("//*[local-name()='svg']");
	public By yearArrowClick=By.xpath("//*[local-name()='svg' and @data-testid='ArrowDropDownIcon']");
	public By yearValues=By.xpath("//div[@class='MuiPickersYear-root css-j9zntq']//button");
	public By date=By.xpath("(//button[@role='gridcell'])[1]");
}	
