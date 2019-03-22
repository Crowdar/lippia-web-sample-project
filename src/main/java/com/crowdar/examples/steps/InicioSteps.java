package com.crowdar.examples.steps;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.Inicio;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class InicioSteps extends PageSteps {

    private Inicio inicio;

    public InicioSteps(SharedDriver driver){
        super(driver);
        inicio = new Inicio(driver);
    }

    @Given("El cliente esta en la pagina de google")
    public void elClienteEstaEnLaPaginaDeGoogle(){
        inicio.navegarAlInicio();
    }

    @When("El cliente ingresa la palabra (.*)")
    public void elClienteIngresaUnaPalabraABuscar(String palabra){
        inicio.ingresarPalabra(palabra);

    }

    @Then("El cliente observa la informacion relevante sobre crowdar")
    public void elClienteObservaLaInformacionRelevanteSobreCrowdar(){

    }
}
