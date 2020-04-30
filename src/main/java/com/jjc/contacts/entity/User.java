package com.jjc.contacts.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author dionich
 */
@Getter
@Setter
@Entity
@Table(name = "t_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER")
    private Long id;
    private String password;
    private String email;
    private String name;
    private String surname;
    @Column(name = "dt_register_date")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date registerDate;
    @Column(name = "dt_last_modification")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date lastModification;

}
