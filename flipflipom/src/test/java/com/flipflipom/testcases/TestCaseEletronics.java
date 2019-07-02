package com.flipflipom.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.flipflipom.Base.Base;
import com.flipflipom.SideBarsUtilities.SideBarFunctions;
import com.flipflipom.mainPage.MainPage;

public class TestCaseEletronics {

	@Test
	public void selectEletrinicsItem() {
		Base b= new Base();
		Base.driver.manage().window().maximize();
		Base.menu.goToElectronics().selectMobile("Mi").accessMiddleBar().clickHighToLow().clickLowToHigh().clickNewestFirst();
		MainPage.accessSideBar().selectCustomerRatings("4★ & above").selectRam("3 GB");
		MainPage.accessMiddleBar().selectFirstElement();
		
		
	}

}
