package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationClinicalIndicesPage {
	String info;

	public void sleep() throws InterruptedException {
		Thread.sleep(4000);
	}

	@SuppressWarnings("rawtypes")
	public void sentence(AndroidDriver driver,String s) throws Exception {
		String sentence;
		
		try {
			sentence = driver.findElementById("com.cordiomed:id/sentence_text_view").getText();
			
			if(s.equals(sentence)) {
				info = "Found Sentence "+s+"";
			}
			
			else {
				info = "Sentence "+s+" did not found/changed";
			}

		} catch (Exception e) {
			info = "Sentence "+s+" did not found/changed";
			throw (e);
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void selectFace3Smiley(AndroidDriver driver, String faceSelection) throws Exception {
		try {
			switch (faceSelection) {
			case "1":
				driver.findElementById("com.cordiomed:id/face_1_image").click();
				info = "First Smiley clicked";
				break;

			case "2":
				driver.findElementById("com.cordiomed:id/face_2_image").click();
				info = "Second Smiley clicked";
				break;

			case "3":
				driver.findElementById("com.cordiomed:id/face_3_image").click();
				info = "Third Smiley clicked";
				break;
			}
		} catch (Exception e) {
			info = "Element did not found/changed";
			throw (e);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void selectFace6Smiley(AndroidDriver driver, String faceSelection) throws Exception {
		try {
			switch (faceSelection) {
			case "1":
				driver.findElementById("com.cordiomed:id/face_1_animation").click();
				info = "First Smiley clicked";
				break;

			case "2":
				driver.findElementById("com.cordiomed:id/face_2_image").click();
				info = "Second Smiley clicked";
				break;

			case "3":
				driver.findElementById("com.cordiomed:id/face_3_image").click();
				info = "Third Smiley clicked";
				break;
				
			case "4":
				driver.findElementById("com.cordiomed:id/face_4_image").click();
				info = "Forth Smiley clicked";
				break;

			case "5":
				driver.findElementById("com.cordiomed:id/face_5_image").click();
				info = "Fifth Smiley clicked";
				break;

			case "6":
				driver.findElementById("com.cordiomed:id/face_6_image").click();
				info = "Six Smiley clicked";
				break;
			}
		} catch (Exception e) {
			info = "Element smileys did not found/changed";
			throw (e);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void selectRadioButton(AndroidDriver driver, String radioButton) throws Exception {
		String s;
		try {
			switch (radioButton) {
			case "1":
				s = "מסכים מאוד";
				driver.findElementByXPath("//android.widget.TextView[@text='" + s + "']").click();
				info = "Element מסכים מאוד clicked";
				break;

			case "2":
				s = "מסכים";
				driver.findElementByXPath("//android.widget.TextView[@text='" + s + "']").click();
				info = "Element מסכים clicked";
				break;

			case "3":
				s = "ללא דעה";
				driver.findElementByXPath("//android.widget.TextView[@text='" + s + "']").click();
				info = "Element ללא דעה clicked";
				break;
				
			case "4":
				s = "לא מסכים";
				driver.findElementByXPath("//android.widget.TextView[@text='" + s + "']").click();
				info = "Element לא מסכים clicked";
				break;

			case "5":
				s = "מאוד לא מסכים";
				driver.findElementByXPath("//android.widget.TextView[@text='" + s + "']").click();
				info = "Element מאוד לא מסכים clicked";
				break;
			}
		} catch (Exception e) {
			info = "Element radio button did not found/changed";
			throw (e);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void yesNoSelection(AndroidDriver driver, String yesNo) throws Exception {
		try {
			switch (yesNo) {
			case "1":
				driver.findElementById("yes_text_view").click();
				info = "Yes";
				break;

			case "2":
				driver.findElementById("no_text_view").click();
				info = "No";
				break;
			}
		} catch (Exception e) {
			info = "Element yes/no did not found/changed";
			throw (e);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void nextButton(AndroidDriver driver) throws IOException {
		try{
			driver.findElementById("next_button").click();
			info = "Found and Clicked on next_button";
		} catch (Exception e) {
			info = "Element next_button DID NOT found/ cannot click";
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}
}