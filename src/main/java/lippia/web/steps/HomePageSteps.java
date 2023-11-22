package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends PageSteps {
    @Given("El cliente se dirige al Menu Tienda")
    public void MenuTienda() {

    }
    @And("Vuelve al Menu Inicio")
    public void MenuInicio() {

    }
    @And("Observa 3 Sliders")
    public void Sliders() {

    }
    @And("Se dirige a uno de los Arrivals")
    public void Arrivals() {

    }
    @And("Observa el libro elegido")
    public void LibroElegido() {

    }
    @And("Agrega el libro a su cesta")
    public void AgregarEnCesta() {

    }
    @And("El cliente ve agreado el libro con su precio")
    public void VerificacionDeLibro() {

    }
    @When("Se dirige a la cesta con el libro agregado")
    public void clickCesta() {

    }
    @And("El cliente ve los detalles de compra")
    public void Cesta() {

    }
    @And("Procede a pasar a la pagina de pago")
    public void ProcesoPago() {

    }
    @And("Ahora puede encontrar los valores total y subtotal")
    public void Valores() {

    }
    @And("El total siempre < subtotal porque los impuestos se añaden en el subtotal")
    public void Impuestos() {

    }
    @And("Procede a realizar el pago que le llevara a la pasarela de pago")
    public void Pasarela() {

    }
    @Then("El cliente observa el formulario para agregar sus datos y puede seleccionar por cualquier tipo de pago como transferencia bancaria directa, cheque, efectivo o paypal")
    public void ValidacionFormulario() {

    }
    @And("Tiene la opcion de agregar cupones en la página de la pasarela de pago, tambien puede encontrar la facturacion, el pedido y detalles adicionales")
    public void AgregarCupones() {

    }
    @Then("^El cliente rellena sus datos del formulario '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)'$")
    public void DatosFormulario(String Nombre, String Apellido, String Empresa, String Email, String Telefono, String Pais, String Direccion, String Dpto, String Ciudad, String Provincia, String CP, String Nota) {

    }
    @And("Se confirma la compra")
    public void Compra() {

    }
}
