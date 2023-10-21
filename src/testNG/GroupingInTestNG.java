package testNG;

import org.testng.annotations.Test;

public class GroupingInTestNG {
	@Test(priority = 1, groups = "sanity")
	public void login() {
		System.out.println("login to app");
//		throw new NullPointerException();
	}

	@Test(priority = 2, dependsOnMethods = "login", groups = "sanity")
	public void dashBoard() {
		System.out.println("Dashboard");
	}

	@Test(priority = 3, dependsOnMethods = "dashBoard", groups = { "Functional", "smoke" })
	public void profile() {
		System.out.println("profile");
	}

	@Test(priority = 4, dependsOnMethods = { "login", "profile" }, groups = "sanity")
	public void logOut() {
		System.out.println("LogOut");
	}

}
