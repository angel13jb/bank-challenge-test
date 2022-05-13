package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    public OpenAccountPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerNameDropDown;
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropDown;
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processButton;

    public void selectCustomerNameFromDropDown(String name){
        selectByVisibleTextFromDropDown(customerNameDropDown,name);
        CustomListeners.node.log(Status.PASS,"customerNameDropDown"+name+"name");
        Reporter.log("customerNameDropDown"+name+"name <br>");
    }
    public void selectCurrencyFromDropDown(String currency){
        selectByVisibleTextFromDropDown(currencyDropDown,currency);
        CustomListeners.node.log(Status.PASS,"currencyDropDown"+currency+"currency");
        Reporter.log("currencyDropDown"+currency+"currencyDropDown <br>");
    }
    public void clickOnProcessButton(){
        CustomListeners.node.log(Status.PASS,"Click on ProcessButton :"+processButton.getText());
        Reporter.log("Clicking on ProcessButton " + processButton.getText() + "<br>");
        clickOnElement(processButton);
    }
}
