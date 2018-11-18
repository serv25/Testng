package core.Testng.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassTest {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Runs ones before class -> beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Runs ones after class -> afterClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Runs before every method -> beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Runs after every method --> afterMethod");
	}

	@Test
	public void test1() {
		System.out.println("Running -> test1");
	}

	@Test
	public void test2() {
		System.out.println("Running -> test2");
	}

	@Test
	public void test3() {
		System.out.println("Running -> test3");
	}

}
