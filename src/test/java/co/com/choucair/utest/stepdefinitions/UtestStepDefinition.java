package co.com.choucair.utest.stepdefinitions;

import co.com.choucair.utest.model.Utest_Datos;
import co.com.choucair.utest.questions.Responder;
import co.com.choucair.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Luis quiere registrarse en la pagina de Utest$")
    public void luisQuiereRegistrarseEnLaPaginaDeUtest() throws Exception{
        theActorCalled("Luis").wasAbleTo(AbrirPaginaUtest.laPagina());

    }

    @When("^ingrese toda la informacion requerida$")
    public void ingreseTodaLaInformacionRequerida(List<Utest_Datos> datos) throws Exception {
        theActorInTheSpotlight().attemptsTo(LlenarPaginaInfoPersonal.laPagina(datos), LlenarPaginaDireccion.laPagina(datos),
                LlenarPaginaDispositivos.laPagina(datos), LlenarPaginaFinal.laPagina(datos)
        );

    }

    @Then("^se completa el registro de manera exitosa$")
    public void seCompletaElRegistroDeManeraExitosa(List<Utest_Datos> datos) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.aLos(datos)));

    }
}
