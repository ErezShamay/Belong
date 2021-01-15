package ErezShamayTestAutomation.AutomationTestsForAndroid;

import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationSearchPageTest {
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver = null;
	ApplicationSearchPage s = new ApplicationSearchPage();

	@BeforeClass
	public void setUp() throws Exception {

		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}

	@Test(priority = 1)
	public void Test1() throws Exception {
		s.clickOnSearchButton(appiumDriver);
		s.sendKeysToSearchBox(appiumDriver, "סרטן");
		s.sendKeysEnter(appiumDriver);
		s.getAllPosts(appiumDriver);
		s.clickOnTheDots(appiumDriver);
		s.removeProtFromPostsList(appiumDriver);
		assert s.compareListsOfPosts(appiumDriver);
		s.clickOnGoBackButton(appiumDriver);
		s.homepage(appiumDriver);
	}
}
