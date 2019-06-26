package com.flipflipom.sideBar.Electronics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipflipom.Base.Base;

//first try finding the user input if not found then select the very first option by default
public class MobileSideBar extends Base{

	public void selectMaxPrice(String price) {
		Select sel= new Select(Base.driver.findElement(By.cssSelector(OR.getProperty("maxPriceSelectFilter.CSS"))));
		List<WebElement> lists=sel.getOptions();
		Iterator<WebElement> i=lists.iterator();
		while(i.hasNext()) {
			WebElement val=i.next();
			if(val.getAttribute("value").equals(price)) {
				System.out.println("match is there");
				val.click();
				break;
			}
		}
		Base.validationAfterEveryClick();
	}
	
	public void clickAssured() {
		Base.ClickElement("clickAssured.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void clickFasterDelievery() {
		Base.ClickElement("fasterDelievery.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void selectRam(String userInputRam) {
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("userSelectionRam.CSS")));
		Iterator<WebElement> i= lists.iterator();
		int flag=0;
		while(i.hasNext()) {
		WebElement ele=	i.next();
		if(ele.getAttribute("title").equals(userInputRam)) {
			ele.click();
			flag=1;
			break;
		}	
	}
		Base.selectDefaultChoice(flag, "defaultFirstRam.CSS");
		Base.validationAfterEveryClick();
	}
	
	//selecitng the default brand
	public void selectDefaultBrand() {
		Base.ClickElement("DeafultBrandSelection.CSS");
		Base.validationAfterEveryClick();
	}
	
	//selecting the customer rating
	public void selectCustomerRating(String customerRating) {
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(Base.OR.getProperty("customerRating.CSS")));
		Iterator<WebElement> i= lists.iterator();
		int flag=0;
		while(i.hasNext()) {
			WebElement ele=i.next();
			if(ele.getAttribute("title").equals(customerRating)) {
				System.out.println("matches");
				ele.click();
				flag=1;
				break;
			}
		}
		
	Base.selectDefaultChoice(flag, "customerRatingFirstValue.CSS");
	Base.validationAfterEveryClick();	
	}
	
	public void selectInternalStorage(String userVal) {
		Base.ClickElement("clickInternalStorage.CSS");
		WebDriverWait wait = new WebDriverWait(Base.driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector((Base.OR.getProperty("InternalStorageItems.CSS")))));
		//waiting till the element gets prsent on the webpage after clicking
		
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("InternalStorageItems.CSS")));
		Iterator<WebElement> i= lists.iterator();
		int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			String value=ele.getAttribute("title");
			if(value.equals(userVal)) {
				ele.click();
				flag=1;
				break;
			}
		}
		Base.selectDefaultChoice(flag, "InternalStorageFirstItem.CSS");
		//checking if page error is coming after clicking the element, in such case, getitng back to the previpus page, hence setting is also undone
		Base.validationAfterEveryClick();
		
	}
	
	public void clickBatteryCapcityAndSlect(String userVal) {
		Base.ClickElement("ClickBatteryCapacity.CSS");
		Base.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("BatteryCapacityItems.CSS")));
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("BatteryCapacityItems.CSS")));
		Iterator<WebElement> i= lists.iterator();
		int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			String value=ele.getAttribute("title");
			if(value.equals(userVal)) {
				ele.click();
				flag=1;
				break;
			}
		}
	Base.selectDefaultChoice(flag, "BatteryCapacityFirstItem.CSS");
	Base.validationAfterEveryClick();
		
	}
	
	public void selectOperatingSystemAndClick(String value) {
		Base.ClickElement("ClickOperatingSystem.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("OperatingSystemItems.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "firstOperatingSystem.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void selectNetworkType(String value) {
		Base.ClickElement("NetworkTypeClick.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("NetworkTypeLists.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "NetworkTypeFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void selectScreenSize(String value) {
		Base.ClickElement("ClickScreenSize.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("ScreenSizeList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "ScreenSizeFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void selectSimType(String value) {
		Base.ClickElement("ClickSimType.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("SimTypeList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "SimTypeFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void selectPrimaryCamera(String value) {
		Base.ClickElement("PrimaryCamera.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("PrimaryCameraList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "PrimaryCameraFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void selectSecondryCamera(String value) {
		Base.ClickElement("SecondaryCamera.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("SecondaryCameraList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "SecondaryCameraFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void selectOffers(String value) {
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("OfferList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "OfferFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void selectProcessorBrands(String value) {
		Base.ClickElement("SecondaryCamera.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("SecondaryCameraList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "SecondaryCameraFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void selectSpecality(String value) {
		Base.ClickElement("Speciality.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("SpecialityList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "SpecialityFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void selectResolutionType(String value) {
		Base.ClickElement("ResolutionType.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("ResolutionTypeList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "ResolutionTypeFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void selectType(String value) {
		Base.ClickElement("Type.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("TypeList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "TypeFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void selectOSVersionName(String value) {
		Base.ClickElement("OS.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("OSList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "OSListFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void clickExcludeOutOfStock() {
		Base.ClickElement("OutOfStock.CSS");
		Base.ClickElement("OutOfStockItem.CSS");
		Base.validationAfterEveryClick();
		
		}

	public void  clickClockSpeed(String value) {
		Base.ClickElement("ClockSpeed.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("ClockSpeedList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "ClockSpeedListFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void  clickFeatures(String value) {
		Base.ClickElement("Features.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("FeaturesList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "FeaturesListFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void  clickNoOfCores(String value) {
		Base.ClickElement("NoOfChores.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("NoOfChoresList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "NoOfChoresListFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	public void  clickBudget(String value) {
		Base.ClickElement("Budget.CSS");
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("BudgetList.CSS")));
		Iterator<WebElement> i= lists.iterator();int flag=0;
		while(i.hasNext()) {
			WebElement ele= i.next();
			if(ele.getAttribute("title").equals(value)) {
				System.out.println("matches");
				flag=1;
				break;		
				
			}
		}
		Base.selectDefaultChoice(flag, "BudgetListFirstElement.CSS");
		Base.validationAfterEveryClick();
	}
	
	
	
	
}
