package org.ice.backend.bkapi.dao.model;


import lombok.Data;

import javax.persistence.*;

@Table(name = "msg")
@Entity
@Data
public class Msg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "keyword")
    private String keyword;
    @Column(name = "content")
    private String content;

}
