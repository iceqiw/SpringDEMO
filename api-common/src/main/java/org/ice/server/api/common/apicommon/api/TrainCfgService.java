package org.ice.server.api.common.apicommon.api;

import org.ice.server.api.common.apicommon.vo.TrainCfgVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


public interface TrainCfgService {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test();

    @GetMapping(value = "/getOne/{id}")
    TrainCfgVo findById(@PathVariable(name = "id") Long id);

    @GetMapping(value = "/page")
    List<TrainCfgVo> page();
}
