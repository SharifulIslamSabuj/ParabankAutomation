package com.parabank.parasoft.pages;

import com.parabank.parasoft.util.ParaBankUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApprovedLoanPage extends BasePage {
    public ApprovedLoanPage(WebDriver driver) {
        super(driver);
    }

    public boolean isApprovedLoanId() {
        ParaBankUtil.waitForDomStable();
        return getElements(By.id("newAccountId")).size() > 0;
    }
}
