package com.back.cadarpiodigitalback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.back.cadarpiodigitalback.entities.Food;
import com.back.cadarpiodigitalback.repositories.FoodRepository;

@Service
public class SaveFoodService {
	
	@Autowired
    private FoodRepository foodRepository;

	@Transactional
	public void salvarObjeto (String title, String url_image, Double price) {
		Food food = new Food();
        food.setTitle(title);
        food.setUrl_image(url_image);
        food.setPrice(price);
        
        foodRepository.save(food);
    }
	
}
