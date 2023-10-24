package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import junit.framework.Assert;
import lippia.web.constants.BookstoreConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class BookstoreHomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    /*public static void clickSearchButton() {
        click(BookstoreConstants.SEARCH_BUTTON_NAME);
    }
    */
}

