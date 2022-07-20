package com.akhilesh.placeorder.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.akhilesh.placeorder.entity.Order;
import com.akhilesh.placeorder.service.OrderService;

@RestController
public class PlaceOrderController {

	static Logger log = LoggerFactory.getLogger(PlaceOrderController.class);

	
}
