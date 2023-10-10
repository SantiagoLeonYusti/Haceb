package com.haceb.stepDefinitions;


import com.haceb.steps.HomeSteps;
import com.haceb.steps.RegisterSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegisterStepDefinitions {

    @Steps
    HomeSteps homeSteps;
    RegisterSteps registerSteps = new RegisterSteps();


    @Dado("que el usuario abre la pagina de haceb")
    public void que_el_usuario_abre_la_pagina_de_haceb() throws IOException {
        homeSteps.abrirNavegador();
    }
    @Cuando("diligencie los campos solicitados y seleccionando los recuadros necesarios")
    public void diligencie_los_campos_solicitados_y_seleccionando_los_recuadros_necesarios() throws IOException {
        homeSteps.pasarCursorYHacerClick();
        homeSteps.clickIngresarHaceb();
        registerSteps.rellenarCampoCorreo();
        registerSteps.rellenarCampoNombre();
        registerSteps.rellenarCampoApellido();
        registerSteps.rellenarCampoContraseña();
        registerSteps.rellenarCampoConfirmarContraseña();
        registerSteps.clickCheckbox();
        registerSteps.clickSiAutorizo();
        registerSteps.clickRegisrarme();
        registerSteps.ingresoCedula();
        registerSteps.sleccionGenero();
        registerSteps.seleccionFecha();
        registerSteps.seleccionPais();
        registerSteps.ingresoNumeroContacto();
        registerSteps.seleccionDepartamento();
        registerSteps.seleccionCiudad();
        registerSteps.clickBotonEnviar();

    }
    @Entonces("el usuario queda registrado en la pagina de forma exitosa")
    public void el_usuario_queda_registrado_en_la_pagina_de_forma_exitosa() {
        homeSteps.validacionUsuario();
    }
}
