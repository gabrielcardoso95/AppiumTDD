package br.com.rsinet.hub_tdd.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.rsinet.hub_tdd.managers.AppManager;
import br.com.rsinet.hub_tdd.methods.CadastroDeUsuarioMetodos;
import br.com.rsinet.hub_tdd.methods.PaginaInicialMetodos;
import br.com.rsinet.hub_tdd.utils.Constant;
import br.com.rsinet.hub_tdd.utils.Data;
import br.com.rsinet.hub_tdd.utils.ExcelUtils;
import br.com.rsinet.hub_tdd.utils.ExtentReport;
import br.com.rsinet.hub_tdd.utils.ScreenShot;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CadastraUsuario {
	
	private static AndroidDriver<MobileElement> driver;
	PaginaInicialMetodos paginaInicial = new PaginaInicialMetodos();
	CadastroDeUsuarioMetodos cadastroDeUsuario = new CadastroDeUsuarioMetodos();
	ExtentTest test = ExtentReport.getTest();
	ExtentReports extent = ExtentReport.getExtent();
	
	@Before
	public void setUp() throws Exception {
		driver = AppManager.iniciaAplicativo();
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Cadastro");
		
		test = extent.startTest("Preenche formulario com informacoes validas");
		
		paginaInicial.clica_MenuDeUsuario(driver);
		test.log(LogStatus.PASS, "Clicou no menu de usuario");
		paginaInicial.clica_lnk_LogIn(driver);
		test.log(LogStatus.PASS, "Clicou no link de login");
		paginaInicial.clica_lnk_Cadastrar(driver);
		test.log(LogStatus.PASS, "Clicou no link 'Cadastrar'");
		
		cadastroDeUsuario.preenche_NomeDeUsuario(driver);
		test.log(LogStatus.PASS, "Campo de nome de usuario preenchido");
		cadastroDeUsuario.preenche_EmailDeUsuario(driver);
		test.log(LogStatus.PASS, "Campo de email preenchido");
		cadastroDeUsuario.preenche_Senha(driver);
		test.log(LogStatus.PASS, "Campo de senha preenchido");
		cadastroDeUsuario.confirma_Senha(driver);
		test.log(LogStatus.PASS, "Campo de confirmacao de senha preenchido");
		cadastroDeUsuario.preenche_PrimeiroNome(driver);
		test.log(LogStatus.PASS, "Campo de nome preenchido");
		cadastroDeUsuario.preenche_Sobrenome(driver);
		test.log(LogStatus.PASS, "Campo de sobrenome preenchido");
		cadastroDeUsuario.preenche_NumeroDeTelefone(driver);
		test.log(LogStatus.PASS, "Campo de telefone preenchido");
		cadastroDeUsuario.desce_Pagina(driver);
		cadastroDeUsuario.seleciona_Pais(driver);
		test.log(LogStatus.PASS, "Pais selecionado");
		cadastroDeUsuario.preenche_EstadoProvinciaRegiao(driver);
		test.log(LogStatus.PASS, "Campo de estado, provincia ou regiao preenchido");
		cadastroDeUsuario.preenche_Endereço(driver);
		test.log(LogStatus.PASS, "Campo de endereço preenchido");
		cadastroDeUsuario.preenche_Cidade(driver);
		test.log(LogStatus.PASS, "Campo de cidade preenchido");
		cadastroDeUsuario.preenche_CaixaPostal(driver);
		test.log(LogStatus.PASS, "Campo de caixa postal preenchido");
		cadastroDeUsuario.clica_Registrar(driver);
		test.log(LogStatus.PASS, "Clicou no botao 'Registrar'");
	}
	
	@Test
	public void teste01_UsuarioCadastradoComSucesso() throws Exception {
		test = extent.startTest("Deve cadastrar novo usuario");
		paginaInicial.clica_MenuDeUsuario(driver);
		test.log(LogStatus.PASS, "Clicou no menu de usuario");
		assertTrue(driver.getPageSource().contains(Data.usuario()));
		test.log(LogStatus.PASS, "Novo usuario cadastrado com sucesso");
		ScreenShot.capture(driver, "UsuarioCadastradoComSucesso");
		test.log(LogStatus.PASS, "Print abaixo: " + test.addScreenCapture("C:\\Users\\gabriel.cardoso\\workspace\\AppiumTDD\\test-output\\Screenshot\\UsuarioCadastradoComSucesso.png"));
	}
	
	@Test
	public void teste02_UsuarioJaCadastrado() throws Exception {
		test = extent.startTest("Nao deve cadastrar usuario com nome ja existente");
		Thread.sleep(100);
		Assert.assertTrue(driver.getPageSource().contains("User name already exists"));
		test.log(LogStatus.PASS, "Mensagem de erro: nome de usuario ja cadastrado");
		ScreenShot.capture(driver, "UsuarioJaCadastrado");
		test.log(LogStatus.PASS, "Print abaixo: " + test.addScreenCapture("C:\\Users\\gabriel.cardoso\\workspace\\AppiumTDD\\test-output\\Screenshot\\UsuarioJaCadastrado.png"));
	}
	
	@After
	public void tearDown() throws Exception {
		AppManager.encerraAplicativo(driver);
	}
}
