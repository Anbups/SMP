package pom;

import org.openqa.selenium.By;

public class RemittanceDropdownValidationPOM {
	public By userEmailBox=By.xpath("//input[@id='email']");
	public By passwordBox=By.xpath("//input[@id='password']");
	public By loginButton=By.xpath("//button[@id='login-button']");
	public By RemittanceDownArrowButton=By.xpath("//span[text()='Remittances']");
	public By outwardButton=By.xpath("//span[text()='Outward' and @class='sidebar-text light_color colr font-fam']");
	public By inwardButton=By.xpath("//span[text()='Inward' and @class='sidebar-text light_color font-fam']");
	public By allRemittance=By.xpath("//span[text()='All Remittances']");
	public By pendingCustomerRemittance=By.xpath("//span[text()='Pending Customer Remittances']");
	public By Title=By.xpath("//div/h3[text()='Outward Remittance']");
	public By titleSubmsg=By.xpath("//div/p[text()='View your remittance requests']");
	public By newRemittanceButton=By.xpath("//button[text()='New Remittance']");
	public By monthBox=By.xpath("//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root')]//div");
	public By month=By.xpath("//div[text()='This Month']");
	public By timePeriodBox1=By.xpath("//input[@placeholder='DD/MM/YYYY']");
	public By timePeriodCalenderButton1=By.xpath("(//*[local-name()='svg']//parent::button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[1]");
	public By timePeriodCalendarBox1=By.xpath("//div[contains(@class,'MuiPickersSlideTransition-root MuiDayCalendar-slideTransition')]");
	public By timePeriodBox2=By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]");
	public By timePeriodCalenderButton2=By.xpath("(//*[local-name()='svg']//parent::button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]");
	public By timePeriodCalendarBox2=By.xpath("//div[contains(@class,'MuiPickersSlideTransition-root MuiDayCalendar-slideTransition')]");
	public By calenderDateBox=By.xpath("//button[@role='gridcell']");
	public By date1=By.xpath("(//button[@role='gridcell'])[10]");
	public By date2=By.xpath("(//button[@role='gridcell'])[20]");
	public By selectCurrency=By.xpath("//input[@id='currency']");
	public By currency=By.xpath("//li[@data-option-index='3']");
	public By searchBox=By.xpath("//input[@placeholder='Search...']");
	public By selectStatusBox=By.xpath("//input[@placeholder='Select Status']");
	public By selectStatus=By.xpath("//button[text()='Select Status']");
	public By resetFilter=By.xpath("//button[text()='Reset Filters']");
	public By idBox=By.xpath("//div[text()='ID']");
	public By typeBox=By.xpath("//div[text()='Type']");
	public By dateBox=By.xpath("//div[text()='Date']");
	public By senderMTOBox=By.xpath("//div[text()='Sender MTO']");
	public By senderBox=By.xpath("//div[text()='Sender']");
	public By recipientBox=By.xpath("//div[text()='Recipient MTO']");
	public By endBenificiaryBox=By.xpath("//div[text()='End Beneficiary']");
	public By sendValueBox=By.xpath("//div[text()='Sent Value']");
	public By recValuBoxe=By.xpath("//div[text()='Recv Value']");
	public By statusBox=By.xpath("//div[text()='Status']");
	public By updateStatusBox=By.xpath("//div[text()='Update Status']");
	public By actionBox=By.xpath("//div[text()='Actions']");
	
	
	
	
	
	
	
	

}
