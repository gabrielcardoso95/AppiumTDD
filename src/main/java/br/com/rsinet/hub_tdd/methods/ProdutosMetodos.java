package br.com.rsinet.hub_tdd.methods;

import br.com.rsinet.hub_tdd.pageObjects.PaginaDeProdutos;
import br.com.rsinet.hub_tdd.utils.Data;
import br.com.rsinet.hub_tdd.utils.Scroll;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ProdutosMetodos {
	PaginaDeProdutos produtos = new PaginaDeProdutos();
	
	public void clica_Produto(AndroidDriver<?> driver) throws Exception {
		Thread.sleep(2000);
		MobileElement el3 = (MobileElement) driver.findElementById("com.Advantage.aShopping:id/imageViewProduct");
		el3.click();
	}
	
	public void clica_produtoDaLista(AndroidDriver<?> driver) throws Exception {
		Scroll.scrollAndClick(driver, Data.produtoValido());
	}
}
