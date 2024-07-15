package com.training.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage 
{
	WebDriver driver;
	
	public HashMap<String, By> objectRepo = new HashMap<String, By>();

	public BasePage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void addObject(String logicalName, By by)// create a method which :to adding to HASHMAP
	{
		objectRepo.put(logicalName, by);
	}

	private WebElement getElement(String logicalName)
	{
		By by = objectRepo.get(logicalName);// if we pass the key it gives value
		WebElement element = driver.findElement(by);
		return element;
	}

	public void enterIntoTextbox(String logicalName, String value) 
	{
		WebElement element = getElement(logicalName);
		element.sendKeys(value);
	}
   public void clickonButton(String logicalName)
   {
	   WebElement element = getElement(logicalName);
	   element.click();
	   System.out.println("Validation :"+driver.getTitle());
	  // Assert.assertEquals(driver.getTitle(), "Home Page ~ Salesforce - Developer Edition","Titles dont Match");
	   
   }

   public void clearTextBox(String logicalName)
   {
	   WebElement element = getElement(logicalName);
		element.clear();
   }
   public void errorMessage(String logicalName)
   {
	   WebElement element = getElement(logicalName);
	   System.out.println("Validation Error Message: "+element.getText());
   }
   public void clickOnRememberMe(String logicalName)
   {
	   WebElement element = getElement(logicalName);
	   element.click();
   }
   public void clickOnUserMenu(String logicalName)
   {
	   WebElement element = getElement(logicalName);
	   explicitWait(20,element);
	   element.click();
   }
   public void validateUserMenu(String logicalName)
   {
	 //div[@id='userNavMenu']/div[3]/a
	 		List<String> actualoptions= new ArrayList<String>();
	 		List<String> expectedoptions = new ArrayList<String>();
	 		expectedoptions.add("My Profile");
	 		expectedoptions.add("My Settings");
	 		expectedoptions.add("Developer Console");
	 		expectedoptions.add("Switch to Lightning Experience");
	 		expectedoptions.add("Logout");
	 		
	 		List<WebElement> usermenudropdown= driver.findElements(By.xpath("//div[@id='userNavMenu']/div[3]/a"));
	 		for(WebElement element: usermenudropdown)
	 		{
	 			actualoptions.add(element.getText());
	 		}
	 		if (actualoptions.equals(expectedoptions))
	 				{
	 			       System.out.println("Test Pass");
	 				}else
	 				{
	 				   System.out.println("Test Fail");
	 				}
   }
   
   public void clickOnLogout(String logicalName)
   {
	   WebElement element = getElement(logicalName);
	   element.click();   
   }
   
   public void clickonMySettings(String logicalName)
   {
		WebElement element = getElement(logicalName);
		explicitWait(100, element);
		element.click();
   }
   public void clickonDisplayandLayout(String logicalName) 
   {
	   List<WebElement> displayandlayout= new ArrayList<WebElement>() ;
	   displayandlayout.add(getElement(logicalName));//since its in a table hence we call list of elements inside
		for(WebElement element: displayandlayout) // we call each element inside the list 
		{
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase("Display & Layout"))// we check our element with if condition
			{
				element.click(); 
				break;  
			}
		}
   }
   
   public void clickonCustomizeMyTabs(String logicalName) 
   {
	   List<WebElement> customizemytabs= new ArrayList<WebElement>();
	   customizemytabs.add(getElement(logicalName));
		for(WebElement element:customizemytabs)
		{
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase("Customize My Tabs"))
			{
				element.click();
				break;
			}
		}
   }
   
   public void selectCustomApp(String logicalName)
   {
		WebElement element = getElement(logicalName);
		Select dropdownoptions = new Select(element); // dropdown hence Select imported
		dropdownoptions.selectByVisibleText("Salesforce Chatter"); // selected by visibility of text
		
   }
   
   public void clickAvailableTab(String logicalName)
   {
	   List<WebElement> availabletabs=new ArrayList<WebElement>();
	   availabletabs.add(getElement(logicalName));
		for(WebElement element:availabletabs)
		{
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase("Reports"))
			{
				element.click();
				break;
			}
		}
   }
   public void clickAddButton(String logicalName)
   {
	   List<WebElement> addbutton=new ArrayList<WebElement>();
	   addbutton.add(getElement(logicalName));
		for(WebElement element:addbutton)
		{
			System.out.println(element.getAttribute("title"));
			if(element.getAttribute("title").equalsIgnoreCase("Add"))
			{
				element.click();
				break;
			}
		}
   }
   public void clickSaveButton(String logicalName)
   {
	   List<WebElement>save= new ArrayList<WebElement>();
	   save.add(getElement(logicalName));
		for(WebElement element:save)
		{
			System.out.println(element.getAttribute("title"));
			if(element.getAttribute("title").equalsIgnoreCase("Save"))
			{
				element.click();
				break;
			}
		}
   }
   
   public void explicitWait(int time,WebElement element)
   {
	   WebDriverWait wait = new WebDriverWait(driver,time);
	   wait.until(ExpectedConditions.visibilityOf(element));
	   
   }
   
}