package com.akhilesh.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.entity.BookIssue;

public interface BookIssueRepository extends JpaRepository<BookIssue, Long>{

	
}
