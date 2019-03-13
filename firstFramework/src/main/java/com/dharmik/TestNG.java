package com.dharmik;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	//WebDriver driver = new ChromeDriver();
	
	TestNGPage function = new TestNGPage();
	
	@BeforeSuite
	public void startSuit() {
		System.out.println("Starting a Test Suit.");
	}
	
	@BeforeTest
	public void startTest() {
		System.out.println("Starting a Test");
	}
	
	@BeforeClass
	public void startClass() {
		System.out.println("Class");
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing\\chromedriver_win32\\chromedriver.exe");
	}
	
	@BeforeMethod
	public void createDriver() {
		
	}
	
	@Test
	public void actionCheck() {
		function.openPage("https://www.amazon.in/");
		function.getOrderList();
	}
	
	@Test
	public void alertCheck() {
		function.openPage("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		function.alertAccept();
	}
	
	@AfterMethod
	public void closePage() {
		function.closeBrowser();
	}
	
	@AfterClass
	public void classDone() {
		System.out.println("This class is done.");
	}
	
	@AfterTest
	public void testDone() {
		System.out.println("Whole Test is done");
	}
	
	@AfterSuite
	public void suitDone() {
		System.out.println("This test suit is finished.");
	}
}
