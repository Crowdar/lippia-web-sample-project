package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.RegistroConstants;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class RegistroService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
        click(RegistroConstants.MY_ACCOUNT);
    }

    public static void flujoExitosoEmail(String mail){
        String generateString= RandomStringUtils.randomAlphabetic(7);
        String email= generateString+mail;
        setInput(RegistroConstants.EMAIL, email);
    }

    public static void flujoExitosoContraseña(String password){
        setInput(RegistroConstants.PASSWORD, password);
        click(RegistroConstants.BOTON_REGISTRO);
    }

    public static  void dirigirLoginyCuenta(String email,String password){
        setInput(RegistroConstants.EMAIL, email);
        setInput(RegistroConstants.PASSWORD, password);
        click(RegistroConstants.BOTON_REGISTRO);
    }

    public static void verificar_Registro_Exitoso() {
        Assert.assertTrue(ActionManager.waitPresence(RegistroConstants.VERI_REGIS_EXITO).isDisplayed());
    }

    public static void verificar_Registro_Fallido(String mensaje) {
        Assert.assertTrue(getElement(String.format(RegistroConstants.VERI_REGIS_FALLIDO, mensaje)).isDisplayed());
    }

}
