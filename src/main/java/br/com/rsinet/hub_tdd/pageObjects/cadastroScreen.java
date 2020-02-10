package br.com.rsinet.hub_tdd.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_tdd.driverFactory.DriverManager;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class cadastroScreen {
	
	private WebDriver driver;
	
	public cadastroScreen(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	private MobileElement localizarUsuario() {
		MobileElement userName = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"));
		return userName;
	}
	
	public void preencherUsuario(String usuario) {
		localizarUsuario().click();
		localizarUsuario().sendKeys(usuario);
	}
	
	
	private MobileElement localizarEmail() {
		MobileElement email = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		return email;
	}
	
	public void preencherEmail(String Email) {
		localizarEmail().click();		
		localizarEmail().sendKeys(Email);
	}
	
	private MobileElement localizarSenha() {
		MobileElement password = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
		return password;
	}
	
	public void preencherSenha(String Senha) {
		localizarSenha().click();		
		localizarSenha().sendKeys(Senha);
	}
	
	private MobileElement localizarConfirmaSenha() {
		MobileElement confirmPassword = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		return confirmPassword;
	}
	
	public void preencherConfirmaSenha(String ConfirmaSenha) {
		localizarConfirmaSenha().click();		
		localizarConfirmaSenha().sendKeys(ConfirmaSenha);
	}
	
	private MobileElement localizarNome() {
		MobileElement firstName = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText"));
		return firstName;
	}
	
	public void preencherNome(String Nome) {
		localizarNome().click();		
		localizarNome().sendKeys(Nome);
	}
	
	private MobileElement localizarUltimoNome() {
		MobileElement lastName = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText"));
		return lastName;
	}
	
	public void preencherUltimoNome(String UltimoNome) {
		localizarUltimoNome().click();		
		localizarUltimoNome().sendKeys(UltimoNome);
	}
	
	private MobileElement localizarTelefone() {
		MobileElement phoneNumber = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		return phoneNumber;
	}
	
	public void preencherTelefone(String Telefone) {
		localizarTelefone().click();		
		localizarTelefone().sendKeys(Telefone);
	}
	
	private MobileElement localizarPais() {
		MobileElement country = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutCountry"));
		return country;
	}
	
	public void clicarPais() {
		localizarPais().click();
	}
	
	public void clicarBrasil(@SuppressWarnings("rawtypes") AndroidDriver driver, String visibleText) {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + visibleText + "\")"))
		.click();	
	}
	
	private MobileElement localizarEstado() {
		MobileElement state = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		return state;
	}
	
	public void preencherEstado(String Estado) {
		localizarEstado().click();	
		localizarEstado().sendKeys(Estado);	
	}
	
	private MobileElement localizarEndereço() {
		MobileElement address = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		return address;
	}
	
	public void preencherEndereço(String Estado) {
		localizarEndereço().click();	
		localizarEndereço().sendKeys(Estado);
	}
	
	private MobileElement localizarCidade() {
		MobileElement city = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText"));
		return city;
	}
	
	public void preencherCidade(String Cidade) {
		localizarCidade().click();	
		localizarCidade().sendKeys(Cidade);
	}
	
	private MobileElement localizarCEP() {
		MobileElement postalCode = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText"));
		return postalCode;
	}
	
	public void preencherCEP(String CEP) {
		localizarCEP().click();	
		localizarCEP().sendKeys(CEP);
	}
	
	private MobileElement localizarCheck() {
		MobileElement checkOffers = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/checkBoxRecieveOffers"));
		return checkOffers;
	}
	
	public void clicarCheck() {
		localizarCheck().click();
	}
	
	private MobileElement localizaRegistra() {
		MobileElement btnRegistra = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister"));
		return btnRegistra;
	}
	
	public MobileElement encontraSenhaErrada() {
		MobileElement tvPassword = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView"));
		return tvPassword;
	}

	public void clicarRegistra() {
		localizaRegistra().click();	
	}
	
	@SuppressWarnings("rawtypes")
	public void scroll(double inicio, double fim) throws Exception {
		Dimension size = DriverManager.getDriver().manage().window().getSize();

		int x = size.width / 2;
		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);
		new TouchAction((PerformsTouchActions) DriverManager.getDriver()).press(PointOption.point(x, start_y))
				.waitAction((WaitOptions.waitOptions(Duration.ofMillis(500))))//
				.moveTo(PointOption.point(x, end_y))//
				.release().perform();

	}
	
	
	
	public void scrollCountry(@SuppressWarnings("rawtypes") AndroidDriver driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))");
	}
	
}
