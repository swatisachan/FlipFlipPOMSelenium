package com.flipflipom.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;



public class Base {

	public static WebDriver driver;
	public static Properties config;
	public static Properties OR;
	public static Logger log= Logger.getLogger("devpinoyLogger");
	public static Reporter rep;
	public static String browser;
	public static FileInputStream fis;
	public static TopMenu menu;
	public static WebDriverWait wait;
	
	public Base() {
		try {
			fis=  new FileInputStream(new File("C:\\Users\\swati sachan\\git\\FlipFlipPOMSelenium\\flipflipom\\src\\main\\Resoruces\\com\\flipflipom\\properties\\config.properties"));
			config= new Properties();
			config.load(fis);
			
			fis= new FileInputStream(new File("C:\\Users\\swati sachan\\git\\FlipFlipPOMSelenium\\flipflipom\\src\\main\\Resoruces\\com\\flipflipom\\properties\\OR.properties"));
			OR= new Properties();
			OR.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(driver==null) {
//			if(System.getenv("browser").equals("chrome") && System.getenv("browser")!=null) {
//				browser= System.getenv("browser");
//			}
//			else if(System.getenv("browser").equals("IE")&& System.getenv("browser")!=null) {
//				browser= System.getenv("browser");
//			}
//			else {
				browser= config.getProperty("browser");
		//	}
			
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\swati sachan\\git\\FlipFlipPOMSelenium\\flipflipom\\src\\main\\Resoruces\\com\\flipflipom\\executables\\chromedriver.exe");
				driver= new ChromeDriver();
			}
			driver.navigate().to(config.getProperty("baseSiteUrl"));
			Base.ClickElement("CrossButton.CSS");
			menu= new TopMenu();
		}
		
	}
	
	public static void ClickElement(String locator) {
		if(locator.endsWith(".CSS")) {
			driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
		}
		else if(locator.endsWith(".ID")) {
			driver.findElement(By.id(OR.getProperty(locator))).click();
		}
		else if(locator.endsWith(".XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(locator))).click();
		}
	}
	
	public static void selectValueBasedOnName(String locator,String valueToSelect) {
		locator= OR.getProperty(locator);
		WebElement liEle=Base.driver.findElement(By.cssSelector(locator));
		WebElement ulele=liEle.findElement(By.tagName("ul"));
		List<WebElement> lists=ulele.findElements(By.tagName("li"));
		Iterator<WebElement> i= lists.iterator();
		while(i.hasNext()) {
			WebElement ele=	i.next();
			if(ele.findElement(By.tagName("a")).getAttribute("title").equals(valueToSelect)) {
				ele.findElement(By.tagName("a")).click(); //here clicking on the entire a element rather than extracting the value from of href from a element
			}
		}
	}
	
	public void sendkyes(String locator,String value) {
		if(locator.endsWith(".CSS")) {
			Base.driver.findElement(By.cssSelector(locator)).sendKeys(value);
		}
		else if(locator.endsWith(".ID")) {
			Base.driver.findElement(By.id(locator)).sendKeys(value);
		}
		else if(locator.endsWith(".XPATH")) {
			Base.driver.findElement(By.xpath(locator)).sendKeys(value);
		}
	}
	
	public static void selectValueFromDropDown(String locator,String value) {
		if(locator.endsWith(".CSS")) {
			Select sel=new Select(Base.driver.findElement(By.cssSelector(locator)));
			List<WebElement> lists=sel.getOptions();
			Iterator<WebElement> i=lists.iterator();
			while(i.hasNext()) {
				WebElement ele=i.next();
				if(ele.getAttribute("value").equals(value)) {
					ele.click();
				}
			}
		}
	}
	
	public static void selectBrand(String locator,String value) {
		WebElement ele=Base.driver.findElement(By.cssSelector(locator));
		List<WebElement> lists=ele.findElements(By.className("GEQwJk"));
		Iterator<WebElement> i=lists.iterator();
		while(i.hasNext()) {
			WebElement ele1=i.next();
			if(ele1.getAttribute("class").equals("GEQwJk")) {
				if(ele1.findElement(By.className("_4IiNRh")).getAttribute("title").equals(value)) {
					ele1.findElement(By.className("_4IiNRh")).click();
				}
			}
		}
	}
	
	public static int validationAfterEveryClick() {
		int flag=0;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(Base.driver.findElements(By.cssSelector(Base.OR.getProperty("noResultFound.CSS"))).size()!=0) {
			System.out.println("element is prsent ..hence");
			String textFieldName=Base.driver.findElement(By.cssSelector(Base.OR.getProperty("noResultFound.CSS"))).getText();
			System.out.println("go back to the previous page to undo the setting");
			Base.driver.navigate().back();
			flag=1;
		}
		else
		{
			System.out.println("do nothing");
			flag=0;
		}
		return flag;
	}
	
	
}
