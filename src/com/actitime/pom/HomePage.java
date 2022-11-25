package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(id="container_tt")
private WebElement timetrackmodule;
@FindBy(id="container_tasks")
private WebElement tasksmodule;
@FindBy(id="container_reports")
private WebElement reports;
@FindBy(id="container_users")
private WebElement users;
@FindBy(id="logoutLink")
private WebElement lgout;


public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setTimeTrackModule() {
	timetrackmodule.click();
}
public void setTasksModule() {
	tasksmodule.click();
}
public void setReports() {
	reports.click();
}
public void setUsers() {
	users.click();
}
public void setLgout() {
	 lgout.click();
}
}
