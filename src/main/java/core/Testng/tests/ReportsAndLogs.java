package core.Testng.tests;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReportsAndLogs {

	@BeforeClass
	public void beforeClass() {
		Reporter.log("-> logs @BeforeClass", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("-> logs @AfterClass", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("-> logs @BeforeMethod", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("-> logs @AfterMethod", true);
	}

	@Test
	public void test1() {
		Reporter.log("-> logs @test1", true);
	}

	@Test
	public void test2() {
		Reporter.log("-> logs @test2", true);
		assertTrue(false);
	}

	@Test(dependsOnMethods = { "test2" })
	public void test3() {
		Reporter.log("-> logs @test3", true);
	}

}
