package com.akhilesh.placeorder.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mybookinventory")
public class BookInventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
	
	private int booksAvailable;
}
