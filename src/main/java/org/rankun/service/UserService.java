package org.rankun.service;

import org.rankun.dao.TUserRepository;
import org.rankun.dao.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created on 4/14/15.
 *
 * @author rankun203
 */
@Service
public class UserService {
    @Autowired
    TUserRepository userRepository;

    @Transactional
    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.add(user);
    }

    public User updateUser(User user) {
        return userRepository.update(user);
    }

    public User deleteUser(Long id) {
        return userRepository.delete(id);
    }

    public User findById(Long id) {
        return userRepository.findById(id);
    }

}
