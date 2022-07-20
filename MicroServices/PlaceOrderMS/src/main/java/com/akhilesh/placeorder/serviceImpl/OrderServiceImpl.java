package com.akhilesh.placeorder.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.akhilesh.placeorder.dto.OrderInfo;
import com.akhilesh.placeorder.entity.BookInventory;
import com.akhilesh.placeorder.entity.Order;
import com.akhilesh.placeorder.entity.OrderItem;
import com.akhilesh.placeorder.repo.BookInventoryRepository;
import com.akhilesh.placeorder.repo.OrderItemRepository;
import com.akhilesh.placeorder.repo.OrderRepository;
import com.akhilesh.placeorder.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private BookInventoryRepository bookInventoryRepository;
	
	@Override
	public void placeOrder(OrderInfo orderInfo) {
		log.info("OrderServiceImpl-placeOrder()");
		//Insert Order
		Order myorder = orderInfo.getOrder();
		myorder = orderRepository.save(myorder);
		long orderId = myorder.getOrderId();
		//Insert order item
		List<OrderItem> itemsList = orderInfo.getItemsList();
		for(OrderItem myorderItem: itemsList) {
			myorderItem.setOrderId(orderId);
			orderItemRepository.save(myorderItem);
		}
		//update book search ms
		RestTemplate bookSearchRest = new RestTemplate();
		String endpoint = "http://localhost:8000/updatebookinventory";
		for(OrderItem myorderItem: itemsList) {
			long bookId = myorderItem.getBookId();
			BookInventory mybookInventory = bookInventoryRepository.findById(bookId).get();
			int currentStock = mybookInventory.getBooksAvailable();
			currentStock = currentStock - myorderItem.getQty();
			mybookInventory.setBooksAvailable(currentStock);
			// local inventory
			bookInventoryRepository.save(mybookInventory);
			// inventory of book search ms
			bookSearchRest.put(endpoint, mybookInventory);
		}
		
	}

	@Override
	public List<Order> getOrdersByUserId(String userId) {
		log.info("OrderServiceImpl-getOrdersByUserId()");
		return orderRepository.findOrderByUserId(userId);
	}

	@Override
	public Order getOrderByOrderId(long orderId) {
		log.info("OrderServiceImpl-getOrderByOrderId()");
		return orderRepository.findById(orderId).get();
	}

}
