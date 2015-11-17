package com.xebia.services;

import com.xebia.models.Receipt;
import java.util.List;

/**
 * Created by kchoudhary on 27-Oct-15.
 */
public class BillingService {

    public Receipt createBillingReceipt(List<String> orders){
     return new Receipt(orders);
    }
}
