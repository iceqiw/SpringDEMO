package org.ice.server.api.common.apicommon.vo;


import lombok.Data;

@Data
public class TrainCfgVo {

    private Long id;

    private String trainNo;

    private String date;

    private String startStation;

    private String endStation;

}
