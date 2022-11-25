package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class ActitimeBaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
@BeforeClass
public void OpenBrowser() {
Reporter.log("openBrowser",true);
driver=new ChromeDriver();
driver.manage().window().maximize();
}
@AfterClass
public void CloseBrowser() {
	Reporter.log("closeBrowser",true);
	driver.close();
}
@BeforeMethod
public void login() throws IOException
{
	Reporter.log("login",true);
	FileLib l=new FileLib();
	String url = l.getPropertyData("url");
	String un = l.getPropertyData("UN");
	String pw=l.getPropertyData("PW");
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
LoginPage lp=new LoginPage(driver);
lp.setLogin(un, pw);
			
	
}
@AfterMethod
public void logout()
{
Reporter.log("logout",true);
HomePage hp=new HomePage(driver);
hp.setLgout();
}

}


