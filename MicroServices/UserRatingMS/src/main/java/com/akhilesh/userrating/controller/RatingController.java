package com.akhilesh.userrating.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhilesh.userrating.entity.BookRating;
import com.akhilesh.userrating.entity.UserRating;
import com.akhilesh.userrating.service.RatingService;

@RestController
public class RatingController {

	static final Logger log = LoggerFactory.getLogger(RatingController.class);
	
	@Autowired
	private RatingService ratingService;
	
	@PutMapping("/adduserrating")
	public void addUserRating(@RequestBody UserRating userRating) {
		log.info("RatingController-addUserRating()");
		ratingService.addUserRating(userRating);
	}
	
	@GetMapping("/userratings/{userId}")
	public List<UserRating> getUserRatingByUserId(@PathVariable String userId){
		log.info("RatingController-getUserRatingByUserId()");
		return ratingService.getUserRatingByUserId(userId);
	}
	
	@GetMapping("/bookratings/{bookId}")
	public BookRating getBookratingByBookId(@PathVariable long bookId){
		log.info("RatingController-getBookratingByBookId()");
		return ratingService.getBookRatingByBookId(bookId);
	}
	
	
}
