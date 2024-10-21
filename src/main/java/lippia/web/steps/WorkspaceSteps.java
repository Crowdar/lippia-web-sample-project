package lippia.web.steps;

import com.crowdar.core.PageSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import lippia.web.services.WorkspaceService;


public class WorkspaceSteps extends PageSteps {

        private String originalName; // Almacena el nombre original

        @Given("el usuario ingresa exitosamente al dashboard de Clockify con el email '(.*)' y la contraseña '(.*)'")
        public void DashboardDeClockify(String email, String pass) {
            WorkspaceService.realizarLogin(email, pass);
        }

        @When("el usuario accede a la sección 'Manage workspaces'")
        public void elUsuarioAccedeALaSeccionManageWorkspaces() {
            WorkspaceService.worskpaceDropdown();
            WorkspaceService.worskpaceManage();
        }

        @And("hace clic en el botón 'Create new workspace'")
        public void haceClicEnElBotonCreateNewWorkspace() {
            WorkspaceService.clickOncreateNew();
        }

        @And("ingresa '(.*)' en el campo 'Workspace name'")
        public void nombreNewWorkspace(String nombreBase) {
            this.originalName = nombreBase; // Guarda el nombre original
            WorkspaceService.inputWorkspace(nombreBase);
        }

        @And("hace clic en el botón 'Create'")
        public void haceClicEnElBotonCreate() {
            WorkspaceService.createButton();
        }

        @Then("se crea exitosamente el nuevo workspace con un nombre basado en '(.*)'")
        public void seCreaExitosamenteElNuevoWorkspaceConNombreBasadoEn(String name) {
            WorkspaceService.validateWorkspaceCreated(name);
        }

        @And("hace clic en el botón 'Settings'")
        public void haceClicEnElBotonSettings() {
            WorkspaceService.clickSettings();
        }

        @And("ingresa '(.*)' en el campo 'Workspace name' para editar")
        public void nombreEditWorkspace(String nuevoNombre) {
            WorkspaceService.inputEditWorkspace(nuevoNombre);
        }

        @And("hace clic en el navbar")
        public void haceClicEnElNavbar() {
            WorkspaceService.worskpaceDropdown();
        }

        @Then("actualiza exitosamente el nombre del workspace")
        public void actualizaAexitosamenteElNombreDelWorkspace() {
            WorkspaceService.validateWorkspaceName(originalName);
        }
    }
