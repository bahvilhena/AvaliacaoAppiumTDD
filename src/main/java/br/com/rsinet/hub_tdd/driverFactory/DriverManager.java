package br.com.rsinet.hub_tdd.driverFactory;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DriverManager {

	public static WebDriver driver;
	
	public static WebDriver getDriver() throws Exception {
		return (driver == null) ? iniciarApp() : driver; 
	}

	@SuppressWarnings({ "rawtypes" })
	public static WebDriver iniciarApp() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Nexus 5X");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("unicodeKeyboard", true);
		cap.setCapability("resetKeyboard", true);
		cap.setCapability("platformVersion", "9.0");
		cap.setCapability("appPackage", "com.Advantage.aShopping");
		cap.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}

	
	public static void fecharApp() {
		if (driver != null) {	
			driver.quit();
			driver = null;
		}
	}
}
