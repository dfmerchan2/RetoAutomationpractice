package co.com.automationpractice.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DireccionPage {
    private DireccionPage() {
    }

    public static final Target LBL_TITULO_DIRECCION = Target.the("Titulo de direccion").located(By.className("page-heading"));
    public static final Target LBL_NOMBRE_CLIENTE = Target.the("Descripcion nombre del cliente").located(By.xpath("//ul[@id='address_delivery']//li[@class='address_firstname address_lastname']"));
    public static final Target LBL_NOMBRE_EMPRESA = Target.the("").located(By.xpath("//ul[@id='address_delivery']//li[@class='address_company']"));
    public static final Target LBL_DIRECCION = Target.the("Descripcion direccion").located(By.xpath("//ul[@id='address_delivery']//li[@class='address_address1 address_address2']"));
}
