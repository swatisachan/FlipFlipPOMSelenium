package com.flipflipom.mainPage;


import com.flipflipom.Base.Base;
import com.flipflipom.SideBarsUtilities.SideBarFunctions;

public class MainPage extends Base{

	//encapsuating all the three parts.. side menu,,, top navigation bar, centre part..
	
	public static SideBarFunctions sideBar;
	public static MiddleBar middleBar;
	
	public static SideBarFunctions accessSideBar() {
		sideBar= new SideBarFunctions();
		return new SideBarFunctions();
	}
	
	public static MiddleBar accessMiddleBar() {
		middleBar= new MiddleBar();
		return new MiddleBar();
	}
	

}
