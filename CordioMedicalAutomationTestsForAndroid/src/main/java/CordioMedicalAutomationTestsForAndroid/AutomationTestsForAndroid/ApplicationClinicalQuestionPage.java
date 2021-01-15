package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationClinicalQuestionPage {
	String info;

	public void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}

	@SuppressWarnings("rawtypes")
	public void indications(AndroidDriver driver,String s) throws Exception {
		String indication;
		try {
			indication = driver.findElementById("com.cordiomed:id/titleTextView").getText();
			
			if(indication.equals(s)) {
				info = "Element "+s+" Found!";
			}
			else {
				info = "Element "+s+" did not found/changed";
			}
		} catch (Exception e) {
			info = "Error in Element "+s+" did not found/changed";
			throw(e);
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void textBox(AndroidDriver driver, String value) throws Exception {
		try {
			driver.findElementById("com.cordiomed:id/text_box_label").sendKeys(value);
			info = "managed to write in the TEXT-BOX";
			driver.findElementById("com.cordiomed:id/text_box_label").clear();
		} catch (Exception e) {
			info = "Element is not clickable/invalid";
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void keyboard(AndroidDriver driver, String sendKey) throws Exception {
		try {
			switch(sendKey) {
				case "1":
					driver.findElementById("com.cordiomed:id/keyboard_button_1").click();
					info = "Button 1 was pressed";
					break;
				
				case "2":
					driver.findElementById("com.cordiomed:id/keyboard_button_2").click();
					info = "Button 2 was pressed";
					break;
				
				case "3":
					driver.findElementById("com.cordiomed:id/keyboard_button_3").click(); {
					info = "Button 3 was pressed";
					break;
				}
				case "4":
					driver.findElementById("com.cordiomed:id/keyboard_button_4").click(); {
					info = "Button 4 was pressed";
					break;
				}
				case "5":
					driver.findElementById("com.cordiomed:id/keyboard_button_5").click(); {
					info = "Button 5 was pressed";
					break;
				}
				case "6":
					driver.findElementById("com.cordiomed:id/keyboard_button_6").click(); {
					info = "Button 6 was pressed";
					break;
				}
				case "7":
					driver.findElementById("com.cordiomed:id/keyboard_button_7").click(); {
					info = "Button 7 was pressed";
					break;
				}
				case "8":
					driver.findElementById("com.cordiomed:id/keyboard_button_8").click(); {
					info = "Button 8 was pressed";
					break;
				}
				case "9":
					driver.findElementById("com.cordiomed:id/keyboard_button_9").click(); {
					info = "Button 9 was pressed";
					break;
				}
				case "0":
					driver.findElementById("com.cordiomed:id/keyboard_button_0").click(); {
					info = "Button 0 was pressed";
					break;
				}
				case ".":
					driver.findElementById("com.cordiomed:id/keyboard_button_dot").click(); {
					info = "Button Dot was pressed";
					break;
				}
				case "delete":
					driver.findElementById("com.cordiomed:id/keyboard_button_delete").click(); {
					info = "Button delete was pressed";
					break;
				}
			}
			
		}catch (Exception e) {
			info = "Keyboard is not clickable/invalid";
			throw(e);
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void nextButton(AndroidDriver driver) throws Exception {
		try {
			driver.findElementById("com.cordiomed:id/next_button").click();
			info = "Clicked on next button";
			
		} catch (Exception e) {
			info = "Element did not found/ cannot click";
		}
		System.out.println(info);
		Log.appendLogFile(info);
	}	
}