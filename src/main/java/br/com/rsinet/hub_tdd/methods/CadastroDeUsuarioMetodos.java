package br.com.rsinet.hub_tdd.methods;


import br.com.rsinet.hub_tdd.pageObjects.PaginaDeCadastro;
import br.com.rsinet.hub_tdd.utils.Data;
import br.com.rsinet.hub_tdd.utils.Scroll;
import io.appium.java_client.android.AndroidDriver;

public class CadastroDeUsuarioMetodos {
	PaginaDeCadastro informacoesCadastrais = new PaginaDeCadastro();
	AndroidDriver<?> driver;
	
	public void preenche_NomeDeUsuario(AndroidDriver<?> driver) throws Exception {
		informacoesCadastrais.cx_NomeDeUsuario(driver).sendKeys(Data.usuario());
	}

	public void preenche_EmailDeUsuario(AndroidDriver<?> driver) throws Exception {
		PaginaDeCadastro.cx_EmailDeUsuario(driver).sendKeys(Data.email());
	}

	public void preenche_Senha(AndroidDriver<?> driver) throws Exception {
		PaginaDeCadastro.cx_Senha(driver).sendKeys(Data.senha());
	}

	public void confirma_Senha(AndroidDriver<?> driver) throws Exception {
		PaginaDeCadastro.cx_ConfirmaSenha(driver).sendKeys(Data.senha());
	}

	public void preenche_PrimeiroNome(AndroidDriver<?> driver) throws Exception {
		PaginaDeCadastro.cx_PrimeiroNome(driver).sendKeys(Data.nome());
	}

	public void preenche_Sobrenome(AndroidDriver<?> driver) throws Exception {
		PaginaDeCadastro.cx_SobreNome(driver).sendKeys(Data.sobrenome());
	}

	public void preenche_NumeroDeTelefone(AndroidDriver<?> driver) throws Exception {
		PaginaDeCadastro.cx_NumeroDeTelefone(driver).sendKeys(Data.telefone());
	}

	public void preenche_EstadoProvinciaRegiao(AndroidDriver<?> driver) throws Exception {
		PaginaDeCadastro.cx_EstadoProvinciaRegiao(driver).sendKeys(Data.estado());
	}

	public void preenche_Endereço(AndroidDriver<?> driver) throws Exception {
		PaginaDeCadastro.cx_Endereço(driver).sendKeys(Data.endereco());
	}

	public void preenche_CaixaPostal(AndroidDriver<?> driver) throws Exception {
		PaginaDeCadastro.cx_CaixaPostal(driver).sendKeys(Data.cep());
	}

	public void preenche_Cidade(AndroidDriver<?> driver) throws Exception {
		PaginaDeCadastro.cx_Cidade(driver).sendKeys(Data.cidade());
	}

	public void seleciona_Pais(AndroidDriver<?> driver) throws Exception {
		PaginaDeCadastro.cx_Pais(driver).click();
		Scroll.scrollAndClick(driver, Data.pais());
	}

	public void desce_Pagina(AndroidDriver<?> driver) throws Exception {
		Scroll.scroll(driver, "REGISTER");
	}
	
	public void clica_Registrar(AndroidDriver<?> driver) throws Exception {
		PaginaDeCadastro.btn_Registrar(driver).click();
	}
}
