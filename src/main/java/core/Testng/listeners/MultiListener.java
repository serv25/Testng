package core.Testng.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class MultiListener implements IInvokedMethodListener, ITestListener, ISuiteListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		/* Before every method in the Test Class */
		System.out.println("Before Invocation: Class = " + testResult.getTestClass().getName() + ", Method = "
				+ method.getTestMethod().getMethodName());

	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		/* After every method in the Test Class */
		System.out.println("After Invocation: Class = " + testResult.getTestClass().getName() + ", Method = "
				+ method.getTestMethod().getMethodName());
	}

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

	@Override
	public void onStart(ISuite suite) {
		/* When <suite> tag starts */
		System.out.println("ISuiteListener: onStart");
	}

	@Override
	public void onFinish(ISuite suite) {
		/* When <suite> tag completes */
		System.out.println("ISuiteListener: onFinish");
	}
}
