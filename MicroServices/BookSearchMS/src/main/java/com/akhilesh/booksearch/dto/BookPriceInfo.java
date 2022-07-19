package com.akhilesh.booksearch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookPriceInfo {

	private long bookId;
	private double price;
	private double offer;
}
