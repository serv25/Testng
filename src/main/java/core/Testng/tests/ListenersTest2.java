package core.Testng.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import core.Testng.listeners.Listener2;

@Listeners(Listener2.class)
public class ListenersTest2 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@Test
	public void test1() {
		System.out.println("@Test 1");
		assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("@Test 2");
		assertTrue(false);
	}

}
