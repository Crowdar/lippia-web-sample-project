package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.FormularioConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FormularioServices extends ActionManager {
    public static void descuento() {
        AyudasServices.tiempo(1000);
        WebElement descuento = getElement(FormularioConstants.LINK_CUPON);
        new Actions(DriverManager.getDriverInstance()).moveToElement(descuento).click().build().perform();

        AyudasServices.tiempo(3000);
        Assert.assertTrue(isVisible(FormularioConstants.APLICAR_CUPON,FormularioConstants.INPUT_CUPON));
    }
}




