package br.com.rsinet.hub_tdd.testes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_tdd.driverFactory.ScreenObject;
import br.com.rsinet.hub_tdd.driverFactory.DriverManager;
import br.com.rsinet.hub_tdd.pageObjects.HomeScreen;
import br.com.rsinet.hub_tdd.pageObjects.PesquisaScreen;
import br.com.rsinet.hub_tdd.report.ExtendReport;
import br.com.rsinet.hub_tdd.utils.Constantes;
import br.com.rsinet.hub_tdd.utils.ExcelUtils;
import br.com.rsinet.hub_tdd.utils.MassaDados;

public class BuscaHome {
	
	private ExtentTest test;
	private WebDriver driver;
	private HomeScreen homeScreen;
	private MassaDados massaDados;
	private PesquisaScreen pesquisaScreen;
	
	@BeforeTest
	public void iniciaExtendReport() {
		ExtendReport.setExtent();
	}

	@BeforeMethod
	public void iniciaTeste() throws Exception {
		driver = DriverManager.iniciarApp();
		
		PageFactory.initElements(driver, this);
		ScreenObject manager = new ScreenObject(driver);
		homeScreen = manager.getHomeScreen();
		pesquisaScreen = manager.getPesquisaScreen();
		massaDados = manager.getMassaDados();
	}
	
	@Test
	public void testeDeBuscaPorTelaInicialSucesso() throws Exception {
		test = ExtendReport.createTest("PesquisaHomeSucesso");
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "Cadastro");
		
		homeScreen.clicarMenu();
		
		homeScreen.clicarLogin();
		
		homeScreen.preencherLogin(massaDados.UserName());
		homeScreen.preencherLogin(massaDados.Password());
		
		homeScreen.clicarBtnLogin();
		
//		homeScreen.clicaNoBt();
		
		homeScreen.clicarSpeakers();
		
		pesquisaScreen.selecionarProduto();
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "PesquisaCat");
		
		String condicao = massaDados.CondicaoAssertMassaSucesso();
		String mensagem = massaDados.MenssagemAssertMassaSucesso();
		
		String pass = pesquisaScreen.localizarProdutoNome(driver).getText();
		Assert.assertTrue(pass.equals(condicao), mensagem);
	}
	
	@Test
	public void testeDeBuscaPorTelaInicialFalha() throws Exception {
		test = ExtendReport.createTest("PesquisaHomeFalha");
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "Cadastro");
		
		homeScreen.clicarMenu();
		
		homeScreen.clicarLogin();
		
		homeScreen.preencherLogin(massaDados.UserName());
		homeScreen.preencherLogin(massaDados.Password());
		
		homeScreen.clicarBtnLogin();
		
//		homeScreen.clicaNoBt();
		
		homeScreen.clicarSpeakers();
		
		pesquisaScreen.selecionarProduto();
		
		pesquisaScreen.clicarQuantidade();
		
		pesquisaScreen.preencherQuantidade();
		
		pesquisaScreen.clicarAplicaQuantidade();
		
		pesquisaScreen.clicarAdicionarCarrinho();
		
		pesquisaScreen.clicarCarrinhoCompras();
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "PesquisaCat");
		
		String condicao = massaDados.CondicaoAssertMassaErro();
		String mensagem = massaDados.MenssagemAssertMassaErro();
		
		String pass = pesquisaScreen.encontrarQuantidadeComprada().getText();
		Assert.assertTrue(pass.equals(condicao), mensagem);
		
	}
	
	@AfterMethod
	public void finalizaTeste(ITestResult result) throws Exception {
		ExtendReport.tearDown(result, test, driver);
		DriverManager.fecharApp();
	}
	
	@AfterTest
	public void finalizaExtendReport() {
		ExtendReport.endReport();
	}

}
