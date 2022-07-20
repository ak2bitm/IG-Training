package com.akhilesh.userrating.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.userrating.entity.UserRating;

public interface UserRatingRepository extends JpaRepository<UserRating, Long>{

	public List<UserRating> getUserRatingByBookId(long bookId);
	public List<UserRating> getUserRatingByUserId(String userId);
}
