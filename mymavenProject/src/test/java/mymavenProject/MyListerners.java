package mymavenProject;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListerners implements ITestListener {

	
	// itestListerners
	public void onStart(ITestContext result) {
		System.out.println("Test started!!!");
	}

	public void onFinish(ITestContext result) {
		System.out.println("Test completed!!!");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case fail: " + result.getName());
		System.out.println(result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped: " + result.getName());
		System.out.println(result.getThrowable());
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test case started : " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Pass: " + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}
}

