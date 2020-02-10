package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;

public class HomeScreen {
	
	private WebDriver driver;
	
	public HomeScreen(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	private MobileElement localizarMenu(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		MobileElement localizarMenu = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/imageViewMenu")));
		return localizarMenu;
	}
	
	public void clicarMenu() {
		localizarMenu(driver).click();
	}
	
	public void clicarLogin() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).click();
	}
	
	public void clicarNovaConta() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewDontHaveAnAccount")).click();
	}
	
	public MobileElement fazerLogo() {
		MobileElement fazerLogo = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
		return fazerLogo;
	}
	
	private MobileElement localizarPesquisa() {
		MobileElement localizarPesquisa = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));
		return localizarPesquisa;
	}
	
	public void preencherPesquisa(String barraPesquisa) {
		localizarPesquisa().click();
		localizarPesquisa().sendKeys(barraPesquisa);
	}
	
	private MobileElement localizarLupa() {
		MobileElement localizarLupa = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));
		return localizarLupa;
	}
	
	public void clicarLupa() {
		localizarLupa().click();
	}
	
	private MobileElement encontraSpeakers() {
		MobileElement encontraSpeakers = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView"));
		return encontraSpeakers;
	}
	
	public void clicarSpeakers() {
		encontraSpeakers().click();
	}
	
	private MobileElement localizarLogin() {
		MobileElement localizarLogin = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText"));
		return localizarLogin;
	}
	
	public void preencherLogin(String login) {
		localizarLogin().click();
		localizarLogin().sendKeys(login);
	}
	
	private MobileElement localizarSenhaLogin() {
		MobileElement localizarLogin = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText"));
		return localizarLogin;
	}
	
	public void preencherSenhaLogin(String SenhaLogin) {
		localizarSenhaLogin().click();
		localizarSenhaLogin().sendKeys(SenhaLogin);
	}
	
	private MobileElement localizarBtnLogin() {
		MobileElement localizarBtnLogin = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/buttonLogin"));
		return localizarBtnLogin;
	}
	
	public void clicarBtnLogin() {
		localizarBtnLogin().click();
	}
	
	private MobileElement localizarBtn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		MobileElement localizarBtn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]")));
		return localizarBtn;
	}
	
	public void clicaBtn() throws InterruptedException {
		localizarBtn(driver).click();
	}
	
	
}