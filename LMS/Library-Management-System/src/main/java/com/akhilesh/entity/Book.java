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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
@ApiModel(value = "Book contain bookId, bookName,author,publication,pages,price,noOfCopies,createdBy,modifiedBy,createdOn,modifiedOn,status")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "contain bookId")
	private long bookId;
	
	@ApiModelProperty(value = "contain bookName")
	private String bookName;

	@ApiModelProperty(value = "contain author")
	private String author;

	@ApiModelProperty(value = "contain publication")
	private String publication;

	@ApiModelProperty(value = "contain pages")
	private int pages;

	@ApiModelProperty(value = "contain price")
	private double price;

	@ApiModelProperty(value = "contain noOfCopies")
	private int noOfCopies;

	@ManyToOne
	@JoinColumn(name = "created_by", referencedColumnName = "userId")
	@ApiModelProperty(value = "contain createdBy")
	private User createdBy;

	@ManyToOne
	@JoinColumn(name = "modified_by", referencedColumnName = "userId")
	@ApiModelProperty(value = "contain modifiedBy")
	private User modifiedBy;

	@ApiModelProperty(value = "contain createdOn")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@ApiModelProperty(value = "contain modifiesOn")
	private Date modifiedOn;

	@ApiModelProperty(value = "contain status")
	private String status;
}
