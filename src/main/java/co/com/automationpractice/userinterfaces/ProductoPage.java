package co.com.automationpractice.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductoPage {
    private ProductoPage() {
    }

    public static final Target LBL_CANTIDAD = Target.the("Texto cantidad de prendas").located(By.xpath("//input[@id='quantity_wanted']"));
    public static final Target BTN_AUMENTAR = Target.the("Boton aumentar").located(By.className("icon-plus"));
    public static final Target LS_TALLA = Target.the("Lista de tallas").located(By.id("group_1"));
    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton para agregar al carrito de compras").located(By.xpath("//span[contains(.,'Add to cart')]"));
    public static final Target BTN_CONTINUAR_COMPRANDO = Target.the("Boton continuar comprando").located(By.xpath("(//span[ contains (.,'Continue shopping')])[2] "));
    public static final Target LBL_NOMBRE_PRODUCTO = Target.the("Nombre del producto").located(By.xpath("//div[@class='primary_block row']//h1"));
    public static final Target LBL_PRECIO_PRODUCTO = Target.the("Precio del producto").located(By.id("our_price_display"));

}
