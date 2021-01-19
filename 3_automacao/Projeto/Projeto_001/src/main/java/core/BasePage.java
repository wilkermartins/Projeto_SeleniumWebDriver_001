package core;

import static core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	/********* TextField e TextArea ************/

	public void escrever(By by, String texto) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto) {
		escrever(By.id(id_campo), texto);
	}

	public void texto(String id_campo, String texto) {
		escrever(By.name(id_campo), texto);
	}

	public String obterValorCampo(String id_campo) {
		return getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}

	public void escreverPorSpan(String texto, String identidade) {
		escrever(By.xpath("//span[contains(text(),'" + texto + "')]"), identidade);

	}

	public void escreverCpF(String Cpf) {
		escrever(By.xpath("//*[@id=\"root\"]/div/span/div/div[2]/section/div/form/div[2]/div[2]/div/div[5]/input"),
				Cpf);

	}

	public void escreverCpFCnpj(String CpfCnpj) {
		escrever(By.xpath(
				"//*[@id=\"root\"]/div/span/div/div[2]/section/div/form/div[2]/div[1]/div[2]/div[2]/div[1]/input"),
				CpfCnpj);

	}

	public void escreverEmail(String email) {
		escrever(By.xpath("//*[@id=\"root\"]/div/span/div/div[2]/section/div/form/div[2]/div[2]/div/div[3]/input"),
				email);

	}

	public void escreverIdentidade(String identidade) {
		escrever(By.xpath(
				"//*[@id=\"root\"]/div/span/div/div[2]/section/div/form/div[2]/div[1]/div[2]/div[2]/div[2]/input"),
				identidade);

	}

	public void escreverComplemento(String complemento) {
		escrever(By.xpath(
				"//*[@id=\"root\"]/div/span/div/div[2]/section/div/form/div[2]/div[2]/div/div[2]/div[1]/div/input"),
				complemento);

	}

	public void escreverNumero(String numero) {
		escrever(By.xpath(
				"//*[@id=\"root\"]/div/span/div/div[2]/section/div/form/div[2]/div[2]/div/div[2]/div[2]/div[1]/input"),
				numero);

	}

	public void escreverCidade(String cidade) {
		escrever(By.xpath(
				"//*[@id=\"root\"]/div/span/div/div[2]/section/div/form/div[2]/div[2]/div/div[2]/div[2]/div[2]/input"),
				cidade);

	}

	public void escreverEstado(String estado) {
		escrever(By.xpath(
				"//*[@id=\"root\"]/div/span/div/div[2]/section/div/form/div[2]/div[2]/div/div[2]/div[3]/div[1]/input"),
				estado);

	}

	public void escreverCodigoPostal(String cp) {
		escrever(By.xpath(
				"//*[@id=\"root\"]/div/span/div/div[2]/section/div/form/div[2]/div[2]/div/div[2]/div[4]/div/input"),
				cp);

	}

	/********* Radio e Check ************/

	public void clicarRadio(By by) {
		getDriver().findElement(by).click();
	}

	public void clicarRadio(String id) {
		clicarRadio(By.id(id));
	}

	public void clicarRadioName(String texto) {
		clicarRadio(By.name(texto));
	}

	/********* Combo ************/

	public void selecionarCombo(String id, String valor) {
		WebElement element = getDriver().findElement(By.name(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	/********* Botao ************/

	public void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}

	public void clicarBotao(String id) {
		clicarBotao(By.id(id));
	}

	public void clicarBotaoPorTexto(String texto) {
		clicarBotao(By.xpath("//button[.='" + texto + "']"));

	}

	public void clicarBotaoPorSpan(String texto) {
		clicarBotao(By.xpath("//span[contains(text(),'" + texto + "')]"));

	}

	public void clicarBotaoPorContains(String texto) {
		clicarBotao(By.xpath("//*[contains(text(),'" + texto + "')]"));

	}

	public void clicarBotaoFechar(String id) {
		clicarBotao(By.xpath("//button[.='" + id + "']"));

	}

	public void clicarBotaoSeletor(String selector) {
		clicarBotao(By.xpath("//*[@class='" + selector + "']/*"));

	}

	public void clicarBotaoAumentarG() {
		clicarBotao(By.xpath("//*[@id=\"root\"]/div/span/div/div[2]/section/div/form/div[1]/div[1]/div[2]/button[2]"));

	}

	public void clicarBotaoAumentarP() {
		clicarBotao(By.xpath("//*[@id=\"root\"]/div/span/div/div[2]/section/div/form/div[1]/div[2]/div[2]/button[2]"));

	}

	public String obterValueElemento(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	/********* Textos ************/

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}

	public String obterTextoValidacao(String txt) {
		return obterTexto(By.xpath(txt));
	}

	public String obterMensagem(String txt) {
		return obterTexto(By.id(txt));

	}

	/************** Waits *********************/

	public void waitPageLoadId(String id) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));

	}

	public void waitPageLoadSelector(String selector) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='" + selector + "']/*")));

	}

	public void waitPageLoadMensagem(String selector) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'" + selector + "')]")));

	}
}
