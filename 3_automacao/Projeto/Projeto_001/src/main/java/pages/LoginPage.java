package pages;

import core.BasePage;
import core.DriverFactory;

public class LoginPage extends BasePage {

	public void acessarTelaInicial() throws Exception {
		DriverFactory.getDriver().get("https://evento.moblee.com.br/ByKtijSZQ");

	}

}
