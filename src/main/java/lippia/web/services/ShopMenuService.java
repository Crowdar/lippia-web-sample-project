package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeMenuConstants;
import lippia.web.constants.ShopConstants;
import lippia.web.constants.HomeMenuConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ShopMenuService extends ActionManager {


    public static void goShop() {
        WebActionManager.click(ShopConstants.SHOP_MENU_BUTTON);
    }

    public static void goHome() {
        WebActionManager.click(HomeMenuConstants.HOM_MENU_BUTTON);
    }
}


