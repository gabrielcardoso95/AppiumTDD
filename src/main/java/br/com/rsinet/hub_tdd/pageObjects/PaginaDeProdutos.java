package br.com.rsinet.hub_tdd.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PaginaDeProdutos {
	
	public MobileElement lnk_Produto(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewProductName");
	}
	
	public MobileElement img_Produto(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("52486a83-e822-406d-a12b-ed40480abc49");
	}
	
}