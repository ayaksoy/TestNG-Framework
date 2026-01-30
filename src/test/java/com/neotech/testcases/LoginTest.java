package com.neotech.testcases;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.RetryLoginElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends CommonMethods {


    @Test(groups= {"smoke","regression"})
    public void validLogin() {
        LoginPageElements loginPage = new LoginPageElements();
        DashboardPageElements dashboard = new DashboardPageElements();
        sendText(loginPage.username, ConfigsReader.getProperty("username"));
        sendText(loginPage.password, ConfigsReader.getProperty("password"));
        click(loginPage.loginButton);
        wait(5);
        String expected = "Jacqueline White";
        String actual = dashboard.accountName.getText();
        Assert.assertEquals(actual, expected, "The account does NOT match!!!");
    }

    @Test(groups="smoke")
    public void emptyPasswordLogin() {
        LoginPageElements loginPage = new LoginPageElements();

        sendText(loginPage.username, ConfigsReader.getProperty("username"));
        loginPage.loginButton.click();
        Assert.assertTrue(loginPage.passwordEmptyError.isDisplayed(), "error massage isnt dissplayed");
    }

    @Test(groups="regression")
    public void invalidPasswordLogin() {
        LoginPageElements loginPage = new LoginPageElements();

        loginPage.username.sendKeys("admin");
        loginPage.password.sendKeys("invalidPassword");
        loginPage.loginButton.click();
        RetryLoginElements retryLogin = new RetryLoginElements();
        Assert.assertEquals(retryLogin.invalidCredentials.getText(), "Invalid Credentials");
    }

}
