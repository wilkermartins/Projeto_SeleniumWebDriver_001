package pages;


import core.BasePage;

public class MenuPage extends BasePage {

	public void acessarTelaCompra() throws InterruptedException {
		
		waitPageLoadId("onesignal-popover-cancel-button");
		clicarBotao("onesignal-popover-cancel-button");
		Thread.sleep(5000);
		clicarBotaoSeletor("c01202");
		Thread.sleep(5000);
		clicarBotaoPorSpan("Inscreva-se");

	}

}
