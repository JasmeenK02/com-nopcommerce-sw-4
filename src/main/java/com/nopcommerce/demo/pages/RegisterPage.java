package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By verifyRegistration = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueTab = By.xpath("//a[contains(text(),'Continue')]");



    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }

    public void enterFirstName(String firstName) {

        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {

        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String email) {

        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {

        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String verifyRegistrationCompleteMessage() {
        return getTextFromElement(verifyRegistration);
    }

    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }




}
