package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationRecordPage {
	String info;

	public void sleep() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	public void waitForNextSentence() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	@SuppressWarnings("rawtypes")
	public void textToSpeechButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElement(By.id("com.cordiomed:id/speechButton")).click();
			info = "Found and Clicked On speech Button";
			System.out.println(info);
			Log.appendLogFile(info);
			
		}catch(Exception e) {
			info = "DID NOT clicked/found speech Button";
			System.out.println(info);
			Log.appendLogFile(info);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void sentenceToRecord(AndroidDriver driver, String sentence) throws IOException {
		try {
			if(driver.findElementByXPath("//android.widget.TextView[@text='"+sentence+"']") != null) {
				info = ""+ sentence + "found";
			}
			
		} catch (NoSuchElementException e) {
			info = "Element "+sentence+" did not found/changed";
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void recordButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("com.cordiomed:id/rec_button").click();
			info = "Record button was clicked";
		} catch (Exception e) {
			info = "Element did not found/cannot be clicked";
			
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void checkTimer(AndroidDriver driver) throws Exception {
		try {
			driver.findElementById("timeTextView");
			info = "timeTextView was found";
		} catch (Exception e) {
			info = "Element did not found";
			
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void checkSoundBar(AndroidDriver driver) throws Exception {
		try {
			driver.findElementById("android.view.View");
			info = "Sound Bar was found";
		} catch (Exception e) {
			info = "Element did not found";
			
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}	
	
	@SuppressWarnings("rawtypes")
	public void findFeedbackButton(AndroidDriver driver) throws Exception {
		try {
			driver.findElementById("com.cordiomed:id/done_button");
			info = "Done button in feed back screen was found";
			
		} catch (Exception e) {
			info = "Done button in feed back screen was NOT found";
			
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void clickOnFeedbackButton(AndroidDriver driver) throws Exception {
		try {
			driver.findElementById("com.cordiomed:id/done_button").click();
			info = "Clicked on done button in feedback screen";
			
		} catch (Exception e) {
			info = "DID NOT Clicked on done button in feedback screen";
			
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void checkError(AndroidDriver driver) {
		String errorMessage;
		
		try {
			errorMessage = driver.findElement(By.id("com.cordiomed:id/titleTextView")).getText();
			
			if(errorMessage.contains("R007")) {
				info = "Error Message is Correct";
				System.out.println(info);
				Log.appendLogFile(info);
			}
			
			else {
				info = "Error Message is WRONG";
				System.out.println(info);
				Log.appendLogFile(info);
			}
			
		}catch(Exception e) {
			info = "Error Message is WRONG";
			System.out.println(info);
			Log.appendLogFile(info);
			
		}
	}
	
	@SuppressWarnings("rawtypes")
	public boolean isNextSentece(AndroidDriver driver , String sentence) {
		String isTheSame;
		
		try {
			Thread.sleep(2500);
			isTheSame = driver.findElement(By.id("sentence_text_view")).getText();
			
			if(isTheSame.contentEquals(sentence)) {
				info = "We need to repeat the same Sentence";
				System.out.println(info);
				Log.appendLogFile(info);
				
				return true;
			}
			
			else {
				info = "We DO NOT need to repeat the same Sentence";
				System.out.println(info);
				Log.appendLogFile(info);
				
				return false;
			}
			
		}catch(Exception e){
			info = "Error in flow";
			System.out.println(info);
			Log.appendLogFile(info);
			
		}
		return false;
		
	}
	
	@SuppressWarnings("rawtypes")
	public void overloadwaiting(AndroidDriver driver) throws InterruptedException {
		Thread.sleep(10000);
	}
}
