package edu.aiite.Interviewpre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefine {
	
public static WebDriver driver;
	
	@Given("Open the browser")
	public void open_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	    	}

	@And("maximize the browser")
	public void maximize_the_browser() {
	    driver.manage().window().maximize();
	}

	@When("Open the FB URL")
	public void open_the_FB_URL() {
	    driver.get("https://www.facebook.com/");
	}

	@And("Enter the username")
	public void enter_the_username() {
	   driver.findElement(By.id("email")).sendKeys("lakshman");
	}

	@And("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.id("pass")).sendKeys("123456");
	    	}

	@Then("click to login button")
	public void click_to_login_button() {
	    driver.findElement(By.name("login")).click();
	}



}
