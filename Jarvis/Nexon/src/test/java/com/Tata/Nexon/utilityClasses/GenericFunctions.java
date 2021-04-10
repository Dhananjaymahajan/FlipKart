package com.Tata.Nexon.utilityClasses;

import java.beans.Visibility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericFunctions {

	static FileInputStream fis;
	static Actions Act;
	static WebDriver obj;

	public static String GetCurrentMethodName() {

		String CurrentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		return CurrentMethodName;
	}

	public static String ReadProperty(String Key) throws IOException {
		String Property = null;
		try {

			fis = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\test\\java\\com\\Tata\\Nexon\\Data\\ConfigProperties.properties");
			Properties prop = new Properties();
			prop.load(fis);
			Property = prop.getProperty(Key);

		} catch (Exception e) {
			System.out.println("Unable to Read the file because of " + e.toString());
		}
		return Property;
	}

	public static Action HoverOnElement(WebDriver driver, WebElement element) {
		Act = new Actions(driver);
		return Act.moveToElement(element).build();
	}

	public static void WaitForElement(WebDriver Driver, WebElement element, long timeout) {
		WebDriverWait wait = new WebDriverWait(Driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
		// below line is just to append the date format with the screenshot name to
		// avoid duplicate names
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		// Returns the captured file path
		return destination;
	}
}
