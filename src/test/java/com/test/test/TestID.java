package com.test.test;

import com.test.baseTest.Base;
import com.test.patterns.objects.DynamicIDPage;
import com.test.patterns.objects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class TestID extends Base {
    private static final int ITERATIONS = 5;

    @Test(description = "Проверить рандомизацию на повторы, атрибута ID у эллемента button")
    public void testDynamicIdButton() {
        Set<String> result = new HashSet<>();
        DynamicIDPage page = (DynamicIDPage) new HomePage(driver).openSection("Dynamic ID");;
        for (int i = 0; i < ITERATIONS; i++) {
            result.add(page.getIdButton());
            driver.navigate().refresh();
        }
        Assert.assertEquals(ITERATIONS, result.size(), "Генератор работает неверно, есть схожие позиции! \n" + result);
    }
}
