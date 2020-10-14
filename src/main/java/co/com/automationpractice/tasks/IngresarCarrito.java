package co.com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.automationpractice.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(BTN_CARRITO_COMPRAS),
                Click.on(BTN_REVISAR)
        );
    }

    public static Performable deCompras(){
        return instrumented(IngresarCarrito.class);
    }
}
