package com.quickride.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.quickride.baselib.GenericLib;
import com.quickride.baselib.QRBaseLib;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class FeedbackPO {
	AndroidDriver driver = null;
	public Logger qrLog = Logger.getLogger(this.getClass());
	public FeedbackPO(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id ="com.disha.quickride:id/search_icon")
	private WebElement eleSearchBtn;
	public WebElement getEleSearchBtn()
	{
		return eleSearchBtn;
	}
	
	@FindBy(name ="Start Exploring")
	private WebElement eleStartExploringTxt;
	public WebElement getEleStartExploringTxt()
	{
		return eleStartExploringTxt;
	}
	@FindBy(name="Enter ride start address")
	private WebElement eleEntRdStSearchIcn;
	public WebElement getEleEntRdStSearchIcn() {
		return eleEntRdStSearchIcn;
	}

	@FindBy(id="com.disha.quickride:id/searchForLocation")
	private WebElement eleEnterAddTxtFld;
	public WebElement getEleEnterAddTxtFld()
	{
		return eleEnterAddTxtFld;
	}

	@FindBy(id="com.disha.quickride:id/selectedLocation_desc_layout")
	private WebElement eleFirstOption;
	public WebElement getEleFirstOption()
	{
		return  eleFirstOption ;
	}
	
	@FindBy(id="com.disha.quickride:id/addPassengers")
	private WebElement eleInviteIcn;
	public WebElement getEleInviteIcn()
	{
		return  eleInviteIcn ;
	}

	
	@FindBy(id = "com.disha.quickride:id/contact_user_name")
	private WebElement elePassengerLstItm;
	public WebElement getElePassengerLstItm()
	{
		return elePassengerLstItm;
	}
	@FindBy(name="Search by Name")
	private WebElement eleSearchTxtFld;
	public WebElement getEleSearchTxtFld()
	{
		return  eleSearchTxtFld ;
	}
	
	@FindBy(id = "com.disha.quickride:id/findNow")
	private WebElement eleRideNwBtn;
	public WebElement getEleRideNwBtn()
	{
		return eleRideNwBtn;
	}

	@FindBy(name="Find Ride")
	private WebElement eleFindRideTab;
	public WebElement getEleFindRideTab() {
		return eleFindRideTab;
	}

	@FindBy(id="com.disha.quickride:id/addPassengers")
	private WebElement eleAddPassengerBtn;
	public WebElement getEleAddPassengerBtn()
	{
		return eleAddPassengerBtn;
	}

	@FindBy(id="com.disha.quickride:id/joinToRide")
	private WebElement eleJoinBtn;
	public WebElement getEleJoinBtn() {
		return eleJoinBtn;
	}

	@FindBy(name="Done")
	private WebElement eleDoneBtn;
	public WebElement getEleDoneBtn()
	{
		return eleDoneBtn;
	}

	@FindBy(name="Start")
	private WebElement eleStartBtn;
	public WebElement getEleStartBtn() {
		return eleStartBtn;
	}
	@FindBy(id="com.disha.quickride:id/drawer_unread_notifications")
	private WebElement eleNotificationCntTxt;
	public WebElement getEleNotificationCntTxt() {
		return eleNotificationCntTxt;
	}
	
	@FindBy(name="Yes")
	private WebElement eleYesBtn;
	public WebElement getEleYesBtn() 
	{
		return eleYesBtn;
	}

	@FindBy(id="com.disha.quickride:id/fromToInfo")
	private WebElement eleSelectstartedRideLyout;
	public WebElement getEleSelectstartedRideLyout() 
	{
		return eleSelectstartedRideLyout;
	}

	@FindBy(name="Stop")
	private WebElement eleStopBtn;
	public WebElement getEleStopBtn()
	{
		return eleStopBtn;
	}
	
	@FindBy(name="Next")
	private WebElement eleNextBtn;
	public WebElement getEleNextBtn() 
	{
		return eleNextBtn;
	}

	@FindBy(name="Next")
	private WebElement eleRideNextBtn;
	public WebElement getEleRideNextBtn() 
	{
		return eleRideNextBtn;
	}
		
	@FindBy(id = "com.disha.quickride:id/userRatingBar //the feed back")
	private WebElement  eleRatingBar;
	public WebElement getEleRatingbar()
	{
		return eleRatingBar;
	}
	
	@FindBy(name="comments")
	private WebElement  eleCommmentTxtFld;
	public WebElement getEleCommmentTxtFld()
	{
		return eleCommmentTxtFld;
	}
	
	@FindBy(name="Submit")
	private WebElement  eleSubmitBtn;
	public WebElement getEleSubmitBtn()
	{
		return eleSubmitBtn;
	}
	
	@FindBy(name="Check out")
	private WebElement eleCheckOutBtn;
	public WebElement getEleCheckOutBtn(){
		return eleCheckOutBtn;
	}

	@FindBy(name= "Create ride")
	private WebElement  eleCreateRideBtn;
	public WebElement getEleCreateRideBtn()
	{
		return eleCreateRideBtn;
	}

	@FindBy(name= "Offer Ride")
	private WebElement  eleOfferRideTab;
	public WebElement getEleOfferRideTab()
	{
		return eleOfferRideTab;
	}
	@FindBy(id="com.disha.quickride:id/top_layout")
	private WebElement eleRideEndAddress;
	public WebElement getEleRideEndAddress()
	{
		return eleRideEndAddress;
	}

	@FindBy(name= "Enter ride end address")
	private WebElement  eleEndAddressTxtFld;
	public WebElement getEleEndAddressTxtFld()
	{
		return eleEndAddressTxtFld;
	}
	
	@FindBy(id="com.disha.quickride:id/scheduleRide")
	private WebElement  eleOfferRideBtn;
	public WebElement getEleOfferRideBtn()
	{
		return  eleOfferRideBtn;
	}

	@FindBy(id="com.disha.quickride:id/back_icon_ride_view_image")
	private WebElement  eleArrowIcn;
	public WebElement getEleArrowIcn()
	{
		return eleArrowIcn;
	}
	
	@FindBy(id="com.disha.quickride:id/profile_actionbar_backPress_image")
	private WebElement  eleProfileArrowIcn;
	public WebElement getEleProfileArrowIcn()
	{
		return eleProfileArrowIcn;
	}
	@FindBy(name="New Ride")
	private WebElement  elepassArrowIcn;
	public WebElement getElepassArrowIcn()
	{
		return elepassArrowIcn;
	}

	
	
	@FindBy(name="Accept")
	private WebElement  eleAcceptLnk;
	public WebElement getEleAcceptLnk()
	{
		return eleAcceptLnk;
	}
	
	@FindBy(id="com.disha.quickride:id/drawer_notification_icon")
	private WebElement  eleNotificationIcn;
	public WebElement getEleNotificationIcn()
	{
		return eleNotificationIcn;
	}
	
	@FindBy(id="com.disha.quickride:id/description")
	private WebElement  eleNotificationTxt;
	public WebElement getEleNotificationTxt()
	{
		return eleNotificationTxt;
	}

	@FindBy(name="QuickRide Wallet")
	private WebElement  eleQRWalletNotiTxt;
	public WebElement getEleQRWalletNotiTxt()
	{
		return eleQRWalletNotiTxt;
	}
	@FindBy(id="com.disha.quickride:id/description")
	private WebElement  eleQRWalletDebitedTxt;
	public WebElement getEleQRWalletDebitedTxt()
	{
		return eleQRWalletDebitedTxt;
	}
	
	@FindBy(xpath="(//android.widget.TextView[@name='QuickRide Wallet']/../android.widget.TextView[@id='com.disha.quickride:id/description']")
	private WebElement  eleQRWalletCreditedTxt;
	public WebElement getEleQRWalletCreditedTxt()
	{
		return eleQRWalletCreditedTxt;
	}
	@FindBy(id="com.disha.quickride:id/notification_time")
	private WebElement  eleNotiTimeTxt;
	public WebElement getEleNotiTimeTxt()
	{
		return eleQRWalletNotiTxt;
	}
	
	@FindBy(name="Check in")		
	private static WebElement eleCheckInBtn;
	public WebElement getEleCheckInBtn()
	{
		return eleCheckInBtn;
	}
	
	@FindBy(name="Find rider")
	private WebElement eleFindRiderIcn;
	public WebElement getEleFindRiderIcn()
	{
		return eleFindRiderIcn;
	}
	
	@FindBy(name="Reject")		
	private static WebElement eleRejectLnk;
	public WebElement getEleRejectLnk()
	{
		return eleRejectLnk;
	}
	
	@FindBy(name="Profile")		
	private static WebElement eleProfileLnk;
	public WebElement getEleProfileLnk()
	{
		return eleProfileLnk;
	}
	
	@FindBy(name="View")		
	private static WebElement eleViewLnk;
	public WebElement getEleViewLnk()
	{
		return eleViewLnk;
	}
	@FindBy(id="com.disha.quickride:id/forward_image")		
	private static WebElement eleArrowForwadIcn;
	public WebElement getEleArrowForwadIcn()
	{
		return eleArrowForwadIcn;
	}
	@FindBy(id="com.disha.quickride:id/rideParticipantName_rideview")		
	private static WebElement eleParticipantIcn;
	public WebElement getEleParticipantIcn()
	{
		return eleParticipantIcn;
	}
	
	@FindBy(id="com.disha.quickride:id/settingsRideView")		
	private static WebElement eleCanelMenu;
	public WebElement getEleCanelMenu(){
		return eleCanelMenu;
	}
	
	@FindBy(name="Cancel")
	private WebElement eleCancelbtn;
	public WebElement getEleCancelbtn(){
		return eleCancelbtn;
	}
	
	@FindBy(name="Type your message")		
	private static WebElement eleChatTxtFld;
	public WebElement getEleChatTxtfld()
	{
		return eleChatTxtFld;
	}
	
	@FindBy(id="com.disha.quickride:id/sendButton")		
	private static WebElement eleChatSendBtn;
	public WebElement getEleChatSendBtn()
	{
		return eleChatSendBtn;
	}
	
	@FindBy(id="com.disha.quickride:id/actionbar_chat_back_icon2")		
	private static WebElement eleChatArrowIcn;
	public WebElement getEleChatArrowIcn()
	{
		return eleChatArrowIcn;
	}
	
	@FindBy(id="com.disha.quickride:id/passengerDetails")		
	private static WebElement eleScheduled;
	public WebElement getEleScheduled()
	{
		return eleScheduled;
	}
	
	
	
	@FindBy(id="com.disha.quickride:id/location")
	private WebElement eleFromLocation;
	public WebElement getEleFromLocation()
	{
		return eleFromLocation;
	}
	@FindBy(id="com.disha.quickride:id/location_to")
	private WebElement eleToLocation;
	public WebElement getEleToLocation()
	{
		return eleToLocation;
	}
	@FindBy(id="com.disha.quickride:id/find_riders")
	private WebElement eleFindRide;
	public WebElement getEleFindRide()
	{
		return eleFindRide;
	}
	@FindBy(id="com.disha.quickride:id/find_passengers")
	private WebElement eleOfferRide;
	public WebElement getEleOfferRide()
	{
		return eleOfferRide;
	}
	
	@FindBy(id="com.disha.quickride:id/rideCreationButton")
	private WebElement elePostRideButton;
	public WebElement getElePostRideButton()
	{
		return elePostRideButton;
	}
	@FindBy(id="com.disha.quickride:id/rideScheduleTimeFirstStep")
	private WebElement eleTimePicker;
	public WebElement getEleTimePicker()
	{
		return eleTimePicker;
	}
	@FindBy(id="com.disha.quickride:id/passengerNoOfSeatsLayout")
	private WebElement eleNoOfSeats;
	public WebElement getNoOfSeats()
	{
		return eleNoOfSeats;
	}
	@FindBy(id="com.disha.quickride:id/riderCarLayout")
	private WebElement eleVehicle;
	public WebElement getEleVehicle()
	{
		return eleVehicle;
	}
	
	@FindBy(id="com.disha.quickride:id/editRouteTextViewRideCreation")
	private WebElement eleEditRoute;
	public WebElement getEleEdtRoute()
	{
		return eleEditRoute;
	}
	@FindBy(id="com.disha.quickride:id/searchForLocation")
	private WebElement eleSearchLocation;
	public WebElement getEleSearchLocation()
	{
		return eleSearchLocation;
	}
	
	@FindBy(id="com.disha.quickride:id/selectedLocationName")
	private WebElement eleLocationName;
	public WebElement getEleLocationName()
	{
		return eleLocationName;
	}
	@FindBy(id="com.disha.quickride:id/positive_button")
	private WebElement eleConfigureVehicleButton;
	public WebElement getEleConfigureVehicleButton()
	{
		return eleConfigureVehicleButton;
	}
	
	@FindBy(id="com.disha.quickride:id/car_registration_name_editText")
	private WebElement eleRegNo;
	public WebElement getEleRegNo()
	{
		return eleRegNo;
	}
	
	@FindBy(id="com.disha.quickride:id/user_profile_edit_save_text")
	private WebElement eleSaveProfile;
	public WebElement getEleSaveProfile()
	{
		return eleSaveProfile;
	}
	
	@FindBy(id = "com.disha.quickride:id/back_icon_ride_view_image")
	private WebElement elePassengerRideViewBackButton;
	public WebElement getElePassengerRideViewBackButton()
	{
		return elePassengerRideViewBackButton;
	}	
	@FindBy(id="com.disha.quickride:id/riderImage")
	private WebElement eleFindRider;
	public WebElement getEleFindRider()
	{
		return eleFindRider;
	}
	
	
	@FindBy(id="com.disha.quickride:id/back_icon_ride_view_image")
	private WebElement eleRouteViewBackButton;
	public WebElement getEleRouteViewbackButton()
	{
		return eleRouteViewBackButton;
	}
	
	@FindBy(id="com.disha.quickride:id/back_icon_ride_view_image")
	private WebElement eleRiderRideViewBackButton;
	public WebElement getEleRiderRideViewBackButton()
	{
		return eleRiderRideViewBackButton;
	}
	
	@FindBy(id= "com.disha.quickride:id/call_icon_matched_user")
	private WebElement eleCallIcon;
	public WebElement getEleCallIcon()
	{
		return eleCallIcon;
	}
	
	
	/*
	public void joinRideOld(String src,String dest,String sName)
	{
		try{
			getEleSearchBtn().click();
			getEleEnterAddTxtFld().sendKeys(src);
			getEleFirstOption().click();
			getEleRideNwBtn().click();
			tohandleblackscreen();
			getEleEndAddressTxtFld().click();
			getEleEnterAddTxtFld().sendKeys(dest);
			getEleFirstOption().click();
			getEleFindRideTab().click();
			driver.findElement(By.name(sName)).click();
			Assert.assertTrue(getEleJoinBtn().isDisplayed(), "Join button is not displayed for passenger");
			qrLog.info("Join Button is displayed");
			getEleJoinBtn().click();
			getEleArrowIcn().click();
			}
		catch(Exception e)
			{
			qrLog.error("Exception in passengerJoin()");
			e.printStackTrace();
			Assert.fail();
			}
	}*/
	public void joinRide(String src,String dest,String sName)
	{
		try
		{
			
			getEleFromLocation().click();
			getEleEnterAddTxtFld().sendKeys(src);
			getEleToLocation().click();
			getEleEnterAddTxtFld().sendKeys(dest);
			getEleFindRide().click();
			getEleFindRider().click();
			driver.findElement(By.name(sName)).click();
			Assert.assertTrue(getEleJoinBtn().isDisplayed());
			getEleJoinBtn().click();
			
			
		}
		catch(Exception e)
		{
			qrLog.error("Exception in passengerjoin()");
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void ViewMatchingOption(String src,String dest,String sName)
	{
		try
		{
			getEleFromLocation().click();
			getEleEnterAddTxtFld().sendKeys(src);
			getEleToLocation().click();
			getEleEnterAddTxtFld().sendKeys(dest);
			getEleFindRide().click();
			getElePostRideButton().click();
			
			driver.findElement(By.name(sName)).click();				
		}
		catch(Exception e)
		{
			qrLog.error("ViewMatchingOption() failed"); 
			e.printStackTrace();
			Assert.fail();
		}
	}
	/*public void createRideOld(String src,String dest, RidesPO ridesPo){
		try
		{	getEleSearchBtn().click();
			getEleEnterAddTxtFld().sendKeys(src);
			getEleFirstOption().click();
			getEleRideNwBtn().click();
			tohandleblackscreen();
			getEleEndAddressTxtFld().click();
			getEleEnterAddTxtFld().sendKeys(dest);
			getEleFirstOption().click();
			getEleOfferRideTab().click();
			verifyOfferRide();
			Assert.assertTrue(getEleArrowIcn().isDisplayed(), "Ride Scheduled is not displayed");
			qrLog.info("Ride Scheduled is displayed");
			getEleArrowIcn().click();
		}
		catch(Exception e)
		{
			qrLog.error("Exception in createRide()");
			e.printStackTrace();
			Assert.fail();
		}
	}*/
	public void createRide(String src, String dest, RidesPO ridesPo)
	{
		try
		{
			getEleFromLocation().click();
			getEleEnterAddTxtFld().sendKeys(src);
			getEleFirstOption().click();
			getEleToLocation().click();
			getEleEnterAddTxtFld().sendKeys(dest);
			getEleFirstOption().click();
			getEleOfferRide().click();
			getElePostRideButton().click();
			VerifyIfvehicleConfigured();			
		}
		catch(Exception e)
		{
			qrLog.error("Exception in createRide()");
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void VerifyIfvehicleConfigured()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try
		{
			getEleConfigureVehicleButton().click();
			getEleRegNo().sendKeys("xyz");
			getEleSaveProfile().click();
			getEleRiderRideViewBackButton().click();
		}
		catch(Exception e)
		{
			getEleRiderRideViewBackButton().click();
		}
	}
	public void verifyOfferRide()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			try
			{
				getEleCreateRideBtn().click();
			}
			catch(Exception e)
			{
				getEleOfferRideBtn().click();
			}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void acceptRide()
	{
		try
		{	getEleArrowIcn().click();
			navigateNotification();	
			getEleAcceptLnk().click();
			getEleArrowIcn().click();
			getEleStartBtn().click();
			getEleYesBtn().click();
			Assert.assertTrue(getEleStopBtn().isDisplayed(), "Ride is not started ");
			qrLog.info("Ride is started successfully");
		}
		catch(Exception e)
		{
			qrLog.error("Exception in acceptRide()");
			e.printStackTrace();
			Assert.fail();
		}
}
	public void rejectRide()
	{
		try
		{	getEleArrowIcn().click();
			getEleRejectLnk().click();
			getEleArrowIcn().click();
		}
		catch(Exception e)
		{	qrLog.error("Exception in acceptRide()");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void checkInRide()
	{
		try
		{		
			getEleCheckInBtn().click();
			getEleYesBtn().click();
			Assert.assertTrue(getEleCheckOutBtn().isDisplayed(), "Ride is not started ");
			qrLog.info("Ride is available for Passenger");
		}
		catch(Exception e)
		{
			qrLog.error("Exception in checkInRide()");
			e.printStackTrace();
			Assert.fail();
		}
}
public void checkOutRide()
{
	try{
		
		getEleCheckOutBtn().click();
		getEleYesBtn().click();
		Assert.assertTrue(getEleNextBtn().isDisplayed(), "Passenger failed to check out from ride");
		qrLog.info("Passenger checked out from ride successfully");
		
		
		
	}catch(Exception e)
	{
		qrLog.error("Exception in checkOutRide()");
		e.printStackTrace();
		Assert.fail();
	
	}
}


		public void findRider(String rider2){
			getEleFindRiderIcn().click();
		}
			
		public void tohandleblackscreen()
		{
		try
		{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			if(getEleRideEndAddress().isDisplayed())
			{
				getEleRideEndAddress().click();
				getEleRideEndAddress().click();
				driver.context("WEBVIEW").findElement(By.id("com.disha.quickride:id/top_layout")).click();
				driver.context("WEBVIEW").findElement(By.id("com.disha.quickride:id/top_layout")).click();
	
				qrLog.info("black screen tap not seen");
			}
		}
		catch(Exception e)
		{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.context("NATIVE_APP");
			qrLog.info("black screen tap not seen");
		
		}
		}

public void navigateNotification()
{
	try
	{
		if(eleNotificationIcn.isDisplayed())
		{
			eleNotificationIcn.click();
			
		}
		
	}
	catch(Exception e)
	{
		qrLog.info("Notification is directly displayed");
	}
}
	


}

