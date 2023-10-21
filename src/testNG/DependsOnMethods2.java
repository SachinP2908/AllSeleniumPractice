package testNG;

import org.testng.annotations.Test;

public class DependsOnMethods2 {
	@Test(priority = 1,dependsOnMethods = "testNG.DependsOnMethodDiscussion.dashBoard ")
	public void myInfo() {
		System.out.println("my info");
	}

	@Test
	public void checkBox() {
		System.out.println("my info");
	}
}
