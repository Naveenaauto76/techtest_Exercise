package com.karhoo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.karhoo.qa.base.TestBase;


public class HomePage extends TestBase {
	
	HomePage homePage;

	// Page Factory or Object repository

		@FindBy(xpath = "//*[@id='topNav']/ul[1]/li[4]/a")
		WebElement aboutdropdown;

		@FindBy(xpath = "//a[contains(@title, 'Join the Karhoo team')]")
		WebElement karhooTeamLink;

		
		public HomePage() {
			PageFactory.initElements(driver, this);
		}

		public KarhooTeamPage navigateToKarhooTeamPage()
		{
			aboutdropdown.click();
			karhooTeamLink.click();
			return new KarhooTeamPage();
			
		}


}
