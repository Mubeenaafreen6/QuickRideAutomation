package com.quickride.PO;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SettingsPO
{
       
	AndroidDriver driver = null;
	public Logger qrLog = Logger.getLogger(getClass());
	//QRProfilePO qrProfilePo = new QRProfilePO(driver);
	
	public SettingsPO(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "com.disha.quickride:id/supportCallTextView")
	private WebElement eleCallOption;
	public WebElement getEleCallOption()
	{
		return eleCallOption;
	}
	
	@FindBy(name = "From anyone")
	private WebElement eleFromAnyOne;
	public WebElement getEleFromAnyOne()
	{
		return eleFromAnyOne;
	}
	@FindBy(name = "Joined ride-partners")
	private WebElement eleJoinedPartners;
	public WebElement getEleJoinedPartners()
	{
		return eleJoinedPartners;
	}
	@FindBy(name = "No calls, please!")
	private WebElement eleNoCallsPlease;
	public WebElement getEleNoCallsPlease()
	{
		return eleNoCallsPlease;
	}
	@FindBy(id="android:id/home")
	private WebElement eleMenuList;
	public WebElement getEleMenuList()
	{
		return eleMenuList;
	}
	@FindBy(id = "com.disha.quickride:id/user_profile_edit_save_text")
	private WebElement eleSaveSettingsButton;
	public WebElement getEleSaveSettingsButton()
	{
		return eleSaveSettingsButton;
	}
	@FindBy(name= "Settings")
	private WebElement eleSettingsOption;
	public WebElement getEleSettingsOption()
	{
		return eleSettingsOption;
	}
	public void chooseCallFromAnyone()
	{
		 getEleMenuList().click();
		 driver.findElement(By.name("Settings"));
		 getEleSettingsOption().click();
		 getEleCallOption().click();
		 getEleFromAnyOne().click();
		 getEleSaveSettingsButton().click();
		 
	}
	public void chooseCallFromJoinedPartners()
	{
		 getEleMenuList().click();
		 driver.findElement(By.name("Settings"));
		 getEleSettingsOption().click();
		 getEleCallOption().click();
		 getEleJoinedPartners().click();
		 getEleSaveSettingsButton().click();
	}
	public void chooseNoCallsOption()
	{
		  getEleMenuList().click();
		 driver.findElement(By.name("Settings"));
		 getEleSettingsOption().click();
		 getEleCallOption().click();
		 getEleNoCallsPlease().click();
		 getEleSaveSettingsButton().click();
	}
}
