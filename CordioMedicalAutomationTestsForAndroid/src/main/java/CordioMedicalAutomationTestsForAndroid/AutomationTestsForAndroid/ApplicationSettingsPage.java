package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import java.io.IOException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationSettingsPage {
	String info;

	public void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}

	@SuppressWarnings("rawtypes")
	public void findVoiceHelpIndicator(AndroidDriver driver) {
		try {
			if (driver.findElementsById("voiceHelpRow") != null) {
				info = "Found Voice Help Indicator";
				System.out.println(info);
				Log.appendLogFile(info);
			}

		} catch (Exception e) {
			info = "DID NOT Find Voice Help Indicator ";
			System.out.println(info);
			Log.appendLogFile(info);
			throw (e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void clickedOnVoiceHelpIndicator(AndroidDriver driver) {
		try {
			driver.findElementById("voiceHelpRow").click();
			info = "Clicked on Voice Help Indicator";
			System.out.println(info);
			Log.appendLogFile(info);
			
		}catch(Exception e){
			info = "DID NOT Find Voice Help Indicator ";
			System.out.println(info);
			Log.appendLogFile(info);
			throw (e);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void contactInfo(AndroidDriver driver) throws IOException {
		info = "Contact information check:";
		System.out.println(info);
		Log.appendLogFile(info);
		
		try {
			driver.findElementById("contact_us_row");
			info = "Found Contact information row";
			System.out.println(info);
			Log.appendLogFile(info);
			
		} catch (Exception e) {
			info = "DID NOT find Contact information";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void contactInfoClick(AndroidDriver driver) throws IOException {
		
		try {
			driver.findElementById("contact_us_row").click();
			info = "Clicked on Contact information row";
			System.out.println(info);
			Log.appendLogFile(info);
			
		} catch (Exception e) {
			info = "DID NOT Click on Contact information";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void checkIfContactInfoOpened(AndroidDriver driver) throws IOException {
		
		try {
			driver.findElementById("callButton1");
			info = "Contact info Screen opened";
			System.out.println(info);
			Log.appendLogFile(info);
			
		} catch (Exception e) {
			info = "DID NOT open Contact info Screen";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void xButtonInContactInfoScreen(AndroidDriver driver) throws IOException {
		
		try {
			driver.findElement(By.xpath("//android.widget.TextView[@text='Close']")).click();
			info = "Clicked on X Button in Contact info screen";
			System.out.println(info);
			Log.appendLogFile(info);
			
		} catch (Exception e) {
			info = "DID NOT Clicked on X Button in Contact info screen";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void findsendMessage(AndroidDriver driver) throws IOException {
		info = "Send message check:";
		System.out.println(info);
		Log.appendLogFile(info);
		
		try {
			driver.findElementById("send_message_row");
			info = "Found Contact information row";
			System.out.println(info);
			Log.appendLogFile(info);
			
		} catch (Exception e) {
			info = "DID NOT find Contact information";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void sendMessageClick(AndroidDriver driver) throws IOException {
		
		try {
			driver.findElementById("send_message_row").click();
			info = "Clicked on Send message";
			System.out.println(info);
			Log.appendLogFile(info);
			
		} catch (Exception e) {
			info = "DID NOT Clicked on Send message";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void checkIfMessageScreenOpened(AndroidDriver driver) throws IOException {
		
		try {
			driver.findElementById("messageTextEdit");
			info = "Send Message Screen is open";
			System.out.println(info);
			Log.appendLogFile(info);
			
		} catch (Exception e) {
			info = "DID NOT Open send message screen";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void writeToTextBoxInMessageScreenOpened(AndroidDriver driver,String message) throws IOException {
		
		try {
			driver.findElementById("messageTextEdit").sendKeys(message);
			info = "Sent keys to text box in send message screen";
			System.out.println(info);
			Log.appendLogFile(info);
			
		} catch (Exception e) {
			info = "DID NOT Send keys to text box in send message screen";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void sendButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("sendButton").click();
			info = "Clicked on Send Button";
			System.out.println(info);
			Log.appendLogFile(info);
			
		} catch (Exception e) {
			info = "DID NOT Clicked on Send Button";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void confirmationButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("alert_sub_title");
			info = "PopUp Window opened";
			System.out.println(info);
			Log.appendLogFile(info);
			
		} catch (Exception e) {
			info = "DID NOT open PopUp Window";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void checkIfMessageWasSent(AndroidDriver driver) throws IOException {
		try {
			driver.findElement(By.xpath("//android.widget.TextView[@text='Message sent']"));
			info = "Message Was Sent";
			System.out.println(info);
			Log.appendLogFile(info);
			
		}catch(Exception e) {
			info = "Message Was NOT Sent";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void xButtonInPopUpWindowOfConfirmation(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("com.cordiomed:id/alert_x_image").click();
			info = "Clicked on x in popup window";
			System.out.println(info);
			Log.appendLogFile(info);
			
		} catch (Exception e) {
			info = "DID NOT clicked on x in popup window";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}

	@SuppressWarnings("rawtypes")
	public void findLanguageRow(AndroidDriver driver) throws IOException {
		info = "Check if can select Language";
		System.out.println(info);
		Log.appendLogFile(info);
		
		try {
			driver.findElement(By.xpath("//android.widget.TextView[@text='Language']"));
			info = "Found language option";
			System.out.println(info);
			Log.appendLogFile(info);
			
		} catch (Exception e) {
			info = "DID NOT Found language option";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void clickedOnLanguageRow(AndroidDriver driver) throws IOException {
		
		try {
			driver.findElement(By.xpath("//android.widget.TextView[@text='Language']")).click();
			info = "Found language option";
			System.out.println(info);
			Log.appendLogFile(info);
		
		} catch (Exception e) {
			info = "DID NOT Clicked On language option";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}

	@SuppressWarnings("rawtypes")
	public void selectLanguageButtonRow(AndroidDriver driver, String langSelection) throws IOException {
		try {
			switch (langSelection) {
			case "1":
				driver.findElementById("buttonRow_1").click();
				info = "Button Hebrew was pressed";
				break;

			case "2":
				driver.findElementById("buttonRow_2").click();
				info = "Button English was pressed";
				break;

			case "3":
				driver.findElementById("buttonRow_3").click();
				info = "Button Arabic was pressed";
				break;

			case "4":
				driver.findElementById("buttonRow_4").click();
				info = "Button Russian was pressed";
				break;
			}

		} catch (Exception e) {
			info = "Select Languge in settings page is unavailable";
			throw (e);
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void buttonX(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("close_textView").click();
			info = "Clicked on close button in Settings page";

		} catch (Exception e) {
			info = "DID NOT clicked on close button in Settings page";
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void closeSendMessageButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElement(By.xpath("//android.widget.TextView[@text='Language']")).click();
			info = "Clicked on close button in Send Message page";

		} catch (Exception e) {
			info = "DID NOT clicked on close button in Send Message page";
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void popUpMessage(AndroidDriver driver, String selection) throws Exception {
		Thread.sleep(2000);
		try {
			if (driver.findElementsById("android:id/message") != null) {
				info = "Selection option";
				System.out.println(info);
				Log.appendLogFile(info);

				switch (selection) {
				case "Yes":
					pressYesOnPopUp(driver);
					break;

				case "No":
					pressNoOnPopUp(driver);
					break;
				}
			}
		} catch (Exception e) {
		}
	}

	@SuppressWarnings("rawtypes")
	public void pressYesOnPopUp(AndroidDriver driver) throws Exception {

		try {
			driver.findElementById("android:id/button1").click();
			info = "pressed on Yes button";
		} catch (Exception e) {
			info = "did not managed to press on Yes button in popup screen";
		}

		System.out.println(info);
		Log.appendLogFile(info);

	}

	@SuppressWarnings("rawtypes")
	public void isNextPage(AndroidDriver driver) {
		info = "Check if we are in welcome screen";
		System.out.println(info);
		Log.appendLogFile(info);

		try {
			if (driver.findElementsById("com.cordiomed:id/startButton") != null) {
				info = "Correct, We are in Welcome Screen";
			}
		} catch (Exception e) {
			info = "Error, We are still in setting screen";
			throw (e);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void pressNoOnPopUp(AndroidDriver driver) throws IOException {

		try {
			driver.findElementById("android:id/button2").click();
			info = "pressed on NO button";

		} catch (Exception e) {
			info = "did not managed to press on No button in popup screen";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void isSettingsPage(AndroidDriver driver) {
		info = "pressed on NO, check if we are still in settings screen";
		System.out.println(info);
		Log.appendLogFile(info);

		try {
			if (driver.findElementsById("com.cordiomed:id/x_textview") != null) {
				info = "Correct, We are in setting screen";
			}
		} catch (Exception e) {
			info = "Error, We are NOT in Settings screen ";
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}
}
