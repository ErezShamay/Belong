package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationMyFeedTest {
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver = null;
	ApplicationMyFeedPage mf = new ApplicationMyFeedPage();

	@BeforeClass
	public void setUp() throws Exception {

		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}

	@Test(priority = 1)
	public void Test1() throws Exception {
		mf.clickOnMyFeedButton(appiumDriver);
		mf.clickOnContinueInPopUpWindow(appiumDriver);
		assert mf.myfeedPage(appiumDriver);
		mf.clickOnGoBackButton(appiumDriver);
		mf.homepage(appiumDriver);
	}
}
