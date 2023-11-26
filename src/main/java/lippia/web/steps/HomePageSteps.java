package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import lippia.web.services.HomePageService;
import lippia.web.services.ProductoService;
import lippia.web.services.FormularioServices;

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
    @And("Observa la informacion del libro")
    public void Item() {
        ProductoService.Item();
    }
    @And("Agrega el libro al carrito")
    public void Agregar() {
        ProductoService.agregar();
    }
    @And("Puede agregar un descuento a su compra")
    public void Descuento() {
        FormularioServices.descuento();
    }
}

