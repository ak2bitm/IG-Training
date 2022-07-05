package com.akhilesh.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
	
	private String bookName;
	
	private String author;
	
	private String publication;
	
	private int pages;

	private double price;
	
	private int noOfCopies;
	
	@ManyToOne
	@JoinColumn(name = "created_by",referencedColumnName = "userId")
	private User createdBy;
	
	@ManyToOne
	@JoinColumn(name = "modified_by",referencedColumnName = "userId")
	private User modifiedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedOn;
}
