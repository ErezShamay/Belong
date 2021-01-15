package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationSettingsPageTest {
	ApplicationSettingsPage sp = new ApplicationSettingsPage();
	ApplicationWelcomePage wp = new ApplicationWelcomePage();
	
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver = null;

	@BeforeClass
	public void setUp() throws MalformedURLException {

		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}

	@Test(priority = 1)
	public void Test1() throws Exception {
		System.out.println("///////////////////////Settings Page Tests///////////////////////");
		System.out.println("Test#1");
		sp.sleep();
		sp.findVoiceHelpIndicator(appiumDriver);
		sp.findLanguageRow(appiumDriver);
		sp.clickedOnLanguageRow(appiumDriver);
		sp.selectLanguageButtonRow(appiumDriver, "1");
		sp.popUpMessage(appiumDriver, "No");
		sp.isNextPage(appiumDriver);
	}
	
	@Test(priority = 2)
	public void Test2() throws Exception {
		System.out.println("Test#2");
		sp.contactInfo(appiumDriver);
		sp.contactInfoClick(appiumDriver);
		sp.checkIfContactInfoOpened(appiumDriver);
		sp.xButtonInContactInfoScreen(appiumDriver);
	}
	
	@Test(priority = 3)
	public void Test3() throws Exception {
		System.out.println("Test#3");
		sp.findsendMessage(appiumDriver);
		sp.sendMessageClick(appiumDriver);
		sp.checkIfMessageScreenOpened(appiumDriver);
		sp.writeToTextBoxInMessageScreenOpened(appiumDriver, "Test Test Test");
		sp.sendButton(appiumDriver);
		sp.sleep();
		sp.checkIfMessageWasSent(appiumDriver);
		sp.xButtonInPopUpWindowOfConfirmation(appiumDriver);
	}
	
	@Test(priority = 4)
	public void Test4() throws Exception {
		System.out.println("Test#4");
		wp.pressOnMenuButton(appiumDriver);
		sp.findVoiceHelpIndicator(appiumDriver);
		sp.clickedOnVoiceHelpIndicator(appiumDriver);
		sp.clickedOnLanguageRow(appiumDriver);
		sp.selectLanguageButtonRow(appiumDriver, "1");
		sp.popUpMessage(appiumDriver, "Yes");
		sp.sleep();
		sp.isNextPage(appiumDriver);
	}
}
