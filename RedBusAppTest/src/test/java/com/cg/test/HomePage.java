package com.cg.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	@FindBy(how = How.ID, using = "txtSource")
	WebElement fromLoc;
	@FindBy(how = How.ID, using = "txtDestination")
	WebElement destLoc;
	@FindBy(how = How.XPATH, using = "//*[@id=\"txtOnwardCalendar\"]")
	WebElement jdateClick;
	@FindBy(how = How.XPATH, using = "//*[@id=\"rb-calmiddle\"]/ul[2]/li[13]/span")
	WebElement jdate;
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/button")
	WebElement search;
}
