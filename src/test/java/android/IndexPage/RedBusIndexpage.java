package android.IndexPage;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Keys;

import android.init.TestCommons;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class RedBusIndexpage {
	
public static void chosethelanguage(AndroidDriver<MobileElement> androidDriver) {
		
		
        TestCommons.pause(15);
		MobileElement checkbox = androidDriver.findElementByXPath("//*[@text='English']/../android.widget.RadioButton");
        
        //MobileElement checkbox = androidDriver.findElementById("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RadioButton");
        checkbox.click();
		TestCommons.pause(10);
		
		
	}//end of function

public static void Clickoncontinuebutton(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(10);
	MobileElement continuebutton = androidDriver.findElementById("in.redbus.android:id/continueButton");
	continuebutton.click();
	TestCommons.pause(10);
	
}

public static void joinredbus(AndroidDriver<MobileElement> androidDriver){
	TestCommons.pause(15);
	MobileElement join = androidDriver.findElementById("in.redbus.android:id/login_signup");
	join.click();
	TestCommons.pause(5);	
}


public static void signupredbus(AndroidDriver<MobileElement> androidDriver){
	TestCommons.pause(10);
	MobileElement join = androidDriver.findElementById("in.redbus.android:id/btnSignUp");
	join.click();
	TestCommons.pause(10);	
}

//in.redbus.android:id/mobileNumber
public static void entermobilenumber(AndroidDriver<MobileElement> androidDriver){
	TestCommons.pause(10);
	MobileElement mob_no = androidDriver.findElementById("in.redbus.android:id/mobileNumber");//in.redbus.android:id/mobileNumber
	mob_no.sendKeys("9537749631");
	TestCommons.pause(10);	
}
//in.redbus.android:id/signupButton
public static void clickonsignupbutton(AndroidDriver<MobileElement> androidDriver){
	TestCommons.pause(10);
	MobileElement sign_up_btn = androidDriver.findElementById("in.redbus.android:id/signupButton");
	sign_up_btn.click();
	TestCommons.pause(25);	
}

public static void login(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(10);
	MobileElement login_btn = androidDriver.findElementById("in.redbus.android:id/login");//in.redbus.android:id/login
	login_btn.click();
	TestCommons.pause(25);	
	
}

public static void loginAgain(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(10);
	MobileElement login_btn_again = androidDriver.findElementById("in.redbus.android:id/btnSignIn");//in.redbus.android:id/btnSignIn
	login_btn_again.click();
	TestCommons.pause(25);	
	
}

public static void loginAgainAgain(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(10);
	MobileElement login_btn_again_again = androidDriver.findElementById("in.redbus.android:id/loginButton");
	login_btn_again_again.click();
	TestCommons.pause(25);	
	
}



public static void clickonskip(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(10);
	MobileElement skip_lnk = androidDriver.findElementById("in.redbus.android:id/skip");
	skip_lnk.click();
	TestCommons.pause(5);	
	
}

////*[@text='Enter City']
public static void taponscreen(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(10);
	List<MobileElement> taps = androidDriver.findElementsById("in.redbus.android:id/sourceLayout");
	for(MobileElement ele:taps){
		TestCommons.pause(2);
		ele.tap(1, 1);
		TestCommons.log("======> Tap on the Enter City Field <=====");
		break;
		}
		TestCommons.pause(10);	
    }
public static void SourceCity(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(10);
	MobileElement source_city = androidDriver.findElementById("in.redbus.android:id/txtSource");
	source_city.click();
	//source_city.sendKeys("Ahmeda");
	TestCommons.pause(5);	
	MobileElement source_city_name = androidDriver.findElementById("in.redbus.android:id/search_src_text");
	source_city_name.sendKeys("Ahmeda");
	TestCommons.pause(5);
	MobileElement select_source = androidDriver.findElementByXPath("//*[@text='Ahmedabad']");
	select_source.click();	
}

public static void DestinationCity(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(5);
	MobileElement Destination_city = androidDriver.findElementById("in.redbus.android:id/txtDestination");
	Destination_city.click();
	//Destination_city.sendKeys("Mumb");
	TestCommons.pause(5);	
	MobileElement source_city_name = androidDriver.findElementById("in.redbus.android:id/search_src_text");
	source_city_name.sendKeys("Mumb");
	TestCommons.pause(5);
	MobileElement select_destination = androidDriver.findElementByXPath("//*[@text='Mumbai']");
	select_destination.click();	
	
}


public static void date(AndroidDriver<MobileElement> androidDriver){
	TestCommons.pause(10);
	MobileElement date = androidDriver.findElementById("in.redbus.android:id/txtToday");
	//date.sendKeys(TestCommons.RandomDate(1, 30, 10, 12, 2018, 2018));
	//date.click();
	/*date.sendKeys("29/09/2018");
	date.sendKeys(Keys.ENTER);*/
	date.click();
	TestCommons.pause(5);
	
	MobileElement tomorrow = androidDriver.findElementById("in.redbus.android:id/dates_pane_tommorow");
	tomorrow.click();
	TestCommons.pause(10);	
	
	MobileElement navigate_back = androidDriver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']");
	navigate_back.click();
	TestCommons.pause(10);
}


public static void btnSearch(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(5);
	MobileElement btn_Search= androidDriver.findElementById("in.redbus.android:id/btnSearch");
	btn_Search.click();
	TestCommons.pause(10);	
	
}


public static void profile_icon(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(5);
	MobileElement profile_icn= androidDriver.findElementById("in.redbus.android:id/action_profile");
	profile_icn.click();
	TestCommons.pause(10);	
	
}

}
