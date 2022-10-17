package com.crm.ObjectRespositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom 
	{
	//Initialization
	public LoginPagePom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Declaration
	@FindBy(name="user_name")
	private WebElement userNameTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement submitbutton;

	
	//getter methods
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
	//Business logics
	/**
	 * this method is used to login the app
	 * @author Pratima
	 */
	
	public void login(String userName,String password)
	{
		userNameTextField.sendKeys(userName);
		passwordTextField.sendKeys(password);
		submitbutton.click();
	}
	}
	


