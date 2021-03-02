package com.quinbay.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class CucumberHooks {

    static WebDriver driver ;

    @Before
    public void testBefore()
    {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("This is a demo of before hook");
    }

//    public WebDriver setDriver(driver)
//    {
//        this.driver=driver;
//    }
    public WebDriver getDriver()
    {
        return driver;
    }

    @After
    public void testAfter(){

        System.out.println("This is a demo of after hook");
        driver.quit();
    }
}
