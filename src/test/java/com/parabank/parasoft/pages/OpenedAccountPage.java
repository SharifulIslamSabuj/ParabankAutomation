package com.parabank.parasoft.pages;

import com.parabank.parasoft.pages.BasePage;
import com.parabank.parasoft.util.ParaBankUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenedAccountPage extends BasePage{
    public OpenedAccountPage(WebDriver driver){
        super(driver);
    }

    public boolean hasOpenedAccountId(){
        ParaBankUtil.waitForDomStable();
        return getElements(By.id("newAccountId")).size()>0;
    }


}