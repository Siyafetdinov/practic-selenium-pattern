package com.test.patterns.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage{

    @FindBy(xpath = "//div[@class='col-sm']//a[text()='Dynamic ID']")
    WebElement dynamicID;
    @FindBy(xpath = "//div[@class='col-sm']//a[text()='Class Attribute']")
    WebElement classAttribute;
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public AbstractPage openSection(String name) {
        switch(name){
            case "Dynamic ID": {
                dynamicID.click();
                return new DynamicIDPage(driver);
            }
            case "Class Attribute" : {
                classAttribute.click();
                return new ClassAttributePage(driver);
            }
            default: {
                throw new NullPointerException("Exception: Не верно ");
            }
        }
    }
}
