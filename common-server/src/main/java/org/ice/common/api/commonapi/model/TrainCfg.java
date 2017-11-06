package org.ice.common.api.commonapi.model;


import lombok.Data;

@Data
public class TrainCfg {

    private Long id;

    private String trainNo;

    private String date;

    private String startStation;

    private String endStation;

}
