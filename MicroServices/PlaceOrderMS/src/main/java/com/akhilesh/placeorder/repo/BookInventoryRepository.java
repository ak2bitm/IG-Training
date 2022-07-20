package com.akhilesh.placeorder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.placeorder.entity.BookInventory;

public interface BookInventoryRepository extends JpaRepository<BookInventory, Long>{

}
