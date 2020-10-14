package co.com.automationpractice.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    private HomePage() {
    }

    public static final Target BTN_INICIAR_SESION = Target.the("Boton iniciar sesion").located(By.className("login"));
    public static final Target LBL_NOMBRE_USUARIO = Target.the("Descripción nombre de usuario").located(By.xpath("(//div[@class='header_user_info'])[1]"));
    public static final Target LBL_LOGO = Target.the("Logo de la pagina").located(By.id("header_logo"));
    public static final Target LBL_PRODUCTO = Target.the("Titulo del producto").locatedBy("(//a[@class='product-name' and contains(.,'{0}')])[1]");
    public static final Target BTN_MAS = Target.the("Boton detalle del producto").locatedBy("(//div[@class='right-block' and contains(.,'{0}')])[1]//span[contains(.,'More')]");
    public static final Target BTN_CARRITO_COMPRAS = Target.the("Boton carrito de compras").located(By.xpath("//b[ contains (.,'Cart')]"));
    public static final Target BTN_REVISAR = Target.the("Boton revisar").located(By.id("button_order_cart"));
}
