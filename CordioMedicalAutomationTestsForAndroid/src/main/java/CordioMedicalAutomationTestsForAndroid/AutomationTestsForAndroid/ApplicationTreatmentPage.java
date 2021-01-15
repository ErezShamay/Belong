package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationTreatmentPage {
	String info;

	@SuppressWarnings("rawtypes")
	public void waitForElement(AndroidDriver driver, String locator) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}

	@SuppressWarnings("rawtypes")
	public void clickOnTreatmentButton(AndroidDriver driver) {
		try {
			driver.findElementById("layout_treatment_cell").click();
			info = "clicked on Treatment button";

		} catch (Exception e) {
			info = "did not clicked on Treatment button";
			clickOnTreatmentButton(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public boolean treatmentPage(AndroidDriver driver) {
		try {
			if(driver.findElementById("text_graph_top") != null)
			{
				info = "we are in treatment page";
			}

			else {
					info = "we are NOT in files page";
					driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]").click();
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
