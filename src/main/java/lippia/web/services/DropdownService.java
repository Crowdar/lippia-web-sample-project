package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.DropdownConstants;

public class DropdownService {

    public static void clickShopDropdown(String arg0) {
        WebActionManager.setDropdownByIndex(DropdownConstants.DROPDOWN_BUTTON, 1);
    }


}
