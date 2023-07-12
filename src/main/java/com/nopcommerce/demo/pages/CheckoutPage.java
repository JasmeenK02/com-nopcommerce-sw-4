package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {

    By verifyWelcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By guestCheckout = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By getFirstNameField= By.id("BillingNewAddress_FirstName");
    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailField = By.id("BillingNewAddress_Email");
    By countryField = By.id("BillingNewAddress_CountryId");
    By cityField = By.id("BillingNewAddress_City");
    By addressLine1Field = By.id("BillingNewAddress_Address1");
    By postalCodeField = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//div[@id = 'billing-buttons-container']//button[@class = 'button-1 new-address-next-step-button']");
    By nextDayRadioButton = By.id("shippingoption_1");
    By continueShipping = By.xpath("//button[@class = 'button-1 shipping-method-next-step-button']");
    By creditCard = By.id("paymentmethod_1");
    By continuePayment = By.xpath("//button[@class = 'button-1 payment-method-next-step-button']");
    By creditCardType = By.id("CreditCardType");
    By cardHolderNameField = By.id("CardholderName");
    By cardNumberField = By.id("CardNumber");
    By expiryMonth = By.id("ExpireMonth");
    By expiryYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueNextStep = By.xpath("//button[@class = 'button-1 payment-info-next-step-button']");
    By verifyPaymentText = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyShippingText = By.xpath("//span[normalize-space() = 'Next Day Air']");
    By verifyTotal = By.xpath("//span[1]/strong[1]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By verifyText = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyOrderSuccessfulText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueAtThankYouPage = By.xpath("//button[contains(text(),'Continue')]");
    By register = By.xpath("//button[contains(text(),'Register')]");
    By secondDayAir = By.id("shippingoption_2");
    By verifySecondAir = By.xpath("//li[@class = 'shipping-method']//span[@class = 'value']");

    public String verifyWelcomeSignInText(){
        return getTextFromElement(verifyWelcomeText);
    }
    public void clickOnGuestCheckout(){
        clickOnElement(guestCheckout);
    }
    public void enterFirstName(String firstName){
        sendTextToElement(getFirstNameField, firstName);
    }
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField, lastName);
    }
    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }
    public void selectCountryName(String country){
        selectByVisibleTextFromDropDown(countryField, country);
    }
    public void enterCityName(String city){
        sendTextToElement(cityField, city);
    }
    public void enterAddressLine1(String address1){
        sendTextToElement(addressLine1Field, address1);
    }
    public void enterPostalCode(String postalCode){
        sendTextToElement(postalCodeField, postalCode);
    }
    public void enterPhoneNumber(String phoneNumber){
        sendTextToElement(phoneNumberField, phoneNumber);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnNextDayAirRadioButton(){
        clickOnElement(nextDayRadioButton);
    }
    public void clickOnContinueLink(){
        clickOnElement(continueShipping);
    }
    public void selectCreditCardRadioButton(){
        clickOnElement(creditCard);
    }
    public void clickOnContinue(){
        clickOnElement(continuePayment);
    }
    public void selectCreditCard(String value) throws InterruptedException{
        selectByValueFromDropDown(creditCardType, value);
    }
    public void enterCardHolderName(String name){
        sendTextToElement(cardHolderNameField,name);
    }
    public void enterCardNumber(String number){
        sendTextToElement(cardNumberField, number);
    }
    public void selectExpiryMonth(String value){
        selectByValueFromDropDown(expiryMonth,value);
    }
    public void selectExpiryYear(String value){
        selectByValueFromDropDown(expiryYear, value);
    }
    public void enterCardCode(String number){
        sendTextToElement(cardCode, number);
    }
    public void clickContinueButton(){
        clickOnElement(continueNextStep);
    }
    public String verifyPaymentMethod(){
        return getTextFromElement(verifyPaymentText);
    }
    public String verifyShippingMethod(){
        return getTextFromElement(verifyShippingText);
    }
    public String verifyTotalAmount(){
        return getTextFromElement(verifyTotal);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public String verifyThankYouText(){
        return getTextFromElement(verifyText);
    }
    public String verifyOrderIsSuccessful(){
        return getTextFromElement(verifyOrderSuccessfulText);
    }
    public void clickOnContinueButtonOnThankYouPage(){
        clickOnElement(continueAtThankYouPage);
    }
    public void clickOnRegisterTab(){
        clickOnElement(register);
    }
     public void clickOnSecondDayAir(){
        clickOnElement(secondDayAir);
     }
     public String verifySecondDayAir(){
        return getTextFromElement(verifySecondAir);
     }
}
