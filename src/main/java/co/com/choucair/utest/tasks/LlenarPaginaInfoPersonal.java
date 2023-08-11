package co.com.choucair.utest.tasks;

import co.com.choucair.utest.model.Utest_Datos;
import co.com.choucair.utest.userinterface.PaginaInfoPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.utest.userinterface.PaginaInfoPersonal.*;

public class LlenarPaginaInfoPersonal implements Task {

    private List<Utest_Datos> datos;

    public LlenarPaginaInfoPersonal(List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaInfoPersonal laPagina(List<Utest_Datos> datos) {
        return Tasks.instrumented(LlenarPaginaInfoPersonal.class, datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(NOMBRE),
                Enter.theValue(datos.get(0).getStrApellido()).into(APELLIDO),
                Enter.theValue(datos.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(datos.get(0).getStrMesNacimiento()).from(MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrDiaNacimiento()).from(DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrAnoNacimiento()).from(ANO_NACIMIENTO),
                Click.on(BOTON_DIRECCION)
                );

    }
}
