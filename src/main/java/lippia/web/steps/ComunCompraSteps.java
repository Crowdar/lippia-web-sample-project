package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
    @Then("El cliente observa el formulario para agregar sus datos")
    public void ValidacionFomulario() {
        ComunCompraService.validacionFomulario();
    }
    @Then("^El cliente rellena sus datos '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)'$")
    public void Datos(String Nombre, String Apellido, String Empresa, String Email, String Telefono, String Pais, String Direccion, String Dpto, String Ciudad, String Provincia, String CP, String Nota) {
        ComunCompraService.datos(Nombre, Apellido, Empresa, Email, Telefono, Pais, Direccion, Dpto, Ciudad, Provincia, CP, Nota);
    }
    @And("Confirmacion de compra")
    public void Confirmacion(){
        ComunCompraService.confirmacion();
    }
    @And("Detalle de lo comprado")
    public void DetalleCompra(){
        ComunCompraService.detalleCompra();
    }

}
