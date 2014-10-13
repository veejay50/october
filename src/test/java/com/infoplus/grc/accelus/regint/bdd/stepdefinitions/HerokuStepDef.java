package com.infoplus.grc.accelus.regint.bdd.stepdefinitions;

import org.junit.Assert;
import com.infoplus.grc.accelus.regint.bdd.pageobjects.*;
import com.infoplus.grc.accelus.regint.bdd.selectors.HerokuSelectors;

import cucumber.api.java.en.*;


public class HerokuStepDef {
  
    @Given("^I am on Multiple Windows page of herokuapp website$")
    public void navigateToHeroku() throws Throwable {
        Heroku.navigateToHerokuPage();
        Heroku.clickOnLink(HerokuSelectors.HEROKU_MULTIPLE_WINDOWS_LINK);
    }
    
    @When("^I click on Click Here$")
    public void I_click_on_Click_Here() throws Throwable {
    	Thread.sleep(5000);
    }
    
    @Then("^another browser tab window opens$")
    public void another_browser_tab_window_opens() throws Throwable {
    	Assert.assertTrue("Expected URL NOT displayed. ", Heroku.herokuResults(HerokuSelectors.HEROKU_CLICK_HERE_LINK, "http://the-internet.herokuapp.com/windows/new"));    	
    }

    
    
    
    
    
    
    
    
}
