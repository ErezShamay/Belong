package ErezShamayTestAutomation.AutomationTestsForAndroid;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationMyFeedPage {
	String info;
	int number = 0;

	@SuppressWarnings("rawtypes")
	public void waitForElement(AndroidDriver driver, String locator) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}
	
	@SuppressWarnings("rawtypes")
	public void takeScreenShot(AndroidDriver driver) throws IOException {
		File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("C:\\Users\\erezs\\git\\repository\\CordioMedicalAutomationTestsForAndroid\\src\\main\\java\\CordioMedicalAutomationTestsForAndroid\\AutomationTestsForAndroid\\Screenshot"+number+".jpg"));
		number++;
	}

	@SuppressWarnings("rawtypes")
	public void clickOnMyFeedButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("image_view_belongers_picture").click();
			info = "clicked on myfeed button";
			takeScreenShot(driver);

		} catch (Exception e) {
			info = "did not clicked on myfeed button";
			takeScreenShot(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void clickOnContinueInPopUpWindow(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("button1").click();
			info = "clicked on continue button";
			takeScreenShot(driver);

		} catch (Exception e) {
			info = "did not clicked on continue button";
			takeScreenShot(driver);
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
				takeScreenShot(driver);
			} else {
				info = "we are NOT in my feed page";
				takeScreenShot(driver);
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
	public void clickOnGoBackButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElementByXPath(
					"//android.widget.ImageButton[@content-desc=\\\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\\\"]")
					.click();
			info = "clicked on goback button";
			takeScreenShot(driver);

		} catch (Exception e) {
			info = "did not clicked on goback button";
			takeScreenShot(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void clickOnokButtonInPopUpWindow(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("button1").click();
			info = "clicked on ok button";
			takeScreenShot(driver);

		} catch (Exception e) {
			info = "did not clicked on ok button";
			takeScreenShot(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void homepage(AndroidDriver driver) throws InterruptedException, IOException {
		waitForElement(driver, "layout_minidash_header_info_section");
		if (driver.findElementById("layout_minidash_header_info_section") != null) {
			info = "navigated to homePage";
			takeScreenShot(driver);
		} else {
			info = "did not navigated to homePage";
			takeScreenShot(driver);
			clickOnokButtonInPopUpWindow(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}
}
