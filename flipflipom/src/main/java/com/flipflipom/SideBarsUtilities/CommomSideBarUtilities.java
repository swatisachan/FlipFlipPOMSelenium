package com.flipflipom.SideBarsUtilities;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.flipflipom.Base.Base;

public class CommomSideBarUtilities extends Base {

	public static int checkBoxesElementFunctions(String nameToSearchWith, String itemValueToBeSelected) {
		int elementFoundFlag = 0;
		List<WebElement> lists = driver.findElements(By.cssSelector("div._1YuAuf>section._1gjf4c.D_NGuZ"));
		Iterator<WebElement> i = lists.iterator();
		while (i.hasNext()) {
			WebElement ele = i.next();
			List<WebElement> sizeOfExpnadedElee = ele.findElements(By.cssSelector("div._3mk-PQ"));
			WebElement toFindOutSpanElee= ele.findElement(By.cssSelector("div._3mk-PQ"));
			List<WebElement> prsenceOfSpanElee= toFindOutSpanElee.findElements(By.cssSelector("div.opNt-w._2Tprpw")) ;
			WebElement outerEle = ele.findElement(By.cssSelector("div._3xglSm._1iMC4O"));
			String valueToBeChoosen = outerEle.findElement(By.tagName("div")).getText();
			System.out.println("value is" + valueToBeChoosen);
			if (valueToBeChoosen.equalsIgnoreCase(nameToSearchWith) && !nameToSearchWith.equalsIgnoreCase("BRAND")||(valueToBeChoosen.equalsIgnoreCase(nameToSearchWith) && !nameToSearchWith.equalsIgnoreCase("Compatible Mobiles"))) {
				if (sizeOfExpnadedElee.size() > 0) {
					System.out.println(
							"eleme is already expanded so checking the user given value if found then slecting it, if  found then make notFound flag as 1");

					WebElement eleParent = ele.findElement(By.cssSelector("div._3mk-PQ"));
					WebElement childElee = eleParent.findElement(By.cssSelector("div._36jUgy"));
					List<WebElement> elementList = childElee.findElements(By.cssSelector("div._4IiNRh._2mtkou"));
					Iterator<WebElement> iterator = elementList.iterator();
					while (iterator.hasNext()) {
						WebElement elementlistValue = iterator.next();
						String valueComingFromList = elementlistValue.getAttribute("title");
						if (valueComingFromList.equalsIgnoreCase(itemValueToBeSelected)) {
							System.out.println("value to is found");
							elementlistValue.click();
							elementFoundFlag = 1;
							break;
						}
					}
					break;
				} else {
					System.out.println("eleemn needs to be expanded");
					// exapnd it
					outerEle.click();

					WebElement eleParent = ele.findElement(By.cssSelector("div._3mk-PQ"));
					WebElement childElee = eleParent.findElement(By.cssSelector("div._36jUgy"));
					List<WebElement> elementList = childElee.findElements(By.cssSelector("div._4IiNRh._2mtkou"));
					Iterator<WebElement> iterator = elementList.iterator();
					while (iterator.hasNext()) {
						WebElement elementlistValue = iterator.next();
						String valueComingFromList = elementlistValue.getAttribute("title");
						System.out.println("values from list is" + valueComingFromList);
						if (valueComingFromList.equalsIgnoreCase(itemValueToBeSelected)) {
							System.out.println("value to is found");
							elementlistValue.click();
							elementFoundFlag = 1;
							break;
						}

					}
				}

			} else if (valueToBeChoosen.equalsIgnoreCase(nameToSearchWith) && nameToSearchWith.equalsIgnoreCase("BRAND")
					&& sizeOfExpnadedElee.size() > 0||(valueToBeChoosen.equalsIgnoreCase(nameToSearchWith) && nameToSearchWith.equalsIgnoreCase("Compatible Mobiles")
							&& sizeOfExpnadedElee.size() > 0)) {
				System.out.println("for brand coming here");
				// checking if it has seeMore option or not..if seeMore option not there then
				// search in that only and set the value of elementFoundFlag =1 if found
				WebElement parntEle = ele.findElement(By.cssSelector("div._3mk-PQ"));
				List<WebElement> seeMoreEle = parntEle.findElements(By.cssSelector("div.opNt-w._2Tprpw"));
				if (seeMoreEle.size() > 0) {
					System.out.println("see more element is present hence expand it");
					WebElement ele3 = parntEle.findElement(By.cssSelector("div.opNt-w._2Tprpw"));
					ele3.click();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					WebElement eleh1 = ele.findElement(By.cssSelector("div._3mk-PQ"));
					WebElement eleh2 = eleh1.findElement(By.tagName("div"));
					WebElement eleh3 = eleh2.findElement(By.className("_6MvKf3"));
					WebElement applyFilter = eleh3.findElement(By.className("_7Jn8-J"));
					WebElement applyFilter1 = applyFilter.findElement(By.className("_1H8SWr"));
					WebElement applyFilterToClick = applyFilter1.findElement(By.cssSelector("div.OICbV5.Su_9Op"));

					WebElement eleh4 = eleh3.findElement(By.className("_2WKcPv"));
					List<WebElement> listOfElement = eleh4.findElements(By.className("GEQwJk"));
					Iterator<WebElement> iter3 = listOfElement.iterator();
					while (iter3.hasNext()) {
						WebElement element = iter3.next();
						if (element.getAttribute("class").equals("GEQwJk")) {
							String brandValueToBeSelected = element.findElement(By.className("_4IiNRh"))
									.getAttribute("title");
							if (brandValueToBeSelected.equalsIgnoreCase(itemValueToBeSelected)) {
								System.out.println("barnd matches");
								element.click();
								applyFilterToClick.click();
								elementFoundFlag = 1;
								break;
							}
						}
					}

				} 
				
				else if(sizeOfExpnadedElee.size()<0 && prsenceOfSpanElee.size()<0) {
					//in this case, element needs to be exapnded
					System.out.println("eleemn needs to be expanded");
					// exapnd it
					outerEle.click();
					//after clicking lets check if clickMore span elemnt comes or not..
					WebElement check1=ele.findElement(By.cssSelector("div._3mk-PQ"));
					List<WebElement> lists4=check1.findElements(By.cssSelector("div.opNt-w._2Tprpw"));
					if(lists4.size()>0) {
						//means after clicking the main element, it has click more elemnt hence logic is changed
						check1.findElement(By.cssSelector("div.opNt-w._2Tprpw")).click();
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						WebElement eleh1 = ele.findElement(By.cssSelector("div._3mk-PQ"));
						WebElement eleh2 = eleh1.findElement(By.tagName("div"));
						WebElement eleh3 = eleh2.findElement(By.className("_6MvKf3"));
						WebElement applyFilter = eleh3.findElement(By.className("_7Jn8-J"));
						WebElement applyFilter1 = applyFilter.findElement(By.className("_1H8SWr"));
						WebElement applyFilterToClick = applyFilter1.findElement(By.cssSelector("div.OICbV5.Su_9Op"));

						WebElement eleh4 = eleh3.findElement(By.className("_2WKcPv"));
						List<WebElement> listOfElement = eleh4.findElements(By.className("GEQwJk"));
						Iterator<WebElement> iter3 = listOfElement.iterator();
						while (iter3.hasNext()) {
							WebElement element = iter3.next();
							if (element.getAttribute("class").equals("GEQwJk")) {
								String brandValueToBeSelected = element.findElement(By.className("_4IiNRh"))
										.getAttribute("title");
								if (brandValueToBeSelected.equalsIgnoreCase(itemValueToBeSelected)) {
									System.out.println("barnd matches");
									element.click();
									applyFilterToClick.click();
									elementFoundFlag = 1;
									break;
								}
							}
						}
						
						
					}
					else if(lists4.size()<0){ //after clicking the main element also, click more element has not coming...hence not there noly
					WebElement eleParent = ele.findElement(By.cssSelector("div._3mk-PQ"));
					WebElement childElee = eleParent.findElement(By.cssSelector("div._36jUgy"));
					List<WebElement> elementList = childElee.findElements(By.cssSelector("div._4IiNRh._2mtkou"));
					Iterator<WebElement> iterator = elementList.iterator();
					while (iterator.hasNext()) {
						WebElement elementlistValue = iterator.next();
						String valueComingFromList = elementlistValue.getAttribute("title");
						System.out.println("values from list is" + valueComingFromList);
						if (valueComingFromList.equalsIgnoreCase(itemValueToBeSelected)) {
							System.out.println("value to is found");
							elementlistValue.click();
							elementFoundFlag = 1;
							break;
						}

					}
				}

				}
				break;
			}
		}

		System.out.println("returnign the value" + elementFoundFlag);
		return elementFoundFlag;
	}
	
	public static void selectPrice(String maxPrice) {
		Select sel= new Select(Base.driver.findElement(By.cssSelector(OR.getProperty("maxPriceSelection.CSS"))));
		List<WebElement> lists=sel.getOptions();
		Iterator<WebElement> itr= lists.iterator();
		while(itr.hasNext()) {
			WebElement ele=itr.next();
			String itemAppeard=ele.getAttribute("option");
			if(itemAppeard.equals(maxPrice)) {
				ele.click();
				break;
			}
		}
	}
	
	public static void clickAssured() {
		Base.ClickElement("assuredClick.CSS");
	}
	
	public static void clickFasterDelievery() {
		Base.ClickElement("fasterDelievery.CSS");
	}
	
	//In this selecting the first element
	public static void selectDeafultChoice(String nameToBeSearched) {
		//have to select the first option
		List<WebElement> lists=Base.driver.findElements(By.cssSelector(OR.getProperty("listOfItems.CSS")));
		Iterator<WebElement> iter= lists.iterator();
		while(iter.hasNext()) {
			WebElement ele=iter.next();
			WebElement nameElee=ele.findElement(By.cssSelector("div._3xglSm._1iMC4O"));
			String nameValue=nameElee.findElement(By.tagName("div")).getText();
			if(nameValue.equalsIgnoreCase(nameToBeSearched)) {
				System.out.println("element found");
				//selecting the first element
				WebElement itemele=ele.findElement(By.cssSelector("div._3mk-PQ"));
				WebElement childElee=itemele.findElement(By.cssSelector("div._36jUgy"));
				List<WebElement> lists1=childElee.findElements(By.cssSelector("div._4IiNRh._2mtkou"));
				lists1.get(0).click();
				break;
			}
		}
	}
	
	public static void selectColor(String colorName) {
		List<WebElement> lists=Base.driver.findElements(By.cssSelector("div._1YuAuf>section._1gjf4c.D_NGuZ"));
		WebElement ele= lists.get(1);
		ele.click();
		WebElement ele2=ele.findElement(By.cssSelector("div._3mk-PQ"));
		ele2.findElement(By.cssSelector("div.opNt-w._2Tprpw")).click();
		List<WebElement> lists1=ele2.findElements(By.cssSelector("div._36jUgy"));
		Iterator<WebElement> i2= lists1.iterator();
		while(i2.hasNext()) {
			WebElement ele4=i2.next();
			if(ele4.getAttribute("title").equals(colorName)) {
				System.out.println("matches");
				ele4.click();
				break;
			}
		}
	}
	
	
	
}
