package com.actitime.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addnewbtn;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newcustbtn;
@FindBy(xpath="//div[text()='+ New Project']")
private WebElement newprojectbtn;
@FindBy(xpath="//div[text()='+ New Tasks']")
private WebElement newtaskbtn;
@FindBy(xpath="//div[text()='Import Tasks from CSV']")
private WebElement  importtaskcsvbtn;
@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement entercustnametbx;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement entercustdestbx;
@FindBy(xpath="(//div[text()='- Select Customer -'] )[1]")
private WebElement selectcustdd;
@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
private WebElement ourcompanycust;
@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createcustbtn;
@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
private WebElement projectnametbx;
@FindBy(xpath="//div[@class='comboboxButton']")
private WebElement selcusttoaddproj;
@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
private WebElement selbigbangcom;
@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
private WebElement addprojdesc;
@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
private WebElement addtaskname;
@FindBy(xpath="//div[text()='Create Project']")
private WebElement createproject;
@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
private WebElement createdcust;
@FindBy(xpath="//div[@class='node customerNode editable selected']/div[4]")
private WebElement selcusteditbtn;
@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
private WebElement custprojsearchtbx;
@FindBy(xpath="(//div[text()='ACTIONS'])[1]")
private WebElement actionbtn;
@FindBy(xpath="(//div[@class='dropdownContainer actionsMenu']/div[1]/div[3]/div)[1]")
private WebElement deletebtn;
@FindBy(xpath="//span[text()='Delete permanently']")
private WebElement deletepermanbtn;
@FindBy(xpath="//div[@class='itemsContainer']/div[2]/div/div/span")
private WebElement selprojtodel;
@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[2]")
private WebElement selprojeditbtn;
@FindBy(xpath="//div[text()='Qspider' and @class='title']")
private WebElement createdproject;
@FindBy(xpath="//div[@class='editProjectPanelHeader']/div[3]/div[1]/div")
private WebElement projactionbtn;
@FindBy(xpath="//div[@class='taskManagement_projectPanel']/div[4]/div[1]/div[3]")
private WebElement projdelbtn;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddnewbtn() {
	return addnewbtn;
}
public WebElement getNewcustbtn() {
	return newcustbtn;
}
public WebElement getNewprojectbtn() {
	return newprojectbtn;
}
public WebElement getNewtaskbtn() {
	return newtaskbtn;
}
public WebElement getImporttaskcsvbtn() {
	return importtaskcsvbtn;
}
public WebElement getEntercustnametbx() {
	return entercustnametbx;
}
public WebElement getEntercustdestbx() {
	return entercustdestbx;
}
public WebElement getSelectcustdd() {
	return selectcustdd;
}
public WebElement getOurcompanycust() {
	return ourcompanycust;
}
public WebElement getProjectnametbx() {
	return projectnametbx;
}
public WebElement getSelcusttoaddproj() {
	return selcusttoaddproj;
}
public WebElement getSelbigbangcom() {
	return selbigbangcom;
}
public WebElement getAddprojdesc() {
	return addprojdesc;
}
public WebElement getAddtaskname() {
	return addtaskname;
}
public WebElement getCreateproject() {
	return createproject;
}
public WebElement getCreatecustbtn() {
	return createcustbtn;
}
public WebElement getCreatedcust() {
	return createdcust;
}
public WebElement getSelcusteditbtn() {
	return selcusteditbtn;
}
public WebElement getCustprojsearchtbx() {
	return custprojsearchtbx;
}
public WebElement getActionbtn() {
	return actionbtn;
}
public WebElement getDeletebtn() {
	return deletebtn;
}
public WebElement getDeletepermanbtn() {
	return deletepermanbtn;
}
public WebElement getSelprojeditbtn() {
	return selprojeditbtn;
}
public WebElement getCreatedproject() {
	return createdproject;
	
}
public WebElement getSelprojtodel() {
	return selprojtodel;
}
public WebElement getProjactionbtn() {
	return projactionbtn;
}
public WebElement getProjdelbtn() {
	return projdelbtn;
}

}




