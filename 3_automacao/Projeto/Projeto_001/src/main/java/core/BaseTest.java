package core;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import pages.LoginPage;

public class BaseTest {

	@Rule
	public TestName testName = new TestName();

	private LoginPage page = new LoginPage();

	@Before
	public void inicializa() throws Exception {
		page.acessarTelaInicial();

	}

	@After
	public void finaliza() throws Exception {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		Files.copy(arquivo, new File(
				"target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));

		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}

}
