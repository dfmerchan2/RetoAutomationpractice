package co.com.automationpractice.tasks;

import co.com.automationpractice.models.Builder.UsuarioBuilder;
import co.com.automationpractice.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.automationpractice.userinterfaces.AutenticacionPage.*;
import static co.com.automationpractice.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    private Usuario usuario;

    public IniciarSesion(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(LBL_LOGO).isDisplayed(),
                Click.on(BTN_INICIAR_SESION),
                Ensure.that(LBL_AUTENTICACION).isDisplayed(),
                Enter.theValue(usuario.getCorreo()).into(TXT_CORREO),
                Enter.theValue(usuario.getClave()).into(TXT_CLAVE),
                Click.on(BTN_REGISTRARSE)
        );
    }

    public static Performable enAutomationpractice(UsuarioBuilder usuarioBuilder){
        return instrumented(IniciarSesion.class, usuarioBuilder.builder());
    }
}
