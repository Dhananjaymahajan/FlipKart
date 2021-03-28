package com.Tata.Nexon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FlipKartLoginPage {

	WebDriver obj;
	
	public FlipKartLoginPage(WebDriver obj) {
		
		this.obj = obj;
	}
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement username;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="(//span[text()='Login'])[2]")
	private WebElement loginBtn;
	@FindBy(xpath="//*[@class='_2KpZ6l _2doB4z']")
	private WebElement closeBtn;
	
	public void LoginFlipkart(String uname, String pass){
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}
	public void clickLoginCloseButton() {
		closeBtn.click();
	}
	
}
