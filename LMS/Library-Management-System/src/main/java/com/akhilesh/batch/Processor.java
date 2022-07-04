package com.akhilesh.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.akhilesh.entity.Book;

@Component
public class Processor implements ItemProcessor<Book, Book>{
	
	private static final Logger log = LoggerFactory.getLogger(Processor.class);

	@Override
	public Book process(Book books) throws Exception {
		log.info("Book Process start");
		log.info(""+books);
		log.info("Book Process stop");
		return books;
	}

}
