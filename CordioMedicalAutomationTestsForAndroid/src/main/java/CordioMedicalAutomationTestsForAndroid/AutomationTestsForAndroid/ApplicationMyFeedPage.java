package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationMyFeedPage {
	String info;

	@SuppressWarnings("rawtypes")
	public void waitForElement(AndroidDriver driver, String locator) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}

	@SuppressWarnings("rawtypes")
	public void clickOnMyFeedButton(AndroidDriver driver) {
		try {
			driver.findElementById("image_view_belongers_picture").click();
			info = "clicked on myfeed button";

		} catch (Exception e) {
			info = "did not clicked on myfeed button";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void clickOnContinueInPopUpWindow(AndroidDriver driver) {
		try {
			driver.findElementById("button1").click();
			info = "clicked on continue button";

		} catch (Exception e) {
			info = "did not clicked on continue button";
			clickOnMyFeedButton(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public boolean myfeedPage(AndroidDriver driver) {
		try {
			waitForElement(driver, "image_view_item_minidash_profile_photo");
			if (driver.findElementById("image_view_item_minidash_profile_photo") != null) {
				info = "we are in my feed page";
			} else {
				info = "we are NOT in my feed page";
				driver.findElementByXPath(
						"//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]")
						.click();

			}
		} catch (Exception e) {
			info = "element is not interactable";
			return false;
		}

		System.out.println(info);
		Log.appendLogFile(info);

		return true;
	}

	@SuppressWarnings("rawtypes")
	public void clickOnGoBackButton(AndroidDriver driver) {
		try {
			driver.findElementByXPath(
					"//android.widget.ImageButton[@content-desc=\\\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\\\"]")
					.click();
			info = "clicked on goback button";

		} catch (Exception e) {
			info = "did not clicked on goback button";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void clickOnokButtonInPopUpWindow(AndroidDriver driver) {
		try {
			driver.findElementById("button1").click();
			info = "clicked on ok button";

		} catch (Exception e) {
			info = "did not clicked on ok button";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void homepage(AndroidDriver driver) throws InterruptedException {
		waitForElement(driver, "layout_minidash_header_info_section");
		if (driver.findElementById("layout_minidash_header_info_section") != null) {
			info = "navigated to homePage";
		} else {
			info = "did not navigated to homePage";
			clickOnokButtonInPopUpWindow(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}
}
