package com.crm.organisation;



//import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
//import org.testng.Assert;
import org.testng.annotations.Test;
import com.crm.Generic_Utilities.Baseclass;
import com.crm.Generic_Utilities.Excel_Utility;
import com.crm.Generic_Utilities.Java_Utility;
import com.crm.Generic_Utilities.WebDriver_Utility;
import com.crm.ObjectRespositry.HomePagePom;
import com.crm.ObjectRespositry.ValidationVerificationPom;
import com.crm.ObjectRespositry.campaignsPom;
public class CreateOrganizationTest extends Baseclass
{
	@Test(groups={"smoketest"})
	public void  createOrganizationTest() throws Throwable
	//public static void main(String[] args) throws Throwable
	{
		Java_Utility jlib=new Java_Utility();
		Excel_Utility elib=new Excel_Utility();
		WebDriver_Utility wlib=new WebDriver_Utility();
		wlib.waitForPageLoad(driver);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//file generic
		/*String URL=flib.getPropertyKeyValue1("url");
		String UserName=flib.getPropertyKeyValue1("un");
		String PassWord=flib.getPropertyKeyValue1("pw");*/
		/*driver.get(URL);
		LoginPagePom lp=new LoginPagePom(driver);
		lp.login(UserName, PassWord);*/
		/*driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(PassWord);
		driver.findElement(By.id("submitButton")).click();*/


		HomePagePom hp=new HomePagePom(driver);
		hp.oraganisationsLinkText();
		//Assert.assertEquals(true,false);

		//driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click(); 

		//java generic

		int ranNum= jlib.getRanDomNum();

		//excel data generic

		String data= elib.getDataFromExcel("Sheet1",0,0)+ranNum;

		driver.findElement(By.name("accountname")).sendKeys(data);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		
		campaignsPom cp=new campaignsPom(driver);
		cp.saveButton();
		
		ValidationVerificationPom vv=new ValidationVerificationPom(driver);
		vv.organisationValidation(driver, data);
		
		
		
		/*String actData=driver.findElement(By.className("dvHeaderText")).getText();
		if(actData.contains(data))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}*/
		/*WebElement ele=driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();*/
		//hp.AdminButton(driver);
		hp.signoutLinkText();
		driver.close();
	}
@Test
public void modifyorg()
{
	System.out.println("modified");
}
	}	







