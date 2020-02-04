package br.com.rsinet.hub_tdd.actions;

import br.com.rsinet.hub_tdd.pageObjects.Busca_Lupa;
import br.com.rsinet.hub_tdd.pageObjects.Home_Page;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaHomeActions {

	static TouchAction action;

	public static void ExecuteClickSearch(AndroidDriver<MobileElement> driver) {
		action = new TouchAction(driver);

		Home_Page.categorySpeaker(driver).click();
		Busca_Lupa.produto(driver).click();
//		ProductsPage.produtoText(driver).getText();
//		System.out.println(ProductsPage.produtoText(driver).getText());
//		Assert.assertEquals(ProductsPage.produtoText(driver).getText(), "HP ROAR MINI WIRELESS SPEAKER");
	}
}

