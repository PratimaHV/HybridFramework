package com.crm.ObjectRespositry;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Generic_Utilities.WebDriver_Utility;



public class HomePagePom
{
	//initialization
	public HomePagePom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(linkText="Organizations")
	private WebElement oraganisationsLinkText;

	@FindBy(linkText="Products")
	private WebElement ProductsLinkText;

	@FindBy(linkText="More")
	private WebElement MoreLinkText;

	@FindBy(linkText="Campaigns")
	private WebElement CampaignsLinkText;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement AdminButton;

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutLinkText;

	//GettersMethod
	public WebElement getOraganisationsLinkText() {
		return oraganisationsLinkText;
	}

	public WebElement getProductsLinkText() {
		return ProductsLinkText;
	}

	public WebElement getMoreLinkText() {
		return MoreLinkText;
	}

	public WebElement getCampaignsLinkText() {
		return CampaignsLinkText;
	}

	public WebElement getAdminButton() {
		return AdminButton;
	}

	public WebElement getSignoutLinkText() {
		return signoutLinkText;
	}
	
	//Business logic for Organizations
	public void oraganisationsLinkText()
	{
		oraganisationsLinkText.click();
	}

	//Business logic for Products
	public void ProductsLinkText()
	{
		ProductsLinkText.click();
	}

	//Business logic for More
	public void MoreLinkText()
	{
		MoreLinkText.click();
	}


	//Business logic for Campaigns
	public void CampaignsLinkText()
	{
		CampaignsLinkText.click();
	}
	
	//Business logic for  AdminButton
		public void  AdminButton(WebDriver driver)
		
		{
			WebDriver_Utility wlib=new WebDriver_Utility();
			wlib.mouseOverOnElement(driver, AdminButton);
		}
		
	//Business logic for SignOut
	public void signoutLinkText()
	{
		signoutLinkText.click();		
	}
}
