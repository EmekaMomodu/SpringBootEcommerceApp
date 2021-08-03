package com.emekamomodu.ecommerce.dto;

import com.emekamomodu.ecommerce.entity.Address;
import com.emekamomodu.ecommerce.entity.Customer;
import com.emekamomodu.ecommerce.entity.Order;
import com.emekamomodu.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
