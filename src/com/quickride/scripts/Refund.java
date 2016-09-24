package com.quickride.scripts;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.quickride.PO.MyRewardsPO;
import com.quickride.PO.NewUserRegPO;
import com.quickride.PO.QRProfilePO;
import com.quickride.PO.TransferPO;
import com.quickride.baselib.GenericLib;
import com.quickride.baselib.QRBaseLib;

public class Refund extends QRBaseLib
{
    public Logger qrLog = Logger.getLogger(this.getClass());
    public String sData[]= null;
    public String sTestCaseID= null;
    MyRewardsPO myRewardsPO;
    NewUserRegPO newUserRegPO;
    QRProfilePO qrProfilePO;
    TransferPO transferPO;
    
    @Test(priority=1,enabled = true)
    public void testRefund()
    {
    	sTestCaseID = "Refund_01";
    	sData = GenericLib.toReadExcelData(sTestCaseID);
    	myRewardsPO = new MyRewardsPO(driver);
    	newUserRegPO = new NewUserRegPO(driver);
    	qrProfilePO = new QRProfilePO(driver);
    	try
    	{
    		newUserRegPO.signUPorLogin(sData[1], sData[2], sData[3]);
    		 qrProfilePO.getEleMenuLst().click();
    		  transferPO.geteleMyAccount().click();
    		  
    	}
    	catch(Exception e)
    	{
    		 qrLog.error("Refund Failed");
    		 e.printStackTrace();
    		 Assert.fail();
    	}
    	
    }
       
}
