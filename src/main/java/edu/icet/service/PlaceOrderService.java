package edu.icet.service;

import edu.icet.model.dto.Customer;
import edu.icet.model.dto.FoodItem;
import edu.icet.model.dto.PlaceOrder;
import edu.icet.model.entity.PlaceOrderEntity;
import edu.icet.repository.PlaceOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class PlaceOrderService {
     PlaceOrderRepository placeOrderRepository;
     CustomerService customerService;
     FoodItemService foodItemService;

    public void addOrder(PlaceOrder placeOrder , Customer customer, FoodItem foodItem){
        placeOrderRepository.save(new PlaceOrderEntity(

        ));
    }
}
