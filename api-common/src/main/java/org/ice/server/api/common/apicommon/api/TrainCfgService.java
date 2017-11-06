package org.ice.server.api.common.apicommon.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public interface TrainCfgService {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test();
}
