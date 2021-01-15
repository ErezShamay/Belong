package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationInboxPage {
	String info;

	@SuppressWarnings("rawtypes")
	public void waitForElement(AndroidDriver driver, String locator) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}

	@SuppressWarnings("rawtypes")
	public void clickOnInboxButton(AndroidDriver driver) {
		try {
			driver.findElementById("layout_saved_disc_cell").click();
			info = "clicked on inbox button";

		} catch (Exception e) {
			info = "did not clicked on inbox button";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public boolean inboxPage(AndroidDriver driver) {
		try {
			String word = driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView")
					.getText();
			{

				if (word == "Inbox") {
					info = "we are in inbox page";
				}

				else {
					info = "we are NOT in inbox page";
					driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]").click();
				}
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
			driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]").click();
			info = "clicked on GoBack button";

		} catch (Exception e) {
			info = "did not clicked on GoBack button";
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
			clickOnGoBackButton(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}
}
