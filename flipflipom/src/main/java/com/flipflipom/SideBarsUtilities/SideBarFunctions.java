package com.flipflipom.SideBarsUtilities;

import com.flipflipom.Base.Base;
import com.flipflipom.mainPage.MainPage;

/*
 * 
 This class is having all the functionalities of side bar
 extends CommomSideBarUtilities which has one major method written to do checks on any
 element based on the nameOfElement such as Ram and value to be ticked(such as 4GB)
 
 All the common functions such as selectRam, selectBrand are in return calling the 
 CommomSideBarUtilities.
 * 
 * 
 */
public class SideBarFunctions  extends CommomSideBarUtilities{

	public static void selectPriceFromCommonSideBarUtilities(String maxPrice) {
		CommomSideBarUtilities.selectPrice(maxPrice);
		Base.validationAfterEveryClick();
	}
	
	public static SideBarFunctions selectRam(String ramValue) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("ram", ramValue);
		if( wetherItemSelectedOrNot==1) {
			System.out.println("if item is selected then checking if error is coming after selecting the item or not");
			int flagvalue=Base.validationAfterEveryClick();
			if(flagvalue==1) {
				System.out.println("error page came after selecting the item hence after going back lets make the default choice");
				CommomSideBarUtilities.selectDeafultChoice("ram");// here aso, while making the default choice as a first option, error page may come, doing validation for this later
			}
			else if(flagvalue==0) {
				System.out.println("no error page came hence successfully selected the option");
			}						
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("item is not selected only as user choice could not be found hence making the default selection");
			CommomSideBarUtilities.selectDeafultChoice("ram");
			Base.validationAfterEveryClick();			//if above choice is giving erro page then simply getting back to the main page	
			}
		
		return new SideBarFunctions();
		}

	public static SideBarFunctions selectBrand(String brandName) {
		CommomSideBarUtilities.checkBoxesElementFunctions("BRAND", brandName);
		Base.validationAfterEveryClick();
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectCustomerRatings(String rating) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("customer ratings", rating);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is present and option is alos selcted");
			int flag=Base.validationAfterEveryClick();
			if(flag==1) {
				System.out.println("error page came based on user default choice hence making the default selection");
				CommomSideBarUtilities.selectDeafultChoice("customer ratings");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			CommomSideBarUtilities.selectDeafultChoice("customer ratings");//since user choice is not found hence giving the default choice
			Base.validationAfterEveryClick(); //simply coming back to the page in case dafult choice is giving the error page
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectInternalStorage(String storage) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("INTERNAL STORAGE", storage);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("INTERNAL STORAGE");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			
			CommomSideBarUtilities.selectDeafultChoice("INTERNAL STORAGE");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectBatteryCapacity(String bcapacity) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Battery capacity", bcapacity);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Battery capacity");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Battery capacity");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectOperatingSystem(String osName) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Operating System", osName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Operating System");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Operating System");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectNetworkType(String networkType) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Network Type", networkType);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Network Type");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Network Type");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectScreenSize(String screenSizeValue) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Screen Size", screenSizeValue);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Screen Size");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Screen Size");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectSimType(String simTypeValue) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Sim Type", simTypeValue);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Sim Type");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Sim Type");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectPrimaryCamera(String cameraValue) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Primary Camera", cameraValue);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Primary Camera");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Primary Camera");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectSecondryCamera(String cameraValue) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Secondary Camera", cameraValue);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Secondary Camera");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Secondary Camera");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectOffers(String offerName) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Offers", offerName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Offers");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Offers");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectProcessorBrand(String processorName) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Processor Brand", processorName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Processor Brand");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Processor Brand");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectSpecality(String specNam) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Speciality", specNam);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Speciality");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Speciality");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectResolutionTyoe(String resolutionName) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Resolution Type", resolutionName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Resolution Type");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Resolution Type");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectType(String type) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Type", type);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Type");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Type");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectOsVersionName(String versionName) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Operating System Version Name", versionName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Operating System Version Name");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Operating System Version Name");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectAvailibity() {
		CommomSideBarUtilities.checkBoxesElementFunctions("Availability", "Exclude Out of Stock");
		Base.validationAfterEveryClick();
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectClockSpeed(String clockSpeed) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Clock Speed", clockSpeed);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Clock Speed");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Clock Speed");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectFeatures(String featureName) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Features", featureName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Features");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Features");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectNoOfChores(String chorName) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("NUMBER OF CORES", chorName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("NUMBER OF CORES");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("NUMBER OF CORES");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectBudget(String budget) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("BUDGET", budget);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("BUDGET");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("BUDGET");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectCompatibleMobiles(String mobileName) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("Compatible Mobiles", mobileName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("Compatible Mobiles");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("Compatible Mobiles");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectColor1(String colorName) {
		CommomSideBarUtilities.selectColor(colorName);
		Base.validationAfterEveryClick();
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectTheme(String themeName) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("THEME", themeName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("THEME");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("THEME");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectMaterial(String materialName) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("MATERIAL", materialName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("MATERIAL");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("MATERIAL");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectDiscount(String  discount) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("discount", discount);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("discount");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("discount");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectPopularCollectio(String collectionName) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("POPULAR COLLECTIONS", collectionName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("POPULAR COLLECTIONS");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("POPULAR COLLECTIONS");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectHeadPhoneType(String headphones) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("HEADPHONE TYPE", headphones);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("HEADPHONE TYPE");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("HEADPHONE TYPE");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectConnectivity(String name) {
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("CONNECTIVITY", name);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("CONNECTIVITY");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("CONNECTIVITY");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectMicrophonePresent(String option) {
		//MICROPHONE PRESENT
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("MICROPHONE PRESENT", option);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("MICROPHONE PRESENT");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("MICROPHONE PRESENT");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
		
	}
	
	public static SideBarFunctions selectHeadPhoneDesign(String designName) {
		//HEADPHONE DESIGN
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("HEADPHONE DESIGN", designName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("HEADPHONE DESIGN");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("HEADPHONE DESIGN");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectCompatibleWith(String name) {
		//COMPATIBLE WITH
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("COMPATIBLE WITH", name);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("COMPATIBLE WITH");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("COMPATIBLE WITH");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectCapacity(String capacity) {
		//CAPACITY
		
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("CAPACITY", capacity);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("CAPACITY");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("CAPACITY");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectBatteryType(String btype) {
		//BATTERY TYPE
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("BATTERY TYPE", btype);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("BATTERY TYPE");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("BATTERY TYPE");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectConnectorType(String conType) {
		//CONNECTORS TYPE
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("CONNECTORS TYPE", conType);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("CONNECTORS TYPE");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("CONNECTORS TYPE");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectUsage(String usage) {
		//USAGE
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("USAGE", usage);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("USAGE");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("USAGE");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectCableLength(String length) {
		//CABLE LENGTH
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("CABLE LENGTH", length);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("CABLE LENGTH");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("CABLE LENGTH");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectNumberOfUsbPorts(String portNo) {
		//NUMBER OF USB PORTS
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("NUMBER OF USB PORTS", portNo);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("NUMBER OF USB PORTS");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("NUMBER OF USB PORTS");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectMountType(String mountType) {
		//mount type
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("mount type", mountType);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("mount type");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("mount type");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectDialShape(String dialShape) {
		//DIAL SHAPE
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("DIAL SHAPE", dialShape);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("DIAL SHAPE");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("DIAL SHAPE");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectStrapColor(String color) {
		//STRAP COLOR
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("STRAP COLOR", color);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("STRAP COLOR");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("STRAP COLOR");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectCompatibleOs(String os) {
		//COMPATIBLE OS
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("COMPATIBLE OS", os);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("COMPATIBLE OS");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("COMPATIBLE OS");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectIdealFor(String gender) {
		//ideal for
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("ideal for", gender);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("ideal for");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("ideal for");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectStrapMaterial(String materialName) {
		//STRAP MATERIAL
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("STRAP MATERIAL", materialName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("STRAP MATERIAL");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("STRAP MATERIAL");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectDisplayType(String displayType) {
		//DISPLAY TYPE
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("DISPLAY TYPE", displayType);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("DISPLAY TYPE");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("DISPLAY TYPE");
			Base.validationAfterEveryClick();
		}	
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectCompatibleDevice(String deviceName) {
		//COMPATIBLE DEVICE
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("COMPATIBLE DEVICE", deviceName);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("COMPATIBLE DEVICE");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("COMPATIBLE DEVICE");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectProcessor(String processor) {
		//PROCESSOR
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("PROCESSOR", processor);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("PROCESSOR");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("PROCESSOR");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectDedicatedGraphicsMemory(String graphics) {
		//DEDICATED GRAPHICS MEMORY
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("DEDICATED GRAPHICS MEMORY", graphics);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("DEDICATED GRAPHICS MEMORY");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("DEDICATED GRAPHICS MEMORY");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectHardDiskCapacity(String hc) {
		//HARD DISK CAPACITY
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("HARD DISK CAPACITY", hc);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("HARD DISK CAPACITY");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("HARD DISK CAPACITY");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectGraphicProcessorName(String gcp) {
		//GRAPHIC PROCESSOR NAME
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("GRAPHIC PROCESSOR NAME", gcp);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("GRAPHIC PROCESSOR NAME");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("GRAPHIC PROCESSOR NAME");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectTouchScreen(String option) {
		//TOUCH SCREEN
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("TOUCH SCREEN", option);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("TOUCH SCREEN");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("TOUCH SCREEN");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectRamType(String ramType) {
		//RAM TYPE
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("RAM TYPE", ramType);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("RAM TYPE");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("RAM TYPE");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectLifeStyle(String lifeStyle) {
		//LIFESTYLE
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("LIFESTYLE", lifeStyle);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("LIFESTYLE");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("LIFESTYLE");
			Base.validationAfterEveryClick();
		}
		
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectRamCapacity(String rcap) {
		//RAM CAPACITY
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("RAM CAPACITY", rcap);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("RAM CAPACITY");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("RAM CAPACITY");
			Base.validationAfterEveryClick();
		}
		
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectSsdCapacity(String ssdCap) {
		//SSD CAPACITY
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("SSD CAPACITY", ssdCap);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("SSD CAPACITY");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("SSD CAPACITY");
			Base.validationAfterEveryClick();
		}
		
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectWeight(String weight) {
		//weight
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("weight", weight);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("weight");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("weight");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectGrpahicProcessorSeries(String gpro) {
		//GRAPHIC PROCESSOR SERIES
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("GRAPHIC PROCESSOR SERIES", gpro);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("GRAPHIC PROCESSOR SERIES");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("GRAPHIC PROCESSOR SERIES");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	public static SideBarFunctions selectGraphicsMemoryType(String mtype) {
		//GRAPHICS MEMORY TYPE
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("GRAPHICS MEMORY TYPE", mtype);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("GRAPHICS MEMORY TYPE");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("GRAPHICS MEMORY TYPE");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
	
	public static SideBarFunctions selectStorageType(String sType) {
		//STORAGE TYPE
		int wetherItemSelectedOrNot=CommomSideBarUtilities.checkBoxesElementFunctions("STORAGE TYPE", sType);
		if(wetherItemSelectedOrNot==1) {
			System.out.println("user choive is prsent");
			int flag= Base.validationAfterEveryClick();
			if(flag==1) {
				CommomSideBarUtilities.selectDeafultChoice("STORAGE TYPE");
				Base.validationAfterEveryClick();
			}
			else if(flag==0) {
				System.out.println("no action needed");
			}
		}
		else if(wetherItemSelectedOrNot==0) {
			System.out.println("user choice not presrnt hence making the default choice");
			CommomSideBarUtilities.selectDeafultChoice("STORAGE TYPE");
			Base.validationAfterEveryClick();
		}
		return new SideBarFunctions();
	}
}
