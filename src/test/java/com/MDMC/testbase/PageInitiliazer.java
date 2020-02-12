package com.MDMC.testbase;

import com.MDMC.pages.FindADoctorPageElements;
import com.MDMC.pages.HomePageElements;

public class PageInitiliazer extends BaseClass {

	protected static FindADoctorPageElements findD;
	protected static HomePageElements homePE;

	public static void initializeAllPage() {
		findD=new FindADoctorPageElements();
		homePE=new HomePageElements();
	}
}