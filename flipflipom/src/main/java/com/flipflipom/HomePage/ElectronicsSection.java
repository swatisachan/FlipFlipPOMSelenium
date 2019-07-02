package com.flipflipom.HomePage;

import com.flipflipom.Base.Base;
import com.flipflipom.mainPage.MainPage;

/**
 * @author swati sachan
 *
 */
public class ElectronicsSection extends Base{

	public MainPage selectMobile(String mobilePhoneName) {
		Base.selectValueBasedOnName("ElectronicsFirstSection.CSS", mobilePhoneName);
		if(mobilePhoneName.equals("Samsung")||mobilePhoneName.equals("OPPO")) {
			Base.ClickElement("ViewAll.CSS");
		}
		else if(mobilePhoneName.equals("Apple")) {
			Base.ClickElement("AppleViewAll.CSS");
		}
		return new MainPage();
	}
	
	public MainPage clickOnMobile() {
		Base.ClickElement("ElectronicsFirstSectionMobiles.CSS");
		return new MainPage();
	}
	
	
	public MainPage selectMobileAccessories(String mobileAccessroiesName) {
		Base.selectValueBasedOnName("ElectronicsSecondSection.CSS", mobileAccessroiesName);
		return new MainPage();
	}
	
	public MainPage clickOnMobileAccessories() {
		Base.ClickElement("ElectronicsSecondSectionMobileAccess.CSS");
		return new MainPage();
	}
	
	
	public MainPage selectSmartWearableTech(String smartTechName) {
		Base.selectValueBasedOnName("ElectronicsSecondSection.CSS", smartTechName);
		return new MainPage();
	}
	
	public MainPage clickOnSmartTech() {
		Base.ClickElement("ElectronicsSecondSectionSmartWearableTech.CSS");
		return new MainPage();
	}
	
	public MainPage selectHealthCareAppliances(String appliName) {
		Base.selectValueBasedOnName("ElectronicsSecondSection.CSS", appliName);
		return new MainPage();
	}
	
	public MainPage clickOnHealthCareAppliances() {
		Base.ClickElement("ElectronicsSecondSectionHealthCareAppli.CSS");
		return new MainPage();
	}
	
	public MainPage clickOnLaptop() {
		Base.ClickElement("ElectronicsThirdSectionLaptop.CSS");
		return new MainPage();
	}
	
	public MainPage clickOneGamingLaptop() {
		Base.ClickElement("ElectronicsThirdSectionGaming.CSS");
		return new MainPage();
	}
	public MainPage clickOnDesktopPCs() {
		Base.ClickElement("ElectronicsThirdSectionDesktop.CSS");
		return new MainPage();
	}
	public MainPage clickOnGamingAndAccesroies() {
		Base.ClickElement("ElectronicsThirdSectionGamingAcc.CSS");
		return new MainPage();
	}
	public MainPage clickOnComputerAcces() {
		Base.ClickElement("ElectronicsThirdSectionGamingAcc.CSS");
		return new MainPage();
	}
	public MainPage selectComputerAccess(String computerAccName) {
		Base.ClickElement("EletronicsThirdSectionComputerAcc.CSS");
		return new MainPage();
	}
	public MainPage clickOnComputerPheripharls() {
		Base.ClickElement("ElectronicsThirdSectionComputerPeri.CSS");
		return new MainPage();
	}
	public MainPage selectComputerPheripharals(String computerPheri) {
		Base.selectValueBasedOnName("ElectronicsThirdSection.CSS", computerPheri);
		return new MainPage();
	}
	public MainPage clickOnTablets(String valueToSelect) {
		Base.selectValueBasedOnName("ElectronicsThirdSection.CSS", valueToSelect);
		return new MainPage();
	}
	public MainPage clickOnAppleiPads(String valueToSelect) {
		Base.selectValueBasedOnName("ElectronicsThirdSection.CSS", valueToSelect);
		return new MainPage();
	}
	public MainPage clickOnTelevisions(String valueToSelect) {
		Base.selectValueBasedOnName("ElectronicsFourthSection.CSS", valueToSelect);
		return new MainPage();
	}
	
	public MainPage clickOnSpeakers(String valueToSelect) {
		Base.selectValueBasedOnName("ElectronicsFourthSection.CSS", valueToSelect);
		return new MainPage();
	}
	public MainPage selectSpeakers(String speakerName) {
		Base.selectValueBasedOnName("ElectronicsFourthSection.CSS", speakerName);
		return new MainPage();
	}
	
	public MainPage clickOnSmartHomeAutomation(String valueToSelect) {
		Base.selectValueBasedOnName("ElectronicsFourthSection.CSS", valueToSelect);
		return new MainPage();
	}
	public MainPage clickOnGoogleHome(String valueToSelect) {
		Base.selectValueBasedOnName("ElectronicsFourthSection.CSS", valueToSelect);
		return new MainPage();
	}
	public MainPage clickOnCamera(String valueToSelect) {
		Base.selectValueBasedOnName("ElectronicsFourthSection.CSS", valueToSelect);
		return new MainPage();
	}
	public MainPage selectCamera(String cameraName) {
		Base.selectValueBasedOnName("ElectronicsFourthSection.CSS", cameraName);
		return new MainPage();
	}
	
	public MainPage clickOnCameraAccess(String valueToSelect) {
		Base.selectValueBasedOnName("ElectronicsFourthSection.CSS", valueToSelect);
		return new MainPage();
	}
	public MainPage selectCameraAccess(String cameraAccName) {
		Base.selectValueBasedOnName("ElectronicsFourthSection.CSS", cameraAccName);
		return new MainPage();
	}
	public MainPage clickOnNetworkComponents(String valueToSelect) {
		Base.selectValueBasedOnName("ElectronicsFourthSection.CSS", valueToSelect);
		return new MainPage();
	}
	public MainPage clickOnRouters(String valueToSelect) {
		Base.selectValueBasedOnName("ElectronicsFourthSection.CSS", valueToSelect);
		return new MainPage();
	}
	public MainPage clickOnFeatured(String valueToSelect) {
		Base.selectValueBasedOnName("ElectronicsFivthSection.CSS", valueToSelect);
		return new MainPage();
	}
	public MainPage selectFeaturedOption(String optionName) {
		Base.selectValueBasedOnName("ElectronicsFivthSection.CSS", optionName);
		return new MainPage();
	}
}


