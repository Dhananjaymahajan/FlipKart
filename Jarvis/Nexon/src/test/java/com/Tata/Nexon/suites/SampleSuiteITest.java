package com.Tata.Nexon.suites;

import com.Tata.Nexon.BaseTest.BaseTest;
import com.Tata.Nexon.pages.FlipKartLoginPage;
import com.Tata.Nexon.pages.FlipkarElectronicsPage;
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

public class SampleSuiteITest extends BaseTest {

	@Test
	public void LogintoFlipKart() throws InterruptedException {
		Report.createTest("This is 1st Test");
		FlipKartLoginPage LoginPage = new FlipKartLoginPage(obj);
		LoginPage.clickLoginCloseButton();
		FlipkarElectronicsPage ElectronicsPage = new FlipkarElectronicsPage(obj);
		ElectronicsPage.selectLaptopAccProcessor(obj);
		ElectronicsPage.getProductList(obj);

	}
	@Test
	public void Check2ndRun()
	{
		Report.createTest("This is 2nd Test");
		System.out.println("This is to check for 2nd Method");
	}

}