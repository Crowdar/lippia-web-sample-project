package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {
    @And("Seleciona un libro")
    public void Libro(){
        ShopService.libro();
    }
    @And("Observa el precio del producto en el carrito")
    public void Carrito(){
        ShopService.carrito();
    }
    @And("^Ingresa un pais '(.*)' observa diferente impuestos '(.*)' segun pais")
    public void Pais(String Pais, int Impuesto){
        ShopService.impuestos(Pais,Impuesto);
    }
}
