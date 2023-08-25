package com.oskarraul.securitydemomvc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface UserRepository extends JpaRepository<User, Long> {

        @Query("SELECT from User u where u.username = :username"  )
        public com.oskarraul.securitydemomvc.User getByUsername(@Param("username") String username);

    }

