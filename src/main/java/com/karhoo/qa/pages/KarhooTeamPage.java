package com.karhoo.qa.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.karhoo.qa.base.TestBase;
import com.karhoo.qa.util.TestUtil;

public class KarhooTeamPage extends TestBase{
	
	HomePage homePage;
	KarhooTeamPage karhooTeamPage;
	BamboohrVacPage bamboohrVacPage;
	
	@FindBy(xpath = "//html/body/main/div[4]/div/div/div/div/div[2]/a")
	WebElement applyBtn;
	
	
	
	public KarhooTeamPage() {
		PageFactory.initElements(driver, this);
		//homePage = new HomePage();
		//karhooTeamPage = new KarhooTeamPage();
		bamboohrVacPage = new BamboohrVacPage();
	}
	
	public String clickApply() throws InterruptedException {
		Thread.sleep(3000);
		TestUtil.scrollPageDown(driver);
		applyBtn.click();
		Set <String> winSet = driver.getWindowHandles();
		for(String winHandle : winSet){
		    driver.switchTo().window(winHandle);
		}
		 
		String bambooHRurl = driver.getCurrentUrl();
		return bambooHRurl;
	}

}
	