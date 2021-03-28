package com.Tata.Nexon.suites;

import com.Tata.Nexon.pages.FlipKartLoginPage;
import com.Tata.Nexon.utilityClasses.GenericFunctions;
import com.github.jsdevel.testng.selenium.AbstractSuite;
import com.github.jsdevel.testng.selenium.annotations.driverconfig.UserAgent;
import com.github.jsdevel.testng.selenium.annotations.screensizes.LargeDesktop;
import com.github.jsdevel.testng.selenium.annotations.screensizes.Phone;
import com.github.jsdevel.testng.selenium.config.Config;
import com.github.jsdevel.testng.selenium.exceptions.PageInitializationException;
import com.github.jsdevel.testng.selenium.exceptions.PageInstantiationException;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleSuiteITest {
	

	 WebDriver obj;

	@BeforeTest
	public void LaunchBrowser() throws IOException {
		System.out.println(GenericFunctions.GetCurrentMethodName() + "has invoked");
		System.setProperty(GenericFunctions.ReadProperty("driverName"),GenericFunctions.ReadProperty("driverPath"));
		obj = new FirefoxDriver();
		obj.manage().window().maximize();
		String LoginUrl = GenericFunctions.ReadProperty("url");
		obj.get(LoginUrl);

	}
	@AfterTest
	public void TestClose()
	{
		System.out.println("Test Closed");
		obj.quit();
	}

	@Test
	@LargeDesktop
	@UserAgent("foo")
	public void LogintoFlipKart() {
		FlipKartLoginPage LoginPage = PageFactory.initElements(obj, FlipKartLoginPage.class);
		LoginPage.LoginFlipkart("dhananjay12@gmail.com", "Password");

	}

}