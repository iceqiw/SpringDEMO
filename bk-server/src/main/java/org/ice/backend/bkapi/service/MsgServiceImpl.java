package org.ice.backend.bkapi.service;

import org.apache.log4j.Logger;
import org.ice.backend.bkapi.dao.MsgRepository;
import org.ice.backend.bkapi.dao.TrainCfgRepository;
import org.ice.backend.bkapi.dao.model.Msg;
import org.ice.backend.bkapi.dao.model.TrainCfg;
import org.ice.server.api.common.apicommon.vo.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/msg")
public class MsgServiceImpl {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private MsgRepository msgRepository;


    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public List<Msg> page() {
        return msgRepository.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseMsg add(@RequestBody Msg t) {
        msgRepository.save(t);
        return ResponseMsg.success("ok");
    }

    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    public ResponseMsg del(@PathVariable(name = "id") Long id) {
        msgRepository.delete(id);
        return ResponseMsg.success("ok");
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public ResponseMsg edit(@RequestBody Msg t) {
        msgRepository.update(t.getId(), t.getKeyword(), t.getContent());
        return ResponseMsg.success("ok");
    }

}
