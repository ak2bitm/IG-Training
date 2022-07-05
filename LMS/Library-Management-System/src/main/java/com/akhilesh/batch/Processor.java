package com.akhilesh.batch;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.akhilesh.entity.Book;
import com.akhilesh.entity.User;

@Component
public class Processor implements ItemProcessor<Book, Book>{
	
	private static final Logger log = LoggerFactory.getLogger(Processor.class);
	
	private User user;
	
	@SuppressWarnings("static-access")
	@Override
	public Book process(Book books) throws Exception {
		log.info("Book Process start");
		books.setCreatedBy(user.builder().userId(8L).build());
		books.setCreatedOn(new Date());
		log.info("--------------------"+books);
		log.info("Book Process stop");
		return books;
	}

}
