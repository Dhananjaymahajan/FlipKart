import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IronMan {

	int k = 5;

	public static void main(String[] args) throws InterruptedException, InvalidFormatException, IOException, AWTException {

		/*
		 * File src = new File("D:\\Paise.xlsx"); XSSFWorkbook wb = new
		 * XSSFWorkbook(src); XSSFSheet sh = wb.getSheetAt(0); //int c = k+5;
		 * System.out.println(sh.getRow(3).getCell(2).getStringCellValue().toString());
		 * for (int i =0;i<10;i++) { System.out.println(i); }
		 * 
		 * int rows = sh.getLastRowNum(); for (int i = 0; i <= rows; i++) { for (int j =
		 * 1; j <= 10; j++) {
		 * System.out.println(sh.getRow(3).getCell(2).getStringCellValue()); }
		 * 
		 * }
		 * 
		 * String inpString = sh.getRow(3).getCell(2).getStringCellValue(); int lenght =
		 * inpString.length(); for (int i = lenght - 1; i >= 0; i--) { String newString
		 * = ""; char a = inpString.charAt(i); newString = newString + a;
		 * System.out.print(newString); }
		 */

		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\Drivers\\geckodriver.exe");
		WebDriver obj = new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("https://www.makemytrip.com/");
		WebElement Trip = obj.findElement(By.xpath("//*[text()='My Trips']"));
		Actions act = new Actions(obj);
		Thread.sleep(2000);
		Robot rob = new Robot();
		rob.mouseMove(1000, 0);
		
	
		JavascriptExecutor js = (JavascriptExecutor)obj;
		js.executeScript("arguments[0].click();", Trip);
		
		Thread.sleep(2000);
		System.out.println(obj.findElement(By.xpath("//*[text()='My Trips']")).getText());

		Thread.sleep(2000);

	}

}
