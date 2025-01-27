package com.helloshop;

import com.helloshop.order.*;

public class ComMain {

    public static void main(String[] args) {
        OrderService orderSvc = new OrderService();
        orderSvc.order();
    }
}