package co.com.choucair.utest.tasks;

import co.com.choucair.utest.model.Utest_Datos;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.utest.userinterface.PaginaFinal.*;

public class LlenarPaginaFinal implements Task {

    private List<Utest_Datos> datos;

    public LlenarPaginaFinal(List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaFinal laPagina(List<Utest_Datos> datos) {
        return Tasks.instrumented(LlenarPaginaFinal.class, datos);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get(0).getStrContrasena()).into(CONTRASENA),
                Enter.theValue(datos.get(0).getStrContrasena()).into(CONFIRMAR_CONTRASENA),
                Click.on(CHECKBOX_STAY_INFORMED),
                Click.on(CHECKBOX_TERMS_OF_USE),
                Click.on(CHECKBOX_PRIVACIDAD),
                Click.on(BOTON_SETUP)

        );


    }
}
