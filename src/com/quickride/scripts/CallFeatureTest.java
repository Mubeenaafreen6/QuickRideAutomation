package com.quickride.scripts;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.quickride.PO.FeedbackPO;
import com.quickride.PO.NewUserRegPO;
import com.quickride.PO.QRProfilePO;
import com.quickride.PO.RidesPO;
import com.quickride.PO.SettingsPO;
import com.quickride.baselib.GenericLib;
import com.quickride.baselib.QRBaseLib;

public class CallFeatureTest extends QRBaseLib
{
         public String sData[]= null;
         public String sTestCaseID=null;
         NewUserRegPO newUserRegPo;
         FeedbackPO feedbackPo;
         RidesPO ridesPo;
         QRProfilePO qrProfilePo;
         SettingsPO settingsPo;
         public Logger qrLog = Logger.getLogger(this.getClass());
         
         @Test(priority = 1, enabled = false)
         public void testCallOptionEnabled()
         {
        	 sTestCaseID = "CallFeature_01";
        	 sData = GenericLib.toReadExcelData(sTestCaseID);
        	 newUserRegPo = new NewUserRegPO(driver);
        	 feedbackPo = new FeedbackPO(driver);
        	 settingsPo = new SettingsPO(driver);
        	 qrProfilePo= new QRProfilePO(driver);
        	 try
        	 {
        		 newUserRegPo.signUPorLogin(sData[1], sData[2], sData[3]);        		         		 
        		 settingsPo.chooseCallFromAnyone();
        		 feedbackPo.createRide(sData[4],sData[5] ,ridesPo);
        		 qrProfilePo.logout();
        		 newUserRegPo.signUPorLogin(sData[6], sData[7], sData[8]);
        		 feedbackPo.ViewMatchingOption(sData[4], sData[5], sData[3]);   
        		 Assert.assertTrue(feedbackPo.getEleCallIcon().isDisplayed());		
        	 }
        	 catch(Exception e)
        	 {
        		 qrLog.error("testCallOptionEnabled failed()");
        		 e.printStackTrace();
        		 Assert.fail();
        	 }
         }
         @Test(priority = 2,enabled = true)
         public void testCallOptionDisabled()
         {
        	 sTestCaseID = "CallFeature_02";
        	 sData = GenericLib.toReadExcelData(sTestCaseID);
        	 newUserRegPo = new NewUserRegPO(driver);
        	 feedbackPo = new FeedbackPO(driver);
        	 settingsPo = new SettingsPO(driver);
        	 qrProfilePo= new QRProfilePO(driver);
        	 try
        	 {
        		 newUserRegPo.signUPorLogin(sData[1], sData[2], sData[3]);
        		 settingsPo.chooseNoCallsOption();
        		 feedbackPo.createRide(sData[4], sData[5], ridesPo);
        		 qrProfilePo.logout();
        		 newUserRegPo.signUPorLogin(sData[6], sData[7], sData[8]);
        		 feedbackPo.ViewMatchingOption(sData[4], sData[5], sData[3]);   
        		 if(feedbackPo.getEleCallIcon() != null && feedbackPo.getEleCallIcon().isDisplayed())
        		 Assert.fail();       		 
        	 }
        	 catch(Exception e)
        	 {
        		 qrLog.error("testCallOptionDisabled() failed " );
        		 e.printStackTrace();
        		 Assert.fail();
        	 }
         }
         @Test(priority =3 , enabled = false)
         public void testCallOptionAsJoinedRidePartners()
         {
        	 sTestCaseID = "CallFeature_03";
        	 sData = GenericLib.toReadExcelData(sTestCaseID);
        	 newUserRegPo = new NewUserRegPO(driver);
        	 feedbackPo = new FeedbackPO(driver);
        	 settingsPo = new SettingsPO(driver);
        	 qrProfilePo= new QRProfilePO(driver);
        	 try
        	 {        		 
        		 newUserRegPo.signUPorLogin(sData[1], sData[2], sData[3]);
        		 settingsPo.chooseNoCallsOption();
        		 feedbackPo.createRide(sData[4], sData[5], ridesPo);
        		 qrProfilePo.logout();
        		 newUserRegPo.signUPorLogin(sData[6], sData[7], sData[8]);
        		 feedbackPo.ViewMatchingOption(sData[4], sData[5], sData[3]);   
        		 if(feedbackPo.getEleCallIcon().isDisplayed())
        		 Assert.fail();
        	 }
        	 catch(Exception e)
        	 {
        		 qrLog.error("testCallOptionAsJoinedRidePartners() failed ");
        		 e.printStackTrace();
        		 Assert.fail();
        	 }
         }
}
