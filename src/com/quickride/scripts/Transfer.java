package com.quickride.scripts;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.quickride.baselib.GenericLib;
import com.quickride.baselib.QRBaseLib;
import com.quickride.PO.MyRewardsPO;
import com.quickride.PO.NewUserRegPO;
import com.quickride.PO.QRProfilePO;
import com.quickride.PO.TransferPO;

public class Transfer extends QRBaseLib
{
   public Logger qrLog = Logger.getLogger(this.getClass());
   public String sData[] = null;
   public String sTestCaseID=null;
   TransferPO transferPO ;
   NewUserRegPO newUserRegPO;
   QRProfilePO qrProfilePO;
   MyRewardsPO myRewardsPO;
    
   @Test(priority=1, enabled=false)
   public void testTransfer()
   {
	   sTestCaseID = "Transfer_01";
	   sData = GenericLib.toReadExcelData(sTestCaseID);
	   transferPO = new TransferPO(driver);
	   newUserRegPO = new NewUserRegPO(driver);
	   qrProfilePO= new QRProfilePO(driver);
	   try
	   {
		newUserRegPO.signUPorLogin(sData[1], sData[2], sData[3]);
		qrProfilePO.getEleMenuLst().click();
		driver.scrollTo("My Account");
		transferPO.geteleMyAccount().click();
		int currentAmt = Integer.parseInt(myRewardsPO.getEleBalReChargeTxt().getText());
		transferPO.geteleTransferTab().click();
		transferPO.transferPoints(sData[4],sData[5],sData[6]);
		transferPO.geteleConfirmButton().click();
		int trasferingPoints = Integer.valueOf(sData[4]) ;
		int amtAfterTransfer= currentAmt - trasferingPoints ;
		myRewardsPO.getEleRechargeTab().click();
		int currentAmt2 = Integer.parseInt(myRewardsPO.getEleBalReChargeTxt().getText());
		if(currentAmt2==amtAfterTransfer)
		qrProfilePO.logout();
	   }
	   catch(Exception e)
	   {
		   qrLog.error("Exception in testTransfer");
		   e.printStackTrace();
		   Assert.fail();
	   }
   }
     @Test(priority=2, enabled=false)
     public void testTransferWithNoNumber()
     {
    	 sTestCaseID = "Transfer_02";
    	 sData = GenericLib.toReadExcelData(sTestCaseID);
    	 transferPO = new TransferPO(driver);
  	     newUserRegPO = new NewUserRegPO(driver);
  	     qrProfilePO= new QRProfilePO(driver);

    	 try
  	   {
  		newUserRegPO.signUPorLogin(sData[1], sData[2], sData[3]);
  		qrProfilePO.getEleMenuLst().click();
  		driver.scrollTo("My Account");
  		transferPO.geteleMyAccount().click();
  		transferPO.geteleTransferTab().click();
  		transferPO.transferPoints(sData[4],sData[5],sData[6]);
  		transferPO.getEleValidPhoneNumber();
  		qrProfilePO.logout();
  	   }
  	   catch(Exception e)
  	   {
  		   qrLog.error("Exception in testTransfer");
  		   e.printStackTrace();
  		   Assert.fail();
  	   }
     }
     @Test(priority=3, enabled=true)
     public void testTransferWithNoAmount()
     {
    	 sTestCaseID = "Transfer_03";
    	 sData = GenericLib.toReadExcelData(sTestCaseID);	
    	 transferPO = new TransferPO(driver);
  	     newUserRegPO = new NewUserRegPO(driver);
  	     qrProfilePO= new QRProfilePO(driver);

    	 try
  	   {
  		newUserRegPO.signUPorLogin(sData[1], sData[2], sData[3]);
  		qrProfilePO.getEleMenuLst().click();
  		driver.scrollTo("My Account");
  		transferPO.geteleMyAccount().click();
  		transferPO.geteleTransferTab().click();
  		transferPO.transferPoints(sData[4],sData[5],sData[6]);
  		transferPO.geteleValidAmount();
  		qrProfilePO.logout();
  	   }
  	   catch(Exception e)
  	   {
  		   qrLog.error("Exception in testTransfer");
  		   e.printStackTrace();
  		   Assert.fail();
  	   }
     }
     @Test(priority=4, enabled= true)
     public void testTransferMoreThanMaximumAmount()
     {
    	 sTestCaseID = " Transfer_04";
    	 sData=GenericLib.toReadExcelData(sTestCaseID);
    	 transferPO = new TransferPO(driver);
  	     newUserRegPO = new NewUserRegPO(driver);
  	     qrProfilePO= new QRProfilePO(driver);
    	 try
  	     {
  		  newUserRegPO.signUPorLogin(sData[1], sData[2], sData[3]);
  		  qrProfilePO.getEleMenuLst().click();
  		  transferPO.geteleMyAccount().click();
  		  transferPO.geteleTransferTab().click();
  		  transferPO.transferPoints(sData[4],sData[5],sData[6]);
  		  transferPO.getElementMaxTransfer();
  		  qrProfilePO.logout();
  		
  	     }
    	 catch(Exception e)
    	 {
    		 qrLog.error("testTransferMoreThanMaximumAmount failed");
    		 e.printStackTrace();
    		 Assert.fail();
    	 }
     }
     @Test(priority = 5,enabled=true)
     public void testTransferToUnregisteredNumber()
     {
    	 sTestCaseID = "Transfer_05";
    	 sData = GenericLib.toReadExcelData(sTestCaseID);
    	 transferPO = new TransferPO(driver);
    	 newUserRegPO = new NewUserRegPO(driver);
    	 qrProfilePO = new QRProfilePO(driver);
    	 try
    	 {
    		 newUserRegPO.signUPorLogin(sData[1], sData[2], sData[3]);
     		  qrProfilePO.getEleMenuLst().click();
     		  transferPO.geteleMyAccount().click();
     		  transferPO.geteleTransferTab().click();
     		  transferPO.transferPoints(sData[4],sData[5],sData[6]);
     		  transferPO.geteleNotYetRegistered();
     		  qrProfilePO.logout(); 
    	 }
    	 catch(Exception e)
    	 {
    		 qrLog.error("testTransferToUnregisteredNumber failed ");
    		 e.printStackTrace();
    		 Assert.fail();
    	 }
     }
}
