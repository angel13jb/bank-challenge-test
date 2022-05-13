package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement depositTab;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amountBox;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositButton;
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositSuccessfulText;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement withDrawlTab;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amountWithDrawBox;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement withDrawButton;
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement transactionSuccessfulText;

    public void clickOnDepositTab(){
        CustomListeners.node.log(Status.PASS, "Click on DepositTab : " + depositTab.getText());
        Reporter.log("Clicking on DepositTab " + depositTab.getText() + "<br>");
        clickOnElement(depositTab);
    }
    public void enterAmount(String amount){
         sendTextToElement(amountBox,amount);
        CustomListeners.node.log(Status.PASS, "Enter Amount : '" + amount + "' to amountbox");
        Reporter.log("Enter Amount : '" + amount + "' to amountbox" + "<br>");
    }
    public void clickOnDepositButton(){
        CustomListeners.node.log(Status.PASS, "Click on DepositButton : " + depositButton.getText());
        Reporter.log("Clicking on DepositButton " + depositButton.getText() + "<br>");
        clickOnElement(depositButton);
    }
    public String getDepositSuccessfulText(){
        CustomListeners.node.log(Status.PASS, "Get DepositSuccessful text : " + depositSuccessfulText.getText());
        Reporter.log("Get DepositSuccessful text " + depositSuccessfulText.getText() + "<br>");
        return getTextFromElement(depositSuccessfulText);
    }
    public void clickOnWithDrawlTab(){
        CustomListeners.node.log(Status.PASS, "Click on withDrawlTab : " + withDrawlTab.getText());
        Reporter.log("Clicking on withDrawlTab " + withDrawlTab.getText() + "<br>");
        clickOnElement(withDrawlTab);
    }
    public void enterWithDrawAmount(String withdrawamount){
        sendTextToElement(amountWithDrawBox,withdrawamount);
        CustomListeners.node.log(Status.PASS, "Enter WithDrawAmount : '" + withdrawamount + "' to amountWithDrawBox");
        Reporter.log("Enter WithDrawAmount : '" + withdrawamount + "' to amountWithDrawBox" + "<br>");
    }
    public void clickOnWithDrawButton(){
        CustomListeners.node.log(Status.PASS, "Click on withDrawButton : " + withDrawButton.getText());
        Reporter.log("Clicking on withDrawButton " + withDrawButton.getText() + "<br>");
        clickOnElement(withDrawButton);
    }
    public String getTransactionSuccessfulText(){
        CustomListeners.node.log(Status.PASS, "Get TransactionSuccessful text : " + transactionSuccessfulText.getText());
        Reporter.log("Get TransactionSuccessful text " + transactionSuccessfulText.getText() + "<br>");
        return getTextFromElement(transactionSuccessfulText);
    }

}
