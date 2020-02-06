package br.com.rsinet.hub_tdd.actions;

import br.com.rsinet.hub_tdd.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.pageObjects.Produto_Home;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaHomeActions {

	@SuppressWarnings("rawtypes")
	static TouchAction action;

	@SuppressWarnings("rawtypes")
	public static void Busca_Produto_Home(AndroidDriver<MobileElement> driver) throws InterruptedException {
		action = new TouchAction(driver);

		Home_Page.btnLaptops(driver).click();
		Thread.sleep(5000);
		Produto_Home.produtoHP(driver).click();
//		ProductsPage.produtoText(driver).getText();
//		System.out.println(ProductsPage.produtoText(driver).getText());
//		Assert.assertEquals(ProductsPage.produtoText(driver).getText(), "HP ROAR MINI WIRELESS SPEAKER");
	}
}

