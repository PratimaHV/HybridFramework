package com.crm.ObjectRespositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationVerificationPom 
{
	public ValidationVerificationPom(WebDriver driver)
	{
		
	//Initialization
	PageFactory.initElements(driver, this);

	}
	//declaration
	@FindBy(className="span.dvHeaderText")
	private WebElement actualOrgnizationData;
	
	
	@FindBy(className="span.lvtHeaderText")
	private WebElement actualProductData;
	
	
	@FindBy(className="span.dvHeaderText")
	private WebElement actualCampaignsData;
	
	
	@FindBy(className="span.dvHeaderText")
	private WebElement actualCampaignProductData;
	




	//getters
	public WebElement getActualOrgnizationData() {
		return actualOrgnizationData;
	}

	public WebElement getActualProductData() {
		return actualProductData;
	}
	
	public WebElement getActualCampaignsData() {
		return actualCampaignsData;
	}

	public WebElement getActualCampaignProductData() {
		return actualCampaignProductData;
	}


	
	
	//business logics
	public void organisationValidation(WebDriver driver,String data)
	{
		String actData=actualOrgnizationData.getText();

		if(actData.contains(data))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
	}
		
		
		//business logics
		public void productValidation(WebDriver driver,String data)
		{
			String actData=actualProductData.getText();

			if(actData.contains(data))
			{
				System.out.println("passed");
			}
			else
			{
				System.out.println("failed");
			}
		}
			
			//business logics
			public void campaignsValidation(WebDriver driver,String data)
			{
				String actData=actualCampaignsData.getText();

				if(actData.contains(data))
				{
					System.out.println("passed");
				}
				else
				{
					System.out.println("failed");
				}
			}
			
			//business logics
			public void campaignsproductValidation(WebDriver driver,String data)
			{
				String actData=actualCampaignProductData.getText();

				if(actData.contains(data))
				{
					System.out.println("passed");
				}
				else
				{
					System.out.println("failed");
				}
		
	}
}



