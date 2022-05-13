package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourNameDropDown;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logoutButton;
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameText;


    public void selectYourNameDropDown(String yourname) {
        selectByVisibleTextFromDropDown(yourNameDropDown, yourname);
        CustomListeners.node.log(Status.PASS, "Select name '" + yourname + "' from dropDown");
        Reporter.log("Select name '" + yourname + "' from dropDown <br>");
    }

    public void clickOnLoginButton() {
        CustomListeners.node.log(Status.PASS, "Click on LoginButton : " + loginButton.getText());
        Reporter.log("Clicking on LoginButton " + loginButton.getText() + "<br>");
        clickOnElement(loginButton);
    }

    public void clickOnLogOutButton() {
        CustomListeners.node.log(Status.PASS, "Click on LogOutButton : " + logoutButton.getText());
        Reporter.log("Clicking on LogOutButton " + logoutButton.getText() + "<br>");
        clickOnElement(logoutButton);
    }

    public String getLogOutText() {
        CustomListeners.node.log(Status.PASS, "Get LogOut text : " + logoutButton.getText());
        Reporter.log("Get LogOut text " + logoutButton.getText() + "<br>");
        return getTextFromElement(logoutButton);
    }
    public String getYourNameText() {
        CustomListeners.node.log(Status.PASS, "Get YourName text : " + yourNameText.getText());
        Reporter.log("Get YourName text " + yourNameText.getText() + "<br>");
        return getTextFromElement(yourNameText);
    }
}
