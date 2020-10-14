package co.com.automationpractice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.automationpractice.userinterfaces.PagoPage.LBL_COMPRA_EXITOSA;

public class CompraProducto implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if (LBL_COMPRA_EXITOSA.resolveFor(actor).isVisible())
            return true;
        return false;
    }

    public static CompraProducto deFormaExitosa() {
        return new CompraProducto();
    }
}
