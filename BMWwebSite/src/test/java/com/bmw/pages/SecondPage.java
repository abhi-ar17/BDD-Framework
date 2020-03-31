package com.bmw.pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;


public class SecondPage {
WebDriver driver;
SoftAssert asd=new SoftAssert();
	public SecondPage(WebDriver driver)							//Constructor
	{
		this.driver=driver;
	}

//	**********************************************ALL LOCATORS***************************************
	
	
	@FindBy(xpath="//*[@class=\"button ds2-link expand ds2-dropdown-js-area\"]")
	WebElement dropDown;
	
	@FindBy(xpath="//*[@class=\"ds2-dropdown__link ds2-link\"]")
	List <WebElement> dropDownList;
	
	@FindBy(xpath="//*[@class=\"content ds2-technical-data--content ds2-mvc-tabs-content__panel ds2-mvc-tabs-content__panel--active\"]//div[@class=\"ds2-cms-output\"]")
	List <WebElement> data;
	
	public void getData(int n) 
	{
		
		dropDown.click();																										//Clicking on drop down 
		dropDownList.get(n).click();																						//sELECTING car
		String dat = data.get(35).getText();																			//Getting power value
		Integer as = Integer.parseInt(dat.substring(5,8));													//Converting to integer
	System.out.println("THE POWER OF CAR IS : "+as);
	if(as>500)
	{
		System.out.println("Does  met my requirements");
		
		
//	    ----------------Take Screenshot of car meet requirements--------------------
		
		
	File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	screenShot.renameTo(new File("src/test/resources/Screenshot/images" + System.currentTimeMillis() + ".png"));
	    
	}
	else
	{
		System.out.println("Does not met my requirements");
	}
//		asd.assertTrue(as>500,"Does not meet my requirements");
	 								//Assert on the condition given
		

//	    TakesScreenshot scrnshot = ((TakesScreenshot) driver);
//		File src = scrnshot.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\BMWwebSite\\src\\test\\resources\\Sreenshot\\image" + System.currentTimeMillis() + ".png");
//		Files.copy(src, dest);
	
	}
	
}
