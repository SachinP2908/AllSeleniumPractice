package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTNG {
@Test
public void softAssert() {
	
	System.out.println("first line");
	System.out.println("second line");
	int i=5;
	int j=10;
	boolean value=i>j;
	SoftAssert soft=new SoftAssert();
	soft.assertTrue(value);

	System.out.println("Third line");
	

	
}
}
