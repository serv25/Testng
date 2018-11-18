package core.Testng.tests;

import org.testng.annotations.Test;

import core.Testng.data.Data;

public class DataProviderTest {

	@Test(dataProvider = "values", dataProviderClass = Data.class)
	public void test1(String value1, String value2) {
		System.out.println("Value1 = " + value1);
		System.out.println("Value2 = " + value2);
	}

}
