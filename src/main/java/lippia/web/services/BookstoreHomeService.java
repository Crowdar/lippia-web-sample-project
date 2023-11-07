package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import lippia.web.constants.BookstoreConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static com.crowdar.driver.DriverManager.getDriverInstance;

public class BookstoreHomeService extends WebActionManager {

    public static void webNavigation(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void homePageValidation(){
        waitVisibility(BookstoreConstants.NEW_ARRIVALS_TITLE);
        Assert.assertEquals( "new arrivals" , getText(BookstoreConstants.NEW_ARRIVALS_TITLE) );
    }

    public static void navbarButtonClick(String boton) {
        waitVisibility(BookstoreConstants.NAVBAR_LOGO);
        if (!boton.equalsIgnoreCase("bookstore logo")) {
            click(String.format(BookstoreConstants.NAVBAR_BUTTON), boton);
        }else{
            click(BookstoreConstants.NAVBAR_LOGO);
            }
        cerrarPublicidad();
    }

    public static void carouselImgValidation(int cantidad) {
        waitVisibility(BookstoreConstants.CAROUSEL_IMG);
        List<WebElement> cantImg = getElements(BookstoreConstants.CAROUSEL_IMG);
        List<WebElement> flecha = getElements(BookstoreConstants.CAROUSEL_NEXT);
        int contador = 0;

        for (int i = 0; i < cantImg.size(); i++){
            flecha.get(0).click();
            contador++;
        }

        Assert.assertEquals(contador, cantidad);


    }

    public static void arrivalsValidation(int cantidad){
        waitVisibility(BookstoreConstants.ARRIVAL_PRODUCTS);
        List<WebElement> list = getElements(BookstoreConstants.ARRIVAL_PRODUCTS);
        Assert.assertEquals(list.size(), cantidad);
    }
    public static void cerrarPublicidad() {

        try{
            WebElement publi = getElement(BookstoreConstants.CLOSE_AD);
            if (publi.isDisplayed()) {
                publi.click();
                DriverManager.getDriverInstance().switchTo().defaultContent();
            }
        }catch(Exception efe) {
            System.out.println(efe.getMessage());
        }
    }

    public static void scrolluntil() {
        waitVisibility(BookstoreConstants.NEW_ARRIVALS_TITLE);
        scroll(getElement(BookstoreConstants.NEW_ARRIVALS_TITLE));
    }

    public static void scroll(WebElement element) {
        JavascriptExecutor jse = DriverManager.getDriverInstance();
        jse.executeScript("arguments[0].scrollIntoView()", new Object[]{element});
    }

    public static void clickeableImgValidation() {
        waitVisibility(BookstoreConstants.ARRIVAL_PRODUCTS);
        List<WebElement> arrivals = getElements(BookstoreConstants.ARRIVAL_PRODUCTS);
        arrivals.get(0).click();
    }

    public static void urlValidation(String url) {
        String urlActual = getDriverInstance().getCurrentUrl();
        String urlCompleta = "";

        if (urlActual.contains("product")) {
            String urlBase = "https://practice.automationtesting.in/product/";
            urlCompleta = urlBase.concat(url).concat("/");
        }else{
            String urlBase = "https://practice.automationtesting.in/";
            urlCompleta = urlBase.concat(url).concat("/");
        }

        Assert.assertEquals(urlCompleta , urlActual);
    }


    public static void addButtonValidation() {
        waitVisibility(BookstoreConstants.ADD_BUTTON);
        Assert.assertEquals(true , isVisible(BookstoreConstants.ADD_BUTTON));
    }

    public static boolean isVisible(String locatorElement, String... locatorReplacementValue) {
        return getElement(locatorElement, locatorReplacementValue).isDisplayed();
    }


    public static void enterUser(String email) {
        waitVisibility(BookstoreConstants.USER_INPUT);
        setInput(BookstoreConstants.USER_INPUT, email);
        click(BookstoreConstants.LOGIN_FORM);
    }

    public static void enterPass(String pass) {
        waitVisibility(BookstoreConstants.PASS_INPUT);
        setInput(BookstoreConstants.PASS_INPUT, pass);
    }

    public static void loginButtonClick() {
        waitVisibility(BookstoreConstants.LOGIN_BUTTON);
        waitClickable(BookstoreConstants.LOGIN_BUTTON);
        click(BookstoreConstants.LOGIN_BUTTON,false);
    }

    public static void errorValidation(String errormsg) {
        waitVisibility(BookstoreConstants.LOGIN_ERROR_MSG);
        String errorObtenido = getText(BookstoreConstants.LOGIN_ERROR_MSG);
        Assert.assertEquals(errormsg , errorObtenido);
    }

    public static void loginFormValidation() {
        waitVisibility(BookstoreConstants.LOGIN_FORM);
        Assert.assertEquals(true , isVisible(BookstoreConstants.LOGIN_FORM));
        Assert.assertEquals(true , isVisible(BookstoreConstants.LOGIN_BUTTON));
    }
}

