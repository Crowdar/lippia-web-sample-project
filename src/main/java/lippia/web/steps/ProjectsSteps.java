package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ProjectService;
import lippia.web.services.WorkspaceService;

public class ProjectsSteps extends PageSteps {

    @Given("el usuario ingresa exitosamente al dashboard con el email '(.*)' y la contraseña '(.*)'")
    public void DashboardDeClockify(String email, String pass) {

        ProjectService.realizarLogin(email, pass);
    }

    @When("hace clic en el botón 'Create Project'")
    public void haceClicEnElBotonCreateProject() {
        ProjectService.clickbuttonProject();
    }

    @And("hace clic en el botón 'Create new project'")
    public void ingresaEnElCampoProjectName() {
        ProjectService.clickbuttonNewProject();
    }

    @And("ingresa '(.*)' en el campo 'Project name'")
    public void haceClicEnElBotonCreateNewProject(String name) {
        ProjectService.inputProject(name);
    }
    @And("hace clic en el botón 'Create' Project")
    public void haceClicEnElBotonCreateConfirm() {
        ProjectService.clickOnCreate();
    }

    @Then("se crea exitosamente el nuevo Project con un nombre basado en '(.*)'")
    public void seCreaExitosamenteElNuevoProjectConUnNombreBasadoEn() {
        ProjectService.clickbuttonProject();
       //ProjectService.alertCreate();
    }
}
