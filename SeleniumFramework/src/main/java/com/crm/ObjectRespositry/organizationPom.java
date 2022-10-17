package com.crm.ObjectRespositry;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationPom
{
//initialization
public void HomePage(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

//Declaration
@FindBy(xpath="Create Organization...")
private WebElement createoraganisation;

@FindBy(name="accountname")
private WebElement OraganisationTextField;

@FindBy(xpath="Save")
private WebElement saveButton;


//getters Method
public WebElement getCreateoraganisation()
{
	return createoraganisation;
}

public WebElement getOraganisationTextField() 
{
	return OraganisationTextField;
}

public WebElement getSaveButton()
{
	return saveButton;
}

//Business logic for createOrganization
		public void createOraganisation()
		{
			createoraganisation.click();
		}
		
	//Business logic for OraganisationTextField
		public void oraganisationTextField()
		{
			OraganisationTextField.click();
		}
		
	//Business logic for save
		public void clickSave()
		{
			saveButton.click();
		}
}
		
		
		
		