package com.emekamomodu.ecommerce.service;

import com.emekamomodu.ecommerce.dto.Purchase;
import com.emekamomodu.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
