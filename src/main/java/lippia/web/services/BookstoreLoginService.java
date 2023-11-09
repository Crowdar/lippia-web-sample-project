package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import lippia.web.constants.CommonConstants;
import lippia.web.constants.BookstoreLoginConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;

import static com.crowdar.driver.DriverManager.getDriverInstance;

public class BookstoreLoginService extends WebActionManager {

    public static void enterUser(String email) {
        waitVisibility(BookstoreLoginConstants.USER_INPUT);
        setInput(BookstoreLoginConstants.USER_INPUT, email);
        click(CommonConstants.LOGIN_FORM);
    }

    public static void enterPass(String pass) {
        waitVisibility(BookstoreLoginConstants.PASS_INPUT);
        setInput(BookstoreLoginConstants.PASS_INPUT, pass);
    }

    public static void errorValidation(String errormsg) {
        waitVisibility(BookstoreLoginConstants.LOGIN_ERROR_MSG);
        String errorObtenido = getText(BookstoreLoginConstants.LOGIN_ERROR_MSG);
        Assert.assertEquals(errormsg , errorObtenido);
    }

    public static void loginFormValidation() {
        waitVisibility(CommonConstants.LOGIN_FORM);
        Assert.assertTrue(isVisible(CommonConstants.LOGIN_FORM));
        Assert.assertTrue(isVisible(CommonConstants.LOGIN_BUTTON));
    }

}
