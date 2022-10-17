package com.crm.Product;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.crm.Generic_Utilities.Baseclass;
import com.crm.Generic_Utilities.Excel_Utility;
import com.crm.Generic_Utilities.Java_Utility;
import com.crm.ObjectRespositry.HomePagePom;
import com.crm.ObjectRespositry.ValidationVerificationPom;
import com.crm.ObjectRespositry.productPom;


public class CreateProductTest extends Baseclass
{
	@Test(groups={"smoketest","regressiontest"})
	public void createPoductTest() throws Throwable
	//public static void main(String[] args) throws Throwable
		{
		Java_Utility jlib=new Java_Utility();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
			//file generic
			
			/*String URL=flib.getPropertyKeyValue1("url");
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
			
			//driver.findElement(By.linkText("Products")).click();  
			driver.findElement(By.xpath("//img[@alt='Create Product...']")).click(); 
			 
		
			int ranNum= jlib.getRanDomNum();
			
			Excel_Utility elib=new Excel_Utility();
			String data= elib.getDataFromExcel("Sheet1",0,0)+ranNum;
			
			 driver.findElement(By.name("productname")).sendKeys(data);
			 driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				Thread.sleep(2000);
				/*String actData=driver.findElement(By.className("lvtHeaderText")).getText();
				if(actData.contains(data))
				{
				System.out.println("passed");
				}
				else
				{
				System.out.println("failed");
				}*/
				productPom pp=new productPom(driver);
				pp.saveButton();
				
				ValidationVerificationPom vv=new ValidationVerificationPom(driver);
				vv.productValidation(driver, data);
				
				/*WebElement ele=driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
				Actions a=new Actions(driver);
				a.moveToElement(ele).perform();
				driver.findElement(By.xpath("//a[text()='Sign Out']")).click();*/
				hp.AdminButton(driver);
				hp.signoutLinkText();
				driver.close();

			}	

			}
				
				
			



				




