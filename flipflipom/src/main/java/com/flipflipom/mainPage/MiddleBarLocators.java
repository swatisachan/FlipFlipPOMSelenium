package com.flipflipom.mainPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MiddleBarLocators {

	@FindBy(css = "div._3UEiDE>div._3ywJNQ>div:nth-child(2)")
	public WebElement popularityTab;
	
	@FindBy(css="div._3UEiDE>div._3ywJNQ>div:nth-child(3)")
	public WebElement priceLowToHigh;
	
	
	@FindBy(css="div._3UEiDE>div._3ywJNQ>div:nth-child(4)")
	public WebElement priceHighLow;
	
	@FindBy(css="div._3UEiDE>div._3ywJNQ>div:nth-child(5)")
	public WebElement newestFirst;
	
	@FindBy(css="div.bhgxx2.col-12-12:nth-child(2)>div>div>div>a")
	public WebElement firstElementOfList;	
}
