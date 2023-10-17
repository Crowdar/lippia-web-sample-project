package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ButtonSinClaveFiscal;


import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class SinClaveFiscalButtonService extends ActionManager {

    public static void navegarWeb(String url){
        navigateTo(url);
    }

    public static void goSinClaveFiscalButton() {

        WebActionManager.click(ButtonSinClaveFiscal.SIN_CLAVE_FISCAL_BUTTON);
    }



}


