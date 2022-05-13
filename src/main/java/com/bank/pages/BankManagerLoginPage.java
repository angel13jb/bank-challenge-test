package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomerTab;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccountTab;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement customersTab;

    public void clickOnOpenAccountTab(){
        CustomListeners.node.log(Status.PASS, "Click on OpenAccountTab : " + openAccountTab.getText());
        Reporter.log("Clicking on OpenAccountTab " + openAccountTab.getText() + "<br>");
        clickOnElement(openAccountTab);
    }
    public void clickOnAddCustomerTab(){
        CustomListeners.node.log(Status.PASS, "Click on AddCustomerTab : " + addCustomerTab.getText());
        Reporter.log("Clicking on AddCustomerTab " + addCustomerTab.getText() + "<br>");
        clickOnElement(addCustomerTab);
    }
    public void clickCustomersTab(){
        CustomListeners.node.log(Status.PASS, "Click on CustomersTab : " + customersTab.getText());
        Reporter.log("Clicking on CustomersTab " + customersTab.getText() + "<br>");
        clickOnElement(customersTab);
    }
}
