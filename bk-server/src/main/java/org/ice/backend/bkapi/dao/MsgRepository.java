package org.ice.backend.bkapi.dao;

import org.ice.backend.bkapi.dao.model.Msg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface MsgRepository extends JpaRepository<Msg, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Msg u SET u.keyword= :keyword, u.content= :content WHERE u.id = :id ")
    void update(@Param("id") Long id, @Param("keyword") String keyword, @Param("content") String content);

}