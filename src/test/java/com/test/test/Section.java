package com.test.test;

import com.test.baseTest.Base;
import com.test.patterns.objects.DynamicIDPage;
import com.test.patterns.objects.HomePage;
import com.test.test.test_objects.ObjectsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Section extends Base {
    @Test()
    public void clickMenu() {
        ObjectsPage objectPage = ObjectsPage.getDynamicIdDate();

        new HomePage(driver).openSection(objectPage.getName());

        String title = new DynamicIDPage(driver).getTitle();
        String desk = new DynamicIDPage(driver).getDesk();

        Assert.assertEquals(objectPage.getName(), title, "Title не совпадает");
        Assert.assertEquals(objectPage.getDesc(), desk, "Description не совпадает");
    }
}