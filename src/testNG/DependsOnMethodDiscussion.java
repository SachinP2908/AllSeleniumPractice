package testNG;

import org.testng.annotations.Test;

public class DependsOnMethodDiscussion {
	@Test(priority = 1)
	public void login() {
		System.out.println("login to app");
		throw new NullPointerException();
	}

	@Test(priority = 2, dependsOnMethods = "login")
	public void dashBoard() {
		System.out.println("Dashboard");
	}

	@Test(priority = 3, dependsOnMethods = "dashBoard")
	public void profile() {
		System.out.println("profile");
	}
	@Test(priority = 4, dependsOnMethods = {"login","profile"})
	public void logOut() {
		System.out.println("LogOut");
	}

}
