package br.com.rsinet.hub_tdd.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PaginaDeCadastro {

	public MobileElement cx_NomeDeUsuario(AndroidDriver<?> driver) {
		return (MobileElement) driver
				.findElementByXPath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextUserName']/child::*[1]");
	}

	public static MobileElement cx_EmailDeUsuario(AndroidDriver<?> driver) {
		return (MobileElement) driver
				.findElementByXPath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextEmail']/child::*[1]");
	}

	public static MobileElement cx_Senha(AndroidDriver<?> driver) {
		return (MobileElement) driver
				.findElementByXPath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPassword']/child::*[1]");
	}

	public static MobileElement cx_ConfirmaSenha(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//*[@resource-id='com.Advantage.aShopping:id/AosEditTextConfirmPassword']/child::*[1]");
	}

	public static MobileElement cx_PrimeiroNome(AndroidDriver<?> driver) {
		return (MobileElement) driver
				.findElementByXPath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextFirstName']/child::*[1]");
	}

	public static MobileElement cx_SobreNome(AndroidDriver<?> driver) {
		return (MobileElement) driver
				.findElementByXPath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextLastName']/child::*[1]");
	}

	public static MobileElement cx_NumeroDeTelefone(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPhoneNumber']/child::*[1]");
	}

	public static MobileElement cx_EstadoProvinciaRegiao(AndroidDriver<?> driver) {
		return (MobileElement) driver
				.findElementByXPath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/child::*[1]");
	}

	public static MobileElement cx_Endereço(AndroidDriver<?> driver) {
		return (MobileElement) driver
				.findElementByXPath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextStreet']/child::*[1]");
	}

	public static MobileElement cx_CaixaPostal(AndroidDriver<?> driver) {
		return (MobileElement) driver
				.findElementByXPath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextZip']/child::*[1]");
	}

	public static MobileElement cx_Cidade(AndroidDriver<?> driver) {
		return (MobileElement) driver
				.findElementByXPath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextCity']/child::*[1]");
	}

	public static MobileElement cx_Pais(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/linearLayoutCountry");
	}
	
	public static MobileElement btn_Registrar(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByClassName("android.widget.Button");
	}

}