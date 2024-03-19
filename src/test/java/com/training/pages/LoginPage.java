package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage
{
	
    static WebDriver driver;
	public LoginPage()
	{
		//we will add elements in constructor because we want to load elements every time the page loads
		super(driver = BaseTest.getDriver());
		//getting the driver from basetest
		
        addObject("Username", By.id("username"));
        addObject("Password", By.id("password"));
        addObject("RememberMe", By.xpath("//input[@class='r4 fl mr8']"));
        addObject("Login", By.id("Login"));
        addObject("Error Message", By.id("error"));
        addObject("Logout",By.xpath("//div[@id='userNav-menuItems']/a[5]"));
	}
} 
