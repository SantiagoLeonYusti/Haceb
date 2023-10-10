package com.haceb.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EsperaExplicita {

    private WebDriver driver;
    private WebDriverWait wait;

    public EsperaExplicita(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void esperarCargaPagina() {
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
    }

}

