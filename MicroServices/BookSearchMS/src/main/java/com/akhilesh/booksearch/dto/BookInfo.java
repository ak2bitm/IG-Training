package com.akhilesh.booksearch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookInfo {

	private long bookId;
	private String bookName;
	private String author;
	private String publications;
	private String category;
	private double price;
	private double offer;
	private double avgRating;
	private int noOfSearches;
	private int booksAvailable;
}
