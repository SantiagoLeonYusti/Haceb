package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.ThreadLocalRandom;

public class AgregarProductoPage extends PageObject {
    By btnCateodria = By.xpath("//a[@class='nav__link'][@role='button']");
    By aEeletrodoCocina = By.xpath("//a[@class='link-parent'][@title='Electrodomésticos de cocina']");
    By lblSubCategoria = By.xpath("//li[@class='has-children cocina-line']//a[@class='nav__link']");
    By descCategoria = By.xpath("//div[@class='descp-category']");
    By lblProductos = By.xpath("//a[@class='shelve-link-name']/h4");
    By aComprar = By.xpath("//div[@class='product__buy flex']/a[@class='btn btn-default buy-in-page-button']");
    By productoCarro = By.xpath("//a[@class='cart-prod-item__prod-name']");
    public By getBtnCateodria() {
        return btnCateodria;
    }
    public By getaEeletrodoCocina() {
        return aEeletrodoCocina;
    }

    public By getLblSubCategoria() {
        return lblSubCategoria;
    }

    public By getDescCategoria() {
        return descCategoria;
    }

    public By getLblProductos() {
        return lblProductos;
    }
    public By getaComprar() {
        return aComprar;
    }

    public By getProductoCarro() {
        return productoCarro;
    }

    public void pasarCursorSobreElemento(WebDriver driver){
        WebElement hoverElement = driver.findElement(aEeletrodoCocina);
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();
    }
}
