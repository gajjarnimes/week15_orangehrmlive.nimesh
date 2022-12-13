package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(name="username")
    WebElement Username;

    @CacheLookup
    @FindBy(name ="password")
    WebElement Password;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement Login;

    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement verifyDashboard;

   @CacheLookup
   @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]")
   WebElement Forgotyourpassword;

   @CacheLookup
   @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/form[1]/h6[1]")
   WebElement RestPassword;
    public void enterUsername(String UsernameText){
        Reporter.log("Username"+Username.toString());
        sendTextToElement(Username,UsernameText);
        CustomListeners.test.log(Status.PASS, "Enter Username"+ Username);
    }
    public void enterPassword(String PasswordText){
        Reporter.log("Password"+Password.toString());
        sendTextToElement(Password,PasswordText);
        CustomListeners.test.log(Status.PASS,"Enter Password"+ Password);
    }
    public void clickOnLoginButton(){
        Reporter.log("Login"+Login.toString());
        clickOnElement(Login);
        CustomListeners.test.log(Status.PASS,"Click on Login");
    }
    public void setVerifyDashboard(){
        return;
    }

    public void clickonForgotyourpassword(){
        Reporter.log("Forgotyourpassword"+Forgotyourpassword.toString());
        clickOnElement(Forgotyourpassword);
        CustomListeners.test.log(Status.PASS,"Click on Forgot your password");
    }
    public void setRestPassword(){
        return;
    }

}
