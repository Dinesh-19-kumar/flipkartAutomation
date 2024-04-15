/**
 * 
 */
package base;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utils.Constants;

/**
 * 
 */
public class BaseTest {

	public static WebDriver driver;
	public ExtentReports extentRep;
	public ExtentTest extent;
	public ExtentSparkReporter sparkReporter;

	@BeforeTest
	public void beforeTest() {

		sparkReporter = new ExtentSparkReporter(Constants.filePath);
		extentRep = new ExtentReports();
		extentRep.attachReporter(sparkReporter);
		sparkReporter.config().setTheme(Theme.DARK);
		extentRep.setSystemInfo("HostName", "Local");
		extentRep.setSystemInfo("UserName", "root");
		extentRep.setSystemInfo("Website", "Flipkart");
		extentRep.setSystemInfo("browser", "Chrome");
		sparkReporter.config().setDocumentTitle("Swiggy Automation Report");
		sparkReporter.config().setReportName("Swiggy Automation by Dinesh");

	}

	@BeforeMethod
	public void beforeMethod(Method testMethod) {

		extent = extentRep.createTest(testMethod.getName());
		getDriver();
		driver.manage().window().maximize();
		driver.get(Constants.url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		
		if (result.getStatus() == ITestResult.SUCCESS) {
            extent.log(Status.PASS,MarkupHelper.createLabel(result.getName()+ "Test passed",ExtentColor.GREEN));
            
        } else if (result.getStatus() == ITestResult.FAILURE) {
        	extent.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+ "Test failed",ExtentColor.RED));
        } else if (result.getStatus() == ITestResult.SKIP) {
        	extent.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+ "Test skipped",ExtentColor.ORANGE));
        }
		
	}

	@AfterTest
	public void afterTest() {
		
		driver.quit();
		extentRep.flush();
	}

	
	

	public static WebDriver getDriver() {

		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;

	}
}

