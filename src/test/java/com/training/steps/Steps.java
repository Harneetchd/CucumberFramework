package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest
{ 
	PageFactory pageFactory = new PageFactory(); //We have to take com.training.pagefactory; NOT the selenium one
	BasePage page; // creating an instance of BasePage
	
	@Before
	public void setUp() throws IOException
	{
		launchApplication();
	}
	
	@Given("User is on {string}")
	public void user_is_on(String Page) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException// on the login page
	{
		//page = new LoginPage(); it will have methods of both base page and elements of login page
	    page = pageFactory.initialize(Page);
	   // System.out.format("Thread ID - %2 - %s from %s feature file.\n", Thread.currentThread().getId());
	}
	
	@When("Enter into Textbox {string} {string}")
	public void enter_into_textbox(String logicalName, String value )
	{
	   page.enterIntoTextbox(logicalName, value);
	}
	
	@Then("Click on Button {string}")
	public void click_on_button(String logicalName) 
	{
		page.clickonButton(logicalName);
	}
	
	@Then("Clear the Textbox {string} {string}")
	public void clear_the_textbox(String logicalName, String value)
	{
	    page.clearTextBox(logicalName);
	}

	@Given("User gets {string}")
	public void user_gets(String logicalName) 
	{
	    page.errorMessage(logicalName);
	}
	@Then("Click on Checkbox {string}")
	public void click_on_checkbox(String logicalName)
	{
	    page.clickOnRememberMe(logicalName);
	}
	
	@When("User Clicks dropdown {string}")
	public void user_clicks_dropdown(String logicalName) 
	{
	    page.clickOnUserMenu(logicalName);
	}
	
	@Then("validate usermenu dropdown {string}")
	public void validate_usermenu_dropdown(String logicalName) 
	{
	    page.validateUserMenu(logicalName);
	}
	

	@Then("user clicks on {string}")
	public void user_clicks_on(String logicalName) 
	{
        page.clickonMySettings(logicalName);
	}

	@Then("user clicks on displaylayout {string}")
	public void user_clicks_on_displaylayout(String logicalName) 
	{
        page.clickonDisplayandLayout(logicalName);
	}
	
	@When("user clicks {string}")
	public void user_clicks(String logicalName) 
	{
        page.clickonCustomizeMyTabs(logicalName);
	}
	
	@Then("User Clicks logout {string}")
	public void user_clicks_logout(String logicalName)
	{
		page.clickOnLogout(logicalName);
	}

	@Then("user selects from Customapp {string}")
	public void user_selects_from_customapp(String logicalName)
	{
       page.selectCustomApp(logicalName);
	}

	@Then("user selects from Availabletabs {string}")
	public void user_selects_from_availabletabs(String logicalName) 
	{
        page.clickAvailableTab(logicalName);
	}

	@Then("user adds {string}")
	public void user_adds(String logicalName) 
	{
        page.clickAddButton(logicalName);
	}



	@After
	public void teardown(Scenario scenario)
	{
//		if(scenario.isFailed())
//		{
//			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshot, "image/png", scenario.getName());
//		}
		byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		//driver.close();
		driver=null;
		
		
	}
}
