package testing.sqa.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class OpenTheWebsite implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static OpenTheWebsite on(){
        return Instrumented.instanceOf(OpenTheWebsite.class).withProperties();
    }
}
