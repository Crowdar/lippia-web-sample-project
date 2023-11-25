package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lippia.web.services.HomePageService;
import lippia.web.services.ProductoService;

public class HomePageSteps extends PageSteps {
    @And("Vuelve al Menu Inicio")
    public void MenuInicio() {
        HomePageService.menuInicio();
    }
    @And("Observa 3 Arrivals")
    public void ArrivalsValidacion() {
        HomePageService.arrivalsVerificacion();
    }
    @And("Selecciona uno de los Arrivals")
    public void ArrivalsSeleccionado() {
        HomePageService.arrivalSeleccionado();
    }
    @When("Observa la informacion del libro")
    public void MenuItem() {
        ProductoService.menuItem();
    }
    @And("Agrega el libro al carrito")
    public void Agregar() {
        ProductoService.agregar();
    }
}

