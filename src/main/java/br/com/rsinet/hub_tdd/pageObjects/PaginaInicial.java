package br.com.rsinet.hub_tdd.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PaginaInicial {

	public MobileElement btn_LogOut(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewMenuUser");
	}

	public MobileElement btn_Menu(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/imageViewMenu");
	}

	public MobileElement btn_LogIn(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewMenuUser");
	}

	public MobileElement btn_Cadastrar(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewSingUpToday");
	}

	public MobileElement btn_Lupa(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/imageViewSearch");
	}

	public MobileElement txtbx_Pesquisar(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/editTextSearch");
	}

}