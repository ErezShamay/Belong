package ErezShamayTestAutomation.AutomationTestsForAndroid;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationSearchPage {
	String info;
	List <WebElement> postsListOriginal;
	List <WebElement> postsListNew;
	
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
	public void clickOnSearchButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("action_main_feed_search").click();
			info = "clicked on Search button";
			takeScreenShot(driver);

		} catch (Exception e) {
			info = "did not clicked on Search button";
			takeScreenShot(driver);
			clickOnSearchButton(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}

	@SuppressWarnings("rawtypes")
	public void sendKeysToSearchBox(AndroidDriver driver, String word) throws IOException {
		try {
			driver.findElementById("search_src_text").sendKeys(word);
			info = "send keys to search box";
			takeScreenShot(driver);

		} catch (Exception e) {
			info = "did not send keys to search box";
			takeScreenShot(driver);
			sendKeysToSearchBox(driver, word);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void sendKeysEnter(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("search_src_text").sendKeys((Keys.ENTER));
			info = "press on enter on search box";
			takeScreenShot(driver);

		} catch (Exception e) {
			info = "did not press on enter on search box";
			takeScreenShot(driver);
			sendKeysEnter(driver);
		}

		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void getAllPosts(AndroidDriver driver) throws IOException {
		try {
			postsListOriginal = driver.findElementsById("search_recycler_container");
			info = "got all the posts";
			takeScreenShot(driver);

		}catch (Exception e) {
			info = "did not get the list of posts";
			takeScreenShot(driver);
			getAllPosts(driver);
		}
		
		System.out.println(info);
		Log.appendLogFile(info);

	}
	
	@SuppressWarnings("rawtypes")
	public void clickOnTheDots(AndroidDriver driver) throws IOException {//////this func can be dynamic and get from the tester the post the he wants to remove
		try {
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[3]/android.widget.ImageView").click();
			info = "clicked on the 3 dots to open a menu";
			takeScreenShot(driver);
		}catch (Exception e) {
			info = "did not click on the 3 dots to open a menu";
			takeScreenShot(driver);
			clickOnTheDots(driver);
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings("rawtypes")
	public void removeProtFromPostsList(AndroidDriver driver) throws IOException {
		try {
			driver.findElementById("content").click();
			takeScreenShot(driver);
			info = "clicked on hide this post";
		}catch (Exception e) {
			info = "did not clicked on hide this post";
			takeScreenShot(driver);
			removeProtFromPostsList(driver);
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
		
	}
	
	@SuppressWarnings("rawtypes")
	public void reportAboutthePost(AndroidDriver driver) throws IOException {
		try {
			waitForElement(driver, "button_ans_2");
			driver.findElementById("button_ans_2").click();
			info = "clicked on 'I'M NOT INTERESTED IN THIS' button";
			takeScreenShot(driver);
		}catch (Exception e) {
			info = "did not click on 'I'M NOT INTERESTED IN THIS' button";
			takeScreenShot(driver);
			reportAboutthePost(driver);
		}
		
		System.out.println(info);
		Log.appendLogFile(info);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean compareListsOfPosts(AndroidDriver driver) throws IOException {
		int counter = 0;

		try {
			postsListNew = driver.findElementsById("search_recycler_container");
			
			for (WebElement postOriginal : postsListOriginal) 
			{ 
			    for(WebElement postNew : postsListNew) {
			    	if (!postOriginal.equals(postNew)) {
			    		counter += 1;
			    	}
			    }
			}
			
			if (counter == 1) {
				info = "the lists are not equal the relevent post has been removed";
				takeScreenShot(driver);
			}
			
			else {
				info =  "the Lists are equal";
				return false;
			}
			
		}catch(Exception e) {
			info = "Error in flow/get relevent fields";
			takeScreenShot(driver);
			compareListsOfPosts(driver);
			
		}
		return true;
	}

	@SuppressWarnings("rawtypes")
	public void clickOnGoBackButton(AndroidDriver driver) throws IOException {
		try {
			driver.findElementByXPath(
					"//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]")
					.click();
			info = "clicked on myfeed button";
			takeScreenShot(driver);

		} catch (Exception e) {
			info = "did not clicked on myfeed button";
			takeScreenShot(driver);
			clickOnGoBackButton(driver);
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
