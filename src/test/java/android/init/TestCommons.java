/**
 * 
 */
package android.init;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Random;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author RahulR
 *
 */
public class TestCommons {

	public static void type(AndroidDriver<MobileElement> driver, MobileElement element, String text) {

		element.clear();

		hideKeyboard(driver);

		element.sendKeys(text);

		hideKeyboard(driver);

		pause(1);
	}

	public static void hideKeyboard(AndroidDriver<MobileElement> driver) {
		try {
			driver.hideKeyboard();
		} catch (Exception e) {
			System.err.println("Keyboard Hidden Already");
		}
	}

	public static int getRandomNumber(int maxNum) {
		return new Random().nextInt(maxNum) + 1;
	}

	public static void pause(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			System.err.println("Error in Thread - Wait");
			e.printStackTrace();
		}
	}

	public static void addLabel(AndroidDriver<MobileElement> driver, String msg) {

		if (AppiumInit.isAddLabel)
		{
			//driver.label(msg);
		}
		else {
			TestCommons.log(msg);
		}

	}

	public static String generateRandomChars(int length) {
		String random = RandomStringUtils.randomAlphabetic(length);
		return random;
	}
	
	public static int randBetween(int start, int end) {
		  return start + (int) Math.round(Math.random() * (end - start));
	}
	
	public static String getTestDate()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c= Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH,7);
        String newDate=sdf.format(c.getTime());
		return newDate;
	}
	
	public static WebElement waitForElement(WebDriver androidWebDriver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(androidWebDriver, 20);
		WebElement waitElement=wait.until(ExpectedConditions.elementToBeClickable(element));
		return waitElement;
	}
	
	public static WebElement waitForElementVisible(WebDriver androidWebDriver,String xpath1)
	{
		WebDriverWait wait=new WebDriverWait(androidWebDriver, 60);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath1)));
		WebElement waitElement = androidWebDriver.findElement(By.xpath(xpath1)); 
		return waitElement;
	}
	
	
	public static void clickOn(WebDriver androidDriver, WebElement element) {
		highlightElement(androidDriver, element);
		element.click();
	}
	
	public static void highlightElement(WebDriver androidDriver, WebElement element) {
		
		((JavascriptExecutor) androidDriver).executeScript(
				"arguments[0].style.border = '3px solid yellow'", element);
		
		pause(2);
		
		((JavascriptExecutor) androidDriver).executeScript(
				"arguments[0].style.border = '0px'", element);
	}
	
	public static boolean isElementDisplayed(WebDriver androidDriver, MobileElement element) {
		try {
			if(element.isDisplayed())
			{
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	
	public static String getCurrentTimeStampString() {

		java.util.Date date = new java.util.Date();

		SimpleDateFormat sd = new SimpleDateFormat("MMddHHmmssSS");
		TimeZone timeZone = TimeZone.getDefault();
		Calendar cal = Calendar.getInstance(new SimpleTimeZone(timeZone.getOffset(date.getTime()), "GMT"));
		sd.setCalendar(cal);
		return sd.format(date);
	}
	
	public static void navigateBack(AndroidDriver<MobileElement> androidDriver) {
		pause(3);
		TestCommons.log("Navigate back.");
		TestCommons.addLabel(androidDriver, "Navigate back.");
		androidDriver.navigate().back();
		pause(6);
	}
	
	public static void log(String log)
	{
		System.out.println("<br>"+log+"</br>");
		Reporter.log("<br>"+log+"</br>");
	}
	
	public static void logcase(String msg) {
		  System.out.println(msg);
		  Reporter.log("<strong> <h3 style=\"color:DarkViolet\"> " + msg
		    + "</h3> </strong>");
		  }
	
	public static void logverification(String msg) {
		  System.out.println(msg);
		  Reporter.log("<br><Strong><font color=#009000>"+ msg+"</font></strong></br>");
		  
		  
		  }

	public static void logStatus(String Status) {
		System.out.println(Status);
		if (Status.equalsIgnoreCase("Pass")) {
			log("<br><Strong><font color=#008000>Pass</font></strong></br>");
		} else if (Status.equalsIgnoreCase("Fail")) {
			log("<br><Strong><font color=#FF0000>Fail</font></strong></br>");

		}

	}

	
	public static void makeScreenshot(WebDriver driver, String screenshotName) {

		WebDriver augmentedDriver = new Augmenter().augment(driver);

		/* Take a screenshot */
		File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		String nameWithExtention = screenshotName + ".png";

		/* Copy screenshot to specific folder */
		try {
			/*
			 * String reportFolder = "target" + File.separator +
			 * "failsafe-reports" + File.separator + "firefox" + File.separator;
			 */
			String reportFolder = "test-output" + File.separator;
			String screenshotsFolder = "screenshots";
			File screenshotFolder = new File(reportFolder + screenshotsFolder);
			if (!screenshotFolder.getAbsoluteFile().exists()) {
				screenshotFolder.mkdir();
			}
			FileUtils.copyFile(screenshot,
					new File(screenshotFolder + File.separator + nameWithExtention).getAbsoluteFile());
		} catch (IOException e) {
			log("Failed to capture screenshot: " + e.getMessage());
		}
		log(getScreenshotLink(nameWithExtention, nameWithExtention)); // add
		
	}
	
	public static String getScreenshotLink(String screenshot_name, String link_text) {

		log("<br><Strong><font color=#FF0000>--Failed</font></strong>");
		return "<a href='../test-output/screenshots/" + screenshot_name + "' target='_new'>" + link_text + "</a>";
	}


	// Vipul
	//Swipe 
	// * Time duration should be in milliseconds
	
	/**
	  /* Method to swipe screen from Bottom to Top (Vertical) Get the size of
	  * screen. Find swipe start and end point from screen's width and height.
	  * Find starty point which is at bottom side of screen. Find endy point
	  * which is at top side of screen. Find horizontal point where you wants to
	  * swipe. It is in middle of screen width.
	  * Time duration should be in milliseconds
	  */
	 public static void bottomTopswipe(AndroidDriver<MobileElement> driver,int timeduration) {

		 TestCommons.pause(10);
		  Dimension size = driver.manage().window().getSize();
		  System.out.println(size);
		  int starty = (int) (size.height * 0.70);
		  int endy = (int) (size.height * 0.10);
		  int startx = size.width / 2;
		  System.out.println("Start swipe operation");
		  driver.swipe(startx, starty, startx, endy, timeduration);

		 }
	// * Time duration should be in milliseconds
	 
	
	  /** Method to swipe screen from Top to Bottom (Vertical) Get the size of
	  * screen. Find swipe start and end point from screen's width and height.
	  * Find starty point which is at bottom side of screen. Find endy point
	  * which is at top side of screen. Find horizontal point where you wants to
	  * swipe. It is in middle of screen width. 
	         * Time duration should be in milliseconds*/
	 public static void topBottomswipe(AndroidDriver<MobileElement> driver,int timeduration) {

		 TestCommons.pause(10);
		 Dimension size = driver.manage().window().getSize();
		  System.out.println(size);
		 int starty = (int) (size.height * 0.7);
		  int endy = (int) (size.height * 0.20);
		  int startx = size.width / 2;
		  System.out.println("Start swipe operation");
		  driver.swipe(startx, endy, startx, starty, timeduration);

		 }
     // * Time duration should be in milliseconds
	 
	 /**
	  * 
	  * Method to swipe screen from right to left (Horizontal) duration should be
	  * in milliseconds Get the size of screen. Find swipe start and end point
	  * from screen's width and height. Find startx point which is at right side
	  * of screen. Find endx point which is at left side of screen. Find vertical
	  * point where you wants to swipe. It is in middle of screen height. 
	         * Time duration should be in milliseconds
	   */

	 public static void rightLeftSwipe(AndroidDriver<MobileElement> driver,int timeduration) {
         TestCommons.pause(10);
		 Dimension size = driver.manage().window().getSize();
		  System.out.println(size);
		  int startx = (int) (size.width * 0.7);
		  int endx = (int) (size.width * 0.01);
		  int starty = size.height / 2;
		  System.out.println("Start swipe operation");
		  driver.swipe(startx, starty, endx, starty, timeduration);

		 }
	 
	 // * Time duration should be in milliseconds
	 
	 /**
	  * 
	  * Method to swipe screen from left to right (Horizontal) duration should be
	  * in milliseconds Get the size of screen. Find swipe start and end point
	  * from screen's width and height. Find startx point which is at right side
	  * of screen. Find endx point which is at left side of screen. Find vertical
	  * point where you wants to swipe. It is in middle of screen height. 
	         * Time duration should be in milliseconds
	      */
	 public static void leftRightSwipe(AndroidDriver<MobileElement> driver,int timeduration) {
		  // duration should be in milliseconds
		 TestCommons.pause(10);
		 Dimension size = driver.manage().window().getSize();
		  System.out.println(size);
		  int startx = (int) (size.width * 0.99);
		  int endx = (int) (size.width * 0.3);
		  int starty = size.height / 2;
		  System.out.println("Start swipe operation");
		  driver.swipe(endx, starty, startx, starty, timeduration);

		 }
	 
	 private static final String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		public static String randomAlphaNumeric(int count) {
			StringBuilder builder = new StringBuilder();
			while (count-- != 0) {
			int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
			}
			return builder.toString();
			}

		private static final String ALPHA_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		public static String randomAlpha(int count) {
			StringBuilder builder = new StringBuilder();
			while (count-- != 0) {
			int character = (int)(Math.random()*ALPHA_STRING.length());
			builder.append(ALPHA_STRING.charAt(character));
			}
			return builder.toString();
			}
		

		private static final String NUMERIC_STRING = "01234567890123456789";
		public static String randomNumeric(int count) {
			StringBuilder builder = new StringBuilder();
			while (count-- != 0) {
			int character = (int)(Math.random()*NUMERIC_STRING.length());
			builder.append(NUMERIC_STRING.charAt(character));
			}
			return builder.toString();
			}

		public static String RandomDate(int startDay,int endDay,int stratMonth,int endMonth,int startYear, int endYear) {
			// TODO Auto-generated method stub
			int day = createRandomIntBetween(startDay, endDay);
	        int month = createRandomIntBetween(stratMonth,endMonth);
	        int year = createRandomIntBetween(startYear, endYear);
	        String date =  Integer.toString(day)+"/"+Integer.toString(month)+"/"+Integer.toString(year);
	        return date;      
		}
		
		public static int createRandomIntBetween(int start, int end) {
	        return start + (int) Math.round(Math.random() * (end - start));
	    }

		
}
