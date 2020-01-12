package com.makemytrip.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.makemytrip.qa.base.TestBase;



public class Login_Page extends TestBase {

	
	@FindBy(id= "username")
	WebElement txtUsername;
	
	@FindBy(id= "password")
	WebElement txtPassword;
	
	@FindBy(xpath= "//span[text()='Continue']" )
	WebElement btnContinue;
	
	
	@FindBy(xpath= "//span[text()='Login']")
	WebElement btnLogin;
	
	
	
	
	
	public Login_Page() {
		PageFactory.initElements(driver, this);
	}
	
	WebDriverWait wait = new WebDriverWait(driver,20);
	public Home_Page loginMakeMyTrip(String username,String password)  {
		txtUsername.sendKeys(username);
		
		wait.until(ExpectedConditions.visibilityOf(btnContinue)).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", btnContinue);
		
		//btnContinue.click();
		txtPassword.sendKeys(password);
		
		
		btnLogin.click();
		return new Home_Page();
		
	}
}
