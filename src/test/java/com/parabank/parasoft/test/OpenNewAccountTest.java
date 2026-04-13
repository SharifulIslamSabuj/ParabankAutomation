package com.parabank.parasoft.test;

import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.OpenNewAccountPage;
import com.parabank.parasoft.pages.OpenedAccountPage;
import com.parabank.parasoft.pages.OverviewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest{

    @Test()

    public void openNewAccountShouldSucceedV1(){

        LoginPage page1=pg.navigateToPage(LoginPage.class);

        OverviewPage page2=page1.doLogin(getUsername(), getPassword());

        OpenNewAccountPage page3=page2.clickOpenNewAccountLink();

        OpenedAccountPage page4=page3
                .selectAccountType("SAVINGS")
                .selectFirstAvailableAccount()
                .clickOpenNewAccountButton();

        Assert.assertTrue(page4.hasOpenedAccountId());

    }

    @Test

    public void openNewAccountShouldSucceedV2(){

      /*OpenedAccountPage page4=pg
                .navigateToPage(LoginPage.class)
                .doLogin(getUsername(),getPassword())
                .clickOpenNewAccountLink()
                .selectAccountType("SAVINGS")
                .selectFromAccount("15009")
                .clickOpenNewAccountButton()

       LoginPage page1=pg.navigateToPage(LoginPage.class);

       OverviewPage page2=page1.doLogin(getUsername(), getPassword());

       OpenNewAccountPage page3=page2.clickOpenNewAccountLink(); */

        OpenedAccountPage page4=pg
                .navigateToPage(LoginPage.class)
                .doLogin(getUsername(), getPassword())
                .clickOpenNewAccountLink()
                .selectAccountType("SAVINGS")
                .selectFirstAvailableAccount()
                .clickOpenNewAccountButton();

        Assert.assertTrue(page4.hasOpenedAccountId());

    }
}


