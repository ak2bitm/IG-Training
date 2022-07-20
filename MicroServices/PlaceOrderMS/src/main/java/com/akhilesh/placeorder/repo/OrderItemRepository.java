package com.akhilesh.placeorder.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.placeorder.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	public List<OrderItem> getOrdersItemByOrderId(long orderId);
}
