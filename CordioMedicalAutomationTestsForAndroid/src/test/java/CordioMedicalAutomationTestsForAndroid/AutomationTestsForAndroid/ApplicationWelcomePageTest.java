package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationWelcomePageTest {
	ApplicationWelcomePage wp = new ApplicationWelcomePage();
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver;

	@BeforeClass
	public void setUp() throws Exception {

		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}
	
	@Test(priority = 1)
	public void Test1() throws Exception {
		ApplicationSettingsPageTest spt = new ApplicationSettingsPageTest();
		wp.sleep();
		System.out.println("///////////////////////Welcome Page Tests///////////////////////");
		System.out.println("Test#1");
		wp.checkLogoImage(appiumDriver);
		wp.pressOnMenuButton(appiumDriver);
		spt.setUp();
		spt.Test1();
		spt.Test2();
		spt.Test3();
		spt.Test4();
	}

	@Test(priority = 2)
	public void Test2() throws Exception {
		System.out.println("Test#2");
		wp.sleep();
		wp.checkLogoImage(appiumDriver);
		wp.message1(appiumDriver);
		wp.message2(appiumDriver);
		wp.startButton(appiumDriver);
		wp.isNextPage(appiumDriver);
	}
}
