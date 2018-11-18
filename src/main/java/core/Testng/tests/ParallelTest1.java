package core.Testng.tests;

import org.testng.annotations.Test;

public class ParallelTest1 {

	@Test
	public void test1() throws InterruptedException {
		System.out.println("Test 1(" + getClass().getSimpleName() + "): start");
		Thread.sleep(6000);
		System.out.println("Test 1(" + getClass().getSimpleName() + "): end");
	}

	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test 2(" + getClass().getSimpleName() + "): start");
		Thread.sleep(6000);
		System.out.println("Test 2(" + getClass().getSimpleName() + "): end");
	}
}
