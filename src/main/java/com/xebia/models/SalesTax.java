package com.xebia.models;

/**
 * Created by kchoudhary on 27-Oct-15.
 */
public class SalesTax {

    private Product product;

    public SalesTax(Product product){
        this.product = product;
        this.getSalesTax();
    }

    public double getSalesTax(){

        double taxForOtherItems = 0.0;
        double taxForImported = 0.0;

        if (!product.getProductName().contains("imported") &&
                !product.getProductName().contains("book") ||
                !product.getProductName().contains("chocolate") ||
                !product.getProductName().contains("pills")) {
            double basicTax = 0.10;
            taxForOtherItems = product.getProductPrice() * basicTax * product.getProductQuantity();
        }

        if (product.getProductName().contains("imported") &&
                !product.getProductName().contains("book") ||
                !product.getProductName().contains("chocolate") ||
                !product.getProductName().contains("pills")) {
            double importTax = 0.15;
            taxForImported = product.getProductPrice() * importTax * product.getProductQuantity();
        }

        if (product.getProductName().contains("imported") &&
                product.getProductName().contains("book") ||
                product.getProductName().contains("chocolate") ||
                product.getProductName().contains("pills")) {
            double importTax = 0.05;
            taxForImported = product.getProductPrice() * importTax * product.getProductQuantity();
        }

        return taxForOtherItems + taxForImported;
    }

}
