package com.akhilesh.bookprice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.akhilesh.bookprice.entity.BookPrice;
import com.akhilesh.bookprice.service.BookPriceService;

@RestController
public class BookPriceController {

	static Logger log = LoggerFactory.getLogger(BookPriceController.class);

	@Autowired
	private BookPriceService bookPriceService;

	@GetMapping("/bookprice/{bookId}")
	public BookPrice getBookPrice(@PathVariable long bookId) {
		log.info("BookPriceController-getBookPrice()");
		return bookPriceService.getBookPriceById(bookId);
	}

	@GetMapping("/offeredprice/{bookId}")
	public double getOfferPrice(@PathVariable long bookId) {
		log.info("BookPriceController-getOfferPrice()");
		return bookPriceService.getOfferedPriceById(bookId);
	}

}
