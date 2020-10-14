package co.com.automationpractice.tasks;

import co.com.automationpractice.interactions.ObtenerInformacion;
import co.com.automationpractice.interactions.SeleccionarCantidad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static co.com.automationpractice.userinterfaces.HomePage.*;
import static co.com.automationpractice.userinterfaces.ProductoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto implements Task {

    private static final String PRODUCTO = "Producto";
    private List<Map<String, String>> informacionProducto;

    public AgregarProducto(List<Map<String, String>> producto) {
        this.informacionProducto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        IntStream.range(0, informacionProducto.size())
                .forEach(
                        i ->
                                actor.attemptsTo(
                                        Click.on(LBL_LOGO),
                                        MoveMouse.to(LBL_PRODUCTO.of(informacionProducto.get(i).get(PRODUCTO))),
                                        Click.on(BTN_MAS.of(informacionProducto.get(i).get(PRODUCTO))),
                                        Ensure.that(LBL_NOMBRE_PRODUCTO).text().isEqualTo(informacionProducto.get(i).get(PRODUCTO)),
                                        SeleccionarCantidad.dePrendas(informacionProducto.get(i).get("Cantidad")),
                                        SelectFromOptions.byVisibleText(informacionProducto.get(i).get("Talla")).from(LS_TALLA),
                                        ObtenerInformacion.deProducto(),
                                        Click.on(BTN_AGREGAR_CARRITO),
                                        Click.on(BTN_CONTINUAR_COMPRANDO)
                                )
                );
    }

    public static Performable alCarrito(List<Map<String, String>> producto) {
        return instrumented(AgregarProducto.class, producto);
    }
}
