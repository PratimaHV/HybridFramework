package com.crm.Generic_Utilities;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility {
	
		/**
		 * wait for page to load before indentifying any snychronized element in DOM
		 *@author Pratima
		 */
		 public void waitForPageLoad(WebDriver driver)
		 {
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		 }
		 
		 
		 
		 /**
		  * After every action it will for next action to perform
		  * *@author Pratima
		  * */
		  public void scriptTimeOut(WebDriver driver)
		  {
			  driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
			  
		  }
		  
		  
		  /**
		   * used to switch to any window based on window title
		   * @param driver
		   * @param PartialWindowTitle
		   * @author Pratima 
		   */

		  public void switchToWindow(WebDriver driver,String PartialWindowTitle)
		  {
			  Set<String>allId=driver.getWindowHandles();
		  Iterator<String> it=allId.iterator();
		  while(it.hasNext())
		  {
		String win=it.next();
		driver.switchTo().window(win);
		if(driver.getTitle().contains(PartialWindowTitle))
		{
			break;
		}
		  }
		  }
	
	
		/**used to switchToAlertWindow and Accept(click  on ok Button)*
		 *@param driver
		 *@author Pratima
		 */
		public void switchToAlertAndAccpect(WebDriver driver)
		{
		driver.switchTo().alert().accept();
		
		}
	
		
		
		/**
		 *used to switch to AlterWindow and dismiss(click on cancel button)
		 *@param driver
		 *@author Pratima
		 */
		public void switchToAlterAndDismiss(WebDriver driver) 
		{
		driver.switchTo().alert().dismiss();	
		}
	
		
		
	
		/**used to switch to frame window based on Index
		 *@author Pratima
		 */
		public void switchToFrame(WebDriver driver,int index)
		{
			driver.switchTo().frame(index);
		}
		
		
	
		/**
		 * used to switch to frame window based on id or name attribute
		 * @param driver
		 *@param id_name_attribute
		 * @author Pratima
		 */
		public void switchToFrame(WebDriver driver,String id_name_Attiribute)
		{
		driver.switchTo().frame(id_name_Attiribute);
		}
		
		
		
		
		/**
		 * used to select the value from the dropDown based on index
		 *  @param driver
		 *@param index
		 * @author Pratima
		 */
		public void mouseOverOnElement(WebDriver driver,WebElement element)
		{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		}
		
		
		
		/**
		 * used to right click on specific element
		 *  @param driver
		 *@param element
		 * @author Pratima
		 */
		public void rightClickOnElement(WebDriver driver,WebElement element)
			{
			Actions act=new Actions(driver);
			act.contextClick(element).perform();
		}
		
		
		public void moveByOffest(WebDriver driver,int x,int y)
		{
		Actions act=new Actions(driver);
		act.moveByOffset(x,y).click().perform();
		}
	
		public void waitElementToClick(WebDriver driver,WebElement Element)
		{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(Element));

		}
}
	
	