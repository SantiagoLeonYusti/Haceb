package com.haceb.steps;

import com.haceb.pageObject.HomePage;
import com.haceb.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Step("Abrir navegador")
    public void abrirNavegador() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Credenciales1");
        homePage.openUrl(data.get(0).get("URL"));
    }

    @Step("Pasar sobre Mi Perfil y dar click en registrate")
    public void pasarCursorYHacerClick() {
        homePage.pasarCursorSobreElento(homePage.getDriver());
        homePage.clickRegistrese(homePage.getDriver());
    }
    @Step("click en ingresar a haceb")
    public void clickIngresarHaceb() {
        homePage.getDriver().findElement(homePage.getBtnIngresarHaceb()).click();
        homePage.cambioAVentanaEmergente();
    }
    @Step("Validacion de usuario registrado")
    public void validacionUsuario(){
        homePage.cambioAVentanaEmergente();
        WebDriverWait wait = new WebDriverWait(homePage.getDriver(), Duration.ofSeconds(20));
        WebElement registroExitioso = wait.until(ExpectedConditions.visibilityOfElementLocated(homePage.getInputActualizarDatos()));;
        Assert.assertTrue(registroExitioso.isDisplayed());
    }

}
