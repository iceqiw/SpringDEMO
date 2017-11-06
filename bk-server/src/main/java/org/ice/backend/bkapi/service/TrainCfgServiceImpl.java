package org.ice.backend.bkapi.service;

import org.apache.log4j.Logger;
import org.ice.backend.bkapi.dao.TrainCfgRepository;

import org.ice.backend.bkapi.dao.model.TrainCfg;
import org.ice.server.api.common.apicommon.api.TrainCfgService;
import org.ice.server.api.common.apicommon.vo.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/trainSearch")
public class TrainCfgServiceImpl implements TrainCfgService {

    private final Logger logger = Logger.getLogger(getClass());


    @Autowired
    private TrainCfgRepository trainCfgRepository;

    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public TrainCfg findById(@RequestParam(name = "id") Long id) {
        logger.info(id);
        return trainCfgRepository.findById(id);
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public List<TrainCfg> page() {
        return trainCfgRepository.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseMsg add(@RequestBody TrainCfg t) {
        trainCfgRepository.save(t);
        return ResponseMsg.success("ok");
    }

    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    public ResponseMsg del(@PathVariable(name = "id") Long id) {
        trainCfgRepository.delete(id);
        return ResponseMsg.success("ok");
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public ResponseMsg edit(@RequestBody TrainCfg t) {
        trainCfgRepository.update(t.getId(), t.getTrainNo(), t.getDate(), t.getEndStation(), t.getStartStation());
        return ResponseMsg.success("ok");
    }

    @Override
    public String test() {
        return "ok";
    }

}
