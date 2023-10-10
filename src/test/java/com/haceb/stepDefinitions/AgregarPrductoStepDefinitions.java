package com.haceb.stepDefinitions;

import com.haceb.steps.AgregarProductoSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class AgregarPrductoStepDefinitions {

    @Steps
    AgregarProductoSteps agregarProductoSteps;

    @Dado("que el usuario abre la pagina de web de haceb")
    public void queElUsuarioAbreLaPaginaDeWebDeHaceb() throws IOException {
        agregarProductoSteps.abrirNavegador();
    }
    @Cuando("seleccione categorias y selecciones Electroomesticos de cocina y selecciones un producto aleatorio y este se agregue al carro de compras")
    public void seleccione_categorias_y_selecciones_electroomesticos_de_cocina_y_selecciones_un_producto_aleatorio_y_este_se_agregue_al_carro_de_compras() {
        agregarProductoSteps.clickCategoria();
        agregarProductoSteps.pasarCursorsobreElectrodomesticos();
        agregarProductoSteps.seleccionarSubCategoria();
        agregarProductoSteps.selecccionarProducto();
        agregarProductoSteps.clickComprar();
        agregarProductoSteps.validarProductoEnCarro();
    }
    @Entonces("el usuario podra ver que el producto se agrego exitosamente al carro de compras")
    public void el_usuario_podra_ver_que_el_producto_se_agrego_exitosamente_al_carro_de_compras() {

    }
}
