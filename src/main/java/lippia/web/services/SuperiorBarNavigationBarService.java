package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.WebDriver;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.SuperiorNavigationBarConstants.*;


public class SuperiorBarNavigationBarService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        EventManager.waitForPageLoad(driver);
    }

    public static void tapMenu( ) {
        WebActionManager.waitClickable(SHOP_MENU_BUTTON);
        WebActionManager.click( SHOP_MENU_BUTTON );

    }

    public static void clickMyAccount() {
        WebActionManager.waitClickable(MY_ACCOUNT_BUTTON);
        WebActionManager.click( MY_ACCOUNT_BUTTON );
    }
}
