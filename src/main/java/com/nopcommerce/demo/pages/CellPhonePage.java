package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    By verifyCellPhoneText = By.xpath("//h1[(text() = 'Cell phones')]");
    By listViewTab = By.xpath("//a[contains(text(),'List')]");
    By productName = By.xpath("//h2[@class = 'product-title']//a[(text() = 'Nokia Lumia 1020')]");


    public String verifyCellPhoneText(){

        return getTextFromElement(verifyCellPhoneText);
    }

    public void clickOnListViewTab(){
        clickOnElement(listViewTab);
    }
    public void clickOnNokiaLumia1020Link(){
        clickOnElement(productName);
    }
}
