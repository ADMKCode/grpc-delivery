package com.perficient.orderapp.application.port.in;

import com.perficient.orderapp.domain.model.Customer;
import com.perficient.orderapp.domain.model.Order;

public interface CreateOrderUseCase {

    Order create(Customer customer);
}
