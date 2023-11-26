package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomePageConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;

public class HomePageService extends ActionManager {
    public static void menuInicio(){
        click(HomePageConstants.INICIO);
    }
    public static void arrivalsVerificacion() {
        List<WebElement> listado =  getElementsByParent(HomePageConstants.ARRIVAL_PADRE,HomePageConstants.ARRIVALS_HIJOS);
        Assert.assertEquals(3, listado.size());
    }
    public  static void arrivalSeleccionado(){
        List<WebElement> BotonAgregar = getElements(HomePageConstants.BOTON_AGREGAR);
        WebElement PrimerBoton = BotonAgregar.get(0);
        String AtributoID = PrimerBoton.getAttribute(HomePageConstants.ATRIBUTOID_LIBRO);
        String SelecionaLibro = HomePageConstants.PRODUCTO_ID.replace("JutsuDeReemplazo", AtributoID);
        click(SelecionaLibro);
    }
}

