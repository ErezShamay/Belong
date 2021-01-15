package ErezShamayTestAutomation.AutomationTestsForAndroid;

import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationInboxPageTest {
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver = null;
	ApplicationInboxPage i = new ApplicationInboxPage();

	@BeforeClass
	public void setUp() throws Exception {

		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}

	@Test(priority = 1)
	public void Test1() throws Exception {
		i.clickOnInboxButton(appiumDriver);
		assert i.inboxPage(appiumDriver);
		i.clickOnGoBackButton(appiumDriver);
		i.homepage(appiumDriver);
	}
}
