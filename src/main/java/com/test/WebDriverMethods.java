package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebDriverMethods {
    public static void main(String[] args) throws InterruptedException {
        //1. get()
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        //2. getTitle()
        System.out.println(driver.getTitle());

        //3. getPageSource()
//        String sourceCode=driver.getPageSource();
//        System.out.println(sourceCode);

        //4. navigate();
        driver.navigate().to("https://www.facebook.com/");

        //5. manage()
        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        Thread.sleep(2000);



        //6. getWindowHandle()
//        String windowData=driver.getWindowHandle();
//        System.out.println(driver.switchTo().window(driver.getWindowHandle()));

        //7. getWindowHandles()
//        for(String window : driver.getWindowHandles())
//        {
//            driver.switchTo().window(window);
//
//            System.out.println("Window ID: " + window);
//            System.out.println("Window Name: " + driver.getTitle());
//        }



        //8. findElement()
       WebElement username= driver.findElement(By.name("email"));
        //username.sendKeys("kk0924405@gmail.com");

        //9. close()
        //driver.close();

        //10. quit()
       // driver.quit();


        Actions act=new Actions(driver);
        act.moveToElement(username).perform();

        act.click(username).perform();
        act.sendKeys("abc@gmail.com").perform();
        act.sendKeys(Keys.TAB).perform();
        act.sendKeys("abc123").perform();

    }
}
