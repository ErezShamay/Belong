package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationUploadScreenPage {
	String info;

	@SuppressWarnings("rawtypes")
	public void image(AndroidDriver driver) throws IOException {
		try {
			if (driver.findElementById("com.cordiomed:id/imageView2") != null) {
				info = "Image exist";
			}
		} catch (Exception e) {
			info = "Image was not found";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void messege1(AndroidDriver driver) throws IOException {
		try {
			driver.findElementByXPath("//android.widget.TextView[@text='שים לב המידע עדיין לא נשלח, אנא המתן']");
			info = "שים לב המידע עדיין לא נשלח, אנא המתן";

		} catch (Exception e) {
			info = "Element שים לב המידע עדיין לא נשלח, אנא המתן did not found/changed";
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void messege2(AndroidDriver driver) throws IOException {
		try {
			if (driver.findElementByXPath(
					"//android.widget.TextView[@text='המידע הועבר בהצלחה תודה רבה ויום נעים']") != null) {
				info = "המידע הועבר בהצלחה תודה רבה ויום נעים";
			}
		} catch (Exception e) {
			info = "Element המידע הועבר בהצלחה תודה רבה ויום נעים did not found/changed";
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void progressBar(AndroidDriver driver) throws IOException {
		try {
			if (driver.findElementById("com.cordiomed:id/progressView") != null) {
				info = "Progress Bar exist";
			}
		} catch (Exception e) {
			info = "Progress Bar was not found";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void confirmationV(AndroidDriver driver) throws IOException {
		try {
			if (driver.findElementById("com.cordiomed:id/uploadAnimation") != null) {
				info = "Upload succeded!";
			}
		} catch (Exception e) {
			info = "Upload image was not found";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void uploadTime(AndroidDriver driver) {
		long startTime = System.currentTimeMillis();
		long elapsedTime = System.currentTimeMillis() - startTime;
		long elapsedSeconds = elapsedTime / 1000;

		if (elapsedSeconds <= 30) {
			info = "30 seconds or less";
		}
	}

	@SuppressWarnings("rawtypes")
	public void endTestsInApp(AndroidDriver driver) throws IOException {
		System.out.println("");

		info = "End of Tests on Android App";
		System.out.println(info);
		Log.appendLogFile(info);

		driver.quit();
	}
}