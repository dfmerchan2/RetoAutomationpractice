package co.com.automationpractice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.automationpractice.userinterfaces.HomePage.LBL_NOMBRE_USUARIO;

public class InicioSesion implements Question <String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_NOMBRE_USUARIO).viewedBy(actor).asString();
    }

    public static InicioSesion exitosa(){
        return new InicioSesion();
    }
}
