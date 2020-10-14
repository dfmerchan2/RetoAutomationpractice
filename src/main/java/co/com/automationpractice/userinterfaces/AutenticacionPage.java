package co.com.automationpractice.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AutenticacionPage {

    private AutenticacionPage() {
    }

    public static final Target TXT_CORREO = Target.the("Caja de texto correo").located(By.id("email"));
    public static final Target TXT_CLAVE = Target.the("Caja de texto clave").located(By.id("passwd"));
    public static final Target BTN_REGISTRARSE = Target.the("Boton registrarse").located(By.xpath("//span[contains (.,'Sign in')]"));
    public static final Target LBL_AUTENTICACION = Target.the("Descripcion de autenticación").located(By.className("page-heading"));
}
