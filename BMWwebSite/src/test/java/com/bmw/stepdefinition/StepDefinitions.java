package com.bmw.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.bmw.base.TestBase;
import com.bmw.pages.FirstPage;
import com.bmw.pages.SecondPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	WebDriver driver;
	FirstPage fp;
	SecondPage sp;
	
	
	@Given("User launches the web browser and Web Site")
	public void User_launches_the_web_browser_and_Web_Site()
	{
		TestBase.launchBrowser("ch");
		this.driver=TestBase.driver;
	}
	
	@When("click on models")
	public void click_son_models()
	{
		fp=PageFactory.initElements(driver, FirstPage.class);
		fp.clickModels();
	}
	
//	@Then("User is taken to new page")
//	public void newPage()
//	{
//		System.out.println("New page is displayed");
//	}
	
	@Then("User click on series 7 and click on the image")
	public void selectS()
	{
//		System.out.println("********************************");
	
		fp.selectSeries();
	}

	@Then("click on technical data")
	public void techData()
	{
	
		fp.clickTechData();
	}
	
	@Then("select each car and check whether power is greater than 500")
	public void checkPower()
	{
		sp=PageFactory.initElements(driver, SecondPage.class);
		
		firstCar();
		secondCar();
		thirdCar();
		fourthCar();
	}
	@Test(priority=0)
	private void firstCar()
	{
		sp.getData(0);	
//		asd.assertTrue(as>500,"Does not meet my requirements");
	}
	
	@Test(priority=1)
	private void secondCar()
	{
		sp.getData(1);
//		asd.assertTrue(as>500,"Does not meet my requirements");
	}
	
	@Test(priority=2)
	private void thirdCar()
	{
		sp.getData(2);
//		asd.assertTrue(as>500,"Does not meet my requirements");
	}
	
	@Test(priority=3)
	private void fourthCar()
	{
		sp.getData(3);
//		asd.assertTrue(as>500,"Does not meet my requirements");
	}
	
}
