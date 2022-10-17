package com.crm.Campaign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.crm.Generic_Utilities.Baseclass;
import com.crm.Generic_Utilities.Excel_Utility;
import com.crm.Generic_Utilities.Java_Utility;
import com.crm.ObjectRespositry.HomePagePom;
import com.crm.ObjectRespositry.ValidationVerificationPom;
import com.crm.ObjectRespositry.campaignsPom;

public class CreateCampaignTest extends Baseclass
{
	@Test
	public void createCampaignTest()throws Throwable
	{
	
		Java_Utility jlib=new Java_Utility();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//file generic
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
		hp. MoreLinkText();
		hp.CampaignsLinkText();
		
		//driver.findElement(By.xpath("//a[text()='More']")).click();  
		//driver.findElement(By.name("Campaigns")).click(); 
		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click(); 
		
		
		int ranNum= jlib.getRanDomNum();

		Excel_Utility elib=new Excel_Utility();
		String data= elib.getDataFromExcel("Sheet1",0,0)+ranNum;
		
		 driver.findElement(By.name("campaignname")).sendKeys(data);
		 driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			Thread.sleep(2000);
			
			campaignsPom cp=new campaignsPom(driver);
			cp.saveButton();
			
			ValidationVerificationPom vv=new ValidationVerificationPom(driver);
			vv.campaignsproductValidation(driver, data);
			
			
			/*String actData=driver.findElement(By.className("dvHeaderText")).getText();
			if(actData.contains(data))
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

