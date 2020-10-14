package co.com.automationpractice.tasks;

import co.com.automationpractice.interactions.ObtenerInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.stream.IntStream;

import static co.com.automationpractice.userinterfaces.ResumenPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObservarResumen implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Ensure.that(LBL_RESUMEN).isDisplayed());
        IntStream.range(0, ObtenerInformacion.cantidadPrendas())
                .forEach(
                        i ->
                                actor.attemptsTo(
                                        Ensure.that(LST_PRODUCTOS.of(Integer.toString(i + 1))).text().isEqualTo(ObtenerInformacion.nombre(i)),
                                        Ensure.that(LST_PRECIOS.of(Integer.toString(i + 1))).text().isEqualTo(ObtenerInformacion.precio(i)),
                                        Ensure.that(LST_CANTIDAD.of(Integer.toString(i + 1))).value().isEqualTo(ObtenerInformacion.cantidad(i))
                                )
                );
        actor.attemptsTo(Click.on(BTN_SIGUIENTE));
    }

    public static Performable deProductos() {
        return instrumented(ObservarResumen.class);
    }
}
