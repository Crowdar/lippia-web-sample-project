package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ShopHomePage;
import io.cucumber.java.en.*;

public class ShopSteps extends PageSteps {

    @Given("el cliente se encuentra en la pagina Home")
    public void elClienteSeEncuentraEnLaPaginaHome() {
        Injector._page(ShopHomePage.class).go();
        Injector._page(ShopHomePage.class).verificarHome();
    }

    @When("el cliente hace click en el boton (.*)")
    public void elClienteHaceClickEnElBotonSignIn(String button) {
        Injector._page(ShopHomePage.class).clickSignInButton(button);
    }

    @Then("el cliente verifica que fue redireccionado a la pantalla del (.*)")
    public void elClienteVerificaQueFueRedireccionadoALaPantallaDelLogin(String pantalla) {
        Injector._page(ShopHomePage.class).verificarLoginPage(pantalla);
    }

    @When("el cliente ingresa su email: (.*)")
    public void elClienteIngresaSuEmailTestingTestingCom(String email) {
        Injector._page(ShopHomePage.class).completeEmailField(email);
    }

    @And("el cliente ingresa su password: (.*)")
    public void elClienteIngresaSuPasswordTesting(String pass) {
        Injector._page(ShopHomePage.class).completePassField(pass);
    }

    @When("el cliente ingresa el nombre del producto: (.*)")
    public void elClienteIngresaElNombreDelProductoFadedShortSleeveTShirts(String nombreProducto) {
        Injector._page(ShopHomePage.class).enterNameProduct(nombreProducto);
    }


    @Then("el cliente verifica que el producto se agregó al carrito")
    public void elClienteVerificaQueElProductoSeAgregóAlCarrito() throws InterruptedException {
        Thread.sleep(5000);
        Injector._page(ShopHomePage.class).verifyScreen1("Product successfully added to your shopping cart");
    }

    @When("el cliente hace click en Add to Cart")
    public void elClienteHaceClickEnAddToCart() {
        Injector._page(ShopHomePage.class).clickSigninButton4();
    }

    @And("el cliente hace click en buscar")
    public void elClienteHaceClickEnBuscar(){
        Injector._page(ShopHomePage.class).clickSigninButton3();
    }

    @When("el Cliente selecciona el producto")
    public void elClienteSeleccionaElProducto() {
        Injector._page(ShopHomePage.class).clickSigninButton5();
    }

    @Then("el cliente verifica que fue redireccionado exitosamente a la pantalla del (.*)")
    public void elClienteVerificaQueFueRedireccionadoExitosamenteALaPantallaDelProducto(String pantalla) {
        Injector._page(ShopHomePage.class).verificarLoginPage2(pantalla);

    }

    @When("el cliente hace click en el botón Add to chart")
    public void elClienteHaceClickEnElBotónAddToChart() {
        Injector._page(ShopHomePage.class).clickSigninButton4();
    }

    @Given("el cliente se encuentra en la pagina My account")
    public void elClienteSeEncuentraEnLaPaginaMyAccount() {
        Injector._page(ShopHomePage.class).go();
    }

    @When("el cliente valida el domicilio (.*) de la seccion Address")
    public void elClienteValidaElDomicilioDeLaSeccionAddress(String datosAddress) {
        Injector._page(ShopHomePage.class).verificarDatosAddress(datosAddress);
    }

    @When("el cliente hace click en el checkbox")
    public void elClienteHaceClickEnElCheckbox() {
        Injector._page(ShopHomePage.class).checkAgreeCheckbox();

    }

    @Then("el cliente verifica que su compra ha sido confirmada")
    public void elClienteVerificaQueSuCompraHaSidoConfirmada() {
        Injector._page(ShopHomePage.class).verificarConfirmacionCompra();
    }
}
