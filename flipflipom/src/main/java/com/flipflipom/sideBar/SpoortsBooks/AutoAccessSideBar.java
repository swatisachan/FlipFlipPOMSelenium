package com.flipflipom.sideBar.SpoortsBooks;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.flipflipom.Base.Base;
//spoorts, books and more---> car and bike acceesorseries
public class AutoAccessSideBar extends Base{
	
	public void selectPrice(String maxprice) {
		Base.selectValueFromDropDown("priceDropDown.CSS", maxprice);
	}
	
	public void  selectBrand(String branndName)  {
		Base.ClickElement("selectBrandMore.CSS");
		Base.driver.findElement(By.cssSelector(OR.getProperty("selectBrands.CSS")));
		
		try {
			Thread.sleep(4000);
			Base.selectBrand("selectBrands.CSS", branndName);
			Base.ClickElement("applyFilter.CSS");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectCustomerRating(String ratings) {
		WebElement ele=Base.driver.findElement(By.cssSelector(OR.getProperty("customerRatings.CSS")));
		List<WebElement> lists=ele.findElements(By.className("_4IiNRh._2mtkou"));
		Iterator<WebElement> i=lists.iterator();
		while(i.hasNext()) {
			WebElement eachElee=i.next();
			if(eachElee.getAttribute("title").equals(ratings)) {
				eachElee.click();
				break;
			}
		}
	}
	
	public void selectOffer(String offerName) {
		WebElement ele= Base.driver.findElement(By.cssSelector(OR.getProperty("Offers.CSS")));
		List<WebElement> lists=ele.findElements(By.className("_4IiNRh _2mtkou"));
		Iterator<WebElement> i=lists.iterator();
		while(i.hasNext()) {
			WebElement ele1=i.next();
			if(ele1.getAttribute("title").equals(offerName)) {
				
				ele1.click();
				break;
			}
		}
	}
	
	public void selectDiscount(String discount) {
		Base.ClickElement("discount.CSS");
		try {
			Thread.sleep(4000);
			WebElement ele=Base.driver.findElement(By.cssSelector(OR.getProperty("selectDiscount.CSS")));
			List<WebElement> lists=ele.findElements(By.className("_4IiNRh._2mtkou"));
			Iterator<WebElement> i=lists.iterator();
			while(i.hasNext()) {
				WebElement ele1=i.next();
				if(ele1.getAttribute("title").equals(discount)) {
					WebElement ele2=ele1.findElement(By.className("_2wQvxh._1WV8jE"));
					WebElement ele3=ele2.findElement(By.tagName("label"));
					WebElement ele4=ele3.findElement(By.tagName("input"));
					ele4.click();
					break;
				}
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectVehicleMotor(String value) {
		Base.ClickElement("vehicleMotor.CSS");
		try {
			Thread.sleep(3000);
			Base.ClickElement("moreVehicle.CSS");
			Thread.sleep(4000);
			WebElement ele=Base.driver.findElement(By.cssSelector("selectVehicleMotor.CSS"));
			List<WebElement> lists=ele.findElements(By.className("GEQwJk"));
			Iterator<WebElement> i= lists.iterator();
			while(i.hasNext()) {
				WebElement ele3=i.next();
				if(ele3.getAttribute("class").equals("GEQwJk")) {
					ele3.click();
					break;
				}
			}
			Base.ClickElement("applyFiltersVehicleMotor.CSS");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectVehicleMoreYear() {
		
	}
	public void selectVehicleBrand() {
		
	}
	public void selectVehicleAvailiblity() {
		
	}
}
