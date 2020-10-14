package co.com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.automationpractice.userinterfaces.EnvioPage.*;
import static co.com.automationpractice.userinterfaces.ResumenPage.BTN_SIGUIENTE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObservarEnvio implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(LBL_ENVIO).isDisplayed(),
                Click.on(CHK_TERMINOS_CONDICIONES),
                Click.on(BTN_SIGUIENTE)
        );
    }

    public static Performable deProductos() {
        return instrumented(ObservarEnvio.class);
    }
}
