package com.crm.ObjectRespositry;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaignsPom
{
	//initialization
	public campaignsPom(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}


	//Declaration
																			
	@FindBy(xpath="//img[@alt='Create Campaign...']")
	private WebElement createcampaigns;

	@FindBy(name="campaignname")
	private WebElement campaignname;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	@FindBy(className="dvHeaderText")
	private WebElement headText;

	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectproduct;

	@FindBy(id="search_txt")
	private WebElement searchtext;

	@FindBy(name="search")
	private WebElement searchButton;



	//getters Method

	public WebElement getCreatecampaigns() {
		return createcampaigns;
	}

	public WebElement getCampaignname() {
		return campaignname;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getHeadText() {
		return headText;
	}

	public WebElement getSelectproduct() {
		return selectproduct;
	}

	public WebElement getSearchtext() {
		return searchtext;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}




	//Business logic for createcampaigns
	public void createcampaigns()
	{
		createcampaigns.click();
	}


	public void campaignname(String name)
	{
		campaignname.sendKeys(name);
	}

	//Business logic for saveButton
	public void saveButton()
	{
		saveButton.click();
	}
	//Business logic for headText
	public String headText()
	{
		String text=headText.getText();
		return text;
	}
	
	//Business logic for selectproduct
	public void selectproduct()
	{
		selectproduct.click();
	}
	
	//Business logic for searchtext
	public void searchtext(String name)
	{
		searchtext.sendKeys(name);
	}


	//Business logic for searchButton	
	public void searchButton()
	{
		searchButton.click();
	}
}






