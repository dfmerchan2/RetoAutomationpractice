package co.com.automationpractice.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.automationpractice.userinterfaces.ProductoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCantidad implements Interaction {

    private String cantidad;

    public SeleccionarCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!LBL_CANTIDAD.resolveFor(actor).getValue().equals(cantidad)) {
            actor.attemptsTo(
                    Click.on(BTN_AUMENTAR)
            );
        }
    }

    public static Performable dePrendas(String cantidad) {
        return instrumented(SeleccionarCantidad.class, cantidad);
    }
}
