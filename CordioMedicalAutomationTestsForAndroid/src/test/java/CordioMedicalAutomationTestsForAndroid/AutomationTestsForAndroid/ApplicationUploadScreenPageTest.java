package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationUploadScreenPageTest {
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver = null;
	ApplicationUploadScreenPage usp = new ApplicationUploadScreenPage();

	@BeforeClass
	public void setUp() throws Exception {

		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}

	@Test(priority = 1)
	public void Test1() throws Exception{
		System.out.println("///////////////////////Upload Screen Tests///////////////////////");
		System.out.println("Test#1");
		usp.image(appiumDriver);
		usp.messege1(appiumDriver);
		usp.progressBar(appiumDriver);
		usp.uploadTime(appiumDriver);
		usp.messege2(appiumDriver);
		usp.confirmationV(appiumDriver);
	}

	@AfterClass
	public void close() throws Exception{
		usp.endTestsInApp(appiumDriver);
	}
}
