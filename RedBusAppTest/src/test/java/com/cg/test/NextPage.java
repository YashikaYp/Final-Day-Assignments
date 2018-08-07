package com.cg.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NextPage {
	@FindBy(how=How.XPATH,using="//*[@id=\"8203530\"]/div/div[2]/div[1]")
	WebElement busName;
	/*@FindBy(how=How.XPATH,using="//*[@id=\"rt_8203530\"]/div/div/div/div[3]/div[2]/div[2]/canvas")
	WebElement seatSel;
	@FindBy(how=How.XPATH,using="//*[@id=\"8203530\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/header/div[1]/h3")
	WebElement bpoint;*/
	@FindBy(how=How.XPATH,using="//*[@id=\"8203530\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]/div")
	WebElement selBoarding;
	/*@FindBy(how=How.XPATH,using="//*[@id=\"8203530\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/header/div[2]/h3")
	WebElement dpoint;*/
	@FindBy(how=How.XPATH,using="//*[@id=\"8203530\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]/span[2]")
	WebElement selDropping;
	@FindBy(how=How.XPATH,using="//*[@id=\"8203530\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")
	WebElement proceed;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-04\"]")
	WebElement name;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-01\"]")
	WebElement age;
	@FindBy(how=How.XPATH,using="//*[@id=\"23_0\"]")
	WebElement gender;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-05\"]")
	WebElement email;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-06\"]")
	WebElement phone;
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[4]/div/div/div[1]/div[5]/div/div[2]/div/label[1]/span[2]")
	WebElement radio;
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")
	WebElement pay;
	
	
}
