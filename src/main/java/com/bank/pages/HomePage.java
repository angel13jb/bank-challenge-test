package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginButton;
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginButton;

    public void clickOnCustomerLoginButton(){
        CustomListeners.node.log(Status.PASS,"Click on CustomerLoginButton :"+customerLoginButton.getText());
        Reporter.log("Clicking on CustomerLoginButton " +customerLoginButton.getText() + "<br>");
        clickOnElement(customerLoginButton);
    }
    public void clickOnBankManagerLoginButton(){
        CustomListeners.node.log(Status.PASS,"Click on BankManagerLoginButton :"+bankManagerLoginButton.getText());
        Reporter.log("Clicking on BankManagerLoginButton " + bankManagerLoginButton.getText() + "<br>");
        clickOnElement(bankManagerLoginButton);
    }
}
