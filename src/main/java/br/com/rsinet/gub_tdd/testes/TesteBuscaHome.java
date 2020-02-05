package br.com.rsinet.gub_tdd.testes;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.actions.PesquisaHomeActions;
import br.com.rsinet.hub_tdd.driverFactory.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteBuscaHome {

	public static AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public static void InicioTeste() throws MalformedURLException {
		
		driver = (AndroidDriver<MobileElement>) DriverManager.InicializaDriver();
	}
	@Test
	public static void BuscaProdutoHome() throws InterruptedException {
	
	PesquisaHomeActions.Busca_Produto_Home(driver);
	}
		
	@AfterClass
	public static void FinalizaTeste() {
		
		driver = DriverManager.FinalizaDriver(driver);
	}
	}
	
