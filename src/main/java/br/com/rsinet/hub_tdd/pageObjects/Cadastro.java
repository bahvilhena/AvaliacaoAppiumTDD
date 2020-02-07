package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class Cadastro {

	static AndroidDriver<WebElement> driver;
	public TouchAction action;
	WebElement element;

	@SuppressWarnings("unchecked")
	public Cadastro(WebDriver driver) {

		driver = (AndroidDriver<MobileElement>) driver;

	}

	public void Register_Screen(AndroidDriver<WebElement> driver) {
		this.driver = driver;
		action = new TouchAction(driver);

	}

	private WebElement boxUsuario() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText");
	}

	private WebElement boxEmail() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText");
	}

	private WebElement boxSenha() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText");
	}

	private WebElement boxConfirmaSenha() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText");
	}

	private WebElement boxPrimeiroNome() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText");
	}

	private WebElement boxUltimoNome() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText");
	}

	private WebElement boxTelefone() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText");
	}

	private WebElement boxPais() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]");
	}

	private WebElement selecionarPais(String nomeDoPais) {
		return driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ nomeDoPais + "\").instance(0))");
	}

	private WebElement boxEstado() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText");
	}

	private WebElement boxEndereco() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText");
	}

	private WebElement boxCidade() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText");
	}

	private WebElement boxCep() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText");
	}

	private WebElement btnTermos() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.CheckBox[2]");
	}

	private WebElement btnRegistra() {
		return driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");
	}

	public void preencheUsuario(String usuario) {
		boxUsuario().sendKeys("braulio");
	}

	public void preencheEmail(String email) {
		boxEmail().sendKeys("braulio@braulio.com");
	}

	public void preencheSenha(String senha) {
		boxSenha().sendKeys("Bra899");
	}

	public void preencheConfirmaSenha(String senha) {
		boxConfirmaSenha().sendKeys("Bra899");
	}

	public void preenchePrimeiroNome(String nome) {
		boxPrimeiroNome().sendKeys("braull");
	}

	public void preencheUltimoNome(String sobrenome) {
		boxUltimoNome().sendKeys("villl");
	}

	public void preencheTelefone(String telefone) {
		boxTelefone().sendKeys("2255556666");
	}

	public void rolarEndereco() {
		action.press(PointOption.point(860, 1400)).moveTo(PointOption.point(814, 400)).release().perform();
	}

	public void selecionaPais(String nomeDoPais) {
		boxPais().click();

		boolean achouPais = false;

		while (achouPais == false) {
			try {
				selecionarPais("brasil").click();
				achouPais = true;
				break;
			} catch (Exception e) {
				(new TouchAction(driver)).press(PointOption.point(677, 1139)).moveTo(PointOption.point(693, 315))
						.release().perform();
			}
		}
	}

	public void preencheEstado(String estado) {
		boxEstado().sendKeys("sul cata");
	}

	public void preencheEndereco(String endereco) {
		boxEndereco().sendKeys("rua cata 678");
	}

	public void preencheCidade(String cidade) {
		boxCidade().sendKeys("sul cati");
	}

	public void preencheCep(String cep) {
		boxCep().sendKeys("02122333");
	}

	public void rolarCadastro() {
		action.press(PointOption.point(668, 1030)).moveTo(PointOption.point(672, 387)).release().perform();
	}

	public void submeteCadastro() {
		btnRegistra().click();
	}
}
