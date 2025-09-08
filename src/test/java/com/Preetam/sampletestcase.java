package com.Preetam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class sampletestcase {
    public static void main(String[] args) {
        WebDriver pree = new ChromeDriver();
        pree.manage().window().maximize();
        pree.get("https://www.selenium.dev/documentation/webdriver/browsersk");
//        Assert.assertEquals(driver.);
      pree.navigate().forward();
      pree.navigate().refresh();
      pree.navigate().back();
      pree.navigate().refresh();


    }
}
