package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import lippia.web.constants.BookstoreLoginConstants;
import lippia.web.constants.CommonConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.List;

import static com.crowdar.driver.DriverManager.getDriverInstance;

public class CommonService extends WebActionManager {

    public static void webNavigation(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void homePageValidation(){
        waitVisibility(CommonConstants.NEW_ARRIVALS_TITLE);
        Assert.assertEquals( "new arrivals" , getText(CommonConstants.NEW_ARRIVALS_TITLE) );
    }

    public static void navbarButtonClick(String boton) {
        waitVisibility(CommonConstants.NAVBAR_LOGO);
        if (!boton.equalsIgnoreCase("bookstore logo")) {
            click(String.format(CommonConstants.NAVBAR_BUTTON), boton);
        }else{
            click(CommonConstants.NAVBAR_LOGO);
            }
        cerrarPublicidad();
    }

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

    public static void urlValidation(String url) {
        String urlActual = getDriverInstance().getCurrentUrl();
        String urlCompleta = "";
        String urlBase = "https://practice.automationtesting.in/";
        urlCompleta = urlBase.concat(url).concat("/");
        Assert.assertEquals(urlCompleta , urlActual);
    }

    public static void loginButtonClick() {
        waitVisibility(CommonConstants.LOGIN_BUTTON);
        waitClickable(CommonConstants.LOGIN_BUTTON);
        click(CommonConstants.LOGIN_BUTTON,false);
    }

}

