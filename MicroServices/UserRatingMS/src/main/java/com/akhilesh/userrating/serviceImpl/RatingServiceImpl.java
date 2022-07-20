package com.akhilesh.userrating.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.akhilesh.userrating.entity.BookRating;
import com.akhilesh.userrating.entity.UserRating;
import com.akhilesh.userrating.repo.BookRatingRepository;
import com.akhilesh.userrating.repo.UserRatingRepository;
import com.akhilesh.userrating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{

	static final Logger log = LoggerFactory.getLogger(RatingServiceImpl.class);
	
	@Autowired
	private UserRatingRepository userRatingRepository;
	
	@Autowired
	private BookRatingRepository bookRatingRepository;
	
	@Override
	public void addUserRating(UserRating userRating) {
		log.info("RatingServiceImpl-addUserRating()");
		// add user rating
		userRatingRepository.save(userRating);
		//calculate the avg rating for book id
		long bookId = userRating.getBookId();
		List<UserRating>ratingList = userRatingRepository.getUserRatingByBookId(bookId);
		double sumRating = 0.0;
		for(UserRating ur: ratingList) {
			sumRating = sumRating + ur.getRating();
		}
		double avgRating = sumRating / ratingList.size();
		//update book rating in user rating ms
		BookRating bookRating = bookRatingRepository.findById(bookId).get();
		bookRating.setAvgRating(avgRating);
		bookRatingRepository.save(bookRating);
		//update book rating in book search ms
		RestTemplate bookSearchRest = new RestTemplate();
		String endpoint = "http://localhost:8000/updatebookrating";
		bookSearchRest.put(endpoint, bookRating);
	}

	@Override
	public List<UserRating> getUserRatingByUserId(String userId) {
		log.info("RatingServiceImpl-getUserRatingByUserId()");
		return userRatingRepository.getUserRatingByUserId(userId);
	}

	@Override
	public void updateBookRating(BookRating bookRating) {
		log.info("RatingServiceImpl-updateBookRating()");
		bookRatingRepository.save(bookRating);
	}

	@Override
	public BookRating getBookRatingByBookId(long bookId) {
		log.info("RatingServiceImpl-getBookRatingByBookId()");
		return bookRatingRepository.findById(bookId).get();
	}

}
