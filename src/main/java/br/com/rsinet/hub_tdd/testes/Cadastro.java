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
import br.com.rsinet.hub_tdd.pageObjects.cadastroScreen;
import br.com.rsinet.hub_tdd.pageObjects.HomeScreen;
import br.com.rsinet.hub_tdd.report.ExtendReport;
import br.com.rsinet.hub_tdd.utils.Constants;
import br.com.rsinet.hub_tdd.utils.ExcelUtils;
import br.com.rsinet.hub_tdd.utils.MassaDados;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Cadastro {

	private WebDriver driver;
	private cadastroScreen cadastroScreen;
	private HomeScreen homeScreen;
	private ExtentTest test;
	private MassaDados massaDados;
	
	@BeforeTest
	public void extendReport() {
		ExtendReport.setExtent();
	}

	@BeforeMethod
	public void iniciaTeste() throws Exception {
		driver = DriverManager.iniciarApp();
		
		ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData, "Cadastro");
		PageFactory.initElements(driver, this);
		ScreenObject manager = new ScreenObject(driver);
		cadastroScreen = manager.getCadastroScreen();
		homeScreen = manager.getHomeScreen();
		massaDados = manager.getMassaDados();
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void testeDeCadastroSucesso() throws Exception {
		test = ExtendReport.createTest("CadastroSucesso");
		
		homeScreen.clicarMenu();
		
		homeScreen.clicarLogin();
		
		homeScreen.clicarNovaConta();

		cadastroScreen.preencherUsuario(massaDados.UserName());
		
		cadastroScreen.preencherEmail(massaDados.Email());
		
		
		cadastroScreen.preencherSenha(massaDados.Password());
		
		cadastroScreen.preencherConfirmaSenha(massaDados.ConfirmPassword());

		
		cadastroScreen.preencherNome(massaDados.FirstName());
		
		cadastroScreen.preencherUltimoNome(massaDados.LastName());
		
		cadastroScreen.preencherTelefone(massaDados.Telefone());
		
		cadastroScreen.scroll(0.9, 0.0);
		
		cadastroScreen.clicarPais();	
		
		cadastroScreen.scrollCountry((AndroidDriver) driver, "Brazil");
		
		cadastroScreen.clicarBrasil((AndroidDriver) driver, "Brazil");
		
		cadastroScreen.preencherEstado(massaDados.Estado());
		
		cadastroScreen.preencherEndereço(massaDados.Endereco());
		
		cadastroScreen.preencherCidade(massaDados.Cidade());

		cadastroScreen.preencherCEP(massaDados.Cep());
		
		cadastroScreen.clicarCheck();	

		cadastroScreen.clicarRegistra();
		
		homeScreen.clicarMenu();
		
		String mensagem = massaDados.MenssagemAssertCadastroSucesso();
		String condicao = massaDados.UserName();
		
		String pass = homeScreen.fazerLogo().getText();
		
		Assert.assertTrue(pass.equals(condicao), mensagem);
	}
	
	@Test
	public void testeDeCadastroFalha() throws Exception {
		test = ExtendReport.createTest("CadastroFalha");

		homeScreen.clicarMenu();
		
		homeScreen.clicarLogin();
		
		homeScreen.clicarNovaConta();

		cadastroScreen.preencherUsuario(massaDados.UserName());
		
		cadastroScreen.preencherEmail(massaDados.Email());
		
		cadastroScreen.preencherSenha(massaDados.Password());
		
		cadastroScreen.preencherConfirmaSenha(massaDados.ConfirmPasswordErrado());
		
		cadastroScreen.preencherNome(massaDados.FirstName());
	
		String condicao = massaDados.CondicaoAssertCadastroErro();
		String mensagem = massaDados.MenssagemAssertCadastroErro();
		String pass = cadastroScreen.encontraSenhaErrada().getText();
		

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
