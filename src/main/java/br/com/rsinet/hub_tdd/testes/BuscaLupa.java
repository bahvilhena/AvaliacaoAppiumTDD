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

public class BuscaLupa {
	
	private ExtentTest test;
	private WebDriver driver;
	private HomeScreen homeScreen;
	private MassaDados massaDados;
	private PesquisaScreen pesquisaScreen;
	
	@BeforeTest
	public void extendReport() {
		ExtendReport.setExtent();
	}

	@BeforeMethod
	public void iniciaTeste() throws Exception {
		driver = DriverManager.iniciarApp();
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "PesquisaBarra");
		PageFactory.initElements(driver, this);
		ScreenObject manager = new ScreenObject(driver);
		homeScreen = manager.getHomeScreen();
		pesquisaScreen = manager.getPesquisaScreen();
		massaDados = manager.getMassaDados();
	}
	
	@Test
	public void testeDeBuscaPorLupaSucesso() throws Exception {
		test = ExtendReport.createTest("PesquisaBarraSucesso");
		
		homeScreen.preencherPesquisa(massaDados.PesquisaNaBarra());
		
		homeScreen.clicarLupa();
		
		pesquisaScreen.clicarProduto();
		
		String condicao = massaDados.CondicaoAssertBarra();
		String mensagem = massaDados.MenssagemAssertBarra();
		
		String pass = pesquisaScreen.localizarProdutoNome(driver).getText();
		Assert.assertTrue(pass.equals(condicao), mensagem);
	}
	
	@Test
	public void testeDeBuscaPorLupaFalha() throws Exception {
		test = ExtendReport.createTest("PesquisaBarraFalha");
		
		homeScreen.preencherPesquisa(massaDados.PesquisaNaBarraErro());
		
		homeScreen.clicarLupa();
		
		String elemento = massaDados.PesquisaNaBarraErro();
		String resposta = pesquisaScreen.localizarPesquisa(driver).getText();
		Assert.assertTrue(resposta.equals("- No results for " + "\"" + elemento + "\" -"),
				"Nenhum resultado encontrado para " + elemento + "!");
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
