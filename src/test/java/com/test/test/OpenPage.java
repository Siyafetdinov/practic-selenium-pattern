package com.test.test;

import com.test.baseTest.Base;
import com.test.patterns.objects.ClassAttributePage;
import com.test.patterns.objects.DynamicIDPage;
import com.test.patterns.objects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenPage extends Base {
    @Test(description = "Псевдо тест, открытия страниц и поиска элемента на странице")
    public void clickMenu() {
        DynamicIDPage pageOne = (DynamicIDPage) new HomePage(driver).openSection("Dynamic ID");
        Assert.assertTrue(pageOne.getTitlePage().isDisplayed(), "No displayed elements (DynamicIDPage)");

        driver.get(URL_HOME_PAGE);

        ClassAttributePage pageTwo = (ClassAttributePage) new HomePage(driver).openSection("Class Attribute");
        Assert.assertTrue(pageTwo.getSearchElement().isDisplayed(), "No displayed elements (pageTwo)");
    }
}
