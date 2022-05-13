package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstNameField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement lastNameField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement postCodeField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomerButton;

    public void enterFirstName(String firstname) {
        sendTextToElement(firstNameField, firstname);
        CustomListeners.node.log(Status.PASS, "Enter Firstname : '" + firstname + "' to firstName field");
        Reporter.log("Enter Firstname : '" + firstname + "' to firstName field" + "<br>");
    }
    public void enterLastName(String lastname) {
        sendTextToElement(lastNameField, lastname);
        CustomListeners.node.log(Status.PASS, "Enter Lastname : '" + lastname + "' to lastName field");
        Reporter.log("Enter Lastname : '" + lastname + "' to lastName field" + "<br>");
    }

    public void enterPostCode(String postcode) {
        sendTextToElement(postCodeField, postcode);
        CustomListeners.node.log(Status.PASS, "Enter PostCode : '" + postcode + "' to postcode field");
        Reporter.log("Enter PostCode : '" + postcode + "' to postcost field" + "<br>");
    }

    public void clickOnAddCustomerButton() {
        CustomListeners.node.log(Status.PASS,"Click onAddCustomerButton");
        Reporter.log("Click onAddCustomerButton"+"<br>");
        clickOnElement(addCustomerButton);
    }

}
