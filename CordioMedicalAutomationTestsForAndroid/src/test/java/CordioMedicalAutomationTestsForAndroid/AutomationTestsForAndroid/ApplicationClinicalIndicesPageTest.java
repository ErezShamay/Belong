package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationClinicalIndicesPageTest {
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver = null;
	ApplicationClinicalIndicesPage cip = new ApplicationClinicalIndicesPage();
	
	@BeforeClass
	public void setUp() throws Exception {

		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}
	
	@Test(priority = 1)
	public void Test1() throws Exception {
		System.out.println("///////////////////////Clinical Indications Tests///////////////////////");
		System.out.println("Test#1");
		cip.sleep();
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 2)
	public void Test2() throws Exception {
		System.out.println("Test#2");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני מרגיש הבוקר? ");
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 3)
	public void Test3() throws Exception {
		System.out.println("Test#3");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני מרגיש הבוקר? ");
		cip.selectFace6Smiley(appiumDriver,"1");
	}
	
	@Test(priority = 4)
	public void Test4() throws Exception {
		System.out.println("Test#4");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני מרגיש הבוקר? ");
		cip.selectFace6Smiley(appiumDriver,"2");
	}
	
	@Test(priority = 5)
	public void Test5() throws Exception {
		System.out.println("Test#5");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני מרגיש הבוקר? ");
		cip.selectFace6Smiley(appiumDriver,"3");
	}
	
	@Test(priority = 6)
	public void Test6() throws Exception {
		System.out.println("Test#6");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני מרגיש הבוקר? ");
		cip.selectFace6Smiley(appiumDriver,"4");
	}
	
	@Test(priority = 7)
	public void Test7() throws Exception {
		System.out.println("Test#7");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני מרגיש הבוקר? ");
		cip.selectFace6Smiley(appiumDriver,"5");
	}
	
	@Test(priority = 8)
	public void Test8() throws Exception {
		System.out.println("Test#8");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני מרגיש הבוקר? ");
		cip.selectFace6Smiley(appiumDriver,"6");
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 9)
	public void Test9() throws Exception {
		System.out.println("Test#9");
		cip.sleep();
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 10)
	public void Test10() throws Exception {
		System.out.println("Test#10");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני נושם הבוקר?");
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 11)
	public void Test11() throws Exception {
		System.out.println("Test#11");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני נושם הבוקר?");
		cip.selectFace6Smiley(appiumDriver,"1");
	}
	
	@Test(priority = 12)
	public void Test12() throws Exception {
		System.out.println("Test#12");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני נושם הבוקר?");
		cip.selectFace6Smiley(appiumDriver,"2");
	}
	
	@Test(priority = 13)
	public void Test13() throws Exception {
		System.out.println("Test#13");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני נושם הבוקר?");
		cip.selectFace6Smiley(appiumDriver,"3");
	}
	
	@Test(priority = 14)
	public void Test14() throws Exception {
		System.out.println("Test#14");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני נושם הבוקר?");
		cip.selectFace6Smiley(appiumDriver,"4");
	}
	
	@Test(priority = 15)
	public void Test15() throws Exception {
		System.out.println("Test#15");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני נושם הבוקר?");
		cip.selectFace6Smiley(appiumDriver,"5");
	}
	
	@Test(priority = 16)
	public void Test16() throws Exception {
		System.out.println("Test#16");
		cip.sleep();
		cip.sentence(appiumDriver,"איך אני נושם הבוקר?");
		cip.selectFace6Smiley(appiumDriver,"6");
		cip.nextButton(appiumDriver);
	}
	
	/*@Test(priority = 11)
	public void Test11() throws Exception {
		System.out.println("Test#11");
		cip.sleep();
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 12)
	public void Test12() throws Exception {
		System.out.println("Test#12");
		cip.sleep();
		cip.sentence3(appiumDriver,"האם אתה נהנה?");
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 13)
	public void Test13() throws Exception {
		System.out.println("Test#13");
		cip.sleep();
		cip.sentence3(appiumDriver,"האם אתה נהנה?");
		cip.selectFace6Smiley(appiumDriver,"1");
	}
	
	@Test(priority = 14)
	public void Test14() throws Exception {
		System.out.println("Test#14");
		cip.sleep();
		cip.sentence3(appiumDriver,"האם אתה נהנה?");
		cip.selectFace6Smiley(appiumDriver,"2");
	}
	
	@Test(priority = 15)
	public void Test15() throws Exception {
		System.out.println("Test#15");
		cip.sleep();
		cip.sentence3(appiumDriver,"האם אתה נהנה?");
		cip.selectFace6Smiley(appiumDriver,"3");
	}
	
	@Test(priority = 16)
	public void Test16() throws Exception {
		System.out.println("Test#16");
		cip.sleep();
		cip.sentence3(appiumDriver,"האם אתה נהנה?");
		cip.selectFace6Smiley(appiumDriver,"4");
	}
	
	@Test(priority = 17)
	public void Test17() throws Exception {
		System.out.println("Test#17");
		cip.sleep();
		cip.sentence3(appiumDriver,"האם אתה נהנה?");
		cip.selectFace6Smiley(appiumDriver,"5");
	}
	
	@Test(priority = 18)
	public void Test18() throws Exception {
		System.out.println("Test#18");
		cip.sleep();
		cip.sentence3(appiumDriver,"האם אתה נהנה?");
		cip.selectFace6Smiley(appiumDriver,"6");
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 19)
	public void Test19() throws Exception {
		System.out.println("Test#19");
		cip.sleep();
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 20)
	public void Test20() throws Exception {
		System.out.println("Test#20");
		cip.sleep();
		cip.sentence4(appiumDriver,"האם אושפזת השבוע?");
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 21)
	public void Test21() throws Exception {
		System.out.println("Test#21");
		cip.sleep();
		cip.sentence4(appiumDriver,"האם אושפזת השבוע?");
		cip.yesNoSelection(appiumDriver,"1");
	}
	
	@Test(priority = 22)
	public void Test22() throws Exception {
		System.out.println("Test#22");
		cip.sleep();
		cip.sentence4(appiumDriver,"האם אושפזת השבוע?");
		cip.yesNoSelection(appiumDriver,"2");
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 23)
	public void Test23() throws Exception {
		System.out.println("Test#23");
		cip.sleep();
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 24)
	public void Test24() throws Exception {
		System.out.println("Test#24");
		cip.sleep();
		cip.sentence5(appiumDriver,"איך ישנתי בלילה?");
		cip.nextButton(appiumDriver);
	}
	
	@Test(priority = 25)
	public void Test25() throws Exception {
		System.out.println("Test#25");
		cip.sleep();
		cip.sentence5(appiumDriver,"איך ישנתי בלילה?");
		cip.selectRadioButton(appiumDriver,"1");
	}
	
	@Test(priority = 26)
	public void Test26() throws Exception {
		System.out.println("Test#26");
		cip.sleep();
		cip.sentence5(appiumDriver,"איך ישנתי בלילה?");
		cip.selectRadioButton(appiumDriver,"2");
	}
	
	@Test(priority = 27)
	public void Test27() throws Exception {
		System.out.println("Test#27");
		cip.sleep();
		cip.sentence5(appiumDriver,"איך ישנתי בלילה?");
		cip.selectRadioButton(appiumDriver,"3");
	}
	
	@Test(priority = 28)
	public void Test28() throws Exception {
		System.out.println("Test#28");
		cip.sleep();
		cip.sentence5(appiumDriver,"איך ישנתי בלילה?");
		cip.selectRadioButton(appiumDriver,"4");
	}
	
	@Test(priority = 29)
	public void Test29() throws Exception {
		System.out.println("Test#29");
		cip.sleep();
		cip.sentence5(appiumDriver,"איך ישנתי בלילה?");
		cip.selectRadioButton(appiumDriver,"5");
		cip.nextButton(appiumDriver);
	}*/
}
