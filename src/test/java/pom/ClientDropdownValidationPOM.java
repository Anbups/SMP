package pom;

import org.openqa.selenium.By;

public class ClientDropdownValidationPOM {
	public By userEmailBox=By.xpath("//input[@id='email']");
	public By passwordBox=By.xpath("//input[@id='password']");
	public By loginButton=By.xpath("//button[@id='login-button']");
	public By clientDownArrowButton=By.xpath("//span[text()='Clients']");
	public By senderButton=By.xpath("//span[text()='Senders']");
	public By receiverButton=By.xpath("//span[text()='Receivers']");
	public By senderIndividualButton=By.xpath("(//span[text()='Individual'])[1]");
	public By senderBusinessButton=By.xpath("(//span[text()='Business'])[1]");
	public By individualSenderClientPage=By.xpath("//div/h3[text()='Individual Senders']");
	public By businessSendersClientPage=By.xpath("//div/h3[text()='Business Senders']");
	public By receiverIndividualButton=By.xpath("(//span[text()='Individual'])[2]");
	public By receiverBusinessButton=By.xpath("(//span[text()='Business'])[2]");
	public By individualReceiverClientPage=By.xpath("//div/h3[text()='Individual Receivers']");
	public By businessReceiverClientPage=By.xpath("//div/h3[text()='Business Receivers']");
	
	
	
	
	

}
