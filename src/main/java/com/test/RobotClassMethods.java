package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotClassMethods {
    public static void main(String[] args) throws AWTException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        Robot robot = new Robot();

        robot.delay(2000);

        driver.findElement(By.name("email")).sendKeys("kamal@gmail.com");

        // keyPress() method
        robot.keyPress(KeyEvent.VK_TAB);

        // keyRelease() method
        robot.keyRelease(KeyEvent.VK_TAB);

        // Password Field
        driver.switchTo().activeElement().sendKeys("12345");

        // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Wait
        robot.delay(3000);

        // mouseMove() method
        robot.mouseMove(500, 300);

        // Wait
        robot.delay(1000);

        // mousePress() method
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        // mouseRelease() method
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        // Wait
        robot.delay(1000);

        // mouseWheel() method
        robot.mouseWheel(5);

        // Wait
        robot.delay(2000);

        // Close Browser
        driver.quit();
    }
}
