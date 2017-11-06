package org.ice.backend.bkapi.service.Impl;

import org.ice.backend.bkapi.dao.TrainCfgRepository;
import org.ice.backend.bkapi.model.TrainCfg;
import org.ice.backend.bkapi.service.ITrainCfgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TrainCfgServiceImpl implements ITrainCfgService {

    @Autowired
    private TrainCfgRepository trainCfgRepository;

    @Override
    public TrainCfg findById(Long id) {
        return trainCfgRepository.findById(id);
    }
}
