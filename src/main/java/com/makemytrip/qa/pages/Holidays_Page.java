package com.makemytrip.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.makemytrip.qa.base.TestBase;

public class Holidays_Page extends TestBase {

	public Holidays_Page() {
		PageFactory.initElements(driver, this);
	}

}
