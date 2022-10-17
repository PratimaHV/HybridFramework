package com.crm.Generic_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.crm.ObjectRespositry.LoginPagePom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
	public WebDriver driver;
	public static WebDriver sDriver;
	@BeforeSuite(groups={"smoketest","regressiontest"})
	public void BS() {
		System.out.println("Data base connection");
	}
	@BeforeTest(groups={"smoketest","regressiontest"})
	public void BT () 
	{
		System.out.println("Execute in Paralell mode");
	}
//@Parameters("BROWSER")
	@BeforeClass(groups={"smoketest","regressiontest"})
	//public void BC (String BROWSER) throws Throwable
	public void BC () throws Throwable
	{
		
		File_Utility flib1=new File_Utility();
		String Browser=flib1.getPropertyKeyValue1("browser");

		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else 
		{
			driver=new ChromeDriver();
		}
		
		System.out.println("Launching the Browser");
		sDriver=driver;
	}
	@BeforeMethod(groups={"smoketest","regressiontest"})
	public void BM () throws Throwable 
	{
		File_Utility flib=new File_Utility();
		String URL=flib.getPropertyKeyValue1("url");
		String UserName=flib.getPropertyKeyValue1("un");
		String PassWord=flib.getPropertyKeyValue1("pw");

		driver.get(URL);
		LoginPagePom lp=new LoginPagePom(driver);
		lp.login(UserName, PassWord);
		System.out.println("Login to Application");
	}
	@AfterMethod(groups={"smoketest","regressiontest"})
	public void AM() {
		System.out.println("Logout the Application");
	}
	@AfterClass(groups={"smoketest","regressiontest"})
	public void AC()
	{
		System.out.println("Close the Browser");
	}
	@AfterTest(groups={"smoketest","regressiontest"})
	public void AT()
	{
		System.out.println("Executed Sucessfully");
	}
	@AfterSuite(groups={"smoketest","regressiontest"})
	public void AS()
	{
		System.out.println("DataBase Close");
	}
}