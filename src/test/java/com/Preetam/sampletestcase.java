package com.Preetam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampletestcase {
    public static void main(String[] args) {
        ChromeDriver pree = new ChromeDriver();
        pree.get("https://www.oanda.com/currency-converter/live-exchange-rates/#Cryptocurrencies");
    }
}
