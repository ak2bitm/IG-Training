package com.akhilesh.placeorder.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.placeorder.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	public List<Order> findOrderByUserId(String userId);
}
