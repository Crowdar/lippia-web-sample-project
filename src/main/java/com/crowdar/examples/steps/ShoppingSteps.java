package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.*;
import io.cucumber.java.en.*;

public class ShoppingSteps extends PageSteps {

    @Given("el cliente se encuentra en la pagina de Home")
    public void elClienteSeEncuentraEnLaPaginaDeHome() {
        Injector._page(ShoppingHomePage.class).go();
        Injector._page(ShoppingHomePage.class).verifyHome();
    }

    @When("el cliente hace click en el botón '(.*)'")
    public void elClienteHaceClickEnElBotónButton(String button) {
        Injector._page(ShoppingHomePage.class).clickButton(button);
    }

    @Then("el cliente verifica que fue redireccionado a la pantalla de '(.*)'")
    public void elClienteVerificaQueFueRedireccionadoALaPantallaDeWindow(String window) {
        Injector._page(ShoppingHomePage.class).redirectScreen(window);
    }

    @When("el cliente ingresa su email '(.*)'")
    public void elClienteIngresaSuEmailEmail(String email) {
        Injector._page(LoginPage.class).setEmail(email);
    }

    @And("el cliente ingresa su password '(.*)'")
    public void elClienteIngresaSuPasswordPassword(String password) {
        Injector._page(LoginPage.class).setPassword(password);
    }


    @When("el cliente hace click en la categoría '(.*)'")
    public void elClienteHaceClickEnLaCategoríaCategory(String navName) {
        Injector._page(MyAccountPage.class).clickTabPage(navName);
    }

    @When("el cliente selecciona el artículo '(.*)'")
    public void elClienteSeleccionaElArtículoNroArticulo(String nomArticulo) {
        Injector._page(ProductCategoryPage.class).clickArticle(nomArticulo);
    }


    @When("el cliente selecciona la talla '(.*)'")
    public void elClienteSeleccionaLaTallaSize(String size) {
        Injector._page(ArticlePreferencesPage.class).setSize(size);
    }

    @And("el cliente selecciona la cantidad '(.*)'")
    public void elClienteSeleccionaLaCantidadQuantity(String quantity) {
        Injector._page(ArticlePreferencesPage.class).setQuantity(quantity);
    }

    @And("el cliente selecciona el color '(.*)'")
    public void elClienteSeleccionaElColorColor(String color) {
        Injector._page(ArticlePreferencesPage.class).setColor(color);
    }

    @When("el cliente acepta los términos y condiciones")
    public void elClienteAceptaLosTérminosYCondiciones() {
        Injector._page(ShippingPage.class).clickTerms();
    }

    @When("el cliente elige el método de pago '(.*)'")
    public void elClienteEligeElMétodoDePagoPaymentMethod(String paymentMethod) {
        Injector._page(PaymentMethodPage.class).choosePaymentMethodBtn(paymentMethod);
    }
}
