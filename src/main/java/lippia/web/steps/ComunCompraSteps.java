package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import lippia.web.services.ComunCompraService;

public class ComunCompraSteps extends PageSteps {
    @Given("Se dirige al Menu Tienda")
    public void MenuTienda() {
        ComunCompraService.menuTienda();
    }
}
