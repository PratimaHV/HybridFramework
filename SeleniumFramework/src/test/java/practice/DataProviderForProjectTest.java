package practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderForProjectTest 
{
	@Test(dataProvider="dataProvider_test")
public void contactDetails(String FN,String LN,String mobile) throws Throwable
{
	String key="webdriver.chrome.driver";
	String value="./chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
	
	driver.findElement(By.name("FirstName")).sendKeys(FN);
	driver.findElement(By.name("LastName")).sendKeys(LN);
	driver.findElement(By.id("mobile")).sendKeys(mobile);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	driver.quit();
	Thread.sleep(3000);
}
	@DataProvider
	public Object[][] dataProvider_test()
	{
		Object[][]objArr=new Object[3][3];
		objArr[0][0]="XXX";
		objArr[0][1]="XX";
		objArr[0][2]="123456789";
		
		
		objArr[1][0]="YYY";
		objArr[1][1]="YY";
		objArr[1][2]="234567891";
		
		objArr[2][0]="ZZZ";
		objArr[2][1]="ZZ";
		objArr[2][2]="345678912";
		
		return objArr;

}
}
