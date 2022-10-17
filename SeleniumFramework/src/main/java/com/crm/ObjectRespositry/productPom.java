package com.crm.ObjectRespositry;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productPom
{
	//initialization
	public productPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement createproduct;

	@FindBy(name="productname")
	private WebElement ProductName;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;


	//getters Method

	public WebElement getCreateproduct()
	{
		return createproduct;
	}

	public WebElement getProductName()               
	{
		return ProductName;
	}

	public WebElement getSaveButton() 
	{
		return saveButton;
	}

	//Business logic for createproduct
	public void createproduct()
	{
		createproduct.click();
	}

	//Business logic for ProductName
	public void ProductName(String name)
	{
		ProductName.sendKeys(name);
	}

	//Business logic for save
	public void saveButton()
	{
		saveButton.click();
	}
}
