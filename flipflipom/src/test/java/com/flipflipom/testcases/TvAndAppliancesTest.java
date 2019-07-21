package com.flipflipom.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flipflipom.Base.Base;
import com.flipflipom.mainPage.MainPage;

public class TvAndAppliancesTest extends Base{
	

	@BeforeClass
	public void openBrowser() {
		Base b= new Base();
		System.out.println("coming inside the open browser of tv and appliances");
	}
  @Test
  public void tvAndAppliancesTest() throws InterruptedException {
	 Thread.sleep(3000);
	 Base.driver.manage().window().maximize();
	 Base.menu.goToTvAndAppliances().selectTopBrands("Vu");
	 Thread.sleep(3000);
	 MainPage.accessSideBar().selectOperatingSystem("Android Based");
	 MainPage.accessMiddleBar().clickHighToLow().clickLowToHigh().clickPopularity();
	 
	
  }
  
  @AfterClass
  public void quitBrowserMethod() {
	 // Base.quitBrowser();
  }
}
