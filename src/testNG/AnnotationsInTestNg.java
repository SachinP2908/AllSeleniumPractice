package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTestNg {
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("before suit ");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class ");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method ");
	}

	@Test
	public void Test() {
		System.out.println("Test ");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass ");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest ");
	}

	@AfterSuite
	public void afterSuit() {
		System.out.println("afterSuit ");
	}
//	before suit 
//	before Test 
//	before Class 
//	before Method 
//	Test 
//	after Method 
//	afterClass 
//	afterTest 
//  afterSuit
}
