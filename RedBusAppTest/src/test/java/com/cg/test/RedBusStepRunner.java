package com.cg.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBusStepRunner {

	WebDriver driver = null;
	HomePage register = null;
	NextPage pageNext = null;

	@Before
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\BDD\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^I have navigated to red bus website$")
	public void i_have_navigated_to_red_bus_website() throws Throwable {
		driver.get("https://www.redbus.in/bus-tickets/");
	}

	@When("^I enter the location and date$")
	public void i_enter_the_location_and_date() throws Throwable {
		register = PageFactory.initElements(driver, HomePage.class);
		register.fromLoc.sendKeys("Pune");
		Thread.sleep(1000);
		register.fromLoc.sendKeys(Keys.ENTER);
		register.destLoc.sendKeys("Nagpur");
		Thread.sleep(1000);
		register.destLoc.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		register.jdateClick.click();
		register.jdate.click();
		Thread.sleep(2000);
		register.search.click();
		Thread.sleep(2000);
	}

	@Then("^I am navigated to next page$")
	public void i_am_navigated_to_next_page() throws Throwable {
		pageNext = PageFactory.initElements(driver, NextPage.class);
		Thread.sleep(5000);
		pageNext.busName.click();
		Thread.sleep(20000);
		/*
		 * pageNext.seatSel.click(); Thread.sleep(1000);
		 */
		// pageNext.bpoint.click();
		// Thread.sleep(1000);
		pageNext.selBoarding.click();
		Thread.sleep(5000);
		// pageNext.dpoint.click();
		// Thread.sleep(1000);
		pageNext.selDropping.click();
		Thread.sleep(5000);
		pageNext.proceed.click();
		Thread.sleep(5000);
		pageNext.name.sendKeys("Yashu");
		pageNext.age.sendKeys("22");
		pageNext.gender.click();
		pageNext.email.sendKeys("yy@gmail.com");
		pageNext.phone.sendKeys("7062156694");
		pageNext.radio.click();
		Thread.sleep(2000);
		pageNext.pay.click();
		driver.close();

	}

}
