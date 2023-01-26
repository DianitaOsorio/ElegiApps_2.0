package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import testing.sqa.drivers.AppiumAndroidDriver;
import testing.sqa.tasks.PrimerCambio;
import testing.sqa.tasks.SegundoCambio;

public class SegundoCambioAppsStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario haga el primer cambio con cobro$")
    public void queElUsuarioHagaElPrimerCambioConCobro() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));

    }

    @Cuando("^seleciona el boton aceptar$")
    public void selecionaElBotonAceptar() {
        OnStage.theActorInTheSpotlight().attemptsTo(SegundoCambio.socialMedia ());

    }

    @Entonces("^la modificcacion de las apps sea exitosa$")
    public void laModificcacionDeLasAppsSeaExitosa() {

    }



}
