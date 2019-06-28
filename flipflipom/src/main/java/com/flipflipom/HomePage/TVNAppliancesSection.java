package com.flipflipom.HomePage;

import com.flipflipom.Base.Base;

public class TVNAppliancesSection extends Base{

	public void selectTelevision() {
		Base.selectValueBasedOnName("TvNAppliancesFirstSection.CSS", "Television");
		Base.ClickElement("viewAllTV.CSS");
		
	}
	
	public void selectAndridTv() {
		Base.selectValueBasedOnName("TvNAppliancesFirstSection.CSS", "Android TVs");
	}
	public void selectSmartAndUltaHD() {
		Base.selectValueBasedOnName("TvNAppliancesFirstSection.CSS", "Smart & Ultra HD");
	}
	
	public void selectTopBrands(String topBrands) {
		Base.selectValueBasedOnName("TvNAppliancesFirstSection.CSS", topBrands);
	}
	public void selectShopByScreenSize(String screenSizeVal) {
		Base.selectValueBasedOnName("TvNAppliancesFirstSection.CSS", screenSizeVal);
	}
	public void selectAirConditions() {
		Base.selectValueBasedOnName("TvNAppliancesSecondSection.CSS", "Air Conditioners");
	}
	public void selectAirCondiTypes(String valueToSel) {
		Base.selectValueBasedOnName("TvNAppliancesSecondSection.CSS", valueToSel);
	}
	public void selectShopByBrand(String brandName) {
		Base.selectValueBasedOnName("TvNAppliancesSecondSection.CSS", brandName);
	}
	
	public void selectRefrigrator() {
		Base.selectValueBasedOnName("TvNAppliancesSecondSection.CSS", "Refrigerators");
	}
	
	public void selectTypeOfRefrigtrator(String valueToSelect) {
		Base.selectValueBasedOnName("TvNAppliancesSecondSection.CSS", valueToSelect);
	}
	
	public void selectWashingmachine() {
		Base.selectValueBasedOnName("TvNAppliancesSecondSection.CSS", "Washing Machine");
	}
	public void selectKitchenAppli() {
		Base.selectValueBasedOnName("TvNAppliancesThirdSection.CSS", "Kitchen Appliances");
	}
	public void selectKitchenAppliTypes(String valueToSelect) {
		Base.selectValueBasedOnName("TvNAppliancesThirdSection.CSS", valueToSelect);
	}
	
	public void selectHealthyLivingAppli() {
		Base.selectValueBasedOnName("TvNAppliancesThirdSection.CSS", "Healthy Living Appliances");
	}
	
	public void smallHomeAppliances() {
		Base.selectValueBasedOnName("TvNAppliancesFourthSection.CSS", "Small Home Appliances");
	}
	
	public void selectTopBrandsInAppliances(String valueToSelect) {
		Base.selectValueBasedOnName("TvNAppliancesFourthSection.CSS", valueToSelect);
	}
	public void selectBuyingGuides(String valueToSelect) {
		Base.selectValueBasedOnName("TvNAppliancesFivthSection.CSS", valueToSelect);
	}
	
	public void selectNewLaunches(String valueToSelect) {
		Base.selectValueBasedOnName("TvNAppliancesFivthSection.CSS", valueToSelect);
	}
}
