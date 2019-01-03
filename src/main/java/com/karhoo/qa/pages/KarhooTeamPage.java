package com.karhoo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.karhoo.qa.base.TestBase;

public class KarhooTeamPage extends TestBase{
	
	HomePage homePage;
	KarhooTeamPage karhooTeamPage;
	BamboohrVacPage bamboohrVacPage;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement applyBtn;
	
	
	
	public KarhooTeamPage() {
		PageFactory.initElements(driver, this);
		//homePage = new HomePage();
		//karhooTeamPage = new KarhooTeamPage();
		bamboohrVacPage = new BamboohrVacPage();
	}
	
	public String clickApply() throws InterruptedException {
		Thread.sleep(2000);
		applyBtn.click();
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		 
		String bambooHRurl = driver.getCurrentUrl();
		return bambooHRurl;
	}

}
