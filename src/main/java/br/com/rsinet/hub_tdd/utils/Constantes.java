package br.com.rsinet.hub_tdd.utils;

public class Constantes {

	/*
	 * Comando responsavel por identificar a url do site que serão aplicados a massa
	 * de dados.
	 */
	public static final String URL = "http://advantageonlineshopping.com/#/";
	/*
	 * Comando responsavel por identificar o endereço do arquivo para manipulação da
	 * massa de dados.
	 */
	public static final String Path_TestData = "C:\\Users\\rodrigo.vilhena\\Documents\\Appium\\TDD\\tdd\\";
	/*
	 * Comando responsavel por identificar o nome do arquivo de manipulação de massa
	 * de dados.
	 */
	public static final String File_TestData = "cadastroappium.xlsx";

	/*
	 * Área onde são identificados as celulas de dentro do arquivo de massa de dados
	 * através da coluna e armazenados nas variaveis.
	 */
	// Cadastro
	public static final int userName = 1;

	public static final int email = 1;

	public static final int password = 1;

	public static final int confirmPassword = 1;

	public static final int confirmInvalidPassword = 1;

	public static final int firstName = 1;

	public static final int lastName = 1;

	public static final int telefone = 1;

	public static final int pais = 1;

	public static final int cidade = 1;

	public static final int endereco = 1;

	public static final int estado = 1;

	public static final int cep = 1;

	public static final int mensagemAssertCadastroSucesso = 5;

	public static final int condicaoAssertCadastroErro = 5;

	public static final int mensagemAssertCadastroErro = 5;

	// PesquisaCat
	public static final int userNameCat = 1;

	public static final int passwordCat = 1;

	public static final int quantidadeCat = 1;

	public static final int condicaoAssertMassaSucesso = 4;

	public static final int mensagemAssertMassaSucesso = 4;

	public static final int condicaoAssertMassaErro = 4;

	public static final int mensagemAssertMassaErro = 4;

	public static final int clicaProduto = 1;

	// PesquisaBarra
	public static final int pesquisaBarra = 1;

	public static final int escolheProduto = 1;

	public static final int pesquisaBarraErro = 1;

	public static final int condicaoAssertBarra = 4;

	public static final int mensagemAssertBarra = 4;

	// Pagamento
	public static final int userNamePay = 1;

	public static final int passwordPay = 1;
}
