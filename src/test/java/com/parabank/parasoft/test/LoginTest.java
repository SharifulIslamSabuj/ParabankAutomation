package com.parabank.parasoft.test;

import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.OverviewPage;
import com.parabank.parasoft.test.BaseTest;
import com.parabank.parasoft.util.ParaBankUtil;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void checkTitle(){
        LoginPage lpage=pg.navigateToPage(LoginPage.class);
        String Title=lpage.getPageTitle();
        Assert.assertEquals(Title, ParaBankUtil.TITTLE);
    }

    @Test ()
    public void LoginV1(){
        LoginPage lpage=pg.navigateToPage(LoginPage.class);
        lpage
                .fillUsername(getUsername())
                .fillPassword(getPassword());

        OverviewPage opage=lpage.clickLoginButton();
        Assert.assertTrue(opage.hasLogOutLink(), "Logout link is not displayed. Login failed.");
    }

    @Test(description = "Login test using method chaining")
    public void LoginV2(){
        OverviewPage opage=pg.navigateToPage(LoginPage.class).doLogin(getUsername(),getPassword());
        Assert.assertTrue(opage.hasLogOutLink(), "Logout link is not displayed. Login failed.");
    }
}