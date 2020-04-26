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
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER")
    private Long id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String surname;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date registerDate;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date lastModification;

}
