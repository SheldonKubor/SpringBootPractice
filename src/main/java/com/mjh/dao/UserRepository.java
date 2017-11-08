package com.mjh.dao;

import com.mjh.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author constantine
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
