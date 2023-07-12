package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaPage extends Utility {
    By verifyNokiaName = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");

    By verifyNokiaPrice = By.id("price-value-20");
    By quantity = By.id("product_enteredQuantity_20");
    By addToCart = By.id("add-to-cart-button-20");
    By verifyProductAddedMessage = By.xpath("//div[@class = 'bar-notification success']//p[@class = 'content']");
    By closeBar = By.xpath("//div[@class = 'bar-notification success']//span[@class = 'close']");
    By mouseHover = By.xpath("//span[@class = 'cart-label']");
    By goToCart = By.xpath("//button[@class='button-1 cart-button']");
    public String verifyNokiaText(){
        return getTextFromElement(verifyNokiaName);
    }

    public String verifyPrice(){
        return getTextFromElement(verifyNokiaPrice);

    }

    public void clearQuantity(){
        driver.findElement(quantity).clear();
    }
    public void inputQuantity(String number){
        sendTextToElement(quantity, number);
    }
    public void clickOnAddTOCart(){
        clickOnElement(addToCart);

    }
    public String verifyProductHasBeenAddedMessage(){
        return getTextFromElement(verifyProductAddedMessage);
    }

    public void closeButtonOnBar(){
        clickOnElement(closeBar);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(mouseHover);
    }
    public void clickOnGoToCart(){
        clickOnElement(goToCart);
    }




}
