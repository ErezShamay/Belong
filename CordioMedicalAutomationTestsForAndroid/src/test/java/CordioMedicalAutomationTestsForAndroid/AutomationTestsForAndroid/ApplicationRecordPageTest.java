package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationRecordPageTest {
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver = null;
	ApplicationRecordPage rp = new ApplicationRecordPage();

	@BeforeClass
	public void setUp() throws Exception {

		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}

	@Test(priority = 1)
	public void Test1() throws Exception {
		System.out.println("///////////////////////Recordind Screen Tests///////////////////////");
		System.out.println("Test#1");
		rp.sleep();
		rp.sentenceToRecord(appiumDriver,"שקד; חנה; גיא; גבי; סתיו; אלה; קובי; דנה; גל; אסף; אביבה; חנן;");
		rp.textToSpeechButton(appiumDriver);
		rp.sleep();
		rp.recordButton(appiumDriver);
		rp.recordButton(appiumDriver);
		rp.findFeedbackButton(appiumDriver);
		rp.checkError(appiumDriver);
		rp.clickOnFeedbackButton(appiumDriver);
		
		if(rp.isNextSentece(appiumDriver, "שקד; חנה; גיא; גבי; סתיו; אלה; קובי; דנה; גל; אסף; אביבה; חנן;")) {
			Test1();
		}
	}
	
	@Test(priority = 2)
	public void Test2() throws Exception {
		System.out.println("Test#2");
		rp.sleep();
		rp.sentenceToRecord(appiumDriver,"אפקט הדומינו");
		rp.textToSpeechButton(appiumDriver);
		rp.sleep();
		rp.recordButton(appiumDriver);
		rp.sleep();
		rp.checkTimer(appiumDriver);
		rp.recordButton(appiumDriver);
		rp.waitForNextSentence();
		rp.findFeedbackButton(appiumDriver);
		rp.checkError(appiumDriver);
		rp.clickOnFeedbackButton(appiumDriver);
		
		if(rp.isNextSentece(appiumDriver, "אפקט הדומינו")) {
			Test2();
		}
	}
	
	@Test(priority = 3)
	public void Test3() throws Exception {
		System.out.println("Test#3");
		rp.sleep();
		rp.sentenceToRecord(appiumDriver,"מידע סודי ביותר");
		rp.textToSpeechButton(appiumDriver);
		rp.sleep();
		rp.recordButton(appiumDriver);
		rp.sleep();
		rp.checkTimer(appiumDriver);
		rp.checkSoundBar(appiumDriver);
		rp.recordButton(appiumDriver);
		rp.findFeedbackButton(appiumDriver);
		rp.checkError(appiumDriver);
		rp.clickOnFeedbackButton(appiumDriver);
		
		if(rp.isNextSentece(appiumDriver, "מידע סודי ביותר")) {
			Test3();
		}
	}
	
	@Test(priority = 4)
	public void Test4() throws Exception {
		System.out.println("Test#4");
		rp.sleep();
		rp.sentenceToRecord(appiumDriver,"סיפון האונייה");
		rp.textToSpeechButton(appiumDriver);
		rp.sleep();
		rp.recordButton(appiumDriver);
		rp.sleep();
		rp.checkTimer(appiumDriver);
		rp.checkSoundBar(appiumDriver);
		rp.recordButton(appiumDriver);
		rp.findFeedbackButton(appiumDriver);
		rp.checkError(appiumDriver);
		rp.clickOnFeedbackButton(appiumDriver);
		
		if(rp.isNextSentece(appiumDriver, "סיפון האונייה")) {
			Test4();
		}
	}
	
	@Test(priority = 5)
	public void Test5() throws Exception {
		System.out.println("Test#5");
		rp.sleep();
		rp.sentenceToRecord(appiumDriver,"הדייג ודג הזהב");
		rp.textToSpeechButton(appiumDriver);
		rp.sleep();
		rp.recordButton(appiumDriver);
		rp.sleep();
		rp.checkTimer(appiumDriver);
		rp.checkSoundBar(appiumDriver);
		rp.recordButton(appiumDriver);
		rp.findFeedbackButton(appiumDriver);
		rp.checkError(appiumDriver);
		rp.clickOnFeedbackButton(appiumDriver);
		
		if(rp.isNextSentece(appiumDriver, "הדייג ודג הזהב")) {
			Test5();
		}
	}
	
	@Test(priority = 6)
	public void Test6() throws Exception {
		System.out.println("Test#6");
		rp.sleep();
		rp.sentenceToRecord(appiumDriver,"הנשיא שלח לשופט איחולי שנה טובה");
		rp.textToSpeechButton(appiumDriver);
		rp.sleep();
		rp.recordButton(appiumDriver);
		rp.sleep();
		rp.checkTimer(appiumDriver);
		rp.recordButton(appiumDriver);
		rp.findFeedbackButton(appiumDriver);
		rp.checkError(appiumDriver);
		rp.clickOnFeedbackButton(appiumDriver);
		
		if(rp.isNextSentece(appiumDriver, "הנשיא שלח לשופט איחולי שנה טובה")) {
			Test6();
		}
	}
}
