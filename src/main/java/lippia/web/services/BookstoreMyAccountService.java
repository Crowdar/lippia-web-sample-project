package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import lippia.web.constants.BookstoreMyAccountConstants;
import lippia.web.constants.CommonConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.crowdar.driver.DriverManager.getDriverInstance;

public class BookstoreMyAccountService extends WebActionManager {

    public static void cerrarPublicidad() {

        try{
            WebElement publi = getElement(CommonConstants.CLOSE_AD);
            if (publi.isDisplayed()) {
                publi.click();
                DriverManager.getDriverInstance().switchTo().defaultContent();
            }
        }catch(Exception efe) {
            System.out.println(efe.getMessage());
        }
    }

    public static void loginFormValidation() {
        waitVisibility(CommonConstants.LOGIN_FORM);
        junit.framework.Assert.assertTrue(isVisible(CommonConstants.LOGIN_FORM));
        junit.framework.Assert.assertTrue(isVisible(CommonConstants.LOGIN_BUTTON));
    }

    public static void navbarLinkClick(String link) {
        String locator = String.format(BookstoreMyAccountConstants.NAVBAR_LINK, link);
        waitVisibility(locator);
        cerrarPublicidad();
        click(locator,false);

    }

    public static void pageValidation() {
        waitVisibility(BookstoreMyAccountConstants.PAGE_CONTENT);
        junit.framework.Assert.assertTrue(getText(BookstoreMyAccountConstants.PAGE_CONTENT).contains("Hello testuser01-automation"));
    }

    public static void viewOrders() {
        waitVisibility(BookstoreMyAccountConstants.PAGE_CONTENT);
        Assert.assertTrue(isVisible(BookstoreMyAccountConstants.ORDERS_TABLE));
    }
}

