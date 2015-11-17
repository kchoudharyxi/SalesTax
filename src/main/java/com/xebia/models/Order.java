package com.xebia.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kchoudhary on 27-Oct-15.
 */
public class Order {

    private Product product = new Product();

    public Order(String orderString) {
        this.createOrder(orderString);
    }

    private void createOrder(String orderString) {

        String[] productDescription = orderString.split("\\s");
        Double productPrice = Double.parseDouble(productDescription[productDescription.length - 1]);
        int productQuantity = Integer.parseInt(productDescription[0]);
        String[] productTypeDescription = orderString.split("\\d");
        String productType = productTypeDescription[1];
        productType = productType.replaceAll("\\s*\\bat\\b\\s*", "");

        product.setProductName(productType);
        product.setProductPrice(productPrice);
        product.setProductQuantity(productQuantity);

        new Receipt(new SalesTax(product).getSalesTax(),productPrice);
        getOrder();
    }


    public List<String> getOrder() {
        List<String> orders = new ArrayList<String>();
        orders.add(String.valueOf(product.getProductQuantity()));
        orders.add(product.getProductName());
        orders.add(String.valueOf(product.getProductPrice()));
        return orders;
    }
}

