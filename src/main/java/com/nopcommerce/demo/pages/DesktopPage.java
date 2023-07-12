package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    By sortByDropDownList = By.xpath("//select[@id='products-orderby']");

    By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

    By errorMessage = By.xpath("//h1[contains(text(),'Build your own computer')]");


    public void selectDropDown(String text) {

        selectByVisibleTextFromDropDown(sortByDropDownList, text);
    }

    public void verifyProductsInDescendingOrder() {
        List<WebElement> productNames = driver.findElements(By.xpath("//h2[@class='product-name']/a"));
        List<String> productNameStrings = new ArrayList<String>();
        for (WebElement productName : productNames) {
            productNameStrings.add(productName.getText());
        }
        List<String> sortedProductNames = new ArrayList<String>(productNameStrings);
        Collections.sort(sortedProductNames, Collections.reverseOrder());
        Assert.assertEquals(productNameStrings, sortedProductNames);
    }

    public void addProductToCart() throws InterruptedException {
        Thread.sleep(2000);

        clickOnElement(addToCart);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

}
