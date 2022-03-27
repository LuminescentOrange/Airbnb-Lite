package com.project.staybooking.repository;

import com.project.staybooking.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description data tier, visit database, JpaRepository do crud in Authority
 * @date
 */
public interface AuthorityRepository  extends JpaRepository<Authority, String> {

}

