package edu.icet.service;

import edu.icet.model.dto.PlaceOrder;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.model.entity.PlaceOrderEntity;
import edu.icet.repository.PlaceOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class PlaceOrderService {
     PlaceOrderRepository placeOrderRepository;
     CustomerService customerService;
     FoodItemService foodItemService;


    public PlaceOrderEntity addOrder(PlaceOrder placeOrder) {
        placeOrderRepository.save(new PlaceOrderEntity(
                placeOrder.getOrderId(),
                placeOrder.getCustomerId(),
                placeOrder.getSelectItem(),
                placeOrder.getOrderDate(),
                placeOrder.getDeliveryAddress(),
                placeOrder.getTotalAmount(),
                placeOrder.getPaymentMethod()
        ));
    }

    public PlaceOrder getOrderItem(Long orderId, Long custId, String name) {
        PlaceOrderEntity orderItemId = new PlaceOrderEntity();
         placeOrderRepository.findById();
    }
}
