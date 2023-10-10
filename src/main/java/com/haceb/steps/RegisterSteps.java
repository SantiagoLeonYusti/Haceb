package com.haceb.steps;

import com.haceb.pageObject.HomePage;
import com.haceb.pageObject.RegisterPage;
import com.haceb.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;


public class RegisterSteps {
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();
    private WebDriver driver;


    @Step("Rellenar campo de correo")
    public void rellenarCampoCorreo() throws IOException {
        WebDriverWait wait = new WebDriverWait(registerPage.getDriver(), Duration.ofSeconds(20));
        WebElement correoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.getLblCorreo()));
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Credenciales1");
        registerPage.getDriver().findElement(registerPage.getLblCorreo()).sendKeys(data.get(0).get("Correo"));
    }

    @Step("Rellenar campo de nombre")
    public void rellenarCampoNombre() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Credenciales1");
        registerPage.getDriver().findElement(registerPage.getLblNombre()).sendKeys(data.get(0).get("Nombre"));
    }

    @Step("Rellenar campo de apellido")
    public void rellenarCampoApellido() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Credenciales1");
        registerPage.getDriver().findElement(registerPage.getLblApellido()).sendKeys(data.get(0).get("Apellido"));
    }

    @Step("Rellenar campo de contraseña")
    public void rellenarCampoContraseña() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Credenciales1");
        registerPage.getDriver().findElement(registerPage.getLblContraseña()).sendKeys(data.get(0).get("Contraseña"));
    }

    @Step("Confirmar contraseña")
    public void rellenarCampoConfirmarContraseña() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Credenciales1");
        registerPage.getDriver().findElement(registerPage.getLblConfirmarContraseña()).sendKeys(data.get(0).get("Confirmar contraseña"));
    }

    @Step("Click en checkbox")
    public void clickCheckbox() {
        JavascriptExecutor executor = (JavascriptExecutor) registerPage.getDriver();
        executor.executeScript("arguments[0].click()", registerPage.getDriver().findElement(registerPage.getLblCheckbox()));
    }

    @Step("Click en Si Autoriso")
    public void clickSiAutorizo() {
        registerPage.getDriver().findElement(registerPage.getCcAutorizo()).click();
    }

    @Step("Click en REGISTRARME")
    public void clickRegisrarme() {
        registerPage.getDriver().findElement(registerPage.getBtnRegistrase()).click();
    }

    @Step("Ingreso de cedula")
    public void ingresoCedula() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Credenciales1");
        registerPage.getDriver().findElement(registerPage.getLblCedula()).sendKeys(data.get(0).get("Cedula"));
    }

    @Step("Seleccion de genero")
    public void sleccionGenero() {
        registerPage.getDriver().findElement(registerPage.getSeleccionGenero()).click();
    }

    @Step("Seleccion fecha")
    public void seleccionFecha() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Credenciales1");
        registerPage.getDriver().findElement(registerPage.getInputFecha()).sendKeys(data.get(0).get("Fecha"));
    }

    @Step("Seleccion de pais")
    public void seleccionPais() {
        registerPage.getDriver().findElement(registerPage.getInputPais()).click();
    }

    @Step("Ingreso numero de contacto")
    public void ingresoNumeroContacto() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Credenciales1");
        registerPage.getDriver().findElement(registerPage.getInputNumeroContacto()).sendKeys(data.get(0).get("Numero de contacto"));
    }

    @Step("Seleccion departamento")
    public void seleccionDepartamento() {
        registerPage.getDriver().findElement(registerPage.getInputDepartamento()).click();
    }

    @Step("Seleccion Ciudad")
    public void seleccionCiudad() {
        registerPage.getDriver().findElement(registerPage.getInputCiudad()).click();
    }

    @Step("Click boton enviar")
    public void clickBotonEnviar() {
        registerPage.getDriver().findElement(registerPage.getBtnEnviar()).click();
    }
}

