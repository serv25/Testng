package core.Testng.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import core.Testng.apps.App;

public class DependentTests {

	App app;

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
		app = new App();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@Test(dependsOnMethods = { "test2" }, alwaysRun = true)
	public void test1() {
		System.out.println("Test 1");

	}

	@Test
	public void test2() {
		System.out.println("Test 2");
		int actual = app.sumNumbers(1, 2);
		assertEquals(actual, 2);
	}

	@Test(dependsOnMethods = { "test1" })
	public void test3() {
		System.out.println("Test 3");
	}

	@Test
	public void test4() {
		System.out.println("Test 4");
	}
}
