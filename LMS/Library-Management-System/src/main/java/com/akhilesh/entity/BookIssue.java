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

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

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
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
public class BookIssue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transactionId;

	@ManyToOne
	@JoinColumn(name = "book_id", referencedColumnName = "bookId")
	private Book bookId;

	@ManyToOne
	@JoinColumn(name = "issue_to", referencedColumnName = "userId")
	private User issueTo;

	@ManyToOne
	@JoinColumn(name = "issued_by", referencedColumnName = "userId")
	private User issuedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date bokkIssueDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date bookReturnDate;

	@ManyToOne
	@JoinColumn(name = "created_by", referencedColumnName = "userId")
	private User createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;

	@ManyToOne
	@JoinColumn(name = "modified_by", referencedColumnName = "userId")
	private User modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedOn;

	private String status;

	private String remarks;

}
