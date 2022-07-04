package com.akhilesh.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	
}
