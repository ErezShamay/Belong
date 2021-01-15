package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationLoginPage {
	String info;

	public void timerWait() throws InterruptedException, IOException {
		info = "Timer wait started";
		System.out.println(info);
		Log.appendLogFile(info);

		Thread.sleep(30000);

		info = "Timer wait finished";
		System.out.println(info);
		Log.appendLogFile(info);
	}

	public void sleep() throws InterruptedException {
		Thread.sleep(4000);
	}

	@SuppressWarnings("rawtypes")
	public void checkHeaderText(AndroidDriver appiumDriver, String s) throws IOException {
		try {
			if (appiumDriver.findElementByXPath("//android.widget.TextView[@text='" + s + "']") != null) {
				info = "checkHeaderText Found";
			}
		} catch (NoSuchElementException e) {
			info = "Element checkHeaderText was not found";
			throw (e);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void openLangaugeMenu(AndroidDriver appiumDriver) throws Exception {
		try {
			appiumDriver.findElementById("langEditText").click();
			info = "selectLangauge Clicked";
		} catch (NoSuchElementException e) {
			info = "Element selectLangauge cannot be clicked";
			throw (e);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void selectLangauge(AndroidDriver appiumDriver, String language) throws Exception {
		try {
			Thread.sleep(2000);
			switch (language) {
				case ("HE"): {
					appiumDriver.findElement(By.id("com.cordiomed:id/buttonRow1")).click();
					break;
				}
				case ("EN"): {
					appiumDriver.findElement(By.id("com.cordiomed:id/buttonRow2")).click();
					break;
				}
				case ("AR"): {
					appiumDriver.findElement(By.id("com.cordiomed:id/buttonRow3")).click();
					break;
				}
				case ("RU"): {
					appiumDriver.findElement(By.id("com.cordiomed:id/buttonRow4")).click();
					break;
				}
			}
	
			info = "Clicked and Select language -> " + language + " in language ";
			System.out.println(info);
			Log.appendLogFile(info);

		}catch(Exception e){
			info = "DID NOT Clicked and Select language -> " + language + " in language ";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}

	@SuppressWarnings("rawtypes")
	public void enterUserName(AndroidDriver appiumDriver, String userName) throws Exception {
		try {
			Thread.sleep(2000);
			appiumDriver.findElementById("userNameEditText").click();
			info = "enterUserName Clicked";
		} catch (NoSuchElementException e) {
			info = "Element enterUserName did not found";
			throw (e);
		}
		try {
			appiumDriver.findElementById("userNameEditText").sendKeys(userName);
			info = "userNameEditText Clicked";
		} catch (NoSuchElementException e) {
			info = "Element did not found/cannot send keys";
			throw (e);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void locatePasswordField(AndroidDriver appiumDriver) throws InterruptedException {
		try {
			Thread.sleep(2000);
			appiumDriver.findElementById("passwordEditText").click();
			info = "enterPassword Clicked";
			System.out.println(info);
			Log.appendLogFile(info);

		} catch (NoSuchElementException e) {
			info = "Element enterPassword did not found";
			System.out.println(info);
			Log.appendLogFile(info);
			throw (e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void sendKeysToPasswordField(AndroidDriver appiumDriver, String password) throws InterruptedException {
		try {
			Thread.sleep(2000);
			appiumDriver.findElementById("passwordEditText").sendKeys(password);
			info = "Sent Keys to enterPassword";
			System.out.println(info);
			Log.appendLogFile(info);

		} catch (NoSuchElementException e) {
			info = "Element enterPassword did not found / cannot send keys";
			System.out.println(info);
			Log.appendLogFile(info);
			throw (e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void clearUserNameField(AndroidDriver appiumDriver) throws InterruptedException {
		try {
			Thread.sleep(2000);
			appiumDriver.findElementById("userNameEditText").clear();
			info = "User Name Field Cleared";
			System.out.println(info);
			Log.appendLogFile(info);

		} catch (NoSuchElementException e) {
			info = "DID NOT Clear User Name Field";
			System.out.println(info);
			Log.appendLogFile(info);
			throw (e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void clearPasswordField(AndroidDriver appiumDriver) throws InterruptedException {
		try {
			Thread.sleep(2000);
			appiumDriver.findElementById("userNameEditText").clear();
			info = "Password Field Cleared";
			System.out.println(info);
			Log.appendLogFile(info);

		} catch (NoSuchElementException e) {
			info = "DID NOT Clear Password Field";
			System.out.println(info);
			Log.appendLogFile(info);
			throw (e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void pressNextButton(AndroidDriver appiumDriver) throws IOException, InterruptedException {
		try {
			Thread.sleep(2000);
			appiumDriver.findElementById("com.cordiomed:id/next_button").click();
			info = "pressNextButton Clicked";
		} catch (NoSuchElementException e) {
			info = "Element pressNextButton did not found/ cannot click";
			throw (e);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void clearField(AndroidDriver appiumDriver) throws IOException {
		try {
			appiumDriver.findElementById("userNameEditText").clear();
			info = "Element clearField cleared!";
		} catch (NoSuchElementException e) {
			info = "Element clearField did not found/ cannot clear";
			throw (e);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void isNextPage(AndroidDriver appiumDriver) throws IOException {
		try {
			if (appiumDriver.findElementsById("startButton") != null) {
				info = "we are still in login and NOT welcome screen!";
			}
		} catch (NoSuchElementException e) {
			info = "we are in welcome screen";
			throw (e);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void popUpForComunication(AndroidDriver appiumDriver, String s) {
		try {
			if (appiumDriver.findElementByXPath("//android.widget.TextView[@text='" + s + "']") != null) {
				info = "Element לצערנו אין תקשורת Found";
			}
		} catch (NoSuchElementException e) {
			info = "Element לצערנו אין תקשורת was not found";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void buttonX(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("com.cordiomed:id/alert_x_textview").click();
			info = "Press on X in popup when no communication";
			
		} catch (NoSuchElementException e) {
			info = "did not managed to Press on X in popup when no communication";
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void permissionScreen(AndroidDriver driver) throws InterruptedException {
		try {
			Thread.sleep(2000);
			info = "Check if permission is needed";
			System.out.println(info);
			Log.appendLogFile(info);

			if (driver.findElementById("com.android.packageinstaller:id/dialog_container") != null) {
				info = "Permission is needed";
				System.out.println(info);
				Log.appendLogFile(info);

				driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
				info = "permission grented!";
				System.out.println(info);
				Log.appendLogFile(info);
			}
		} catch (NoSuchElementException e) {
			info = "No window permission / Error in flow";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}

	@SuppressWarnings("rawtypes")
	public void failedLoginMessage(AndroidDriver driver) {
		try {
			driver.findElementById("com.cordiomed:id/errorText").click();
			info = "failed Login Message is showen";
		} catch (NoSuchElementException e) {
			info = "failed Login Message DOES NOT showed";
			throw (e);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}
}
