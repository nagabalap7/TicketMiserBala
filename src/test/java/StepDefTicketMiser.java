package com.TickerMiser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefTicketMiser {
	
	WebDriver driver = null;
	
	@Before
	public void InitiateDriver() {
		driver = new FirefoxDriver();
	}
	
	@After
	public void CloseDriver() {
		driver.close();
	}
		
	@Given("^Ticket Miser browser \"([^\"]*)\"$")
	public void ticket_Miser_browser(String TicketMiserURL) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    driver.navigate().to(TicketMiserURL);
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	    driver.manage().window().maximize();
	    //driver.findElement(By.className("demo-oracle-icon")).click();
	   //driver.findElement(By.className("oj-web-applayout-header-title")).click();

	}

	@When("^Click on Venues$")
	public void click_on_Venues() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.className("home-venue-icon")).click();
	}

	@Then("^Click on Add Venue$")
	public void click_on_Add_Venue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("btn-add-venue")).click();
	}

	@And("^Enter Venue Name \"([^\"]*)\"$")
	public void enter_Venue_Name(String VenueName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("name")).sendKeys(VenueName);
	}

	@And("^Click OK$")
	public void click_OK() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("okButton")).click();
	    driver.findElement(By.id("cancelButton")).click();
	}
}
