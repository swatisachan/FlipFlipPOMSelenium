package com.flipflipom.mainPage;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipflipom.Base.Base;
/**
 * 
 * @author swati sachan
 * 
 * Implementation of page factory
 *
 */

public class MiddleBar extends Base{

	public MiddleBarLocators middleBarLocObj;
	
	public MiddleBar() {// initializing the locators of MiddleBarLocators
		this.middleBarLocObj = new MiddleBarLocators();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.middleBarLocObj);
		System.out.println("constructor of middle bar");
	}
	
	public  MiddleBar selectFirstElement() {
		
		middleBarLocObj.firstElementOfList.click();
		return new MiddleBar();
	}
	
	public  MiddleBar clickPopularity() {
		
		middleBarLocObj.popularityTab.click();
		return new MiddleBar();
	}
	
	public  MiddleBar clickLowToHigh() {
		
		middleBarLocObj.priceLowToHigh.click();
		return new MiddleBar();
	}
	public  MiddleBar clickHighToLow() {
		
		middleBarLocObj.priceHighLow.click();
		return new MiddleBar();
	}
	public MiddleBar  clickNewestFirst() {
		
		middleBarLocObj.newestFirst.click();
		return new MiddleBar();
	}
}
