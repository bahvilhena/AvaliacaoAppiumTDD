package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Home_Page {

	static AndroidDriver<MobileElement> driver;
	private static WebDriverWait wait;

	public static MobileElement btnMenu(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/imageViewMenu");
	}

	public static MobileElement btnLogin(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewMenuUser");
	}

	public static MobileElement btnNovoUsuario(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewSingUpToday");
	}

	public static MobileElement btnHeadphone(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath(
				"[{\"key\":\"elementId\",\"value\":\"056a5606-312c-4088-b5e1-44b8e818fdf6\",\"name\":\"elementId\"},{\"key\":\"index\",\"value\":\"0\",\"name\":\"index\"},{\"key\":\"package\",\"value\":\"com.Advantage.aShopping\",\"name\":\"package\"},{\"key\":\"class\",\"value\":\"android.widget.ImageView\",\"name\":\"class\"},{\"key\":\"text\",\"value\":\"\",\"name\":\"text\"},{\"key\":\"resource-id\",\"value\":\"com.Advantage.aShopping:id/imageViewCategory\",\"name\":\"resource-id\"},{\"key\":\"checkable\",\"value\":\"false\",\"name\":\"checkable\"},{\"key\":\"checked\",\"value\":\"false\",\"name\":\"checked\"},{\"key\":\"clickable\",\"value\":\"true\",\"name\":\"clickable\"},{\"key\":\"enabled\",\"value\":\"true\",\"name\":\"enabled\"},{\"key\":\"focusable\",\"value\":\"false\",\"name\":\"focusable\"},{\"key\":\"focused\",\"value\":\"false\",\"name\":\"focused\"},{\"key\":\"long-clickable\",\"value\":\"false\",\"name\":\"long-clickable\"},{\"key\":\"password\",\"value\":\"false\",\"name\":\"password\"},{\"key\":\"scrollable\",\"value\":\"false\",\"name\":\"scrollable\"},{\"key\":\"selected\",\"value\":\"false\",\"name\":\"selected\"},{\"key\":\"bounds\",\"value\":\"[0,557][720,854]\",\"name\":\"bounds\"},{\"key\":\"displayed\",\"value\":\"true\",\"name\":\"displayed\"}]");
	}

	public static MobileElement btnLupa(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/imageViewSearch");
	}

	public static MobileElement boxLupa(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/editTextSearch");
	}
	

	
}