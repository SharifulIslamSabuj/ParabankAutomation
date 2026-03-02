package com.parabank.parasoft.pages;

import com.parabank.parasoft.util.ParaBankUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogOutLink() {
       // return getElements(By.cssSelector("a[href='logout.htm']")).size() > 0;
        waitForElementToBeVisible(By.cssSelector("a[href='logout.htm']"));
        return !getElements(By.cssSelector("a[href='logout.htm']")).isEmpty();
    }

    public OpenNewAccountPage clickOpenNewAccountLink() {
        ParaBankUtil.waitForDomStable();
        getElement(By.cssSelector("a[href='openaccount.htm']")).click();
        return navigateToPage(OpenNewAccountPage.class);
    }

    public RequestLoanPage clickRequestLoanLink() {
        ParaBankUtil.waitForDomStable();
        clickElement(By.cssSelector("a[href='requestloan.htm']"));
        return navigateToPage(RequestLoanPage.class);
    }

    public UpdateProfilePage clickUpdateProfileLink() {
        ParaBankUtil.waitForDomStable();
        clickElement(By.cssSelector("a[href='updateprofile.htm']"));
        return navigateToPage(UpdateProfilePage.class);
    }

}
