package tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import core.BasePage;
import core.BaseTest;
import pages.CompraPage;
import pages.MenuPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompraTest extends BaseTest {

	private static WebDriver driver;

	private BasePage base = new BasePage();
	private MenuPage menu = new MenuPage();
	private CompraPage comPage = new CompraPage();

	@Test
	public void comprarIngresso_tst_001() throws InterruptedException {

		menu.acessarTelaCompra();

		Thread.sleep(5000);
		base.clicarBotaoAumentarG();
		base.clicarBotaoPorSpan("Continuar");
		Thread.sleep(5000);
		comPage.setCredencial("João de Souza");
		comPage.setNomeCracha("João");
		comPage.setEmail("wilkersmartins@gmail.com");
		comPage.setTelefone("47999939048");
		Thread.sleep(5000);
		comPage.setArea("Tecnologia");
		comPage.setCPF("19100000000");
		comPage.setContinuarCompra();

		base.waitPageLoadMensagem("Seus ingressos estão garantidos");
		Assert.assertEquals("Seus ingressos estão garantidos", comPage.obterMensagemSucesso_001());
		comPage.setVoltar();
	}

	@Test
	public void comprarIngresso_tst_002() throws InterruptedException {

		Thread.sleep(5000);
		menu.acessarTelaCompra();

		Thread.sleep(10000);
		base.clicarBotaoAumentarP();
		base.clicarBotaoPorSpan("Continuar");
		Thread.sleep(5000);
		comPage.setNome("Maria de Souza");
		comPage.setCpfCnpj("19100000000");
		comPage.setEmail("wilkersmartins@gmail.com");
		comPage.setTelefone("4799858000");
		comPage.setCredencial("Maria de Souza");
		comPage.setNomeCracha("Maria");
		comPage.setEmailP("mariasouza@gmail.com");
		Thread.sleep(5000);
		comPage.setAreaV("Vendas");
		comPage.setCPF("19100000000");
		comPage.setContinuarCompra();
		Thread.sleep(5000);
		base.clicarBotaoPorContains("Boleto bancário");
		comPage.setCep("89036820");
		Thread.sleep(5000);
		comPage.setNumero("8000");
		comPage.setComplementoN("Casa");
		comPage.setFinalizarCompra();

		base.waitPageLoadMensagem("Seus ingressos estão reservados até o pagamento");
		Assert.assertEquals("Seus ingressos estão reservados até o pagamento", comPage.obterMensagemSucesso_002());
		comPage.setVoltar();
	}

	@Test
	public void comprarIngresso_tst_003() throws InterruptedException {

		Thread.sleep(5000);
		menu.acessarTelaCompra();

		Thread.sleep(5000);
		base.clicarBotaoAumentarP();
		base.clicarBotaoPorSpan("Continuar");
		Thread.sleep(5000);
		base.clicarBotaoPorSpan("Não sou brasileiro");
		comPage.setNome("Paul Klein");
		comPage.setIdetidade("8989500");
		comPage.setCPF("19100000000");
		comPage.setEmail("wilkersmartins@gmail.com");
		comPage.setTelefone("4799858000");
		comPage.setCredencial("Klein, Paul");
		comPage.setNomeCracha("Paul");
		comPage.setEmailP("wilkersmartins@gmail.com");
		Thread.sleep(5000);
		comPage.setArea("Marketing");
		comPage.escreverCpF("00019100000");
		comPage.setContinuarCompra();
		Thread.sleep(5000);
		comPage.setCartaoCredito("4232423242324232");
		comPage.setCodigoVerificador("400");
		comPage.setDataValidade("1124");
		comPage.setNomeImpresso("Paul Klein");
		comPage.escreverComplemento("Street west");
		comPage.escreverNumero("200");
		comPage.escreverCidade("New York");
		comPage.escreverEstado("New York");
		Thread.sleep(5000);
		comPage.selecionarCombo("countryCode", "Estados Unidos");
		comPage.escreverCodigoPostal("187895");
		comPage.setFinalizarCompra();
		Thread.sleep(10000);
		base.waitPageLoadMensagem("Pagamento não realizado");

		Assert.assertEquals(
				"Pagamento não realizado. Por favor revise seus dados de pagamento ou entre em contato com seu banco ou operadora de cartão de crédito.",
				comPage.obterMensagemSucesso_003());
	}

}
