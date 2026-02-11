package com.logitech.services.order;

import com.logitech.domain.shipment.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class defaultOrderService implements IOrderService{
    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Order getOrderById(Long id) {
        return null;
    }

    @Override
    public Order createOrder(Order order) {
        return null;
    }

    @Override
    public void deleteOrder(Long id) {

    }
}
