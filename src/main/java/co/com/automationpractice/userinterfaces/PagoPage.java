package co.com.automationpractice.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PagoPage {
    private PagoPage() {
    }

    public static final Target LBL_METODOS_PAGOS = Target.the("Titulo de mrtodos de pagos").located(By.className("page-heading"));
    public static final Target BTN_PAGAR_TRANSFERENCIA = Target.the("Boton pagar con transferencia").located(By.xpath("//a[@title='Pay by bank wire']/span"));
    public static final Target BTN_PAGAR_CHEQUE = Target.the("Boton pagar con cheque").located(By.xpath("//a[@title='Pay by check.']/span"));
    public static final Target BTN_CONFIRMAR_ORDEN = Target.the("Boton confirmar orden").located(By.xpath("//span[contains(.,'I confirm my order')]"));
    public static final Target LBL_COMPRA_EXITOSA = Target.the("Mensaje compra exitosa").located(By.xpath("//p[@class='alert alert-success' and contains (.,'Your order on My Store is complete.')]"));
}
