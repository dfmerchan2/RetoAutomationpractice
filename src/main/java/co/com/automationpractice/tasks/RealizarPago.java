package co.com.automationpractice.tasks;

import co.com.automationpractice.models.Builder.UsuarioBuilder;
import co.com.automationpractice.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.automationpractice.userinterfaces.PagoPage.*;
import static co.com.automationpractice.utilities.Constantes.CHEQUE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarPago implements Task {

    private Usuario usuario;

    public RealizarPago(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Ensure.that(LBL_METODOS_PAGOS).isDisplayed());

        if (CHEQUE.equalsIgnoreCase(usuario.getMetodoPago())) {
            actor.attemptsTo(Click.on(BTN_PAGAR_CHEQUE));
        } else {
            actor.attemptsTo(Click.on(BTN_PAGAR_TRANSFERENCIA));
        }
        actor.attemptsTo(Click.on(BTN_CONFIRMAR_ORDEN));
    }

    public static Performable deProductos(UsuarioBuilder usuarioBuilder) {
        return instrumented(RealizarPago.class, usuarioBuilder.builder());
    }
}
