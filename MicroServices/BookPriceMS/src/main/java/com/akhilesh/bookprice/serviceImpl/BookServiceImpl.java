package com.akhilesh.bookprice.serviceImpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhilesh.bookprice.entity.BookPrice;
import com.akhilesh.bookprice.repo.BookPriceRepository;
import com.akhilesh.bookprice.service.BookPriceService;

@Service
public class BookServiceImpl implements BookPriceService{

	static final Logger log = LoggerFactory.getLogger(BookServiceImpl.class);
	
	@Autowired
	private BookPriceRepository bookPriceRepository;
	
	@Override
	public BookPrice getBookPriceById(long bookId) {
		log.info("BookServiceImpl-getBookPriceById()");
		BookPrice bookPrice = null;
		Optional<BookPrice> opt = bookPriceRepository.findById(bookId);
		if(opt.isPresent()) {
			bookPrice = opt.get();
		}
		return bookPrice;
	}

	@Override
	public double getOfferedPriceById(long bookId) {
		log.info("BookServiceImpl-getOfferedPriceById()");
		double offerPrice = 0.0;
		Optional<BookPrice> opt = bookPriceRepository.findById(bookId);
		if(opt.isPresent()) {
			BookPrice bookPrice = opt.get();
			double price = bookPrice.getPrice();
			double offer = bookPrice.getOffer();
			if(offer<0) {
				return price;
			}
			offerPrice = price - price * offer/100;
		}
		return offerPrice;
	}

}
