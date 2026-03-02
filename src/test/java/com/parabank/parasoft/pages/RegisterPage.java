package com.parabank.parasoft.pages;

import com.parabank.parasoft.pages.BasePage;
import com.parabank.parasoft.util.ParaBankUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {

        super(driver);
    }

    public RegisterPage fillFirstName(String firstName){
        getElement(By.id("customer.firstName")).sendKeys(firstName);
        return this;
    }

    public RegisterPage fillLastName(String lastname){
        getElement(By.id("customer.lastName")).sendKeys(lastname);
        return this;
    }

    public RegisterPage fillAddress(String address){
        getElement(By.id("customer.address.street")).sendKeys(address);
        return this;
    }

    public RegisterPage fillCity(String city){
        getElement(By.id("customer.address.city")).sendKeys(city);
        return this;
    }

    public RegisterPage fillState(String state){
        getElement(By.id("customer.address.state")).sendKeys(state);
        return this;
    }

    public RegisterPage fillZipCode(String zipcode){
        getElement(By.id("customer.address.zipCode")).sendKeys(zipcode);
        return this;
    }

    public RegisterPage fillPhone(String phone){
        getElement(By.id("customer.phoneNumber")).sendKeys(phone);
        return this;
    }

    public RegisterPage fillSSN(String ssn){
        getElement(By.id("customer.ssn")).sendKeys(ssn);
        return this;
    }

    public RegisterPage fillUsername(String username){
        getElement(By.id("customer.username")).sendKeys(username);
        return this;
    }

    public RegisterPage fillPassword(String password){
        getElement(By.id("customer.password")).sendKeys(password);
        return this;
    }

    public RegisterPage fillConfirmPassword(String confirmPassword){
        getElement(By.id("repeatedPassword")).sendKeys(confirmPassword);
        return this;
    }

    public OverviewPage clickRegisterButtonWithSuccess(){
        ParaBankUtil.waitForDomStable();
        getElement(By.cssSelector("input[value='Register']")).click();
        return navigateToPage(OverviewPage.class);
    }

    public RegisterPage clickRegisterButtonWithFail(){
        ParaBankUtil.waitForDomStable();
        getElement(By.cssSelector("input[value='Register']")).click();
        return this;
    }

    public boolean hasErrorMessage(int errorNumber){
        ParaBankUtil.waitForDomStable();
        return getElements(By.cssSelector("span[class='error']")).size()>=errorNumber;
    }


}
