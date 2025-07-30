package com.foodApp.service.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodApp.entities.Order;
import com.foodApp.payloads.OrderPayload;
import com.foodApp.repositry.OrderRepository;
import com.foodApp.service.OrderService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<OrderPayload> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream()
                .map(order -> modelMapper.map(order, OrderPayload.class))
                .collect(Collectors.toList());
    }

    public OrderPayload getOrderById(int orderId) {
        Order order = orderRepository.findById(orderId).orElse(null);
        if (order != null) {
            return modelMapper.map(order, OrderPayload.class);
        }
        return null;
    }

    public OrderPayload createOrder(OrderPayload orderPayload) {
        Order order = modelMapper.map(orderPayload, Order.class);
        Order savedOrder = orderRepository.save(order);
        return modelMapper.map(savedOrder, OrderPayload.class);
    }

    public void deleteOrder(int orderId) {
        orderRepository.deleteById(orderId);
    }
}
