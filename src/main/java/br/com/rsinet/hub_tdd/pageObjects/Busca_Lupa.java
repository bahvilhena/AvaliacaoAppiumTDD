package br.com.rsinet.hub_tdd.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Busca_Lupa {

	static AndroidDriver<MobileElement> driver;

	public static MobileElement produtoLocalizado(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/imageViewProduct");
	}

	public static MobileElement produtoTexto(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/editTextSearch");
		
	}

	public static MobileElement produtoBusca(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/imageViewSearch");
	}

//	public static MobileElement naoLocalizado(AndroidDriver<?> driver) {
//		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewNoProductsToShow");
//	}

	
}
