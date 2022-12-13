package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldLoginPageSuccessfully(){
        loginPage.enterUsername("Admin");
        loginPage.enterUsername("admin123");
        loginPage.clickOnLoginButton();
        loginPage.setVerifyDashboard();

    }
    @Test(groups = {"smoke","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
      loginPage.clickonForgotyourpassword();
      loginPage.setRestPassword();
    }
    }
