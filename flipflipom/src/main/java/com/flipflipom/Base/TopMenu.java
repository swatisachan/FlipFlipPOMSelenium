package com.flipflipom.Base;

import com.flipflipom.HomePage.ElectronicsSection;
import com.flipflipom.HomePage.TVNAppliancesSection;

public class TopMenu extends Base{

	public ElectronicsSection goToElectronics() {
		Base.ClickElement("HomePageElectronicsTab.CSS");
		return new ElectronicsSection();
		
	}
	public TVNAppliancesSection goToTvAndAppliances() {
		Base.ClickElement("HomePageTvAndAppliances.CSS");
		return new TVNAppliancesSection();
	}
	public void goToMen() {
		Base.ClickElement("HomePageMenTab.CSS");
	}
	public void goToWomen() {
		Base.ClickElement("HomePageWomenTab.CSS");
	}
	public void goToBabyAndKids() {
		Base.ClickElement("HomePageBabyAndKids.CSS");
	}
	public void goToHomeNFurniture() {
		Base.ClickElement("HomePageHomeNFurniture.CSS");
	}
	public void goToSpoortsBooks() {
		Base.ClickElement("HomePageSpoortsBooksMore.CSS");
	}
	public void goToGrocery() {
		Base.ClickElement("HomePageGrocery.CSS");
	}
	public void goToOfferZone() {
		Base.ClickElement("HomePageOfferZone.CSS");
	}
	
}
