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

public class PrimerCambioAppsStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario haga el primer cambio sin cobro$")
    public void queElUsuarioHagaElPrimerCambioSinCobro() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));
    }

    @Cuando("^da click en boton aceptar$")
    public void daClickEnBotonAceptar() {

            OnStage.theActorInTheSpotlight().attemptsTo(PrimerCambio.socialMedia ());
        }

    @Entonces("^el cambio de apps sea exitoso$")
    public void elCambioDeAppsSeaExitoso() {

    }
}
