package edu.icet.controller;


import edu.icet.model.dto.Customer;
import edu.icet.model.dto.FoodItem;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.model.entity.FoodItemEntity;
import edu.icet.service.CustomerService;
import edu.icet.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;


    @PostMapping("/addItem")
    public void addFood(@RequestBody FoodItem foodItem) {
        foodItemService.addFoodItem(foodItem);
    }

    @GetMapping("/getAll")
    public List<FoodItem> foodItems(){
        return foodItemService.foodList();

    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable String id){
        return foodItemService.foodItemDeleteById(id);
    }

    @PutMapping("/update/{foodItemId}")
    public FoodItemEntity update(@PathVariable String updateId, @RequestBody FoodItemEntity update){
        return foodItemService.update(updateId,update);
    }


    @GetMapping("get/{id}")
    public FoodItem foodItemSearch(@PathVariable String id){
        return foodItemService.foodItemSearch(id);
    }

}
