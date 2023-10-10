package com.haceb.steps;

import com.haceb.pageObject.AgregarProductoPage;
import com.haceb.utils.EsperaExplicita;
import com.haceb.utils.Excel;
import com.haceb.utils.IndexRandom;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AgregarProductoSteps {
    AgregarProductoPage agregarProductoPage = new AgregarProductoPage();
    WebDriver driver = agregarProductoPage.getDriver();
    EsperaExplicita esperaExplicita = new EsperaExplicita(driver);

    @Step("Abrir navegador")
    public void abrirNavegador() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Credenciales1");
        agregarProductoPage.openUrl(data.get(0).get("URL"));
    }
    @Step("click en categoria")
    public void clickCategoria(){
        agregarProductoPage.getDriver().findElement(agregarProductoPage.getBtnCateodria()).click();
    }
    @Step("Pasar sobre Electrodomesticos de cocina")
    public void pasarCursorsobreElectrodomesticos() {
        agregarProductoPage.pasarCursorSobreElemento(agregarProductoPage.getDriver());
    }
    @Step("Seleccionar sub categoria de electrodomesticos aleatoria")
    public void seleccionarSubCategoria(){
        List<WebElement> categoria = agregarProductoPage.getDriver().findElements(agregarProductoPage.getLblSubCategoria());
        categoria.get(IndexRandom.numeroAleatorioEnRango(0, categoria.size())).click();
    }
    @Step("Seleccionar producto aleatorio de la subcategoria")
    public void selecccionarProducto(){
        esperaExplicita.esperarCargaPagina();
        List<WebElement> producto = agregarProductoPage.getDriver().findElements(agregarProductoPage.getLblProductos());
        producto.get(IndexRandom.numeroAleatorioEnRango(0, producto.size())).click();
    }
    @Step("Click en comprar")
    public void clickComprar(){
        esperaExplicita.esperarCargaPagina();
        agregarProductoPage.getDriver().findElement(agregarProductoPage.getaComprar()).click();
    }

    @Step("Validadar que el producto se encuentra en el carro de compras")
    public void validarProductoEnCarro(){
        WebDriverWait wait = new WebDriverWait(agregarProductoPage.getDriver(), Duration.ofSeconds(20));
        WebElement productoAgregado = wait.until(ExpectedConditions.visibilityOfElementLocated(agregarProductoPage.getaComprar()));
        Assert.assertTrue(productoAgregado.isDisplayed());
    }

}
