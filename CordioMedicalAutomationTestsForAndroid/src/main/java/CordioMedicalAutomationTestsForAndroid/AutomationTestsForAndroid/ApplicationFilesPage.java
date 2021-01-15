package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationFilesPage {
	String info;

	@SuppressWarnings("rawtypes")
	public void waitForElement(AndroidDriver driver, String locator) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}

	@SuppressWarnings("rawtypes")
	public void clickOnFilesButton(AndroidDriver driver) {
		try {
			driver.findElementById("layout_binder_cell").click();
			info = "clicked on files button";

		} catch (Exception e) {
			info = "did not clicked on files button";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public boolean filesPage(AndroidDriver driver) {
		try {
			String word = driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView")
					.getText();
			{

				if (word == "My Files") {
					info = "we are in files page";
				}

				else {
					info = "we are NOT in files page";
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
			info = "clicked on myfeed button";

		} catch (Exception e) {
			info = "did not clicked on myfeed button";
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
