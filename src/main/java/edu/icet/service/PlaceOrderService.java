package edu.icet.service;

import edu.icet.model.dto.Customer;
import edu.icet.model.dto.FoodItem;
import edu.icet.model.dto.PlaceOrder;
import edu.icet.model.entity.PlaceOrderEntity;
import edu.icet.repository.PlaceOrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaceOrderService {
     PlaceOrderRepository placeOrderRepository;
     CustomerService customerService;
     FoodItemService foodItemService;


    public PlaceOrderEntity createOrder(Long orderId, Long customerId, String name) {
        PlaceOrderEntity orderItemId = new PlaceOrderEntity(orderId, customerId);
        PlaceOrder orderItem = new PlaceOrder();
        orderItem.getOrderId(orderItemId);
        orderItem.getCustomerName(name);
        return placeOrderRepository;
    }

    public PlaceOrder getOrderItem(Long orderId, Long custId, String name) {
        PlaceOrderEntity orderItemId = new PlaceOrderEntity();
        return placeOrderRepository.findById(orderItemId.getOrderId()).isPresent();
    }
}
