package edu.icet.service;

import edu.icet.model.dto.Customer;
import edu.icet.model.dto.FoodItem;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.model.entity.FoodItemEntity;
import edu.icet.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoodItemService {

    @Autowired
    FoodItemRepository foodItemRepository;

    public List<FoodItem> foodList(){
        List<FoodItemEntity>foodItemEntities = foodItemRepository.findAll();
        List<FoodItem> foodItemFood = new ArrayList<>();

        for(FoodItemEntity foodItemEntity : foodItemEntities){
            foodItemFood.add(new FoodItem(
                    foodItemEntity.getId(),
                    foodItemEntity.getFoodName(),
                    foodItemEntity.getCategory(),
                    foodItemEntity.getDescription(),
                    foodItemEntity.getPrice(),
                    foodItemEntity.getAvailableQuantity()
            ));

        }
        return foodItemFood;

    }

    public void addFoodItem(FoodItem foodItem){
        foodItemRepository.save(new FoodItemEntity(
                foodItem.getId(),
                foodItem.getFoodName(),
                foodItem.getCategory(),
                foodItem.getDescription(),
                foodItem.getPrice(),
                foodItem.getAvailableQuantity()
        ));

    }


    public FoodItemEntity update(String id, FoodItemEntity updateItem){
        Optional<FoodItemEntity> foodItemEntity = foodItemRepository.findById(id);
        if(foodItemEntity.isPresent()) {
            FoodItemEntity foodItemEntity1 =  foodItemEntity.get();
            foodItemEntity1.setId(updateItem.getId());
            foodItemEntity1.setFoodName(updateItem.getFoodName());
            foodItemEntity1.setCategory(updateItem.getCategory());
            foodItemEntity1.setDescription(updateItem.getDescription());
            foodItemEntity1.setPrice(updateItem.getPrice());
            foodItemEntity1.setAvailableQuantity(updateItem.getAvailableQuantity());

            return foodItemRepository.save(foodItemEntity1);
        }
        return null;


    }
    public boolean foodItemDeleteById(String id) {
        foodItemRepository.deleteById(String.valueOf(id));
        return true;
    }

    public FoodItem foodItemSearch(String id){
        Optional<FoodItemEntity> byId = foodItemRepository.findById(String.valueOf(id));
        FoodItemEntity foodItemEntity = byId.get();
        return new FoodItem(
                foodItemEntity.getId(),
                foodItemEntity.getFoodName(),
                foodItemEntity.getCategory(),
                foodItemEntity.getDescription(),
                foodItemEntity.getPrice(),
                foodItemEntity.getAvailableQuantity()
        );
    }
}
