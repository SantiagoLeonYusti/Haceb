package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class HomePage extends PageObject {
    By pMiPerfil = By.xpath("//p[text()='Mi perfil']");
    By aRegistrarte = By.xpath("//a[@class='cdc-fire cdc-register']");
    By btnIngresarHaceb = By.xpath("//*[@id='vtexIdUI-custom-oauth']");
    By inputActualizarDatos = By.xpath("//input[@value='ACTUALIZAR DATOS']");
    public By getBtnIngresarHaceb() {
        return btnIngresarHaceb;
    }

    public By getInputActualizarDatos() {
        return inputActualizarDatos;
    }

    public void pasarCursorSobreElento(WebDriver driver) {
        WebElement hoverElement = driver.findElement(pMiPerfil);
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();
    }

    public void clickRegistrese(WebDriver driver) {
        WebElement desiredElement = driver.findElement(aRegistrarte);
        desiredElement.click();
    }

    public void cambioAVentanaEmergente() {
        String ventanaPrincipal = getDriver().getWindowHandle();
        Set<String> ventanas = getDriver().getWindowHandles();
        for (String ventana : ventanas) {
            if (!ventanaPrincipal.equals(ventana)) {
                getDriver().switchTo().window(ventana);
                break;
            }
        }
    }
}

