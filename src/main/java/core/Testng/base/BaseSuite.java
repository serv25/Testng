package core.Testng.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseSuite {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite: Runs ones before suite -> beforeSuite " + this.getClass().getSimpleName());
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite: Runs ones after suite -> afterSuite " + this.getClass().getSimpleName());
	}

	@BeforeClass
	public void beforeClass1() {
		System.out.println("@BeforeClass: !!!Runs ones before class -> beforeClass " + this.getClass().getSimpleName());
	}

	@AfterClass
	public void afterClass2() {
		System.out.println("@AfterClass: !!!Runs ones after class -> afterClass " + this.getClass().getSimpleName());
	}

	@BeforeTest
	public void beforeTest() {
		/*
		 * @BeforeTest
		 * 
		 * The annotated method will be run before any test method belonging to the
		 * classes inside the <test> tag is run.
		 */
		System.out.println("@BeforeTest: Runs before each <test> tag -> beforeTest " + this.getClass().getSimpleName());
	}

	@AfterTest
	public void afterTest() {
		/*
		 * @AfterTest
		 * 
		 * The annotated method will be run after all the test methods belonging to the
		 * classes inside the <test> tag have run.
		 */
		System.out.println("@AfterTest: Runs after each <test> tag -> afterTest " + this.getClass().getSimpleName());
	}

}
