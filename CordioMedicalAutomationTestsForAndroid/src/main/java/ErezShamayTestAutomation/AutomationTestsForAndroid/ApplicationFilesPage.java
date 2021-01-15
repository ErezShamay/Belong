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

public class ApplicationFilesPage {
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
	public void clickOnFilesButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("layout_binder_cell").click();
			info = "clicked on files button";
			takeScreenShot(driver);

		} catch (Exception e) {
			info = "did not clicked on files button";
			takeScreenShot(driver);
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
					takeScreenShot(driver);
				}

				else {
					info = "we are NOT in files page";
					takeScreenShot(driver);
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
	public void clickOnGoBackButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]").click();
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
	public void homepage(AndroidDriver driver) throws InterruptedException, IOException {
		waitForElement(driver, "layout_minidash_header_info_section");
		if (driver.findElementById("layout_minidash_header_info_section") != null) {
			info = "navigated to homePage";
			takeScreenShot(driver);
		} else {
			info = "did not navigated to homePage";
			takeScreenShot(driver);
			clickOnGoBackButton(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}
}
