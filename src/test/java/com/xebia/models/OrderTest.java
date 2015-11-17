package com.xebia.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by kchoudhary on 27-Oct-15.
 */
public class OrderTest {

    Order order;
    Order mockedOrder;

    @Before
    public void setUp() throws Exception {
        mockedOrder = mock(Order.class);
    }

    @Test
    public void testCreateOrder1(){
        String orderString = "1 book at 12.49";
        String[] productDescription = orderString.split("\\s");
        String[] productTypeDescription = orderString.split("\\d");
        int productQuantity = Integer.parseInt(productDescription[0]);
        double productPrice = Double.parseDouble(productDescription[productDescription.length-1]);
        String productType = productTypeDescription[1];
        assertEquals(12.49,productPrice,1e-8);
        assertEquals(1,productQuantity);
        assertEquals(" book at ",productType);
        productType = productType.replaceAll("\\s*\\bat\\b\\s*","");
        assertEquals(" book",productType);
    }

    @Test
    public void testCreateOrder2(){
        String orderString = "1 Imported box of chocolates at 10.00";
        String[] productDescription = orderString.split("\\s");
        String[] productTypeDescription = orderString.split("\\d");
        int productQuantity = Integer.parseInt(productDescription[0]);
        double productPrice = Double.parseDouble(productDescription[productDescription.length-1]);
        String productType = productTypeDescription[1];
        assertEquals(10.00,productPrice,1e-8);
        assertEquals(1,productQuantity);
        assertEquals(" Imported box of chocolates at ", productType);
        productType = productType.replaceAll("\\s*\\bat\\b\\s*","");
        assertEquals(" Imported box of chocolates", productType);
        assertTrue("imported", productType.toLowerCase().contains("imported"));
    }

}