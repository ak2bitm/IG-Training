package com.akhilesh.userrating.entity;

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
@Table(name = "myuserratings")
public class UserRating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ratingId;
	private long bookId;
	private String userId;
	private double rating;
	private String review;
}
