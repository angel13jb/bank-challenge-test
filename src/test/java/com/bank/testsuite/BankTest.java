package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomerLoginPage customerLoginPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
        accountPage=new AccountPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("John");
        addCustomerPage.enterLastName("Smith");
        addCustomerPage.enterPostCode("E765JB");
        addCustomerPage.clickOnAddCustomerButton();
        String expectedMessage = "Customer added successfully";
        boolean actualMessage = driver.switchTo().alert().getText().contains("Customer added successfully");
        Assert.assertTrue(true, expectedMessage);
        driver.switchTo().alert().accept();
    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnOpenAccountTab();
        openAccountPage.selectCustomerNameFromDropDown("Hermoine Granger");
        openAccountPage.selectCurrencyFromDropDown("Pound");
        openAccountPage.clickOnProcessButton();
        String expectedMessage = "Account created successfully";
        boolean actualMessage = driver.switchTo().alert().getText().contains("Account created successfully");
        Assert.assertTrue(true, expectedMessage);
        driver.switchTo().alert().accept();
    }


    @Test(groups = {"smoke","regression"})
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameDropDown("Hermoine Granger");
        customerLoginPage.clickOnLoginButton();
        Thread.sleep(10000);
        String expectedText="Logout";
        String actualText=customerLoginPage.getLogOutText();
        Assert.assertEquals(expectedText,actualText,"Text not displayed");
        customerLoginPage.clickOnLogOutButton();
        String expectedText1="Your Name";
        boolean actualText1=customerLoginPage.getYourNameText().contains("Your Name");
        Assert.assertTrue(true,expectedText1);
    }

    @Test(groups = {"smoke","regression"})
    public void customerShouldDepositMoneySuccessfully(){
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameDropDown("Hermoine Granger");
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositTab();
        accountPage.enterAmount("100");
        accountPage.clickOnDepositButton();
        String expectedText="Deposit Successful";
        String actualText= accountPage.getDepositSuccessfulText();
        Assert.assertEquals(expectedText,actualText,"Text not displayed");
    }

    @Test(groups = "regression")
    public void customerShouldWithdrawMoneySuccessfully(){
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameDropDown("Hermoine Granger");
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnWithDrawlTab();
        accountPage.enterWithDrawAmount("50");
        accountPage.clickOnWithDrawButton();
        String expectedText="Transaction Successful";
        String actualText= accountPage.getTransactionSuccessfulText();
        Assert.assertEquals(expectedText,actualText,"Text not match");
    }
}
