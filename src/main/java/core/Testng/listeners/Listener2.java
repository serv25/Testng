package core.Testng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class Listener2 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		/* When @TEST method starts */
		System.out.println("onTestStart -> @Test name: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		/* If @TEST is successful */
		System.out.println("onTestSuccess -> @Test name: " + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		/* If @TEST is failed */
		System.out.println("onTestFailure -> @Test name: " + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		/* If @TEST is skipped */

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		/* Before <test> TAG of xml file */
		System.out.println("onStart -> <test> tag name: " + context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods();
		for (ITestNGMethod method : methods) {
			System.out.print(method.getMethodName() + ", ");
			System.out.println();
		}

	}

	@Override
	public void onFinish(ITestContext context) {
		/* After <test> TAG of xml file */
		System.out.println("onFinish -> <test> tag name: " + context.getName());
	}

}
