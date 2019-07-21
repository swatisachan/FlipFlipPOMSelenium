package com.flipflipom.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.flipflipom.Base.Base;
import com.flipflipom.SideBarsUtilities.SideBarFunctions;
import com.flipflipom.listeners.CustomerListeners;
import com.flipflipom.mainPage.MainPage;


public class TestCaseEletronics {

	
	@BeforeClass
	public void openBrowser() {
		Base b= new Base();
	}
	@Test (enabled=false)
	public void selectEletrinicsItem() {
		Base.driver.manage().window().maximize();
		Base.menu.goToElectronics().selectMobile("Mi").accessMiddleBar().clickHighToLow().clickLowToHigh().clickNewestFirst();
		MainPage.accessSideBar().selectCustomerRatings("4★ & above").selectRam("3 GB");
		
		MainPage.accessMiddleBar().selectFirstElement();	
	}
	
	@AfterClass
	public void quitBrowse() {
		Base.quitBrowser();
	}
}
