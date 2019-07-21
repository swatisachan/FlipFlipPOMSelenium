package com.flipflipom.HomePage;

import com.flipflipom.Base.Base;
import com.flipflipom.mainPage.MainPage;

public class TVNAppliancesSection extends Base{

	public MainPage selectTelevision() {
		Base.selectValueBasedOnName("TvNAppliancesFirstSection.CSS", "Television");
		Base.ClickElement("viewAllTV.CSS");
		return new MainPage();
	}
	
	public MainPage selectAndridTv() {
		Base.selectValueBasedOnName("TvNAppliancesFirstSection.CSS", "Android TVs");
		return new MainPage();
	}
	public MainPage selectSmartAndUltaHD() {
		Base.selectValueBasedOnName("TvNAppliancesFirstSection.CSS", "Smart & Ultra HD");
		return new MainPage();
	}
	
	public MainPage selectTopBrands(String topBrands) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Base.selectValueBasedOnName("TvNAppliancesFirstSection.CSS", topBrands);
		return new MainPage();
	}
	public MainPage selectShopByScreenSize(String screenSizeVal) {
		Base.selectValueBasedOnName("TvNAppliancesFirstSection.CSS", screenSizeVal);
		return new MainPage();
	}
	public MainPage selectAirConditions() {
		Base.selectValueBasedOnName("TvNAppliancesSecondSection.CSS", "Air Conditioners");
		return new MainPage();
	}
	public MainPage selectAirCondiTypes(String valueToSel) {
		Base.selectValueBasedOnName("TvNAppliancesSecondSection.CSS", valueToSel);
		return new MainPage();
	}
	public MainPage selectShopByBrand(String brandName) {
		Base.selectValueBasedOnName("TvNAppliancesSecondSection.CSS", brandName);
		return new MainPage();
	}
	
	public MainPage selectRefrigrator() {
		Base.selectValueBasedOnName("TvNAppliancesSecondSection.CSS", "Refrigerators");
		return new MainPage();
	}
	
	public MainPage selectTypeOfRefrigtrator(String valueToSelect) {
		Base.selectValueBasedOnName("TvNAppliancesSecondSection.CSS", valueToSelect);
		return new MainPage();
	}
	
	public MainPage selectWashingmachine() {
		Base.selectValueBasedOnName("TvNAppliancesSecondSection.CSS", "Washing Machine");
		return new MainPage();
	}
	public MainPage selectKitchenAppli() {
		Base.selectValueBasedOnName("TvNAppliancesThirdSection.CSS", "Kitchen Appliances");
		return new MainPage();
	}
	public MainPage selectKitchenAppliTypes(String valueToSelect) {
		Base.selectValueBasedOnName("TvNAppliancesThirdSection.CSS", valueToSelect);
		return new MainPage();
	}
	
	public MainPage selectHealthyLivingAppli() {
		Base.selectValueBasedOnName("TvNAppliancesThirdSection.CSS", "Healthy Living Appliances");
		return new MainPage();
	}
	
	public MainPage smallHomeAppliances() {
		Base.selectValueBasedOnName("TvNAppliancesFourthSection.CSS", "Small Home Appliances");
		return new MainPage();
	}
	
	public MainPage selectTopBrandsInAppliances(String valueToSelect) {
		Base.selectValueBasedOnName("TvNAppliancesFourthSection.CSS", valueToSelect);
		return new MainPage();
	}
	public MainPage selectBuyingGuides(String valueToSelect) {
		Base.selectValueBasedOnName("TvNAppliancesFivthSection.CSS", valueToSelect);
		return new MainPage();
	}
	
	public MainPage selectNewLaunches(String valueToSelect) {
		Base.selectValueBasedOnName("TvNAppliancesFivthSection.CSS", valueToSelect);
		return new MainPage();
	}
}
