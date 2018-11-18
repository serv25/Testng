package core.Testng.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class Listener1 implements IInvokedMethodListener {

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

}
