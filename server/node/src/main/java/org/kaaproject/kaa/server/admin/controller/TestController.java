package org.kaaproject.kaa.server.admin.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.kaaproject.kaa.common.dto.EndpointStatusDto;
import org.kaaproject.kaa.server.admin.shared.services.KaaAdminService;
import org.kaaproject.kaa.server.admin.shared.services.KaaAdminServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by liuhu on 3/9/16.
 */
@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    KaaAdminService kaaAdminService;

    @RequestMapping(value = "endPointStatus/{applicationToken}", method = RequestMethod.GET)
    @ResponseBody
    public List<EndpointStatusDto> getEndpointStatusByApplicationToken(
            @PathVariable String applicationToken) throws KaaAdminServiceException {
        return kaaAdminService.getEndpointStatusByApplicationToken(applicationToken);
    }

    @RequestMapping(value = "endPointLog", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public void getEndpointLog(
            @RequestParam(value = "applicationToken") String applicationToken, @RequestParam(value = "endpointKeyHash") String endpointKeyHash, HttpServletResponse response) throws KaaAdminServiceException {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(kaaAdminService.getEndpointLog(applicationToken, endpointKeyHash));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
