

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testin {

	@Test  (groups = "Tata") 
	public void T12() {
		System.out.println("This is Test");
	}
	@Test (groups = "Nexon") 
	public void T1() {
		System.out.println("This is Test");
	}
	@BeforeTest
	public void T2() {
		System.out.println("This is @BeforeTest");
	}
	@AfterTest
	public void T11() {
		System.out.println("This is @BeforeTest");
	}
	@BeforeMethod
	public void T3() {
		System.out.println("This is @BeforeMethod");
	}
	@AfterMethod
	public void T4() {
		System.out.println("This is @AfterMethod");
	}
	@AfterSuite
	public void T5() {
		System.out.println("This is @AfterSuite");
	}
	@BeforeSuite
	public void T6() {
		System.out.println("This is @BeforeSuite");
	}
	@BeforeClass
	public void T7() {
		System.out.println("This is @BeforeClass");
	}
	@AfterClass
	public void T8() {
		System.out.println("This is @AfterClass");
	}
	@AfterGroups
	public void T9() {
		System.out.println("This is @AfterGroup");
	}
	@BeforeGroups 
	public void T10()
	{
		System.out.println("This is @BeforeGroups");
	}
	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * 
	 * System.setProperty("webdriver.gecko.driver",
	 * "D:\\selenium\\Drivers\\geckodriver.exe"); WebDriver obj = new
	 * FirefoxDriver(); obj.manage().window().maximize();
	 * obj.get("http://www.zlti.com"); String PageTitle = obj.getTitle();
	 * System.out.println(PageTitle); List<WebElement> a =
	 * obj.findElements(By.tagName("a"));
	 * 
	 * int linkNo = a.size(); for (int i = 0; i <linkNo ; i++) { a.get(i).click();
	 * String ChangedTitle = obj.getTitle(); if
	 * (PageTitle.equalsIgnoreCase(ChangedTitle)) {
	 * System.out.println("Link is Broken");
	 * 
	 * 
	 * } else { System.out.println("Link is not Broken");
	 * System.out.println(ChangedTitle); Thread.sleep(2000); obj.navigate().back();
	 * System.out.println(obj.getTitle()); } }
	 * 
	 * obj.quit(); }
	 */
}