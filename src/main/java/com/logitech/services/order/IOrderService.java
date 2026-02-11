package com.logitech.services.order;

import com.logitech.domain.shipment.Order;
import com.logitech.domain.terminal.Terminal;

import java.util.List;

public interface IOrderService {
    public List<Order> findAll();

    Order getOrderById(Long id);

    Order createOrder(Order order);

    void deleteOrder(Long id);
}
