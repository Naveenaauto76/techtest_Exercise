package com.karhoo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.karhoo.qa.base.TestBase;
import com.karhoo.qa.pages.BamboohrVacPage;
import com.karhoo.qa.pages.HomePage;
import com.karhoo.qa.pages.KarhooTeamPage;

public class KarhooTeamPageTest extends TestBase{
	
HomePage homePage;	
KarhooTeamPage karhooTeamPage; 
BamboohrVacPage bamboohrVacPage;
	
	public KarhooTeamPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		TestBase.initialization();
		homePage = new HomePage();
		bamboohrVacPage = new BamboohrVacPage();
        karhooTeamPage = homePage.navigateToKarhooTeamPage();
		
	}

		
	@Test
	public void applyTest() throws InterruptedException{
		String bamboourl = karhooTeamPage.clickApply();
		Assert.assertEquals(bamboourl, "https://karhoo.bamboohr.co.uk/jobs/");
		
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
