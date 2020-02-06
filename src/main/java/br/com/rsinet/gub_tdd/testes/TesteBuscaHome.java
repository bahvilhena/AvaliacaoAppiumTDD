package br.com.rsinet.gub_tdd.testes;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.rsinet.hub_tdd.actions.PesquisaHomeActions;
import br.com.rsinet.hub_tdd.driverFactory.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteBuscaHome {

	public  AndroidDriver<MobileElement> driver;
	
	@Before
	public  void InicioTeste() throws MalformedURLException {
		
		driver = (AndroidDriver<MobileElement>) DriverManager.InicializaDriver();
	}
	@Test
	public  void BuscaProdutoHome() throws InterruptedException {
	
	PesquisaHomeActions.Busca_Produto_Home(driver);
	}
		
	@After
	public  void FinalizaTeste() {
		
		driver = DriverManager.FinalizaDriver(driver);
	}
	}
	
