package com.Preetam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class sampletestcase {
    public static void main(String[] args) {
        WebDriver pree = new FirefoxDriver();
        pree.get("https://www.selenium.dev/documentation/webdriver/browsers");

    }
}
