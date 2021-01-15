package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationClinicalQuestionPageTest {
	@SuppressWarnings("rawtypes")
	AndroidDriver appiumDriver = null;
	ApplicationClinicalQuestionPage cqp = new ApplicationClinicalQuestionPage();

	@BeforeClass
	public void setUp() throws Exception {

		appiumDriver = DriverFactory.getMobileAndroidDriver("no","yes");
	}
	
	////////////////Tests for Saturation////////////////
	@Test(priority = 1)
	public void Test1() throws Exception {
		System.out.println("///////////////////////Clinical Questions Tests///////////////////////");
		System.out.println("Test#1");
		cqp.sleep();
		cqp.indications(appiumDriver,"סטורציה");
		cqp.textBox(appiumDriver, "56");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 2)
	public void Test2() throws Exception{
		System.out.println("Test#2");
		cqp.sleep();
		cqp.indications(appiumDriver,"סטורציה");
		cqp.keyboard(appiumDriver, "1");
		cqp.keyboard(appiumDriver, "2");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 3)
	public void Test3() throws Exception{
		System.out.println("Test#3");
		cqp.sleep();
		cqp.indications(appiumDriver,"סטורציה");
		cqp.keyboard(appiumDriver, "3");
		cqp.keyboard(appiumDriver, "4");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 4)
	public void Test4() throws Exception{
		System.out.println("Test#4");
		cqp.sleep();
		cqp.indications(appiumDriver,"סטורציה");
		cqp.keyboard(appiumDriver, "0");
		cqp.keyboard(appiumDriver, ".");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 5)
	public void Test5() throws Exception{
		System.out.println("Test#5");
		cqp.sleep();
		cqp.indications(appiumDriver,"סטורציה");
		cqp.keyboard(appiumDriver, "delete");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 6)
	public void Test6() throws Exception{
		System.out.println("Test#6");
		cqp.sleep();
		cqp.indications(appiumDriver,"סטורציה");
		cqp.keyboard(appiumDriver, "5");
		cqp.keyboard(appiumDriver, "6");
		cqp.keyboard(appiumDriver, "7");
	}
	
	@Test(priority = 7)
	public void Test7() throws Exception{
		System.out.println("Test#7");
		cqp.sleep();
		cqp.indications(appiumDriver,"סטורציה");
		cqp.textBox(appiumDriver, "5");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 8)
	public void Test8() throws Exception{
		System.out.println("Test#8");
		cqp.sleep();
		cqp.indications(appiumDriver,"סטורציה");
		cqp.keyboard(appiumDriver, "7");
		cqp.keyboard(appiumDriver, "7");
		cqp.nextButton(appiumDriver);
	}
	
	////////////////////// Tests for Pulse ///////////////////////////
	@Test(priority = 9)
	public void Test9() throws Exception{
		System.out.println("Test#9");
		cqp.sleep();
		cqp.indications(appiumDriver,"דופק");
		cqp.keyboard(appiumDriver, "3");
		cqp.keyboard(appiumDriver, "0");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 10)
	public void Test10() throws Exception{
		System.out.println("Test#10");
		cqp.sleep();
		cqp.indications(appiumDriver,"דופק");
		cqp.keyboard(appiumDriver, ".");
		cqp.keyboard(appiumDriver, "0");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 11)
	public void Test11() throws Exception{
		System.out.println("Test#11");
		cqp.sleep();
		cqp.indications(appiumDriver,"דופק");
		cqp.keyboard(appiumDriver, "0");
		cqp.keyboard(appiumDriver, ".");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 12)
	public void Test12() throws Exception{
		System.out.println("Test#12");
		cqp.sleep();
		cqp.indications(appiumDriver,"דופק");
		cqp.keyboard(appiumDriver, "delete");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 13)
	public void Test13() throws Exception{
		System.out.println("Test#13");
		cqp.sleep();
		cqp.indications(appiumDriver,"דופק");
		cqp.keyboard(appiumDriver, "5");
		cqp.keyboard(appiumDriver, "6");
		cqp.keyboard(appiumDriver, "7");
	}
	
	@Test(priority = 14)
	public void Test14() throws Exception{
		System.out.println("Test#14");
		cqp.sleep();
		cqp.indications(appiumDriver,"דופק");
		cqp.textBox(appiumDriver, "5");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 15)
	public void Test15() throws Exception{
		System.out.println("Test#15");
		cqp.sleep();
		cqp.indications(appiumDriver,"דופק");
		cqp.keyboard(appiumDriver, "7");
		cqp.keyboard(appiumDriver, "7");
	}
	
	@Test(priority = 16)
	public void Test16() throws Exception{
		System.out.println("Test#16");
		cqp.sleep();
		cqp.indications(appiumDriver,"דופק");
		cqp.keyboard(appiumDriver, "7");
		cqp.keyboard(appiumDriver, "7");
		cqp.keyboard(appiumDriver, "delete");
		cqp.keyboard(appiumDriver, ".");
		cqp.nextButton(appiumDriver);
		cqp.keyboard(appiumDriver, "8");
		cqp.nextButton(appiumDriver);
	}
	
	///////////////////////// Tests for weight ////////////////////////////
	
	@Test(priority = 17)
	public void Test17() throws Exception{
		System.out.println("Test#17");
		cqp.sleep();
		cqp.indications(appiumDriver,"משקל");
		cqp.keyboard(appiumDriver, "2");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 18)
	public void Test18() throws Exception{
		System.out.println("Test#18");
		cqp.sleep();
		cqp.indications(appiumDriver,"משקל");
		cqp.keyboard(appiumDriver, ".");
		cqp.keyboard(appiumDriver, "0");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 19)
	public void Test19() throws Exception{
		System.out.println("Test#19");
		cqp.sleep();
		cqp.indications(appiumDriver,"משקל");
		cqp.keyboard(appiumDriver, "0");
		cqp.keyboard(appiumDriver, ".");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 20)
	public void Test20() throws Exception{
		System.out.println("Test#20");
		cqp.sleep();
		cqp.indications(appiumDriver,"משקל");
		cqp.keyboard(appiumDriver, "delete");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 21)
	public void Test21() throws Exception{
		System.out.println("Test#21");
		cqp.sleep();
		cqp.indications(appiumDriver,"משקל");
		cqp.keyboard(appiumDriver, "5");
		cqp.keyboard(appiumDriver, "6");
		cqp.keyboard(appiumDriver, "7");
	}
	
	@Test(priority = 22)
	public void Test22() throws Exception{
		System.out.println("Test#22");
		cqp.sleep();
		cqp.indications(appiumDriver,"משקל");
		cqp.textBox(appiumDriver, "56");
	}
	
	@Test(priority = 23)
	public void Test23() throws Exception{
		System.out.println("Test#23");
		cqp.sleep();
		cqp.indications(appiumDriver,"משקל");
		cqp.keyboard(appiumDriver, "7");
		cqp.keyboard(appiumDriver, "7");
		cqp.keyboard(appiumDriver, "delete");
		cqp.keyboard(appiumDriver, ".");
		cqp.nextButton(appiumDriver);
		cqp.keyboard(appiumDriver, "8");
		cqp.nextButton(appiumDriver);
	}
	
	@Test(priority = 24)
	public void Test24() throws Exception{
		System.out.println("Test#24");
		cqp.sleep();
		cqp.indications(appiumDriver,"משקל");
		cqp.keyboard(appiumDriver, "7");
		cqp.keyboard(appiumDriver, "7");
		cqp.keyboard(appiumDriver, ".");
		cqp.keyboard(appiumDriver, "7");
		cqp.nextButton(appiumDriver);
	}
}
