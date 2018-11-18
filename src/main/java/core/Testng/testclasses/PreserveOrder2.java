package core.Testng.testclasses;

import org.testng.annotations.Test;

public class PreserveOrder2 {

	@Test
	public void test1() {
		System.out.println("Test 1: " + this.getClass().getSimpleName());
	}

	@Test
	public void test2() {
		System.out.println("Test 2: " + this.getClass().getSimpleName());
	}
}
