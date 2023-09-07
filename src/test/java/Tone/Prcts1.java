package Tone;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prcts1 {

@Test
public void m1() {
	Reporter.log("Hi",true);
}

@Test
public void m2() {
	Reporter.log("Hello",true);
}

@Test

public void m3() {
	Reporter.log("Wasp",true);
	Assert.fail(); //Intnetionally failed a test case using Assert.
}
}
