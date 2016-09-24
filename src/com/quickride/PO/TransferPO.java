package com.quickride.PO;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class TransferPO 
{
   AndroidDriver driver = null;
   public Logger qrLog = Logger.getLogger(this.getClass());
 
   public TransferPO(AndroidDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(id = "com.disha.quickride:id/transfer_pointsET")
   private WebElement eleNoOfPoints;
   public WebElement geteleNoOfPoints()
   {
	return eleNoOfPoints;	   
   }
   @FindBy(id="com.disha.quickride:id/transferToNumberEditText")
   private WebElement eleReceiverNumber;
   public WebElement geteleReceiverNumber()
   {
	return eleReceiverNumber;
	   
   }
   @FindBy(id ="com.disha.quickride:id/transferReasonEditText")
   private WebElement eleReason;
   public WebElement geteleReason()
   {
	   return eleReason;
   }
   @FindBy(id = "com.disha.quickride:id/transfer")
   private WebElement eleTransferButton;
   public WebElement geteleTransferButton()
   {
	   return eleTransferButton;
   }
   @FindBy(name="My Account")
   private WebElement eleMyAccount;
   public WebElement geteleMyAccount()
   {
	   return eleMyAccount;
   }
   @FindBy(name = "Transfer")
   private WebElement eleTransferTab;
   public WebElement geteleTransferTab()
   {
	   return eleTransferTab;
   }
   @FindBy(id="com.disha.quickride:id/positive_button")
   private WebElement eleConfirmButton;
   public WebElement geteleConfirmButton()
   {
	   return eleConfirmButton;
   }   
   @FindBy(name= "Enter valid phone number")
   private WebElement eleValidPhoneNumber;
   public WebElement getEleValidPhoneNumber()
   {
	   return eleValidPhoneNumber;
   }
   @FindBy(name = "Enter the amount to transfer")
   private WebElement eleValidAmount;
   public WebElement geteleValidAmount()
   {
	   return eleValidAmount;
   }
   @FindBy(name = "You can transfer only maximum 200 points")
   private WebElement eleMaxTransfer;
   public WebElement getElementMaxTransfer()
   {
	   return eleMaxTransfer;
   }
   @FindBy(name="The user not yet registered with Quick Ride")
   private WebElement eleNotYetRegistered;
   public WebElement geteleNotYetRegistered()
   {
	   return eleNotYetRegistered;
   }
   
   public void transferPoints(String NoOfPoints, String PhoneNumber,String Reason)throws SQLException
   {
  	 geteleNoOfPoints().sendKeys(NoOfPoints);
  	 geteleReceiverNumber().sendKeys(PhoneNumber);
  	 geteleReason().sendKeys(Reason);
  	 geteleTransferButton().click();
 
   }
}
