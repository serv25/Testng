package core.Testng.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider(name = "values")
	public Object[][] getData() {
		return new Object[][] { { "str1", "str2" }, { "str3", "str4" }, { "str5", "str6" } };
	}

	@Test(dataProvider = "values")
	public void test1(String value1, String value2) {
		System.out.println("Value1 = " + value1);
		System.out.println("Value2 = " + value2);
	}

}
