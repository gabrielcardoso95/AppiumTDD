package br.com.rsinet.hub_tdd.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.rsinet.hub_tdd.managers.AppManager;
import br.com.rsinet.hub_tdd.methods.CadastroDeUsuarioMetodos;
import br.com.rsinet.hub_tdd.methods.PaginaInicialMetodos;
import br.com.rsinet.hub_tdd.methods.ProdutosMetodos;
import br.com.rsinet.hub_tdd.utils.Constant;
import br.com.rsinet.hub_tdd.utils.ExcelUtils;
import br.com.rsinet.hub_tdd.utils.ExtentReport;
import br.com.rsinet.hub_tdd.utils.ScreenShot;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BuscaPorMenu {
	private static AndroidDriver<MobileElement> driver;
	PaginaInicialMetodos paginaInicial = new PaginaInicialMetodos();
	ProdutosMetodos produtos = new ProdutosMetodos();
	CadastroDeUsuarioMetodos cadastroDeUsuario = new CadastroDeUsuarioMetodos();
	ExtentTest test = ExtentReport.getTest();
	ExtentReports extent = ExtentReport.getExtent();
	
	@Before
	public void setUp() throws Exception {
		driver = AppManager.iniciaAplicativo();
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Produtos");
	}
	
	@Test
	public void buscaProduto() throws Exception {
		test = extent.startTest("Pesquisa produto por menu");
		paginaInicial.clica_menuMouses(driver);
		test.log(LogStatus.PASS, "Clicou no menu de mouses");
		produtos.clica_produtoDaLista(driver);
		test.log(LogStatus.PASS, "Clicou no produto");
		assertTrue(driver.getPageSource().contains("ADD TO CART"));
		test.log(LogStatus.PASS, "Detalhes do produto aparecem na tela");
		ScreenShot.capture(driver, "BuscaProdutoMenuSucesso");
		test.log(LogStatus.PASS, "Print abaixo: " + test.addScreenCapture("C:\\Users\\gabriel.cardoso\\workspace\\AppiumTDD\\test-output\\Screenshot\\BuscaProdutoMenuSucesso.png"));
	}
	
	@After
	public void tearDown() throws Exception {
		AppManager.encerraAplicativo(driver);
	}
}
