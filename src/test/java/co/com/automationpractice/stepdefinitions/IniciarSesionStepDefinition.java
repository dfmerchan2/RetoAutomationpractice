package co.com.automationpractice.stepdefinitions;

import co.com.automationpractice.exceptions.ExceptionError;
import co.com.automationpractice.interactions.AbrirNavegador;
import co.com.automationpractice.questions.InicioSesion;
import co.com.automationpractice.tasks.IniciarSesion;
import cucumber.api.java.es.Dado;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import static co.com.automationpractice.utilities.Constantes.MS_INICIO_SESION_FALLIDO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static co.com.automationpractice.models.Builder.UsuarioBuilder.usuario;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class IniciarSesionStepDefinition {
    @Dado("^que (.*) inicia sesion en automationpractice$")
    public void queDiegoIniciaSesionEnAutomationpractice(String actor, List<Map<String, String>> informacion) {
        theActorCalled(actor).attemptsTo(
                AbrirNavegador.deAutomationpractice(),
                IniciarSesion.enAutomationpractice(usuario()
                        .conCorreo(informacion.get(0).get("Usuario"))
                        .conClave(informacion.get(0).get("Clave")))
        );
        theActorInTheSpotlight().should(seeThat(
                InicioSesion.exitosa(), Matchers.equalTo(informacion.get(0).get("NombreUsuario")))
                .orComplainWith(ExceptionError.class, MS_INICIO_SESION_FALLIDO));
    }
}

