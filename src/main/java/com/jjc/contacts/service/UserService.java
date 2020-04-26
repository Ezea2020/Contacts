package com.jjc.contacts.service;

import com.jjc.contacts.entity.User;
import com.jjc.contacts.repository.UserRepository;
import java.util.Date;
import java.util.List;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

/**
 *
 * @author dionich
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {

        if (user.getId() != null) { //Es una modificación y no un nuevo registro

            //AÑADIR COMPROBACIÓN DE CONTRASEÑA Y USUARIO
            user.setLastModification(new Date());
            return userRepository.save(user);
        }

        //COMPROBAR QUE LOS CAMPOS BÁSICOS NO ESTÉN VACÍOS 
        user.setRegisterDate(new Date());
        user.setLastModification(new Date());
        user.setPassword(DigestUtils.sha256Hex(user.getPassword()));
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}
