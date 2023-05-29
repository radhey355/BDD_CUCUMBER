package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LOginStepdefs {

	
	WebDriver driver= null;
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/JARS/selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	  
	}

	@When("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
	   
	}

	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
		Assert.assertEquals("JavaByKiran | Dashboard ", driver.getTitle());
	   
	}
	

	@Then("^user should see the logo$")
	public void user_should_see_the_logo() throws Throwable {
	  WebElement logo= driver.findElement(By.tagName("img"));
	   Assert.assertTrue(logo.isDisplayed());
	}
	
	@When("^user click on New Register$")
	public void user_click_on_New_Register() throws Throwable {
	   driver.findElement(By.linkText("Register a new membership")).click();
	}

	@Then("^user should be on register page$")
	public void user_should_be_on_register_page() throws Throwable {
		Assert.assertEquals("JavaByKiran | Registration Page", driver.getTitle());
	   
	}
	
	

}
