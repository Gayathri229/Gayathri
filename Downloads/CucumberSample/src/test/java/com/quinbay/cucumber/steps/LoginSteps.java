package com.quinbay.cucumber.steps;

import com.quinbay.cucumber.CucumberHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class LoginSteps {

       CucumberHooks ch = new CucumberHooks();
       WebDriver drive = ch.getDriver();

        @Given("I am on Facebook login page")
        public void facebook()
        {
            drive.navigate().to("https://www.facebook.com");
        }

        @When("I enter email as \"abc@gmail.com\"")
        public void email()
        {
            drive.findElement(By.id("email")).sendKeys("abc@gmail.com");

        }

        @And("I enter password as \"1234*\"")
        public void password ()
        {
            drive.findElement(By.id("pass")).sendKeys("1234*");

        }

        @Then("Login should fail")
        public void login ()
        {
            drive.findElement(By.name("login")).click();
        }

        @And("this is a test")
        public void laststep ()
        {
            System.out.print("Last step");
        }




}