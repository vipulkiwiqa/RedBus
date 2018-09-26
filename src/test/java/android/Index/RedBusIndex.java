package android.Index;

import org.testng.Assert;
import org.testng.annotations.Test;

import android.init.AppiumInit;
import android.init.TestCommons;
import android.init.TestLogger;
//import android.indexpage.NotepadIndexPage;

import android.IndexPage.RedBusIndexpage;
import android.Verification.RedBusVerification;

public class RedBusIndex extends AppiumInit {

	@Test
	public void SignupwithRedBus() throws Exception
	{
		int step = 1;
		
		TestCommons.logcase("Sign Up with RedBus using all valid Details ");
		
		TestCommons.log("Step "+(step++)+":Choose The Language ");
		RedBusIndexpage.chosethelanguage(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Click on Continue ");
		RedBusIndexpage.Clickoncontinuebutton(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Click on Join ");
		RedBusIndexpage.joinredbus(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Click on Sign up ");
		RedBusIndexpage.signupredbus(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Enter Mobile Number ");
		RedBusIndexpage.entermobilenumber(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Click on SignUp button  ");
		RedBusIndexpage.clickonsignupbutton(androidDriver);
		
	}//end of function
	
	
	@Test
	public void SigninwithRedBus() throws Exception
	{
		int step = 1;
	
		TestCommons.logcase("Sign In with RedBus using valid Credential Details ");
		
		TestCommons.log("Step "+(step++)+":Choose The Language ");
		RedBusIndexpage.chosethelanguage(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Click on Continue ");
		RedBusIndexpage.Clickoncontinuebutton(androidDriver);
		TestCommons.log("Step "+(step++)+":Click on Login ");
		RedBusIndexpage.login(androidDriver);
		TestCommons.log("Step "+(step++)+":Click on Login Again ");
		RedBusIndexpage.loginAgain(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Enter Mobile Number ");
		RedBusIndexpage.entermobilenumber(androidDriver);
		TestCommons.log("Step "+(step++)+":Click on Login Again ");
		RedBusIndexpage.loginAgainAgain(androidDriver);
		
		/*TestCommons.log("Step "+(step++)+ ":Click on Continue ");
		RedBusIndexpage.Clickoncontinuebutton(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Click on Join ");
		RedBusIndexpage.joinredbus(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Click on Sign up ");
		RedBusIndexpage.signupredbus(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Enter Mobile Number ");
		RedBusIndexpage.entermobilenumber(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Click on SignUp button  ");
		RedBusIndexpage.clickonsignupbutton(androidDriver);*/
		
	}//end of function
	
	@Test
	public void swipethescreens() throws Exception
	{
		int step = 1;
	
		TestCommons.logcase("Sign In with RedBus using valid Credential Details ");
		
		TestCommons.log("Step "+(step++)+":Choose The Language ");
		RedBusIndexpage.chosethelanguage(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Click on Continue ");
		RedBusIndexpage.Clickoncontinuebutton(androidDriver);
		
		TestCommons.pause(10);
		TestCommons.log("Step "+(step++)+":Swipe the Screens Right to Left ");
		TestCommons.rightLeftSwipe(androidDriver, 5000);
		TestCommons.log("Step "+(step++)+":Swipe the Screens Right to Left");
		TestCommons.rightLeftSwipe(androidDriver, 5000);
		
		TestCommons.pause(10);
		TestCommons.log("Step "+(step++)+":Swipe the Screens Left to Right ");
		TestCommons.leftRightSwipe(androidDriver, 5000);
		TestCommons.log("Step "+(step++)+":Swipe the Screens Left to Right");
		TestCommons.leftRightSwipe(androidDriver, 5000);
		
		TestCommons.pause(10);
		TestCommons.log("Step "+(step++)+":Swipe the Screens Right to Left ");
		TestCommons.rightLeftSwipe(androidDriver, 5000);
		TestCommons.log("Step "+(step++)+":Swipe the Screens Right to Left");
		TestCommons.rightLeftSwipe(androidDriver, 5000);
		TestCommons.log("Step "+(step++)+":Click on Skip  ");
		RedBusIndexpage.clickonskip(androidDriver);
		
		TestCommons.log("Step "+(step++)+ ":Tap On Screen ");
		RedBusIndexpage.taponscreen(androidDriver);
		
		
	}//end of function
	
	@Test
	public void selectyourroute() throws Exception
	{
		int step = 1;
	
		TestCommons.logcase("Sign In with RedBus using valid Credential Details ");
		
		TestCommons.log("Step "+(step++)+":Choose The Language ");
		RedBusIndexpage.chosethelanguage(androidDriver);
		TestCommons.log("Step "+(step++)+ ":Click on Continue ");
		RedBusIndexpage.Clickoncontinuebutton(androidDriver);
		
		TestCommons.pause(10);
		TestCommons.log("Step "+(step++)+":Swipe the Screens Right to Left ");
		TestCommons.rightLeftSwipe(androidDriver, 5000);
		TestCommons.log("Step "+(step++)+":Swipe the Screens Right to Left");
		TestCommons.rightLeftSwipe(androidDriver, 5000);
		
		TestCommons.pause(10);
		TestCommons.log("Step "+(step++)+":Swipe the Screens Left to Right ");
		TestCommons.leftRightSwipe(androidDriver, 5000);
		TestCommons.log("Step "+(step++)+":Swipe the Screens Left to Right");
		TestCommons.leftRightSwipe(androidDriver, 5000);
		
		TestCommons.pause(10);
		TestCommons.log("Step "+(step++)+":Swipe the Screens Right to Left ");
		TestCommons.rightLeftSwipe(androidDriver, 5000);
		TestCommons.log("Step "+(step++)+":Swipe the Screens Right to Left");
		TestCommons.rightLeftSwipe(androidDriver, 5000);
		TestCommons.log("Step "+(step++)+":Click on Skip  ");
		RedBusIndexpage.clickonskip(androidDriver);
		
		TestCommons.log("Step "+(step++)+ ":Tap On Screen ");
		RedBusIndexpage.taponscreen(androidDriver);
		
		
		
		
	}//end of function
	
	
}
