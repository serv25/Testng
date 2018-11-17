package core.Testng.suite1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import core.Testng.base.BaseSuite;

public class ClassTest1 extends BaseSuite {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Runs ones before class -> beforeClass " + this.getClass().getSimpleName());
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Runs ones after class -> afterClass " + this.getClass().getSimpleName());
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Runs before every method -> beforeMethod " + this.getClass().getSimpleName());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Runs after every method --> afterMethod " + this.getClass().getSimpleName());
	}

	@Test
	public void test1() {
		System.out.println("Running -> test1 " + this.getClass().getSimpleName());
	}

	@Test
	public void test2() {
		System.out.println("Running -> test2 " + this.getClass().getSimpleName());
	}

	@Test
	public void test3() {
		System.out.println("Running -> test3 " + this.getClass().getSimpleName());
	}

}
