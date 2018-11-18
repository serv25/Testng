package core.Testng.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Listener3 implements ISuiteListener {

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
