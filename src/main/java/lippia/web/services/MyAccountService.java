package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static lippia.web.constants.MyAccountConstants.*;


public class MyAccountService extends ActionManager {


    public static void setInputValues(String username, String elemento, String xpath) {
        waitPresence(elemento);
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        WebElement inputField = driver.findElement(By.xpath(xpath));
        inputField.sendKeys(username);
        try {
            Thread.sleep(3000);  // Esperar 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickLogin() {
        waitClickable(MYACCOUNT_LOGIN_BUTTON);
        click(MYACCOUNT_LOGIN_BUTTON);
    }

    public static void validateUser() {
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        // Obtiene el contenido de la página web
        String contenidoPagina = driver.getPageSource();
        // Verifica si la cadena está incluida en el contenido de la página
        Assert.assertTrue(contenidoPagina.contains("Sign out"), "El usuario no está logueado");
    }

    public static void incorrectUser() {
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        // Obtiene el contenido de la página web
        String contenidoPagina = driver.getPageSource();
        // Verifica si la cadena está incluida en el contenido de la página
        String error = " A user could not be found with this email address.";
        Assert.assertTrue(contenidoPagina.contains(error), "El usuario está logueado");
    }
}

