package com.akhilesh.userrating.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.userrating.entity.BookRating;

public interface BookRatingRepository extends JpaRepository<BookRating, Long>{

}
