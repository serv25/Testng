package core.Testng.testclasses;

import org.testng.annotations.Test;

public class AnnotationTest {

	@Test
	public void testMethod1() {
		System.out.println("Running Test -> testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
	}

	@Test
	public void testMethod3() {
		System.out.println("Running Test -> testMethod3");
	}
}
