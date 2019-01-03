package com.karhoo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.karhoo.qa.pages.HomePage;
import com.karhoo.qa.pages.KarhooTeamPage;
import com.karhoo.qa.base.TestBase;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	KarhooTeamPage karhooTeamPage; 
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		TestBase.initialization();
		homePage = new HomePage();
		karhooTeamPage = new KarhooTeamPage();
	}

		
	@Test
	public void navigateToKarhooTeamPageTest(){
		karhooTeamPage = homePage.navigateToKarhooTeamPage();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
