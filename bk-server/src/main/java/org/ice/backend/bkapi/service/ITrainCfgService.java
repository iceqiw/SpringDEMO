package org.ice.backend.bkapi.service;

import org.ice.backend.bkapi.model.TrainCfg;

public interface ITrainCfgService {

    TrainCfg findById(Long id);
}
