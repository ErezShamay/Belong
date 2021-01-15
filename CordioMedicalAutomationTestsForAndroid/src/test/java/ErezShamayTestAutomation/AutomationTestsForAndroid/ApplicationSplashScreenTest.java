package ErezShamayTestAutomation.AutomationTestsForAndroid;

import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationSplashScreenTest {
	ApplicationSplashScreen sc = new ApplicationSplashScreen();
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver;

	@BeforeClass
	public void setUp() throws Exception {

		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}
	
	//////////////each test can have a name of the test case or a comment to that
	@Test(priority = 1)
	public void Test1() throws Exception {
		try{
			assert sc.startingPoint(appiumDriver);
		}catch(AssertionError ae) {
			for (int i = 0 ; i < 2; i ++) {
				if(sc.startingPoint(appiumDriver)) {
					Test2();
				}
			}
			appiumDriver.quit();
		}
	}
	
	@Test(priority = 2)
	public void Test2() throws Exception {
		try {
			sc.alreadyRegisteredButton(appiumDriver);
			assert sc.privecyPolicyPopupWindow(appiumDriver);
		}catch(AssertionError ae) {
			Test2();
		}
	}
	
	@Test(priority = 3)
	public void Test3() throws Exception {
		try {
			sc.agreeButtonInPopupWindow(appiumDriver);
			assert sc.privecyPolicyPopupWindow(appiumDriver);
		}catch(AssertionError ae) {
			Test3();
		}
	}
}
