package lippia.web.steps;

import com.crowdar.core.PageSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.WorkspaceService;

import java.util.UUID;


public class WorkspaceSteps extends PageSteps {
    private String uniqueWorkspaceName;

        @When("the user accesses the 'Manage workspaces' section")
        public void loginToManageWorkspaces() {
            WorkspaceService.worskpaceDropdown();
            WorkspaceService.worskpaceManage();
        }

        @And("clicks on the 'Create new workspace' button")
        public void clickOnNewWorkspaceButton() {

            WorkspaceService.clickOncreateNew();
        }

        @And("enters '(.*)' in the 'Workspace name' field")
        public void setNameWorkspace(String nombreBase) {
            uniqueWorkspaceName = nombreBase + "_" + UUID.randomUUID().toString().substring(0, 8);
            WorkspaceService.inputWorkspace(uniqueWorkspaceName);
        }

        @And("clicks on the 'Create' button")
        public void createNewWorkspace() throws InterruptedException {
            WorkspaceService.createButton();
        }

        @Then("the new workspace is successfully created with a name based on '(.*)'")
        public void validateNewWorkspaceCreated(String name) {
            WorkspaceService.validateWorkspaceCreated(uniqueWorkspaceName);

        }

        @And("clicks on the 'Settings' button")
        public void loginToSettings() {

            WorkspaceService.clickSettings();
        }

        @And("enters '(.*)' in the 'Workspace name' field to edit")
        public void setNewWorkspaceName(String nuevoNombre) {

            WorkspaceService.inputEditWorkspace(nuevoNombre);
            WorkspaceService.worskpaceDropdown();
        }

        @Then("the workspace name is successfully updated to '(.*)'")
        public void validateNewWorkspaceName(String newName) {
            WorkspaceService.validateWorkspaceName(newName);
        }
    }
