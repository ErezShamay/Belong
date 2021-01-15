package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationSplashScreen {
	String info;

	
	@SuppressWarnings("rawtypes")
	public void waitForElement(AndroidDriver driver , String locator) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}
	
	@SuppressWarnings("rawtypes")
	public boolean startingPoint(AndroidDriver driver) throws IOException{
		try{
			if(driver.findElementById("button_login_already_registered") != null) {
				info = "we are in splash screen";
			}
			else {
				info = "we are NOT in splash screen";
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
	public void signUpButton(AndroidDriver driver) {
		try {
			driver.findElementById("").click();
			info = "clicked on the signup button";
		}catch(Exception e) {
			info = "did not clicked on the signup button";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void alreadyRegisteredButton(AndroidDriver driver) {
		try {
			driver.findElementById("").click();
			info = "clicked on the Already Registered button";
		}catch(Exception e) {
			info = "did not clicked on the Already Registered button";
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
			}
			else {
				info = "privecy Policy Popup Window is NOT shown";
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
	public void agreeButtonInPopupWindow(AndroidDriver driver) {
		try {
			driver.findElementById("button_login_agree").click();
			info = "button login agree clicked";
			
		}catch(Exception e){
			info = "button login agree was not clicked";
			agreeButtonInPopupWindow(driver);
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void cancelButtonInPopupWindow(AndroidDriver driver) {
		try {
			driver.findElementById("button_login_not_agree").click();
			info = "button login not agree clicked";
			
		}catch(Exception e){
			info = "button login not agree was not clicked";
			cancelButtonInPopupWindow(driver);
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void loginPhoneWindow(AndroidDriver driver) {
		try {
			waitForElement(driver, "toolbar_login");
			if(driver.findElementById("toolbar_login") != null) {
				info = "we are in login Phone Window";
			}
			
		}catch(Exception e){
			info = "we are NOT in login Phone Window";
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void enterPhoneNumber(AndroidDriver driver , String phoneNumber) {
		try {
			driver.findElementById("editTextLoginPhone").sendKeys(phoneNumber);
			info = "send keys for phone number";
			
		}catch(Exception e){
			info = "did not send keys with phone number";
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void nextButtonInLoginPhoneWindow(AndroidDriver driver) {
		try {
			driver.findElementById("editTextLoginPhone").click();
			info = "clicked on next button in login phone window";
			
		}catch(Exception e){
			info = "did not clicked on next button in login phone window";
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void sendButtonInPopupWindow(AndroidDriver driver) {
		try {
			driver.findElementById("button_dialog_yes_resend").click();
			info = "clicked on button_dialog_yes_resend";
			
		}catch(Exception e){
			info = "did not clicked on button_dialog_yes_resend";
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
}