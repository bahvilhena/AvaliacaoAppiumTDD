package br.com.rsinet.gub_tdd.testes;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.rsinet.hub_tdd.actions.PesquisaLupaActions;
import br.com.rsinet.hub_tdd.driverFactory.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteBuscaPesquisa {

public AndroidDriver<MobileElement> driver;
	
	@Before
	public void InicioTeste() throws MalformedURLException {
		
		driver = (AndroidDriver<MobileElement>) DriverManager.InicializaDriver();
	}
	@Test
	public void Busca_Lupa_Positivo() throws InterruptedException {
	
	PesquisaLupaActions.Busca_Lupa_Positivo(driver);
	}
	
	@Test
	public void Busca_Lupa_Negativo() throws InterruptedException {
	
	PesquisaLupaActions.Busca_Lupa_Negativo(driver);
	}
		
	@After
	public void FinalizaTeste() {
		
		driver = DriverManager.FinalizaDriver(driver);
	}
	
}
