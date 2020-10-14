package co.com.automationpractice.tasks;

import co.com.automationpractice.models.Builder.UsuarioBuilder;
import co.com.automationpractice.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.automationpractice.userinterfaces.DireccionPage.*;
import static co.com.automationpractice.userinterfaces.ResumenPage.BTN_SIGUIENTE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObservarDireccion implements Task {

    private Usuario usuario;

    public ObservarDireccion(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(LBL_TITULO_DIRECCION).isDisplayed(),
                Ensure.that(LBL_NOMBRE_CLIENTE).text().isEqualTo(usuario.getNombreUsuario()),
                Ensure.that(LBL_NOMBRE_EMPRESA).text().isEqualTo(usuario.getNombreEmpresa()),
                Ensure.that(LBL_DIRECCION).text().isEqualTo(usuario.getDireccion()),
                Click.on(BTN_SIGUIENTE)
        );
    }

    public static Performable deEntrega(UsuarioBuilder usuarioBuilder){
        return instrumented(ObservarDireccion.class, usuarioBuilder.builder());
    }
}
