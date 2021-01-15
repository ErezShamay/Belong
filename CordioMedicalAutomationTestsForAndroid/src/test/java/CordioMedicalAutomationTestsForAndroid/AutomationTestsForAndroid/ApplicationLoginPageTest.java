package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationLoginPageTest {
	ApplicationLoginPage lp = new ApplicationLoginPage();
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver = null;
		
	@BeforeClass
	public void setUp() throws MalformedURLException {
		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}
	
	@Test(priority = 1)
	public void Test1() throws InterruptedException, IOException {
		System.out.println("Cordio Medical Android Application Tests:Version 4.0");
		Log.appendLogFile("Cordio Medical Android Application Tests:Version 4.0");
		System.out.println("///////////////////////Login Page Tests///////////////////////");
		Log.appendLogFile("///////////////////////Login Page Tests///////////////////////");
		System.out.println("Test#1");
		Log.appendLogFile("Test#1");
		lp.permissionScreen(appiumDriver);
		lp.permissionScreen(appiumDriver);
		lp.permissionScreen(appiumDriver);
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
	}
	
	@Test(priority = 2)
	public void Test2() throws Exception {
		System.out.println("Test#2");
		Log.appendLogFile("Test#2");
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"HE");
		
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
	}
	
	@Test(priority = 3)
	public void Test3() throws Exception {
		System.out.println("Test#3");
		Log.appendLogFile("Test#3");
		lp.sleep();
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"EN");
		
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
	}
	
	@Test(priority = 4)
	public void Test4() throws Exception {
		System.out.println("Test#4");
		Log.appendLogFile("Test#4");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"AR");
		lp.enterUserName(appiumDriver, "ERE/1234");
		
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}
	
	@Test(priority = 5)
	public void Test5() throws Exception {
		System.out.println("Test#5");
		Log.appendLogFile("Test#5");
		lp.sleep();
		lp.clearField(appiumDriver);
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "ERE/1234");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"RU");
		
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
		
	}
	
	@Test(priority = 6)
	public void Test6() throws Exception{
		System.out.println("Test#6");
		Log.appendLogFile("Test#6");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"EN");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
	}

	@Test(priority = 7)
	public void Test7() throws Exception {
		System.out.println("Test#7");
		Log.appendLogFile("Test#7");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "tst-1234");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT08000");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"HE");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}

	@Test(priority = 8)
	public void Test8() throws Exception {
		System.out.println("Test#8");
		Log.appendLogFile("Test#8");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "mkt-1234");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT08000");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"RU");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}

	@Test(priority = 9)
	public void Test9() throws Exception {
		System.out.println("Test#9");
		Log.appendLogFile("Test#9");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "!@#$%%^^&*&*");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT08000");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"EN");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}

	@Test(priority = 10)
	public void Test10() throws Exception {
		System.out.println("Test#10");
		Log.appendLogFile("Test#10");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "TST");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT08000");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"EN");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}

	@Test(priority = 11)
	public void Test11() throws Exception {
		System.out.println("Test#11");
		Log.appendLogFile("Test#11");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MttT-!@#$");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT08000");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"HE");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}

	@Test(priority = 12)
	public void Test12() throws Exception {
		System.out.println("Test#12");
		Log.appendLogFile("Test#12");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "asd-ffdd");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT08000");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"EN");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}

	@Test(priority = 13)
	public void Test13() throws Exception {
		System.out.println("Test#13");
		Log.appendLogFile("Test#13");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MkT1065!");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT08000");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"AR");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}

	@Test(priority = 14)
	public void Test14() throws Exception {
		System.out.println("Test#14");
		Log.appendLogFile("Test#14");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKt!065!");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT08000");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"EN");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}

	@Test(priority = 15)
	public void Test15() throws Exception {
		System.out.println("Test#15");
		Log.appendLogFile("Test#15");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKT@0!!0");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT08000");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"EN");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}

	@Test(priority = 16)
	public void Test16() throws Exception {
		System.out.println("Test#16");
		Log.appendLogFile("Test#16");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKT-0800");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT0650");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"EN");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.failedLoginMessage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}
	
	@Test(priority = 17)
	public void Test17() throws Exception {
		System.out.println("Test#17");
		Log.appendLogFile("Test#17");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKT-0800");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT0650");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"EN");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.failedLoginMessage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}
	
	@Test(priority = 18)
	public void Test18() throws Exception {
		System.out.println("Test#18");
		Log.appendLogFile("Test#18");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKT-0800");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT0650");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"AR");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.failedLoginMessage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}
	
	@Test(priority = 19)
	public void Test19() throws Exception {
		System.out.println("Test#19");
		Log.appendLogFile("Test#19");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKT-0800");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT********0650");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"HE");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.failedLoginMessage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}
	
	@Test(priority = 20)
	public void Test20() throws Exception {
		System.out.println("Test#20");
		Log.appendLogFile("Test#20");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKT-0800");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"EN");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}
	
	@Test(priority = 21)
	public void Test21() throws Exception {
		System.out.println("Test#21");
		Log.appendLogFile("Test#21");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKT-0800");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT+0001");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"HE");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.failedLoginMessage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}
	
	@Test(priority = 22)
	public void Test22() throws Exception {
		System.out.println("Test#22");
		Log.appendLogFile("Test#22");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKT-0800");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "123456789");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"EN");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.failedLoginMessage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}
	
	@Test(priority = 23)
	public void Test23() throws Exception {
		System.out.println("Test#23");
		Log.appendLogFile("Test#23");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKT-0800");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "!@#$%^&06500");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"AR");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.failedLoginMessage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}
	
	@Test(priority = 24)
	public void Test24() throws Exception {
		System.out.println("Test#24");
		Log.appendLogFile("Test#24");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKT-0800");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "!@#$%^&06500");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"HE");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.failedLoginMessage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}
	
	@Test(priority = 25)
	public void Test25() throws Exception {
		System.out.println("Test#25");
		Log.appendLogFile("Test#25");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKT-0800");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "!@#$%^&-06500!@#$%^&-06500!@#$%^&-06500!@#$%^&-06500!@#$%^&-06500!@#$%^&-06500");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"AR");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
		lp.failedLoginMessage(appiumDriver);
		lp.clearUserNameField(appiumDriver);
		lp.clearPasswordField(appiumDriver);
	}
	
	@Test(priority = 26)
	public void Test26() throws Exception {
		System.out.println("Test#26");
		Log.appendLogFile("Test#26");
		lp.sleep();
		lp.checkHeaderText(appiumDriver,"ברוכים הבאים");
		lp.enterUserName(appiumDriver, "MKT-0800");
		lp.locatePasswordField(appiumDriver);
		lp.sendKeysToPasswordField(appiumDriver, "MKT08000");
		lp.openLangaugeMenu(appiumDriver);
		lp.selectLangauge(appiumDriver,"EN");
		lp.pressNextButton(appiumDriver);
		lp.isNextPage(appiumDriver);
	}
	
	@Test(priority = 27)
	public void Test27() throws Exception {
		System.out.println("Test#27");
		Log.appendLogFile("Test#27");
		
		lp.popUpForComunication(appiumDriver, "לצערנו אין תקשורת");
		lp.buttonX(appiumDriver);
	}
}
