package core.Testng.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import core.Testng.apps.App;

public class AssertsTest {

	@Test
	public void testSum() {
		System.out.println("Running Test -> testSum");
		App obj = new App();
		int actual = obj.sumNumbers(1, 2);
		int expected = 3;
		assertEquals(actual, expected);

	}

	@Test
	public void testStrings() {
		System.out.println("Running Test -> testStrings");
		String expected = "Hello World";
		App obj = new App();
		String actual = obj.addStrings("Hello", "World");
		assertEquals(actual, expected);
	}

	@Test
	public void testArrays() {
		System.out.println("Running Test -> testArrays");
		int[] expected = { 1, 2, 3,4 };
		App obj = new App();
		int[] actual = obj.getArray();
		assertEquals(actual, expected);
	}

}
