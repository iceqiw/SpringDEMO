package org.ice.backend.bkapi.service;

import org.apache.log4j.Logger;
import org.ice.backend.bkapi.dao.TrainCfgRepository;
import org.ice.backend.bkapi.dao.model.TrainCfg;
import org.ice.server.api.common.apicommon.api.TrainCfgService;
import org.ice.server.api.common.apicommon.vo.ResponseMsg;
import org.ice.server.api.common.apicommon.vo.TrainCfgVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/trainSearch")
public class TrainCfgServiceImpl implements TrainCfgService {

    private final Logger logger = Logger.getLogger(getClass());


    @Autowired
    private TrainCfgRepository trainCfgRepository;

    @Override
    public TrainCfgVo findById(@PathVariable(name = "id") Long id) {
        logger.info(id);
        TrainCfg t = trainCfgRepository.findById(id);
        TrainCfgVo out = new TrainCfgVo();
        BeanUtils.copyProperties(t, out);
        return out;
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public List<TrainCfgVo> page() {
        List<TrainCfg> listOrigin= trainCfgRepository.findAll();
        List<TrainCfgVo> out=new ArrayList<>();
        for (Object source: listOrigin ) {
            TrainCfgVo target= new TrainCfgVo();
            BeanUtils.copyProperties(source , target);
            out.add(target);
        }
        return  out;
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
