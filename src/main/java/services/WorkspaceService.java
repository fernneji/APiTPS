package services;

import api.model.ErrorResponse;
import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Request;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class WorkspaceService extends MethodsService {

    public static final ThreadLocal<String> API_KEY = new ThreadLocal<>();


    public static Response get(String jsonName) {
        Request request = getRequest(jsonName, setParams());
        return get(request, WorkspacesResponse.class);
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        return params;
    }

}
