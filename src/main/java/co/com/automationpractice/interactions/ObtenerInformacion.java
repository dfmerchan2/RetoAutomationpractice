package co.com.automationpractice.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.ArrayList;
import java.util.List;

import static co.com.automationpractice.userinterfaces.ProductoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObtenerInformacion implements Interaction {


    private static List<String> nombreProducto = new ArrayList<>();
    private static List<String> cantidadProducto = new ArrayList<>();
    private static List<String> precioProducto = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        nombreProducto.add(LBL_NOMBRE_PRODUCTO.resolveFor(actor).getText());
        cantidadProducto.add(LBL_CANTIDAD.resolveFor(actor).getValue());
        precioProducto.add(LBL_PRECIO_PRODUCTO.resolveFor(actor).getText());
    }

    public static int cantidadPrendas() {
        return nombreProducto.size();
    }

    public static String nombre(int posicion) {
        return nombreProducto.get(posicion);
    }

    public static String cantidad(int posicion) {
        return cantidadProducto.get(posicion);
    }

    public static String precio(int posicion) {
        return precioProducto.get(posicion);
    }

    public static Performable deProducto() {
        return instrumented(ObtenerInformacion.class);
    }
}
