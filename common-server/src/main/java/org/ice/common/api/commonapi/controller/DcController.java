package org.ice.common.api.commonapi.controller;

import org.apache.log4j.Logger;
import org.ice.common.api.commonapi.client.TrainCfgClient;
import org.ice.server.api.common.apicommon.vo.TrainCfgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 翟永超
 * @create 2017/4/15.
 * @blog http://blog.didispace.com
 */
@RestController
public class DcController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    TrainCfgClient dcClient;

    @Value("${mane}")
    private String ttt;

    @GetMapping("/consumer")
    public String dc() {
        logger.info(ttt);
        return dcClient.test();
    }

}
