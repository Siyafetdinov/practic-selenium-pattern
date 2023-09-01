package com.test.patterns.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicIDPage extends AbstractPage {
    @FindBy(xpath = "//button[text()='Button with Dynamic ID']")
    WebElement idLocatorButton;
    @FindBy(xpath = "//div[@class='container']//h3[text()='Dynamic ID']")
    WebElement title;
    @FindBy(xpath = "//div[@class='container']//p")
    WebElement description;

    public DynamicIDPage(WebDriver driver) {
        super(driver);
    }

    public String getIdButton() {
        waitForElementVisible(idLocatorButton);
        return idLocatorButton.getAttribute("id");
    }

    public WebElement getTitlePage() {
        return title;
    }

    public String getTitle() {
        return title.getText();
    }

    public String getDesk() {
        return description.getText();
    }
}
