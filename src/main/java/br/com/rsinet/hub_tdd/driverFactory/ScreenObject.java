package br.com.rsinet.hub_tdd.driverFactory;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.pageObjects.cadastroScreen;
import br.com.rsinet.hub_tdd.pageObjects.HomeScreen;
import br.com.rsinet.hub_tdd.pageObjects.PesquisaScreen;
import br.com.rsinet.hub_tdd.utils.MassaDados;

public class ScreenObject {
	
	private WebDriver driver;
	
	private HomeScreen homeScreen;
	private cadastroScreen cadastroScreen;
	private PesquisaScreen pesquisaScreen;
	private MassaDados massaDados;
	
	
	public ScreenObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomeScreen getHomeScreen() {
		return (homeScreen == null) ? homeScreen = new HomeScreen(driver) : homeScreen;
	}
	
	public cadastroScreen getCadastroScreen() {
		return (cadastroScreen == null) ? cadastroScreen = new cadastroScreen(driver) : cadastroScreen;
	}
	
	public PesquisaScreen getPesquisaScreen() {
		return (pesquisaScreen == null) ? pesquisaScreen = new PesquisaScreen(driver) : pesquisaScreen;
	}
	
	public MassaDados getMassaDados() {
		return (massaDados == null) ? massaDados = new MassaDados(driver) : massaDados;
	}

}
