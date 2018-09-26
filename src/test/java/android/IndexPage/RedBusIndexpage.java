package android.IndexPage;
import java.util.List;

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
	MobileElement mob_no = androidDriver.findElementById("in.redbus.android:id/mobileNumber");
	mob_no.sendKeys("1234567890");
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
	MobileElement login_btn = androidDriver.findElementById("in.redbus.android:id/login");
	login_btn.click();
	TestCommons.pause(25);	
	
}

public static void loginAgain(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(10);
	MobileElement login_btn_again = androidDriver.findElementById("in.redbus.android:id/btnSignIn");
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
	TestCommons.pause(20);
	MobileElement skip_lnk = androidDriver.findElementById("in.redbus.android:id/skip");
	skip_lnk.click();
	TestCommons.pause(10);	
	
}

////*[@text='Enter City']
public static void taponscreen(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(10);
	List<MobileElement> taps = androidDriver.findElementsByXPath("//*[@text='Enter City']");
	for(MobileElement ele:taps){
		TestCommons.pause(2);
		ele.tap(1, 1);
		TestCommons.log("======> Tap on the Enter City Field <=====");
		break;
		}
		TestCommons.pause(15);	
    }
public static void SourceCity(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(5);
	MobileElement source_city = androidDriver.findElementById("in.redbus.android:id/txtSource");
	source_city.click();
	source_city.sendKeys("Ahmedabad");
	TestCommons.pause(10);	
	
}
public static void DestinationCity(AndroidDriver<MobileElement> androidDriver) {
	// TODO Auto-generated method stub
	TestCommons.pause(5);
	MobileElement Destination_city = androidDriver.findElementById("in.redbus.android:id/txtDestination");
	Destination_city.click();
	Destination_city.sendKeys("Mumbai");
	TestCommons.pause(10);	
	
}

}
