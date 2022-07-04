package com.akhilesh.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.akhilesh.entity.BookIssue;

public interface BookIssueRepository extends JpaRepository<BookIssue, Long>{

	@Query("select bi from BookIssue bi where bi.status=:status")
	public List<BookIssue> findByStatus(@Param("status") String status);
}
