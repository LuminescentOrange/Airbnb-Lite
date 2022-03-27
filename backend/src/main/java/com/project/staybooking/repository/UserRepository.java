package com.project.staybooking.repository;

import com.project.staybooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description JpaRepository do crud in User
 * @date
 */
public interface UserRepository extends JpaRepository<User, String> {
}
