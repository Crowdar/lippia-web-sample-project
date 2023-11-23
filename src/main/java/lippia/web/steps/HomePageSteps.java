package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomePageService;


public class HomePageSteps extends PageSteps {
    @And("Vuelve al Menu Inicio")
    public void MenuInicio() {
        HomePageService.menuInicio();
    }
    @And("Observa 3 Sliders")
    public void Sliders() {
        HomePageService.sliders();
    }
    @And("Se dirige a uno de los Arrivals")
    public void Arrivals() {
        HomePageService.arrival();
    }
    @And("Observa el libro elegido")
    public void LibroElegido() {
        HomePageService.libroElegido();
    }
    @And("Agrega el libro a su cesta")
    public void Agregar() {
        HomePageService.agregar();
    }

    @When("Procede a pasar a la pagina de pago")
    public void Cesta() {
        HomePageService.cesta();
    }
    @And("El cliente ve los detalles de compra")
    public void Detalles() {
        HomePageService.detalles();
    }

    @And("Se ven los valores totales, siempre total < subtotal por los impuestos")
    public void Valores() {
        HomePageService.valores();
    }

    @And("Procede a realizar el pago que le llevara a la pasarela de pago")
    public void Pasarela() {
        HomePageService.pasarela();
    }
    @Then("El cliente observa el formulario para agregar sus datos y puede seleccionar por cualquier tipo de pago como transferencia bancaria directa, cheque, efectivo o paypal")
    public void Validacion() {
        HomePageService.validacion();
    }
    @And("Tiene la opcion de agregar cupones en la página de la pasarela de pago, tambien puede encontrar la facturacion, el pedido y detalles adicionales")
    public void AgregarCupon() {
        HomePageService.agregarCupon();
    }
    @Then("^El cliente rellena sus datos del formulario '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)'$")
    public void Datos(String Nombre, String Apellido, String Empresa, String Email, String Telefono, String Pais, String Direccion, String Dpto, String Ciudad, String Provincia, String CP, String Nota) {
        HomePageService.datos();
    }
    @And("Se confirma la compra")
    public void Compra() {
        HomePageService.compra();
    }
}
