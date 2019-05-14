package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberOne {
	static WebDriver driver;
	@Given("the user name in telecom homepage")
	public void the_user_name_in_telecom_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\New\\workspace\\Yuvi\\Cucumber1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
				
		
	    
	}

	@Given("the user click on add button")
	public void the_user_click_on_add_button() {
		driver.findElement(By.xpath("(//a[contains(text(),'Add Customer')])[1]")).click();	
	    
	}

	@When("the user filling all the fields")
	public void the_user_filling_all_the_fields(io.cucumber.datatable.DataTable dataTable) {
	   driver.findElement(By.xpath("//label[text()='Done']")).click();
	   
	   driver.findElement(By.id("fname")).sendKeys("Yuvaraj");
	   driver.findElement(By.id("lname")).sendKeys("Sakthivel");
	   driver.findElement(By.id("email")).sendKeys("y1@gmail.com");
	   driver.findElement(By.name("addr")).sendKeys("Thooraipakkam");
	   driver.findElement(By.id("telephoneno")).sendKeys("9876654");
	}

	@When("the user click on submit button")
	public void the_user_click_on_submit_button() {
		driver.findElement(By.name("submit")).click();
	    
	}

	@Then("the user id should be generated")
	public void the_user_id_should_be_generated() {
	    
	}

}
