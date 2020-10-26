package com.MDMC.testbase;

import com.MDMC.pages.CareerPageElements;
import com.MDMC.pages.FindADoctorPageElements;
import com.MDMC.pages.GivenPageElements;
import com.MDMC.pages.HomePageElements;
import com.MDMC.pages.MyChartElements;

public class PageInitiliazer extends BaseClass {

	protected static FindADoctorPageElements findD;
	protected static HomePageElements homePE;
	protected static GivenPageElements givenPE;
	protected static MyChartElements mChart;
	protected static CareerPageElements career;

	public static void initializeAllPage() {
		findD=new FindADoctorPageElements();
		homePE=new HomePageElements();
		givenPE=new GivenPageElements();
		mChart=new MyChartElements();
		career=new CareerPageElements();
	}
}