package com.crm.Product;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.crm.Generic_Utilities.Baseclass;
import com.crm.Generic_Utilities.Excel_Utility;
import com.crm.Generic_Utilities.Java_Utility;
import com.crm.ObjectRespositry.HomePagePom;


public class DeletProductTest extends Baseclass
{
@Test(groups={"regressiontest"})
public void deletProductTest() throws Throwable
	//public static void main(String[] args) throws Throwable
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
			hp.ProductsLinkText();
			
			//driver.findElement(By.linkText("Products")).click();  
			driver.findElement(By.xpath("//img[@alt='Create Product...']")).click(); 
			
	
			int ranNum= jlib.getRanDomNum();

			Excel_Utility elib=new Excel_Utility();
			String data= elib.getDataFromExcel("Sheet1",0,0)+ranNum;
			
			System.out.println(data);
			
			 driver.findElement(By.name("productname")).sendKeys(data);
			 driver.findElement(By.xpath("(//input[@name='button'][1])")).click();
			 driver.findElement(By.xpath("(//input[@type='button'][3])")).click();
			 
			 /*WebElement ele=driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
				Actions a=new Actions(driver);
				a.moveToElement(ele).perform();
				driver.findElement(By.xpath("//a[text()='Sign Out']")).click();*/
				hp.AdminButton(driver);
				hp.signoutLinkText();
				driver.close();

			}	


	}


