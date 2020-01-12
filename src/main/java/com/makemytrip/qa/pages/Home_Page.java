package com.makemytrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.qa.base.TestBase;



public class Home_Page extends TestBase {

	// By loginbutton = By.xpath("//p[text()=' Login or Create Account']");

	@FindBy(xpath = "//p[text()=' Login or Create Account']")
	WebElement btnLogin_Home;

	@FindBy(xpath = "//span[text()='Flights']")
	WebElement lnkFlights;

	@FindBy(xpath = "//span[text()='Hotels']")
	WebElement lnkHotels;

	@FindBy(xpath = "//span[text()='Villas & Apts']")
	WebElement lnkVillas;

	@FindBy(xpath = "//span[text()='Holidays']")
	WebElement lnkHolidays;

	public Home_Page() {
		PageFactory.initElements(driver, this); // to intialize webelements of that particular page
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyHomePageLabel() {
		return btnLogin_Home.isDisplayed();
	}

	public Login_Page navloginPage() {
		btnLogin_Home.click(); // we are navigating to login page so we need to return login page object to
							// access all the webelements of that page
		return new Login_Page();// once this is created, constructor of login page gets executed and we will
								// have access of that page webelements
	}

	
	public Hotels_Page navHotelPage() {
		lnkHotels.click();
		return new Hotels_Page();
	}
	
	public Flights_Page navFlightPage() {
		lnkHotels.click();
		return new Flights_Page();
	}

	
	public Villas_Apt_Page navVillasPage() {
		lnkHotels.click();
		return new Villas_Apt_Page();
	}
	
	
	public Holidays_Page navHolidaysPage() {
		lnkHotels.click();
		return new Holidays_Page();
	}
}
