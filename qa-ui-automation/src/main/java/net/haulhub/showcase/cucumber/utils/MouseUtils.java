package net.haulhub.showcase.cucumber.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MouseUtils extends PageObject {

	public MouseUtils(WebDriver driver){
		super(driver);
	}
	
	public  boolean mouseLeftClick(WebElementFacade element){
		try{
			Actions action = new Actions(getDriver());
			action.moveToElement(element).click(element).build().perform();
			return true;
		}catch(Throwable t){
		}
		
		return false;
	}
	
	public  boolean moveToElement(WebElementFacade element){
		try{
			Actions action = new Actions(getDriver());
			action.moveToElement(element).build().perform();
			return true;
		}catch(Throwable t){
		}
		
		return false;
	}
}
