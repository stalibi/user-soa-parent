package com.adneom.repository;

import com.adneom.usersoa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kermit on 18/11/2018.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
