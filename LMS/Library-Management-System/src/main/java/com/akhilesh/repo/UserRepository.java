package com.akhilesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{


}
