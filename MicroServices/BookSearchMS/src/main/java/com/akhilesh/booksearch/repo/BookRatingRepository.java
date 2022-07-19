package com.akhilesh.booksearch.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.booksearch.entity.BookRating;

public interface BookRatingRepository extends JpaRepository<BookRating, Long>{

	
}
