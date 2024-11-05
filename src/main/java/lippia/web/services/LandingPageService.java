package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LandingPageConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LandingPageService extends ActionManager {

    public static void navigateWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickOnSignIn() {
        WebActionManager.click(LandingPageConstants.BUTTON_SIGN_IN);
    }
}
