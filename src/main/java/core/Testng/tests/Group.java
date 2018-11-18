package core.Testng.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Group {

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@Test(groups = { "cars", "suv" })
	public void testBMWX6() {
		System.out.println("testBMWX6");
	}

	@Test(groups = { "cars", "sedan" })
	public void testAudiA6() {
		System.out.println("testAudiA6");
	}

	@Test(groups = { "bikes" })
	public void testNinja() {
		System.out.println("testNinja");
	}

	@Test(groups = { "bikes" })
	public void testHondaCBR() {
		System.out.println("testHondaCBR");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("afterClass");
	}
}
