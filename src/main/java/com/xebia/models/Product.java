package com.xebia.models;

public class Product {

    private String productName;
    private int productQuantity;
    private Double productPrice;

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

}