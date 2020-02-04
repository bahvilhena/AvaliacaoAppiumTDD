package br.com.rsinet.hub_tdd.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Busca_Lupa {

	static AndroidDriver<MobileElement> driver;

	public static MobileElement produto(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.widget.RelativeLayout[@content-desc=\"Speakers\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView");
	}

	public static MobileElement produtoTexto(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewProductName");
	}

	public static MobileElement produtoBusca(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]");
	}

	public static MobileElement naoLocalizado(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewNoProductsToShow");
	}

	
}
