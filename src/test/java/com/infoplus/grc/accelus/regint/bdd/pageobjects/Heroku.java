package com.infoplus.grc.accelus.regint.bdd.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.infoplus.grc.accelus.regint.bdd.support.Driver;
import com.infoplus.grc.accelus.regint.bdd.selectors.HerokuSelectors;

public class Heroku extends Driver {

    public static void navigateToHerokuPage(){
        driver.get(HerokuSelectors.HEROKU_HOME_PAGE);
    }
    public static void clickOnLink(String linkText1){
        driver.findElement(By.linkText(linkText1)).click();
    }
    
    public static boolean herokuResults(String linkText1, String expectedURL) throws InterruptedException{
    	Boolean newBrowserOpened = false;    	
    	String parentHandle = driver.getWindowHandle(); 
        driver.findElement(By.linkText(linkText1)).click();
        Thread.sleep(2000);
    	for (String winHandle : driver.getWindowHandles()) {
    	    driver.switchTo().window(winHandle); 
    	}
    	String urlOfNewWindow = driver.getCurrentUrl();
    	    System.out.println("-----NewWindow-------------   "+ urlOfNewWindow+ " -- "+ driver.getTitle());
    	    if(urlOfNewWindow.equalsIgnoreCase(expectedURL)){
        	   	 System.out.println("New Window Link : "+ urlOfNewWindow);
        	   	 newBrowserOpened = true;
        	}
    	Thread.sleep(3000);
    	driver.switchTo().window(parentHandle); 
	    System.out.println("----OldWindow-------------   "+ driver.getCurrentUrl()+ " ---- "+ driver.getTitle());
	    Thread.sleep(3000);
    	return newBrowserOpened;
    }    
}
