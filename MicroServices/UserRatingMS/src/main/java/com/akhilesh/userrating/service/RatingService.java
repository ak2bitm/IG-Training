package com.akhilesh.userrating.service;

import java.util.List;

import com.akhilesh.userrating.entity.BookRating;
import com.akhilesh.userrating.entity.UserRating;

public interface RatingService {

	public void addUserRating(UserRating userRating);
	public List<UserRating> getUserRatingByUserId(String userId);
	public void updateBookRating(BookRating bookRating);
	public BookRating getBookRatingByBookId(long bookId);
}
