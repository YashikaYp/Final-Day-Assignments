package com.capg.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonStepDef {
	WebDriver driver;

	@Before
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\BDD\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^I have navigated to Amazon website$")
	public void i_have_navigated_to_Amazon_in_website() throws Throwable {
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
	}

	@When("^I add some items to cart$")
	public void i_add_some_items_to_cart() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("books");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div/div/div[1]/div/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		Select dropDown = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		dropDown.selectByVisibleText("Electronics");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("earphones");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("powerbanks");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"result_1\"]/div/div[4]/div[1]/a/h2")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();

	}

	@Then("^I have added to cart successfully$")
	public void i_am_navigated_to_login_page_for_payment() throws Throwable {

		String title = "Amazon Sign In";

		assertEquals(driver.getTitle(), title);
		System.out.println("true!");
		driver.close();
	}

}
