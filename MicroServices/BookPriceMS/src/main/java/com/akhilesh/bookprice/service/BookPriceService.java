package com.akhilesh.bookprice.service;

import com.akhilesh.bookprice.entity.BookPrice;

public interface BookPriceService {

	public BookPrice getBookPriceById(long bookId);
	public double getOfferedPriceById(long bookId);
}
