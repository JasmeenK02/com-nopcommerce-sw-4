package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    By processor = By.id("product_attribute_1");
    By ram = By.id("product_attribute_2");
    By hddRadio = By.id("product_attribute_3_7");
    By osRadio = By.id("product_attribute_4_9");
    By software = By.id("product_attribute_4_9");
    By verifyPrice = By.xpath("//span[@id='price-value-1']");
    By addToCart = By .id("add-to-cart-button-1");
    By verifyProductAddedMessage = By.xpath("//div[@class='bar-notification success']/p");
    By crossButton = By.xpath("//span[@class = 'close']");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");

    public void selectProcessor(String text){
        selectByVisibleTextFromDropDown(processor, text);
    }

    public void selectRam(String text){
        selectByVisibleTextFromDropDown(ram, text);
    }
    public void selectHDDRadioButton(){
        clickOnElement(hddRadio);
    }
    public void selectOSRadioButton(){
        clickOnElement(osRadio);
    }
    public void selectSoftware() throws InterruptedException{
        Thread.sleep(5000);
        clickOnElement(software);
    }
    public String verifyCorrectPrice(){
        return getTextFromElement(verifyPrice);
    }
    public void clickAddToCartButton(){
        clickOnElement(addToCart);
    }
    public String verifyProductHasBeenAddedText(){
        return getTextFromElement(verifyProductAddedMessage);
    }
    public void closeBar(){
        clickOnElement(crossButton);
    }
    public void mouseHoverToShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoToCart() throws InterruptedException{
        Thread.sleep(2000);
        clickOnElement(goToCart);
    }
}
