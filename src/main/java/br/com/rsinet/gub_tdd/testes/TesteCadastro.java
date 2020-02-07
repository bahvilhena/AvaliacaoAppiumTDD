package br.com.rsinet.gub_tdd.testes;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

import br.com.rsinet.hub_tdd.driverFactory.DriverManager;
import br.com.rsinet.hub_tdd.pageObjects.Cadastro;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteCadastro {

public AndroidDriver<MobileElement> driver;
private Cadastro cadastro;

	@Before
	public void InicioTeste() throws MalformedURLException {
		cadastro = new Cadastro(driver);
		driver = (AndroidDriver<MobileElement>) DriverManager.InicializaDriver();
	}
	@Test
	public void Cadastro_Positivo() throws InterruptedException {
		
		cadastro.preencheUsuario(usuario);
		
		
		
	}
		
}
