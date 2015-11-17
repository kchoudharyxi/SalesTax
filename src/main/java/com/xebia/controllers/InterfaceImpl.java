package com.xebia.controllers;

import com.xebia.Interface;
import com.xebia.models.Order;
import com.xebia.models.Receipt;
import com.xebia.services.BillingService;
import com.xebia.services.OrderService;


/**
 * Created by kchoudhary on 27-Oct-15.
 */
public class InterfaceImpl implements Interface {

    public InterfaceImpl(String orderInput){
        this.processOrder(orderInput);
    }

    public Receipt processOrder(String orderInput){
        Order order = new OrderService().createOrderFromInput(orderInput);
        return new BillingService().createBillingReceipt(order.getOrder());
    }

}
