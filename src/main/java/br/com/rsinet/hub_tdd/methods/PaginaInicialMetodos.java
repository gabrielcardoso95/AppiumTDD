package br.com.rsinet.hub_tdd.methods;

import br.com.rsinet.hub_tdd.pageObjects.PaginaInicial;
import br.com.rsinet.hub_tdd.utils.Data;
import br.com.rsinet.hub_tdd.utils.Scroll;
import io.appium.java_client.android.AndroidDriver;

public class PaginaInicialMetodos {
	PaginaInicial paginaInicial = new PaginaInicial();
	
	public void clica_lnk_Lupa(AndroidDriver<?> driver) throws InterruptedException {
		paginaInicial.btn_Lupa(driver).click();
		Thread.sleep(200);
	}

	public void pesquisa_Produto(AndroidDriver<?> driver) throws Exception {
		paginaInicial.txtbx_Pesquisar(driver).sendKeys(Data.produtoValido());
	}

	public void pesquisa_ProdutoInvalido(AndroidDriver<?> driver) {
		paginaInicial.txtbx_Pesquisar(driver).sendKeys("Ferrari");
	}

	public void clica_menuMouses(AndroidDriver<?> driver) throws InterruptedException {
		Scroll.scrollAndClick(driver, "MICE");
	}
	
	public void clica_MenuDeUsuario(AndroidDriver<?> driver) throws InterruptedException {
		Thread.sleep(2000);
		paginaInicial.btn_Menu(driver).click();
		Thread.sleep(2000);
	}
	
	public void clica_lnk_LogIn(AndroidDriver<?> driver) {
		paginaInicial.btn_LogIn(driver).click();
	}

	public void clica_lnk_Cadastrar(AndroidDriver<?> driver) {
		paginaInicial.btn_Cadastrar(driver).click();
	}

	public boolean verifica_UsuarioLogado(AndroidDriver<?> driver) throws InterruptedException {
		try {
			return paginaInicial.btn_LogOut(driver).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}
