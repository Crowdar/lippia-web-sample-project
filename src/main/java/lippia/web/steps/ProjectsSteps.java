package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ProjectService;

import java.util.UUID;

public class ProjectsSteps extends PageSteps {

    private String uniqueProjectName;

    @When("clicks on the 'Create Project' button")
    public void clickOnCreateProject() {
        ProjectService.clickButtonProject();
    }

    @And("clicks on the 'Create new project' button")
    public void clickOnCreateNewProject() {

        ProjectService.clickButtonNewProject();
    }

    @And("enters '(.*)' in the 'Project name' field")
    public void setProjectName(String nombreBase) {
        // Usando UUID para generar un nombre único

        uniqueProjectName = nombreBase + "_" + UUID.randomUUID().toString();

        // Llamar al servicio con el nombre generado
        ProjectService.inputProject(uniqueProjectName);

    }
    @And("user clicks on the 'Create' button")
    public void confirmCreationButton() {

        ProjectService.clickOnCreate();
    }

    @Then("the new project is successfully created with a name based on '(.*)'")
    public void validateNewProjectName(String name) { //Se deja la variable definida porque en gherkin tenemos dicha definicion
        ProjectService.validateNameProject(uniqueProjectName);
    }
    @And("an alert 'Project '(.*)' has been created' is displayed")
    public void validateAlert(String name) {
        ProjectService.validateAlertSucessfully("Project " + uniqueProjectName + " has been created");

    }

}
