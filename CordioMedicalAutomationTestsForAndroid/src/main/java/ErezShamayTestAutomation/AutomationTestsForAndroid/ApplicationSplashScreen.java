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

public class ApplicationSplashScreen {
	String info;
	int number = 0;

	
	@SuppressWarnings("rawtypes")
	public void waitForElement(AndroidDriver driver , String locator) throws InterruptedException {
		
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
	public boolean startingPoint(AndroidDriver driver) throws IOException{
		try{
			if(driver.findElementById("button_login_already_registered") != null) {
				info = "we are in splash screen";
				takeScreenShot(driver);
			}
			else {
				info = "we are NOT in splash screen";
				takeScreenShot(driver);
			}
		} catch (Exception e) {
			info = "did not find element Already registered button";
			return false;
		}

		System.out.println(info);
		Log.appendLogFile(info);
		
		return true;
	}
	
	@SuppressWarnings("rawtypes")
	public void signUpButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("").click();
			info = "clicked on the signup button";
			takeScreenShot(driver);
		}catch(Exception e) {
			info = "did not clicked on the signup button";
			takeScreenShot(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void alreadyRegisteredButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("").click();
			info = "clicked on the Already Registered button";
			takeScreenShot(driver);
		}catch(Exception e) {
			info = "did not clicked on the Already Registered button";
			takeScreenShot(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public boolean privecyPolicyPopupWindow(AndroidDriver driver) {
		try {
			waitForElement(driver, "text_view_dialog_terms_text");
			
			if(driver.findElementById("text_view_dialog_terms_text") != null) {
				info = "privecy Policy Popup Window is shown";
				takeScreenShot(driver);
			}
			else {
				info = "privecy Policy Popup Window is NOT shown";
				takeScreenShot(driver);
			}
			
		}catch(Exception e){
			info = "privecy Policy Popup Window element is entarctable";
			return false;
		}
		

		System.out.println(info);
		Log.appendLogFile(info);
		
		return true;
	}
	
	@SuppressWarnings("rawtypes")
	public void agreeButtonInPopupWindow(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("button_login_agree").click();
			info = "button login agree clicked";
			takeScreenShot(driver);
			
		}catch(Exception e){
			info = "button login agree was not clicked";
			agreeButtonInPopupWindow(driver);
			takeScreenShot(driver);
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void cancelButtonInPopupWindow(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("button_login_not_agree").click();
			info = "button login not agree clicked";
			takeScreenShot(driver);
			
		}catch(Exception e){
			info = "button login not agree was not clicked";
			cancelButtonInPopupWindow(driver);
			takeScreenShot(driver);
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void loginPhoneWindow(AndroidDriver driver) throws IOException {
		try {
			waitForElement(driver, "toolbar_login");
			if(driver.findElementById("toolbar_login") != null) {
				info = "we are in login Phone Window";
				takeScreenShot(driver);
			}
			
		}catch(Exception e){
			info = "we are NOT in login Phone Window";
			takeScreenShot(driver);
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void enterPhoneNumber(AndroidDriver driver , String phoneNumber) throws IOException {
		try {
			driver.findElementById("editTextLoginPhone").sendKeys(phoneNumber);
			info = "send keys for phone number";
			takeScreenShot(driver);
			
		}catch(Exception e){
			info = "did not send keys with phone number";
			takeScreenShot(driver);
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void nextButtonInLoginPhoneWindow(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("editTextLoginPhone").click();
			info = "clicked on next button in login phone window";
			takeScreenShot(driver);
			
		}catch(Exception e){
			info = "did not clicked on next button in login phone window";
			takeScreenShot(driver);
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void sendButtonInPopupWindow(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("button_dialog_yes_resend").click();
			info = "clicked on button_dialog_yes_resend";
			takeScreenShot(driver);
			
		}catch(Exception e){
			info = "did not clicked on button_dialog_yes_resend";
			takeScreenShot(driver);
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
}