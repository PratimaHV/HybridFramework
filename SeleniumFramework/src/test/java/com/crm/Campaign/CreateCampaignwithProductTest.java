package com.crm.Campaign;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import com.crm.Generic_Utilities.Baseclass;
import com.crm.Generic_Utilities.Excel_Utility;
import com.crm.Generic_Utilities.Java_Utility;
import com.crm.Generic_Utilities.WebDriver_Utility;
import com.crm.ObjectRespositry.HomePagePom;
import com.crm.ObjectRespositry.ValidationVerificationPom;
import com.crm.ObjectRespositry.campaignsPom;
import com.crm.ObjectRespositry.productPom;

public class CreateCampaignwithProductTest extends Baseclass
{
	@Test
	public void createCampaignwithProductTest() throws Throwable
	//public static void main(String[] args) throws Throwable
	{
		Java_Utility jlib=new Java_Utility();
		WebDriver_Utility wlib=new WebDriver_Utility();
		wlib.waitForPageLoad(driver);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();



		/*File_Utility flib=new File_Utility();
		String URL=flib.getPropertyKeyValue1("url");
		String UserName=flib.getPropertyKeyValue1("un");
		String PassWord=flib.getPropertyKeyValue1("pw");
		driver.get(URL);
		LoginPagePom lp=new LoginPagePom(driver);
		lp.login(UserName, PassWord);*/

		/*driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(PassWord);
		driver.findElement(By.id("submitButton")).click();*/


		HomePagePom hp=new HomePagePom(driver);
		hp.ProductsLinkText();

		productPom pp=new productPom(driver);
		pp.createproduct();
		int ranNum= jlib.getRanDomNum();
		Excel_Utility elib=new Excel_Utility();
		String data= elib.getDataFromExcel("Sheet1",0,0)+ranNum;
		pp.ProductName(data);
		pp.saveButton();

		//driver.findElement(By.linkText("Products")).click();  
		//driver.findElement(By.xpath("//img[@alt='Create Product...']")).click(); 
		//driver.findElement(By.name("productname")).sendKeys(data);
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();


		//navigate to campaign
		HomePagePom hp1=new HomePagePom(driver);
		hp1. MoreLinkText();
		hp1.CampaignsLinkText();

		campaignsPom cp=new campaignsPom(driver);
		cp.createcampaigns();
		Excel_Utility elib1=new Excel_Utility();
		String data1= elib1.getDataFromExcel("Sheet1",0,0)+ranNum;
		cp.campaignname(data1);

		//driver.findElement(By.xpath("//a[text()='More']")).click(); 
		//driver.findElement(By.name("Campaigns")).click(); 
		//driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click(); 
		//driver.findElement(By.name("campaignname")).sendKeys(data1);
		//driver.findElement(By.xpath("//img[@title='Select']")).click(); 

		cp.selectproduct();
		//window switching
		wlib.switchToWindow(driver, "Product&action");

		cp.searchtext(data1);
		cp.searchButton();


		//driver.findElement(By.id("search_txt")).sendKeys(data1);
		//driver.findElement(By.name("search")).click();

		//Dynamic Xpath
		driver.findElement(By.xpath("//a[text()='"+data1+"']")).click();
		//switch back window
		WebDriver_Utility wlib1=new WebDriver_Utility();
		wlib1.switchToWindow(driver,"Campaigns&action");

		cp.saveButton();
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		ValidationVerificationPom vv=new ValidationVerificationPom(driver);
		vv.campaignsproductValidation(driver, data1);
		
		//String actData=cp.headText();
		//String actData=driver.findElement(By.className("dvHeaderText")).getText();

		/*if(actData.contains(data1))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}*/
		hp.AdminButton(driver);
		hp.signoutLinkText();


		/*WebElement ele=driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();*/ 


		driver.close();
	}
}
