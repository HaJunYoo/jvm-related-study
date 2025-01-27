package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {
    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public void order() {
        User user = new User();
        user.setUserId("user1");
        Product product = new Product();
        Order order = new Order(user, product);

        logger.info("Order user id: {}", order.user.getUserId());
    }
}