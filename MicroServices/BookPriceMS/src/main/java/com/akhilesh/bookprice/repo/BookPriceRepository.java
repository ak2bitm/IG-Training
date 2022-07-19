package com.akhilesh.bookprice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.bookprice.entity.BookPrice;

public interface BookPriceRepository extends JpaRepository<BookPrice, Long>{

}
