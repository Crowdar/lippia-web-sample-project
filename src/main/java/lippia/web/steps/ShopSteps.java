package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {
    @And("Dirige al Menu Tienda")
    public void Tienda(){
        ShopService.menuTienda();
    }
    @And("Seleciona un libro")
    public void Libro(){
        ShopService.libro();
    }
    @And("Observa el precio del producto en el carrito")
    public void Carrito(){
        ShopService.carrito();
    }
    @And("^Ingresa '(.*)' como pais,observa un impuestos diferente es del '(.*)'%")
    public void Pais(String Pais, double Impuesto){
        ShopService.impuestos(Pais,Impuesto);
    }
}
