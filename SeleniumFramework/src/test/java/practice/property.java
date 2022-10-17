package practice;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class property 
	{

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		FileInputStream fis=new FileInputStream("./target/commondata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		
		String URL=pro.getProperty("url");
		String UserName=pro.getProperty("un");
		String PassWord=pro.getProperty("pw");
		
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(PassWord);
		driver.findElement(By.id("submitButton")).click();
	}

}
