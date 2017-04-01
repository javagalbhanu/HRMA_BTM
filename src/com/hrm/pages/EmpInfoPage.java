package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.hrm.base.HomePage;

public class EmpInfoPage extends HomePage{

	@FindBy(id="searchBtn")
	private WebElement searchBtn;
	
	public EmpInfoPage(WebDriver driver) {
		super(driver);
	}

	public void checkSearchButtonIsPresent(){
		checkElementIsPresent(searchBtn);
	}
}
