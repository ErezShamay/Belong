package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationFilesPageTest {
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver = null;
	ApplicationFilesPage f = new ApplicationFilesPage();

	@BeforeClass
	public void setUp() throws Exception {

		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}

	@Test(priority = 1)
	public void Test1() throws Exception {
		f.clickOnFilesButton(appiumDriver);
		assert f.filesPage(appiumDriver);
		f.clickOnGoBackButton(appiumDriver);
		f.homepage(appiumDriver);
	}
}
