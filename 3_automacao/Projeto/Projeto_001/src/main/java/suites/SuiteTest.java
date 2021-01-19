package suites;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import core.DriverFactory;
import pages.LoginPage;
import tests.CompraTest;

@RunWith(Suite.class)
@SuiteClasses({

	CompraTest.class

})
public class SuiteTest {

	private static LoginPage page = new LoginPage();

	@BeforeClass
	public static void reset() throws Exception {
		page.acessarTelaInicial();

		DriverFactory.killDriver();
	}
}
