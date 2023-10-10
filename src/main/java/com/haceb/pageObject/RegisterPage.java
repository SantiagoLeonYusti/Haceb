package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;



public class RegisterPage extends PageObject {
    By lblCorreo = By.xpath("//*[@id='gigya-loginID-51216659851706440']");
    By lblNombre = By.xpath("//*[@id='gigya-textbox-72173553995486780']");
    By lblApellido = By.xpath("//*[@id='gigya-textbox-146410824335495100']");
    By lblContraseña = By.xpath("//*[@id='gigya-password-54061940132406190']");
    By lblConfirmarContraseña = By.xpath("//*[@id='gigya-password-142670944012194750']");
    By lblCheckbox = By.xpath("//input[@id='gigya-checkbox-70031539084410860']");
    By ccsAutorizo = By.cssSelector("#gigya-register-form .gigya-multi-choice-item:nth-child(4) > label");
    By btnRegistrase = By.xpath("//input[@value='REGISTRARME']");
    By inputCedula = By.xpath("//input[@type='number' and @name='data.cedula'][@data-screenset-element-id='gigya-textbox-153635908553265760'][contains(@data-screenset-roles, 'instance,instance')]");
    By seleccionGenero = By.xpath("//select[@id='gigya-dropdown-153944062160082270']//option[@value='m' and @data-translation-key='DROPDOWN_153944062160082270_CHOICES_6F8F57715090DA2632453988D9A1501B']");
    By inputFecha = By.xpath("//input[@id='gigya-textbox-29430652596742216' and @type='date']");
    By inputPais = By.xpath("//option[@value='+57' and contains(text(), 'Colombia (+57)')]");
    By inputNumeroContacto = By.xpath("//input[@class='gigya-input-text gigya-subscriber-phone-number-input' and @placeholder='Numero de contacto']");
    By inputDepartamento = By.xpath("//select[@id='gigya-dropdown-92626747568210580']/option[@value='Quindío']");
    By inputCiudad = By.xpath("//select[@id='gigya-dropdown-68670919361457840']/option[@value='Circasia']");
    By btnEnviar = By.xpath("//input[@type='submit' and @class='gigya-input-submit hc-c-register-screen-submit invi' and @value='Enviar']");
    By msjError = By.xpath("//*[@class='gigya-error-msg gigya-form-error-msg gigya-error-code-400006 gigya-error-msg-active']");
    public By getLblCorreo() {
        return lblCorreo;
    }
    public By getLblNombre() {
        return lblNombre;
    }
    public By getLblApellido() {
        return lblApellido;
    }
    public By getLblContraseña() {
        return lblContraseña;
    }
    public By getLblConfirmarContraseña() {
        return lblConfirmarContraseña;
    }
    public By getLblCheckbox() {
        return lblCheckbox;
    }
    public By getCcAutorizo() {
        return ccsAutorizo;
    }
    public By getBtnRegistrase() {
        return btnRegistrase;
    }

    public By getInputPais() {
        return inputPais;
    }

    public By getInputNumeroContacto() {
        return inputNumeroContacto;
    }

    public By getInputDepartamento() {
        return inputDepartamento;
    }
    public By getInputCiudad() {
        return inputCiudad;
    }
    public By getBtnEnviar() {
        return btnEnviar;
    }
    public By getSeleccionGenero() {
        return seleccionGenero;
    }
    public By getLblCedula() {
        return inputCedula;
    }
    public By getInputFecha() {
        return inputFecha;
    }
    public By getMsjError() {
        return msjError;
    }

}
