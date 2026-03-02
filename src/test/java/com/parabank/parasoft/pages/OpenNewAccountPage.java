package com.parabank.parasoft.pages;

import com.parabank.parasoft.pages.BasePage;
import com.parabank.parasoft.util.ParaBankUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OpenNewAccountPage extends BasePage{
    public OpenNewAccountPage (WebDriver driver){
        super(driver);
    }

    // 1️⃣ Select Account Type (CHECKING / SAVINGS)
    public OpenNewAccountPage selectAccountType(String accountType){
        ParaBankUtil.waitForDomStable();
        Select select = new Select(getElement(By.xpath("//select[@id='type']")));
        select.selectByVisibleText(accountType);
        return this;
    }


/*
    // 2️⃣ Select From Account (15009)
    public OpenNewAccountPage selectFromAccount(String accountNumber){
        ParaBankUtil.waitForDomStable();
        Select select = new Select(getElement(By.xpath("//select[@id='fromAccountId']")));
        select.selectByVisibleText(accountNumber);
        return this;
    }*/

    public OpenNewAccountPage selectFirstAvailableAccount(){
        ParaBankUtil.waitForDomStable();

        Select select = new Select(getElement(By.id("fromAccountId")));
        // Get all options
        List<WebElement> options = select.getOptions();
        // Select first option (index 0)
        select.selectByIndex(0);

        return this;
    }

    public OpenedAccountPage clickOpenNewAccountButton(){
        ParaBankUtil.waitForDomStable();
        getElement(By.cssSelector("input[value='Open New Account']")).click();
        return navigateToPage(OpenedAccountPage.class);
    }


}