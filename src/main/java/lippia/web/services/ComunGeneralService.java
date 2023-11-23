package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import static com.crowdar.core.actions.WebActionManager.navigateTo;


public class ComunGeneralService extends ActionManager {
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
}
