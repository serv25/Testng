package core.Testng.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParametersXML {

	@BeforeClass
	@org.testng.annotations.Parameters({ "browser", "platform" })
	public void beforeClass(String browser, String platform) {
		System.out.println("Browser = " + browser);
		System.out.println("Platform = " + platform);
	}

	@Test
	@org.testng.annotations.Parameters({ "response" })
	public void test(String response) {
		String[] arr = response.split(",");
		for (String responseCode : arr) {
			System.out.println("Response code = " + responseCode);
		}

	}

}
