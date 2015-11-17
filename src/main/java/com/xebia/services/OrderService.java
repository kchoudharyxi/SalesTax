package com.xebia.services;

import com.xebia.models.Order;

/**
 * Created by kchoudhary on 27-Oct-15.
 */
public class OrderService {

    public Order createOrderFromInput(String orderInput){
        return new Order(orderInput);
    }

}
