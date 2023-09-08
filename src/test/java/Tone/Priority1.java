package Tone;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class Priority1 {
	@Test(priority=1)
	private void testmethod1() {
		// TODO Auto-generated method stub
		System.out.println("Test Method 1");

	}
	@Test(priority=3)

	private void syso() {
		// TODO Auto-generated method stub
		System.out.println("Test Method 3");

	}
	@Test(priority=2)
	private void syso1() {
	System.out.println("Test Method 2");
		Reporter.log("hi this is tarun");
	}
}
