package br.com.rsinet.hub_tdd.tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.rsinet.hub_tdd.managers.AppManager;
import br.com.rsinet.hub_tdd.methods.PaginaInicialMetodos;
import br.com.rsinet.hub_tdd.methods.ProdutosMetodos;
import br.com.rsinet.hub_tdd.utils.Constant;
import br.com.rsinet.hub_tdd.utils.ExcelUtils;
import br.com.rsinet.hub_tdd.utils.ExtentReport;
import br.com.rsinet.hub_tdd.utils.ScreenShot;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BuscaProdutoPelaLupa {
	private static AndroidDriver<MobileElement> driver;
	PaginaInicialMetodos paginaInicial = new PaginaInicialMetodos();
	ProdutosMetodos produtos = new ProdutosMetodos();
	ExtentTest test = ExtentReport.getTest();
	ExtentReports extent = ExtentReport.getExtent();

	@Before
	public void setUp() throws Exception {
		driver = AppManager.iniciaAplicativo();
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Produtos");
	}

	@Test
	public void buscaProdutoValido() throws Exception {
		test = extent.startTest("Pesquisa produto valido");
		paginaInicial.pesquisa_Produto(driver);
		test.log(LogStatus.PASS, "Inseriu nome do produto");
		paginaInicial.clica_lnk_Lupa(driver);
		test.log(LogStatus.PASS, "Clicou no botao de lupa");
		produtos.clica_Produto(driver);
		test.log(LogStatus.PASS, "Clicou no produto pesquisado");
		assertTrue(driver.getPageSource().contains("DETAILS"));
		ScreenShot.capture(driver, "LupaSucesso");
		test.log(LogStatus.PASS, "Detalhes do produto aparecem na tela");
		test.log(LogStatus.PASS, "Print abaixo: " + test.addScreenCapture("C:\\Users\\gabriel.cardoso\\workspace\\AppiumTDD\\test-output\\Screenshot\\LupaSucesso.png"));
	}

	@Test
	public void buscaProdutoInvalido() throws InterruptedException, IOException {
		test = extent.startTest("Pesquisa produto invalido");
		paginaInicial.pesquisa_ProdutoInvalido(driver);
		test.log(LogStatus.PASS, "Inseriu nome do produto invalido");
		paginaInicial.clica_lnk_Lupa(driver);
		test.log(LogStatus.PASS, "Clicou na lupa");
		assertTrue(driver.getPageSource().contains("No results for"));
		ScreenShot.capture(driver, "LupaFalha");
		test.log(LogStatus.PASS, "Nao foram encontrados resultados validos");
		test.log(LogStatus.PASS, "Print abaixo: " + test.addScreenCapture("C:\\Users\\gabriel.cardoso\\workspace\\AppiumTDD\\test-output\\Screenshot\\LupaFalha.png"));
	}

	@After
	public void tearDown() throws Exception {
		AppManager.encerraAplicativo(driver);
	}
}
