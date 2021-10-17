package ar.validator;

import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class WorkspaceValidator {
        public static void validate(){
            WorkspacesResponse response = (WorkspacesResponse) APIManager.getLastResponse().getResponse();

            Assert.assertNotNull(response.getId(),"El campo ID es nulo");
        }
}
