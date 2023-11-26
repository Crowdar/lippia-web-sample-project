package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.RegistroConstants;
import org.testng.Assert;

public class RegistroService extends ActionManager {
    public static  void valoresRegistros(String email,String password){
        setInput(RegistroConstants.EMAIL, email);
        setInput(RegistroConstants.PASSWORD_REG, password);
        click(RegistroConstants.BOTON_REGISTRO);
    }
    public static void verificar_Registro_Fallido(String mensaje) {
        Assert.assertTrue(getElement(String.format(RegistroConstants.VERI_REGIS_FALLIDO, mensaje)).isDisplayed());
    }
}
