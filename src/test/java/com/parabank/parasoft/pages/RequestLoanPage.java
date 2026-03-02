package com.parabank.parasoft.pages;

import com.parabank.parasoft.pages.BasePage;
import com.parabank.parasoft.util.ParaBankUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RequestLoanPage extends BasePage {
    public RequestLoanPage(WebDriver driver){
        super(driver);
    }

    public RequestLoanPage fillLoanAmount(String LoanAmount){
        ParaBankUtil.waitForDomStable();

        getElement(By.xpath("//input[@id='amount']")).sendKeys(LoanAmount);
        return this;
    }

    public RequestLoanPage fillDownpayment(String DownPaymentAmount){
        ParaBankUtil.waitForDomStable();
        getElement(By.xpath("//input[@id='downPayment']")).sendKeys(DownPaymentAmount);
        return this;
    }

    public RequestLoanPage selectAccount(int index){
        ParaBankUtil.waitForDomStable();

        Select select =new Select(getElement(By.xpath("//select[@id='fromAccountId']")));

        select.selectByIndex(index);
       // List<WebElement> options=select.getOptions();
        //select.selectByIndex(2);
        return this;
    }

   /* public RequestLoanPage selectAccount(String accountNumber){
        Select select = new Select(getElement(By.id("fromAccountId")));
        select.selectByVisibleText(accountNumber);
        return this;
    }*/

    public ApprovedLoanPage clickApplyNowButton(){
        ParaBankUtil.waitForDomStable();

        getElement(By.xpath("//input[@value='Apply Now']")).click();

        return navigateToPage(ApprovedLoanPage.class);
    }


}