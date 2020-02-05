package br.com.rsinet.hub_tdd.driverFactory;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {

	private static AndroidDriver<MobileElement> driver;

	public static AppiumDriver<MobileElement> InicializaDriver() throws MalformedURLException {
		if (driver == null) {

			DesiredCapabilities cap = new DesiredCapabilities();

			cap.setCapability("deviceName", "Nexus 5X");
			cap.setCapability("udid", "emulator-5554");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "9.0");

			cap.setCapability("appPackage", "com.Advantage.aShopping");
			cap.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AndroidDriver<MobileElement>(url, cap);

		}
		return driver;

	}

	public static AndroidDriver<MobileElement> FinalizaDriver(WebDriver driver) {

		if (null != driver)
			driver.quit();
		return null;
	}

}
