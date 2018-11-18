package core.Testng.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority {

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass: Runs ones before class -> beforeClass " + this.getClass().getSimpleName());
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass: Runs ones after class -> afterClass " + this.getClass().getSimpleName());
	}

	@Test(priority = 2)
	public void test1() {
		System.out.println("Running -> test1 " + this.getClass().getSimpleName());
	}

	@Test(priority = 1)
	public void test2() {
		System.out.println("Running -> test2 " + this.getClass().getSimpleName());
	}

	@Test(priority = 0)
	public void test3() {
		System.out.println("Running -> test3 " + this.getClass().getSimpleName());
	}
}
