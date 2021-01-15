package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationWelcomePage {
	String info;

	public void sleep() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	@SuppressWarnings("rawtypes")
	public void message1(AndroidDriver driver) throws IOException{
		try{
			if(driver.findElementById("title_label") != null) {
				info = "Element title_label found";
			}
		} catch (Exception e) {
			info = "Element title_label was not found";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void message2(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("sub_title_label");
			info = "Element sub_title_label found";
		} catch (Exception e) {
			info = "Element sub_title_label was not found/changed";
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void startButton(AndroidDriver driver) throws IOException{
		try {
			driver.findElementById("startButton").click();
			info = "Clicked on Start Button";
		} catch (Exception e) {
			info = "DID NOT Clicked on Start Button";
			
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void isNextPage(AndroidDriver driver) throws IOException {
		try {
			if (driver.findElementsById("rec_button") != null) {
				info = "We are in Recording screen!";
			}
		} catch (Exception e) {
			info = "We are still in Welcome screen and NOT recording";
			
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void pressOnMenuButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("menu_button").click();
			info = "Clicked on menu_button";
		}catch(Exception e) {
			info = "Error, did not clicked on menu button";
			
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void checkLogoImage(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("logo_image");
			info = "Found logo_image";
		}catch(Exception e) {
			info = "Error, logo_image was not found";
			
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
}
