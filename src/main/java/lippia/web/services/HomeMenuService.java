package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeMenuConstants;

public class HomeMenuService extends ActionManager {

    public static void goHome() {

        WebActionManager.click(HomeMenuConstants.HOM_MENU_BUTTON);
    }


}
