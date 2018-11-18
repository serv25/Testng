package core.Testng.tests;

import static org.testng.Assert.assertTrue;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResultDemo {

	@Test
	public void test1() {
		System.out.println("Test 1");
		assertTrue(false);
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
		assertTrue(true);
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("@AfterMethod: Method " + testResult.getMethod().getMethodName() + " is failed!");
		} else if (testResult.getStatus() == ITestResult.SUCCESS) {
			System.out.println("@AfterMethod: Method " + testResult.getName() + " is success!");
		}
	}

}
