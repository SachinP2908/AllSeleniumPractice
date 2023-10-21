package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertInTNG {
@Test
public void hardAssert() {
	
	System.out.println("first line");
	System.out.println("second line");
	int i=5;
	int j=10;
	boolean value=i>j;
	Assert.assertTrue(value);

	System.out.println("Third line");
	
//	first line
//	second line
//	FAILED: testNG.HardAssertInTNG.hardAssert

	
}
}
