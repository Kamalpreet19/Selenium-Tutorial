package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMethods {
    public static void main(String[] args)throws InterruptedException {



        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open Facebook
        driver.get("https://www.facebook.com/");

        // Maximize Browser
        driver.manage().window().maximize();

        // Wait
        Thread.sleep(2000);

        // Create Actions Object
        Actions act = new Actions(driver);

        // click() method
        act.click(driver.findElement(By.name("email")))
                .perform();

        // sendKeys() method
        act.sendKeys(driver.findElement(By.name("email")),
                "kamal@gmail.com").perform();

        // moveToElement() + click()
        act.moveToElement(driver.findElement(By.name("pass")))
                .click().perform();

        // sendKeys() for password
        act.sendKeys(driver.findElement(By.name("pass")),
                "12345").perform();

        // doubleClick() method
        act.doubleClick(driver.findElement(By.name("email")))
                .perform();

        // contextClick() method
        act.contextClick(driver.findElement(By.name("email")))
                .perform();

        // pause() method
        act.pause(2000).perform();

        // Login Button
        WebElement loginBtn =
                driver.findElement(By.name("login"));

        // moveToElement()
        act.moveToElement(loginBtn).perform();

        // clickAndHold()
        act.clickAndHold(loginBtn).perform();

        Thread.sleep(1000);

        // release()
        act.release(loginBtn).perform();

        Thread.sleep(1000);

        // click()
        act.click(loginBtn).perform();

        Thread.sleep(3000);

        // Close Browser
        driver.quit();
    }
}