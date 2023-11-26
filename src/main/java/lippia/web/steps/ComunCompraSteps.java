package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.ComunCompraService;

public class ComunCompraSteps extends PageSteps {
    @Given("Se dirige al Menu Tienda")
    public void MenuTienda() {
        ComunCompraService.menuTienda();
    }
    @When("Se ve el libro junto a los valores totales, siempre total < subtotal por los impuestos")
    public void VerificacionValores() {
        ComunCompraService.verificacionValores();
    }
    @And("Procede a realizar el pago que le llevara a la pasarela de pago")
    public void Pasarela() {
        ComunCompraService.checkout();
    }
}
