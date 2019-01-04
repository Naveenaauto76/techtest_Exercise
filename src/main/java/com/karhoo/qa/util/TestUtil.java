package com.karhoo.qa.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.karhoo.qa.base.TestBase;

public class TestUtil extends TestBase{
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;



public static void scrollPageDown(WebDriver driver) {
	
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript(("window.scrollTo(0,document.body.scrollHeight)"));
	
}
}
