package br.com.rsinet.hub_tdd.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.rsinet.hub_tdd.tests.*;
import br.com.rsinet.hub_tdd.utils.ExtentReport;

@RunWith(Suite.class)
@SuiteClasses({CadastraUsuario.class, BuscaProdutoPelaLupa.class, BuscaPorMenu.class})
public class TestRunner {
	
	@BeforeClass
	public static void iniciaReport() {
		ExtentReport.iniciaReport();
	}
	
	@AfterClass
	public static void fecharReport() {
		ExtentReport.fechaReport();
	}

}