package com.akhilesh.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.akhilesh.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public Optional<User> findByEmail(String email);

	@Query(value = "select * from User u where u.status='Active'", nativeQuery = true)
	public List<User> getAllActiveUsers();

	@Query(value = "select * from User u where u.status='Inactive'", nativeQuery = true)
	public List<User> getAllInactiveUsers();

	@Query(value = "select * from User u where u.status='Active' and u.user_id=?", nativeQuery = true)
	public Optional<User> getActiveUserById(@Param(value = "userId") Long uId);

	@Query(value = "select * from User u where u.status='Inactive' and u.user_id=?", nativeQuery = true)
	public Optional<User> getInactiveUserById(@Param(value = "userId") Long uId);

}
