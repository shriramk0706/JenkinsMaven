package com.ju;

import org.testng.annotations.Test;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.JiraClient;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class TestClass {
 
	public WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions chromeOptions= new ChromeOptions();
      System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\latest\\chromedriver_win32 (4)\\Chromedriver.exe");
      chromeOptions.addArguments("start-maximized"); // open Browser in maximized mode
      chromeOptions.addArguments("--disable-infobars"); // disabling infobars
      chromeOptions.addArguments("--disable-extensions"); // disabling extensions
      chromeOptions.addArguments("--disable-gpu"); // applicable to windows os only
      chromeOptions.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
      chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model
      chromeOptions.setExperimentalOption("useAutomationExtension", false);
      chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
      //DriverContext.Driver = new ChromeDriver(chromeOptions);
      driver = new ChromeDriver(chromeOptions);
      
  }
  
  @Test
  public void f() {
	  String baseUrl = "https://www.facebook.com/";
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get(baseUrl);
      System.out.println("web title is:"+driver.getTitle());
      
  }

  @AfterTest
  public void afterTest(ITestResult result) {
	  if(result.getStatus() == ITestResult.FAILURE) {
		  BasicCredentials cred = new BasicCredentials("shriramk0@gmail.com", "March@123456");
		 
	  }
  }

}
