package br.com.rsinet.hub_tdd.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Cadastro {

	AndroidDriver<AndroidElement> driver;

	public static MobileElement boxUsuario(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath(
				"[{\"key\":\"elementId\",\"value\":\"cc82fc35-a3ed-464e-8018-2c5453ce6b01\",\"name\":\"elementId\"},{\"key\":\"index\",\"value\":\"1\",\"name\":\"index\"},{\"key\":\"package\",\"value\":\"com.Advantage.aShopping\",\"name\":\"package\"},{\"key\":\"class\",\"value\":\"android.widget.TextView\",\"name\":\"class\"},{\"key\":\"text\",\"value\":\"USER NAME\",\"name\":\"text\"},{\"key\":\"checkable\",\"value\":\"false\",\"name\":\"checkable\"},{\"key\":\"checked\",\"value\":\"false\",\"name\":\"checked\"},{\"key\":\"clickable\",\"value\":\"false\",\"name\":\"clickable\"},{\"key\":\"enabled\",\"value\":\"true\",\"name\":\"enabled\"},{\"key\":\"focusable\",\"value\":\"false\",\"name\":\"focusable\"},{\"key\":\"focused\",\"value\":\"false\",\"name\":\"focused\"},{\"key\":\"long-clickable\",\"value\":\"false\",\"name\":\"long-clickable\"},{\"key\":\"password\",\"value\":\"false\",\"name\":\"password\"},{\"key\":\"scrollable\",\"value\":\"false\",\"name\":\"scrollable\"},{\"key\":\"selected\",\"value\":\"false\",\"name\":\"selected\"},{\"key\":\"bounds\",\"value\":\"[79,432][656,511]\",\"name\":\"bounds\"},{\"key\":\"displayed\",\"value\":\"true\",\"name\":\"displayed\"}]");

	}

	public static MobileElement boxEmail(AndroidDriver<MobileElement> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText");
	}

	public static MobileElement boxSenha(AndroidDriver<MobileElement> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText");
	}

	public static MobileElement boxConfirmaSenha(AndroidDriver<MobileElement> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText");
	}

	public static MobileElement boxPrimeiroNome(AndroidDriver<MobileElement> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText");
	}

	public static MobileElement boxUltimoNome(AndroidDriver<MobileElement> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText");
	}

	public static MobileElement boxTelefone(AndroidDriver<MobileElement> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText");
	}

	public static MobileElement boxPais(AndroidDriver<MobileElement> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewCountries");
	}

	public static MobileElement boxEstado(AndroidDriver<MobileElement> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText");
	}

	public static MobileElement boxEndereco(AndroidDriver<MobileElement> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText");
	}

	public static MobileElement boxCidade(AndroidDriver<MobileElement> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText");
	}

	public static MobileElement boxCep(AndroidDriver<MobileElement> driver) {
		return (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText");
	}

	public static MobileElement btnRegistra(AndroidDriver<MobileElement> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/buttonRegister");
	}
	
}
