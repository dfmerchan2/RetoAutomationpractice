package co.com.automationpractice.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ResumenPage {
    private ResumenPage() {
    }

    public static final Target BTN_SIGUIENTE = Target.the("Boton siguiente").located(By.xpath("(//span[contains(.,'Proceed to checkout')])[2]"));
    public static final Target LBL_RESUMEN = Target.the("Titulo de resumen").located(By.id("cart_title"));
    public static final Target LST_PRODUCTOS = Target.the("lista de productos").locatedBy("(//td[@class='cart_description']//p)[{0}]");
    public static final Target LST_PRECIOS = Target.the("lista de precios de los productos").locatedBy("(//span[@class='price']//span)[{0}]");
    public static final Target LST_CANTIDAD = Target.the("lista de productos").locatedBy("(//td[@class='cart_quantity text-center']//input[@type='text'])[{0}]");
}
