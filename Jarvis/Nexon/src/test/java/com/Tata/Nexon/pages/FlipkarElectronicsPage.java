package com.Tata.Nexon.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.Tata.Nexon.utilityClasses.GenericFunctions;

public class FlipkarElectronicsPage {

	public FlipkarElectronicsPage(WebDriver obj) {

		PageFactory.initElements(obj, this);
	}

	@FindBy(xpath = "//*[@class='_1psGvi SLyWEo']//following::*[text()='Electronics']")
	private WebElement ElectronicsTab;

	@FindBy(xpath = "//*[text()='Laptop Accessories']")
	private WebElement LaptopAccessoriesTab;
	@FindBy(xpath = "//*[text()='Processor']")
	private WebElement ProcessorLink;
	@FindBys({ @FindBy(xpath = "//a[@class='s1Q9rs']") })
	private List<WebElement> listofProducts;

	public void selectLaptopAccProcessor(WebDriver obj) throws InterruptedException {

		GenericFunctions.HoverOnElement(obj, ElectronicsTab).perform();

		GenericFunctions.WaitForElement(obj, LaptopAccessoriesTab, 20);

		GenericFunctions.HoverOnElement(obj, LaptopAccessoriesTab).perform();
		GenericFunctions.WaitForElement(obj, ProcessorLink, 20);

		GenericFunctions.HoverOnElement(obj, ProcessorLink).perform();
		ProcessorLink.click();
	}

	public void getProductList(WebDriver obj) {
		for (int i = 0; i < listofProducts.size(); i++) {
			GenericFunctions.WaitForElement(obj, listofProducts.get(i), 10);
			System.out.println(listofProducts.get(i).getText());
		}
	}
}
