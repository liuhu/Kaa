package org.kaaproject.kaa.server.admin.controller;

import org.kaaproject.kaa.common.dto.EndpointStatusDto;
import org.kaaproject.kaa.server.admin.shared.services.KaaAdminService;
import org.kaaproject.kaa.server.admin.shared.services.KaaAdminServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "endPointLog", method = RequestMethod.GET)
    @ResponseBody
    public List<String> getEndpointLog(
            @RequestParam(value = "applicationToken") String applicationToken, @RequestParam(value = "endpointKeyHash") String endpointKeyHash) throws KaaAdminServiceException {
        return kaaAdminService.getEndpointLog(applicationToken, endpointKeyHash);
    }
}
