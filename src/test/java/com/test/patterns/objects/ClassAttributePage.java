package com.test.patterns.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassAttributePage extends AbstractPage {
    @FindBy(xpath = "//div[@class='container']//h3[text()='Class Attribute']")
    WebElement searchElement;
    @FindBy(xpath = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary')]")
    WebElement blueButton;

    public ClassAttributePage(WebDriver driver) {
        super(driver);
    }
    public WebElement getSearchElement() {
        return searchElement;
    }

    public void clickBlueButton() {
        blueButton.click();
    }
}
