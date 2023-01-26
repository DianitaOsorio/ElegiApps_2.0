package testing.sqa.interactions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.InvalidSelectorException;

import static testing.sqa.drivers.AppiumAndroidDriver.driver;

public class ScrollDown2 implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).index(0)).scrollIntoView(new UiSelector().text(\"Otros servicios\"))"));
        }
        catch (InvalidSelectorException e) { // ignore
             }
        System.out.println("Paso por aquí");

    }
    public static ScrollDown2 on(){
        return Instrumented.instanceOf(ScrollDown2.class).withProperties();
    }
}
