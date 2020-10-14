package co.com.automationpractice.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EnvioPage {
    private EnvioPage() {
    }

    public static final Target LBL_ENVIO = Target.the("Titulo de envio").located(By.className("page-heading"));
    public static final Target CHK_TERMINOS_CONDICIONES = Target.the("Check terminos y condiciones").located(By.id("cgv"));
}
