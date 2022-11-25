package com.actitime.testcript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.ActitimeBaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class TaskModule extends ActitimeBaseClass{
	
@Test
public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	Reporter.log("createcustomer",true);
	HomePage hp=new HomePage(driver);
	hp.setTasksModule();
	FileLib f=new FileLib();
	String custname = f.getExceldata("TestTask", 1, 0);
	String custdes = f.getExceldata("TestTask", 1, 1);
	TaskListPage tlp=new TaskListPage(driver);
	tlp.getAddnewbtn().click();
	tlp.getNewcustbtn().click();
	tlp.getEntercustnametbx().sendKeys(custname);
	tlp.getEntercustdestbx().sendKeys(custdes);
	tlp.getSelectcustdd().click();
	WebElement element = tlp.getOurcompanycust();
	Actions a=new Actions(driver);
a.moveToElement(element).click().perform();
	tlp.getCreatecustbtn().click();
	Thread.sleep(5000);
	String expectedtitle = tlp.getCreatedcust().getText();
	SoftAssert s=new SoftAssert();
s.assertEquals(expectedtitle, custname);
	
}
@Test(priority=1)
public void testDeleteCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("DeleteCustomer",true);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	HomePage hp=new HomePage(driver);
	hp.setTasksModule();
	FileLib f=new FileLib();
	String custname=f.getExceldata("TestTask", 1, 0);
	TaskListPage tlp=new TaskListPage(driver);
	tlp.getCustprojsearchtbx().sendKeys(custname);
	WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(tlp.getSelcusteditbtn()));
	WebElement element = tlp.getSelcusteditbtn();
	Actions a=new Actions(driver);
	a.moveToElement(element).click().perform();
	Thread.sleep(1000);
	tlp.getActionbtn().click();
	 tlp.getDeletebtn().click();
	tlp.getDeletepermanbtn().click();
	
}
@Test(priority=2)
public void testCreateProject() throws EncryptedDocumentException, IOException {
	Reporter.log("newproject",true);
	HomePage hp=new HomePage(driver);
	hp.setTasksModule();
	TaskListPage tlp=new TaskListPage(driver);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	tlp.getAddnewbtn().click();
	tlp.getNewprojectbtn().click();
	FileLib f=new FileLib();
	String projname = f.getExceldata("TestTask", 1, 2);
	String projdes = f.getExceldata("TestTask", 1, 3);
	tlp.getProjectnametbx().sendKeys(projname);
	tlp.getSelcusttoaddproj().click();
	tlp.getSelbigbangcom().click();
	tlp.getAddprojdesc().sendKeys(projdes);
	tlp.getCreateproject().click();
	String expectedprojname = tlp.getCreatedproject().getText();
	SoftAssert s=new SoftAssert();
	s.assertEquals(expectedprojname, projname);
}
@Test(priority=3)
public void testDeleteProject() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("DeleteProject",true);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	HomePage hp=new HomePage(driver);
	hp.setTasksModule();
	FileLib f=new FileLib();
	String projname=f.getExceldata("TestTask", 1, 2);
	TaskListPage tlp=new TaskListPage(driver);
	tlp.getCustprojsearchtbx().sendKeys(projname);
	WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(tlp.getSelprojtodel()));
	WebElement element = tlp.getSelprojtodel();
	Thread.sleep(1000);
	element.click();
	tlp.getSelprojeditbtn().click();
	Thread.sleep(1000);
	tlp.getProjactionbtn().click();
	tlp.getProjdelbtn().click();
	tlp.getDeletepermanbtn().click();
	
}
}
