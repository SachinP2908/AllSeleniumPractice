package testNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.ScreenShot;

public class Listenrs extends TestClass implements ITestListener {
static WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("On test start:"+result.getName());}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success:"+result.getName());}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On test fail:"+result.getName());
		try {
			ScreenShot.captureScreenshot(driver, "ssaa");
		} catch (IOException e) {
			System.out.println("sasasa");
		}}


	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On test skipped:"+result.getName());}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On  start:"+context.getName());}


	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On finish:"+context.getName());}


}
