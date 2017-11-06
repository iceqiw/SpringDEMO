package org.ice.backend.bkapi.dao;

import org.ice.backend.bkapi.dao.model.TrainCfg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface TrainCfgRepository extends JpaRepository<TrainCfg, Long> {

    TrainCfg findById(Long id);

    @Modifying
    @Transactional
    @Query("UPDATE TrainCfg u SET u.trainNo=:trainNo, u.date= :date,u.endStation=:endStation ,u.startStation=:startStation WHERE u.id = :id")
    void update(@Param("id") Long id, @Param("trainNo") String trainNo, @Param("date") String date, @Param("endStation") String endStation, @Param("startStation") String startStation);
}