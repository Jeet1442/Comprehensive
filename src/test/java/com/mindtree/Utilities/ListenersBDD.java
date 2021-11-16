package com.mindtree.Utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersBDD  implements ITestListener {
	Screenshot ss = new Screenshot();
	/*public void onTestFailure(ITestResult result) {
		try {
			ss.getScreenshot(result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}*/
	
	public void onTestSuccess(ITestResult result) {
		try {
			ss.getScreenshot(result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

	

}
