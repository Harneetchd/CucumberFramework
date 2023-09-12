package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class HomePage extends  BasePage
{ 
	static  WebDriver driver;
	public HomePage() 
	{
		super(driver = BaseTest.getDriver());
		addObject("UserMenuDropdown",By.id("userNav"));
		addObject("Logout",By.xpath("//a[text()='Logout']"));
		addObject("MySettings",By.xpath("//a[text()='My Settings']"));
		addObject("DisplayandLayout",By.xpath("//div[@id='AutoNumber5']/div"));
		addObject("CustomizemyTabs",By.xpath("//div[@id='DisplayAndLayout_child']/div"));
		addObject("Salesforce Chatter",By.id("p4"));
		addObject("Reports",By.xpath("//select[@id='duel_select_0']/option"));
		addObject("Add",By.xpath("//td[@class='zen-phs buttonCell']/div/a/img"));
		addObject("Save",By.xpath("//td[@id='bottomButtonRow']/input"));
		
	}
}
