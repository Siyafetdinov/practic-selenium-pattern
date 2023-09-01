package com.test.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Base {
    protected WebDriver driver;
    protected static final String URL_HOME_PAGE = "http://uitestingplayground.com";
    @BeforeClass(description = "Start browser")
    public void setUp(){
        driver = new FirefoxDriver();
        //Implicit Wait можно использовать для:
        //ожидания полной загрузки страницы — pageLoadTimeout();
        //ожидания появления элемента на странице — implicitlyWait();
        //ожидания выполнения асинхронного запроса — setScriptTimeout();
        driver.get(URL_HOME_PAGE);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterClass(description = "Close browser and clear")
    public void tearDown(){
        driver.quit();
        driver = null;
    }
}
