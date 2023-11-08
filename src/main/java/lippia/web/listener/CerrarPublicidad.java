package lippia.web.listener;

import com.crowdar.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.ActionManager.getElement;

final public class CerrarPublicidad implements ValidacionListener {

    private static String BOTON_CIERRE = "id:dismiss-button";
    public static final String PUBLICIDAD_1 = "xpath:/html/ins/*/*[contains(@id, 'aswift_') and not(contains(@id, 'host'))]";
    public static final String PUBLICIDAD_2 = "id:ad_iframe";

    @Override
    public void validacion(Throwable throwable, WebDriver driver ) {
        if ( !publicidadVisible() )
            return;

        cerrarPublicidad();
    }

    private boolean publicidadVisible() {
        return DriverManager.getDriverInstance().getCurrentUrl().contains( "#google_vignette" );
    }

    private static void cerrarPublicidad() {
        WebDriver driver = DriverManager.getDriverInstance();
        accionParaCerrar( driver, getElement(PUBLICIDAD_1) );
        accionParaCerrar( driver, getElement(PUBLICIDAD_2) );
        driver.switchTo().defaultContent();
    }

    private static boolean accionParaCerrar(WebDriver driver, WebElement publicidad ){
        if ( !publicidad.isDisplayed() )
            return false;
        driver.switchTo().frame( publicidad );
        try {
            getElement(BOTON_CIERRE).click();
        }catch(Exception ignored ){
            return false;
        }
        return true;
    }


}
