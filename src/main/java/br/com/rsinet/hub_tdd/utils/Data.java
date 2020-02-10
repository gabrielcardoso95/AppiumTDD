package br.com.rsinet.hub_tdd.utils;

public class Data {
	
	public static String produtoValido() throws Exception {
		return ExcelUtils.getCellData(6, 0);
	}

	public static String produtoValido02() throws Exception {
		return ExcelUtils.getCellData(2, 0);
	}
	
	public static String produtoInvalido() throws Exception {
		return ExcelUtils.getCellData(1, 1);
	}
	
	public static String usuario() throws Exception {
		return ExcelUtils.getCellData(1, 0);
	}
	
	public static String email() throws Exception {
		return ExcelUtils.getCellData(1, 1);
	}
	
	public static String senha() throws Exception {
		return ExcelUtils.getCellData(1, 2);
	}
	
	public static String nome() throws Exception {
		return ExcelUtils.getCellData(1, 3);
	}
	
	public static String sobrenome() throws Exception {
		return ExcelUtils.getCellData(1, 4);
	}
	
	public static String telefone() throws Exception {
		return ExcelUtils.getCellData(1, 5);
	}
	
	public static String pais() throws Exception {
		return ExcelUtils.getCellData(1, 6);
	}
	
	public static String estado() throws Exception {
		return ExcelUtils.getCellData(1, 7);
	}
	
	public static String endereco() throws Exception {
		return ExcelUtils.getCellData(1, 8);
	}
	
	public static String cidade() throws Exception {
		return ExcelUtils.getCellData(1, 9);
	}
	
	public static String cep() throws Exception {
		return ExcelUtils.getCellData(1, 10);
	}
	
}