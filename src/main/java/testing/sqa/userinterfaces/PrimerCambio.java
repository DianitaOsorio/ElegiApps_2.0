package testing.sqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrimerCambio {
    public static final Target LST_LINEAS = Target.the("lista desplegable con las lineas a usar")
            .locatedBy("//android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView");
    public static final Target BTN_LINEA_SEL = Target.the("linea a seleccionar")
            .locatedBy("//android.view.View[6]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[2]");
    public static final Target BTN_ElEGIAPPS = Target.the("botton elegiapps")

            .locatedBy("//*[contains(@text,'ElegiApps')]");
    public static final Target BTN_PINTEREST = Target.the("botton pinterest")
            .locatedBy("//android.view.View[4]");
    public static final Target BTN_SNAPCHAT = Target.the("botton snapchapt")
            .locatedBy("//android.view.View[5]");
    public static final Target BTN_SIGNAL = Target.the("botton signal")
            .locatedBy("//android.view.View[7]");

    public static final Target BTN_CONTINUAR= Target.the("botton continuar")
            .locatedBy("//*[contains(@text,'Continuar')]");
    public static final Target CHECKTYC = Target.the("check box tyc")
            .locatedBy("//android.widget.CheckBox");
    public static final Target BTN_ACEPTAR = Target.the("botton para cerrar ")
            .locatedBy("//*[contains(@text,'Aceptar')]");
    public static final Target BTN_CERRAR = Target.the("botton para cerrar modal")
            .locatedBy("//android.widget.Button");
    public static final Target BTN_MINUTOS = Target.the("botton elegiapps")
            .locatedBy("//*[contains(@text,'Minutos')]");
}
