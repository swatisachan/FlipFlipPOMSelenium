package com.flipflipom.HomePage;

import com.flipflipom.Base.Base;

public class WomenSection extends Base{

	public void selectClothingWomen() {
		Base.selectValueBasedOnName("womenFirstSection.CSS", "Clothing");
	}
	
	public void selectWesternWear() {
		Base.selectValueBasedOnName("womenFirstSection.CSS", "Western Wear");
	}
	
	public void selectWesternWearItems(String itemName) {
		Base.selectValueBasedOnName("womenFirstSection.CSS", itemName);
	}
	
	public void selectLingrieSleepWear() {
		Base.selectValueBasedOnName("womenFirstSection.CSS", "Lingerie & Sleepwear");
	}
	
	public void selectItemLingrieSleepWear(String itemName) {
		Base.selectValueBasedOnName("womenFirstSection.CSS", itemName);
	}
	public void selectSwimNBeatchYaer() {
		Base.selectValueBasedOnName("womenFirstSection.CSS", "Swim & Beachwear");
	}
	public void selecteinterwean() {
		Base.selectValueBasedOnName("womenFirstSection.CSS", "Winter & Seasonal Wear");
	}
}
