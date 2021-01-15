package CordioMedicalAutomationTestsForAndroid.AutomationTestsForAndroid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

	public static URL url;
	public static DesiredCapabilities capabilities;
	@SuppressWarnings("rawtypes")
	static AndroidDriver androidDriver = null;
	static IOSDriver<IOSElement> iosDriver = null;

	final static String URL_STRING = "http://127.0.0.1:4723/wd/hub";
	
	
	@SuppressWarnings("rawtypes")
	public static AndroidDriver getMobileAndroidDriver(String platformVersion, String networkSpeed) throws MalformedURLException {
		
		//String imei;

		if (androidDriver == null) {
			url = new URL(URL_STRING);
			
			//imei = getDeviceImei(); ///// when working in parallel each calling to func will return the phone imei

			try {
				// Set desired capabilities.
				DesiredCapabilities capabilities = new DesiredCapabilities();

				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("deviceName", "352355115381131"); ////// for the purpose of this excersice i use harcoded imei
				capabilities.setCapability("platformVersion", platformVersion);
				//capabilities.setCapability("appWaitActivity", "if_splash_is_diffrent_from_main_activity");
				capabilities.setCapability("browserName", "");
				//capabilities.setCapability("networkSpeed", networkSpeed);//if we want to see how the app works with low network connection
				capabilities.setCapability("automationName", "UiAutomator2");
				capabilities.setCapability("app", "C:\\WIP\\Belong_base.apk");

				androidDriver = new AndroidDriver(url, capabilities);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return androidDriver;
	}

	public static IOSDriver<IOSElement> getMobileiOSDriver() throws MalformedURLException {
		
		//String imei;
		
		if (iosDriver == null) {
			url = new URL(URL_STRING);
			
			//imei = getDeviceImei(); ///// when working in parallel each calling to func will return the phone imei

			try {
				// Set desired capabilities.
				capabilities = new DesiredCapabilities();
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone_name");
				capabilities.setCapability(MobileCapabilityType.UDID, "udid");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "os_version");
				capabilities.setCapability(MobileCapabilityType.APP,"app_locatuion");
				capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
				capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
				capabilities.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID, "developer_team_id");
				capabilities.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID, "iPhone Developer");
				capabilities.setCapability("useNewWDA", false);

				iosDriver = new IOSDriver<IOSElement>(url, capabilities);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return iosDriver;
	}
	
	/*public static String getDeviceImei() {
		
		TelephonyManager telephonyManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
		
		return telephonyManager.getDeviceId();
		
	}*/
}