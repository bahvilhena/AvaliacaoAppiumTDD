package br.com.rsinet.hub_tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;

public class PesquisaScreen {

	private WebDriver driver;
	
	public PesquisaScreen(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	private MobileElement localizarProduto(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		MobileElement localizarProduto = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout/android.widget.ImageView")));
		return localizarProduto;
	}
	
	public void clicarProduto() {
		localizarProduto(driver).click();
	}
	
	public MobileElement localizarProdutoNome(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		MobileElement localizarProdutoNome = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/textViewProductName")));
		return localizarProdutoNome;
	}
	
	public MobileElement localizarPesquisa(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		MobileElement localizarPesquisa = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")));
		return localizarPesquisa;
	}
	
	private MobileElement selecionarProduto(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		MobileElement localizarProdutoCategoria = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Speakers\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView")));
		return localizarProdutoCategoria;
	}
	
	public void selecionarProduto() {
		selecionarProduto(driver).click();
	}
	
	private MobileElement selecionarQuantidade() {
		MobileElement selecionarQuantidade = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity"));
		return selecionarQuantidade;
	}
	
	public void clicarQuantidade() {
		selecionarQuantidade().click();
	}
	
	private MobileElement localizarQuantidadeCompra() {
		MobileElement localizarQuantidadeCompra = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
		return localizarQuantidadeCompra;
	}
	
	public void preencherQuantidade() {
		localizarQuantidadeCompra().click();
		localizarQuantidadeCompra().clear();
		localizarQuantidadeCompra().sendKeys("12");
	}
	
	private MobileElement localizaQuantidade() {
		MobileElement localizarAplicaQuantidade = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/textViewApply"));
		return localizarAplicaQuantidade;
	}
	
	public void clicarAplicaQuantidade() {
		localizaQuantidade().click();
	}
	
	private MobileElement localizarAdicionarCarrinho() {
		MobileElement localizarAdicionarCarrinho = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));
		return localizarAdicionarCarrinho;
	}
	
	public void clicarAdicionarCarrinho() {
		localizarAdicionarCarrinho().click();
	}
	
	private MobileElement localizarCarrinhoCompras() {
		MobileElement localizarCarrinhoCompras = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/imageViewCart"));
		return localizarCarrinhoCompras;
	}
	
	public void clicarCarrinhoCompras() {
		localizarCarrinhoCompras().click();
	}
	
	public MobileElement encontrarQuantidadeComprada() {
		MobileElement encontrarQuantidadeDeCompra = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/textViewCartQuantity"));
		return encontrarQuantidadeDeCompra;
	}
	
}
