package testing.sqa.tasks;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.interactions.touch.TouchActions;
import testing.sqa.interactions.ExplicitWait;
import testing.sqa.interactions.ScrollDown;
import testing.sqa.interactions.ScrollDown2;
import testing.sqa.interactions.ScrollUp;

import java.lang.annotation.ElementType;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static testing.sqa.drivers.AppiumAndroidDriver.driver;
import static testing.sqa.userinterfaces.PrimerCambio.*;


public class PrimerCambio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                ExplicitWait.here(10),
                Click.on(LST_LINEAS),
                ScrollDown.on(),
                ScrollUp.on(),
                Click.on(BTN_LINEA_SEL),
                ExplicitWait.here(20),
                ScrollDown2.on(),
                WaitUntil.the(BTN_ElEGIAPPS,isVisible()).forNoMoreThan(129).seconds(),
                Click.on(BTN_ElEGIAPPS)
//                ExplicitWait.here(10),
//                ScrollDown.on(),
//                ExplicitWait.here(10),
//                Click.on(BTN_PINTEREST),
//                Click.on(BTN_SNAPCHAT),
//                ScrollUp.on(),
//                Click.on(BTN_CONTINUAR),
//                ExplicitWait.here(10),
//                Click.on(CHECKTYC),
//                ExplicitWait.here(10)
////                Click.on(BTN_ACEPTAR),
////                ExplicitWait.here(20),
////               Click.on(BTN_CERRAR)
        );




    }
    public static PrimerCambio socialMedia() {
        return Instrumented.instanceOf(PrimerCambio.class).withProperties();
    }
}
