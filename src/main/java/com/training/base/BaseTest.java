 package com.training.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest
{
  protected static WebDriver driver;
  static CommonUtilities common = new CommonUtilities ();
  
  
  public static void launchApplication() throws IOException
  {
	    driver = getDriver();
	    String url = common.getProperty("url");
	    driver.get(url);
  }
  
  public static  WebDriver getDriver()
  {
	  if(driver== null) 
	  {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	  }
	  return driver;
  } 
}
 