package com.flipflipom.Base;

import com.flipflipom.HomePage.BabyAndKidsSection;
import com.flipflipom.HomePage.ElectronicsSection;
import com.flipflipom.HomePage.HomeAndFurnitureSection;
import com.flipflipom.HomePage.MenSection;
import com.flipflipom.HomePage.SpoortsBooksAndMoreSection;
import com.flipflipom.HomePage.TVNAppliancesSection;
import com.flipflipom.HomePage.WomenSection;

public class TopMenu extends Base{

	public ElectronicsSection goToElectronics() {
		System.out.println("coming here");
		Base.ClickElement("HomePageElectronicsTab.CSS");
		return new ElectronicsSection();
		
	}
	public TVNAppliancesSection goToTvAndAppliances() {
		Base.ClickElement("HomePageTvAndAppliances.CSS");
		return new TVNAppliancesSection();
	}
	public MenSection goToMen() {
		Base.ClickElement("HomePageMenTab.CSS");
		return new MenSection();
	}
	public WomenSection goToWomen() {
		Base.ClickElement("HomePageWomenTab.CSS");
		return new WomenSection();
	}
	public BabyAndKidsSection goToBabyAndKids() {
		Base.ClickElement("HomePageBabyAndKids.CSS");
		return new BabyAndKidsSection();
	}
	public HomeAndFurnitureSection goToHomeNFurniture() {
		Base.ClickElement("HomePageHomeNFurniture.CSS");
		return new HomeAndFurnitureSection();
	}
	public SpoortsBooksAndMoreSection goToSpoortsBooks() {
		Base.ClickElement("HomePageSpoortsBooksMore.CSS");
		return new SpoortsBooksAndMoreSection();
	}
	public void goToGrocery() {
		Base.ClickElement("HomePageGrocery.CSS");
	}
	public void goToOfferZone() {
		Base.ClickElement("HomePageOfferZone.CSS");
	}
	
}
