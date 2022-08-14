package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Pojo.org.LoginPojo;
import baseClass.org.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefenitions extends BaseClass {
	
	
	
	@When("pass the values in username and password")
	public void pass_the_values_in_username_and_password() {
		
		 driver.findElement(By.id("email")).sendKeys("yuvaraj");
		  
		  driver.findElement(By.id("pass")).sendKeys("yuva1236");
		
	   
	}

	@When("click the login button")
	public void click_the_login_button() {
		
		driver.findElement(By.name("login")).click();
		
		System.out.println("login button");
	   
	}

	@Then("user as navigate to error page")
	public void user_as_navigate_to_error_page() {
		System.out.println("error Page");
	}

}
