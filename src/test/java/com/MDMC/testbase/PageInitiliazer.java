package com.MDMC.testbase;

import com.MDMC.pages.FindADoctorPageElements;
import com.MDMC.pages.GivenPageElements;
import com.MDMC.pages.HomePageElements;

public class PageInitiliazer extends BaseClass {

	protected static FindADoctorPageElements findD;
	protected static HomePageElements homePE;
	protected static GivenPageElements givenPE;

	public static void initializeAllPage() {
		findD=new FindADoctorPageElements();
		homePE=new HomePageElements();
		givenPE=new GivenPageElements();
	}
}