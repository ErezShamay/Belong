package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationTreatmentPageTest {
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver = null;
	ApplicationTreatmentPage t = new ApplicationTreatmentPage();

	@BeforeClass
	public void setUp() throws Exception {

		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}

	@Test(priority = 1)
	public void Test1() throws Exception {
		t.clickOnTreatmentButton(appiumDriver);
		assert t.treatmentPage(appiumDriver);
		t.clickOnGoBackButton(appiumDriver);
		t.homepage(appiumDriver);
	}
}
