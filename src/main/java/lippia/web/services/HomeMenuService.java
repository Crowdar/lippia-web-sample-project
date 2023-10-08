package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeMenuConstants;

public class HomeMenuService {

    public static void goHome() {
        WebActionManager.waitClickable(HomeMenuConstants.HOM_MENU_BUTTON);
        WebActionManager.click(HomeMenuConstants.HOM_MENU_BUTTON);
    }


}
