package com.xebia.main;

import com.xebia.Interface;
import com.xebia.controllers.InterfaceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by kchoudhary on 27-Oct-15.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Input");
        String orderInput = input.readLine();
        Interface i = new InterfaceImpl(orderInput);

    }
}
