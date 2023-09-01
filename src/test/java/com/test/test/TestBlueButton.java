package com.test.test;

import com.test.baseTest.Base;
import com.test.patterns.objects.ClassAttributePage;
import com.test.patterns.objects.HomePage;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBlueButton extends Base {
    @Test(description = "Поиск синей кнопки и отработка алерта")
    public void searchBlueBtn() {
        ClassAttributePage page = (ClassAttributePage) new HomePage(driver).openSection("Class Attribute");
        page.clickBlueButton();

        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Primary button pressed", alert.getText(), "Произошла ошибка!");
        alert.accept();
    }
}
