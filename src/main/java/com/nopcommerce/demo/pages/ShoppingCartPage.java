package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By verifyText =By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantity = By.xpath("//input[@class = 'qty-input']");
    By updateCart = By.id("updatecart");
    By verifyTotal = By.xpath("//span[@class ='value-summary']/strong");
    By termsOfService = By.id("termsofservice");
    By checkout = By.id("checkout");
    By login = By.linkText("Log in");

    public String verifyTextShoppingCart(){
        return getTextFromElement(verifyText);
    }
    public void clearQuantity(){
        driver.findElement(quantity).clear();
    }
    public void quantityAmount(String quantityRequired){
        sendTextToElement(quantity,quantityRequired);
    }
    public void updateShoppingCart() throws InterruptedException{
        Thread.sleep(2000);
        clickOnElement(updateCart);
    }
    public String verifyTotalAmount(){
        return getTextFromElement(verifyTotal);
    }
    public void clickOnTermsOfService(){
        clickOnElement(termsOfService);
    }
    public void clickOnCheckoutButton(){
        clickOnElement(checkout);
    }
    public void clickOnLoginLink(){
        clickOnElement(login);
    }
}
