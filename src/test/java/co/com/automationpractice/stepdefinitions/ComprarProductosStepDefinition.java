package co.com.automationpractice.stepdefinitions;

import co.com.automationpractice.exceptions.ExceptionError;
import co.com.automationpractice.questions.CompraProducto;
import co.com.automationpractice.tasks.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import java.util.List;
import java.util.Map;

import static co.com.automationpractice.models.Builder.UsuarioBuilder.usuario;
import static co.com.automationpractice.utilities.Constantes.MS_COMPRA_FALLIDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarProductosStepDefinition {

    @Dado("^que agrega los productos al carrito de compras$")
    public void queAgregaLosProductosAlCarritoDeCompras(List<Map<String, String>> producto) {
        theActorInTheSpotlight().attemptsTo(
                AgregarProducto.alCarrito(producto)
        );
    }

    @Cuando("^observa el resumen de la compra$")
    public void observaElResumenDeLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                IngresarCarrito.deCompras(),
                ObservarResumen.deProductos()
        );
    }

    @Y("^realiza el proceso de pago$")
    public void realizaElProcesoDePago(List<Map<String, String>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                ObservarDireccion.deEntrega(usuario()
                        .conNombreUsuario(informacion.get(0).get("NombreUsuario"))
                        .conNombreEmpresa(informacion.get(0).get("Empresa"))
                        .conDireccion(informacion.get(0).get("Direccion"))),
                ObservarEnvio.deProductos(),
                RealizarPago.deProductos(usuario()
                        .conMetodoPago(informacion.get(0).get("MetodoPago")))
        );
    }

    @Entonces("^observa el mensaje de compra exitosa$")
    public void observaElMensajeDeCompraExitosa() {
        theActorInTheSpotlight().should(seeThat(
                CompraProducto.deFormaExitosa())
                .orComplainWith(ExceptionError.class, MS_COMPRA_FALLIDA));
    }
}
