package com.akhilesh.springbatch.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.springbatch.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer>{

}
