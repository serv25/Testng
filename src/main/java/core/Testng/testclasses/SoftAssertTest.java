package core.Testng.testclasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import core.Testng.appcode.App;

public class SoftAssertTest {

	@Test
	public void testSum() {
		SoftAssert softAssert = new SoftAssert();
		App app = new App();
		int actual = app.sumNumbers(1, 2);

		softAssert.assertEquals(actual, 2);
		System.out.println("\n Line after assert 1");

		softAssert.assertEquals(actual, 3);
		System.out.println("\n Line after assert 2");

		softAssert.assertAll();
	}

}
