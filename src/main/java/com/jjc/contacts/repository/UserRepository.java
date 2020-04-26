/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jjc.contacts.repository;

import com.jjc.contacts.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dionich
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
