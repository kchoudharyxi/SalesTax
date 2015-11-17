package com.xebia.models;

import java.util.List;

/**
 * Created by kchoudhary on 27-Oct-15.
 */
public class Receipt {

    private static Double salesTax;
    private static Double price;

    public Receipt(Double salesTax, Double price) {
        this.price = price;
        this.salesTax = salesTax;
    }

    public Receipt(List<String> orders) {
        this.printReceipt(orders);
    }

    private void printReceipt(List<String> orders) {
        String[] arr = orders.toArray(new String[orders.size()]);
        System.out.println(arr[0] + arr[1] + " : " + arr[2]);

        System.out.println("Sales Tax : " + salesTax);
        System.out.println("Total : " + (price + salesTax));
    }
}
