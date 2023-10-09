package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ShopConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ShopMenuService extends ActionManager {

    public static void navegarWeb(String url){
        navigateTo(url);
    }

    public static void goShop() {

        WebActionManager.click(ShopConstants.SHOP_MENU_BUTTON);
    }



}


