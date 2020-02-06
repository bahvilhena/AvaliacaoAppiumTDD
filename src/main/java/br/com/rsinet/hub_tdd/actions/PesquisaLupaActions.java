package br.com.rsinet.hub_tdd.actions;

import br.com.rsinet.hub_tdd.pageObjects.Busca_Lupa;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaLupaActions {

	static TouchAction action;
	
	@SuppressWarnings("rawtypes")
	public static void Busca_Lupa_Positivo(AndroidDriver<MobileElement> driver) throws InterruptedException {
		action = new TouchAction(driver);
		
		br.com.rsinet.hub_tdd.pageObjects.Busca_Lupa.produtoTexto(driver).sendKeys("HP ROAR WIRELESS");
		br.com.rsinet.hub_tdd.pageObjects.Busca_Lupa.produtoBusca(driver).click();
		br.com.rsinet.hub_tdd.pageObjects.Busca_Lupa.produtoLocalizado(driver).click();
		Thread.sleep(5000);
		
	}
	
	public static void Busca_Lupa_Negativo(AndroidDriver<MobileElement> driver) throws InterruptedException {
		action = new TouchAction(driver);
	
		br.com.rsinet.hub_tdd.pageObjects.Busca_Lupa.produtoTexto(driver).sendKeys("HP BALL FIRE");
		br.com.rsinet.hub_tdd.pageObjects.Busca_Lupa.produtoBusca(driver).click();
		Thread.sleep(5000);
	}
}
