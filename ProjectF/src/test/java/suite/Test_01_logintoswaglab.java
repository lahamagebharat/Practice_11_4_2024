package suite;

import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class Test_01_logintoswaglab extends Common {

	@Test
	void loginscript(

	) {

		LoginPage obj = new LoginPage(d);
		obj.logintobrowser();

	}

}
