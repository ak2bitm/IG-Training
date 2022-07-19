package com.akhilesh.booksearch.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.booksearch.entity.BookInventory;

public interface BookInventoryRepository extends JpaRepository<BookInventory, Long>{

}
