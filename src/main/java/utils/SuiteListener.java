package utils;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseTest;

public class SuiteListener implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		String fileName = System.getProperty("user.dir")+File.separator+"passSnaps"+File.separator+result.getMethod().getMethodName();

		File f1 = ((TakesScreenshot)BaseTest.getDriver()).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(f1, new File(fileName+".png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {

		String fileName = System.getProperty("user.dir")+File.separator+"failSnaps"+File.separator+result.getMethod().getMethodName();

		File f1 = ((TakesScreenshot)BaseTest.getDriver()).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(f1, new File(fileName+".png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
