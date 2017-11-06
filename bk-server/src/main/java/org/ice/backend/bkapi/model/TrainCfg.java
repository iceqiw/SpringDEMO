package org.ice.backend.bkapi.model;


import lombok.Data;

import javax.persistence.*;

@Table(name = "train_search")
@Entity
@Data
public class TrainCfg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "train_no")
    private String trainNo;
    @Column(name = "date")
    private String date;
    @Column(name = "start_station")
    private String startStation;
    @Column(name = "end_station")
    private String endStation;

}
