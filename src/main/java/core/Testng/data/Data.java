package core.Testng.data;

import org.testng.annotations.DataProvider;

public class Data {

	@DataProvider(name = "values")
	public Object[][] getData() {
		return new Object[][] { { "str1", "str2" }, { "str3", "str4" }, { "str5", "str6" } };
	}
}
