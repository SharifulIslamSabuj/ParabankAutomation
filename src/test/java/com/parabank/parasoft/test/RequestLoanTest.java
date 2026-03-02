package com.parabank.parasoft.test;

import com.parabank.parasoft.pages.ApprovedLoanPage;
import com.parabank.parasoft.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RequestLoanTest extends BaseTest{

    @Test

    public void requestLoanShouldSucceed(){

        ApprovedLoanPage page=pg
                .navigateToPage(LoginPage.class)
                .doLogin(getUsername(),getPassword())
                .clickRequestLoanLink()
                .fillLoanAmount("1000")
                .fillDownpayment("200")
                .selectAccount(0)
                .clickApplyNowButton();

        Assert.assertTrue(page.isApprovedLoanId());
    }
}
