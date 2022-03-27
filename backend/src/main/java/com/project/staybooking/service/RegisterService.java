package com.project.staybooking.service;

import com.project.staybooking.exception.UserAlreadyExistException;
import com.project.staybooking.model.Authority;
import com.project.staybooking.model.User;
import com.project.staybooking.model.UserRole;
import com.project.staybooking.repository.AuthorityRepository;
import com.project.staybooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description call data tier, is logic tier, save authority ro database
 * @date
 */
@Service
public class RegisterService {

    private UserRepository userRepository;
    private AuthorityRepository authorityRepository;
    private PasswordEncoder passwordEncoder; // SecurityConfig, encoding

    @Autowired
    public RegisterService(UserRepository userRepository, AuthorityRepository authorityRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
        this.passwordEncoder = passwordEncoder; // encrypt before store in database

    }

    @Transactional(isolation = Isolation.SERIALIZABLE) //现在方法涉及多张表操作，一张表成功一张表失败，保证是原子操作，保证要不改要不都不改，可以回滚
    public void add(User user, UserRole role) throws UserAlreadyExistException { // exception.UserAlreadyExistException

        if (userRepository.existsById(user.getUsername())) {
            throw new UserAlreadyExistException("User already exists");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(true);
        userRepository.save(user);
        authorityRepository.save(new Authority(user.getUsername(), role.name()));
    }



}
