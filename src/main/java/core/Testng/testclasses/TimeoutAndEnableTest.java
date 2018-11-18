package core.Testng.testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TimeoutAndEnableTest {

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@Test(enabled = false)
	public void test1() {
		System.out.println("Test 1");
	}

	@Test(timeOut = 100)
	public void test2() throws InterruptedException {
		System.out.println("Test 2");
		Thread.sleep(10);
	}
}
