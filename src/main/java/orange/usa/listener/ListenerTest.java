package orange.usa.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Start" + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success" +result.getName());//Test Success instead of existing
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failure" + result.getName() );
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped" + result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test FailedButWithinSuccessPercentage" + result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Start" + context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finish" + context.getName());
		
	}

}
