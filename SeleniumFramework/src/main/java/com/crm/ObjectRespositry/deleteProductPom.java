package com.crm.ObjectRespositry;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deleteProductPom
{
//initialization
public deleteProductPom(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

//Declaration
@FindBy(xpath="Create Product...")
private WebElement createproduct;

@FindBy(name="productname")
private WebElement ProductTextField;

@FindBy(xpath="button")
private WebElement Button1;

@FindBy(xpath="button")
private WebElement Button3;


//getters Method
public WebElement getCreateproduct() {
	return createproduct;
}

public WebElement getProductTextField() {
	return ProductTextField;
}

public WebElement getButton1() {
	return Button1;
}

public WebElement getButton3() {
	return Button3;
}

//Business logic for createProduct
		public void createProduct()
		{
			createproduct.click();
		}

//Business logic for ProductTextField
		public void ProductTextField()
		{
			ProductTextField.click();
		}
		
//Business logic for button1
		public void Button1()
		{
			Button1.click();
		}
		
//Business logic for button1
		public void Button3()
		{
		Button3.click();
		}
		
}

