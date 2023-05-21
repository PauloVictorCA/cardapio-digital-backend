package com.back.cadarpiodigitalback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.back.cadarpiodigitalback.dto.FoodDTO;
import com.back.cadarpiodigitalback.entities.Food;
import com.back.cadarpiodigitalback.repositories.FoodRepository;

@Service
public class FoodService {

	@Autowired
	private FoodRepository foodRepositury;
	
	@Transactional (readOnly = true)
	public List<FoodDTO> buscarFoods(){
		List<Food> result = foodRepositury.findAll();
		List<FoodDTO> dto = result.stream().map(x -> new FoodDTO(x)).toList();
		return dto;
	}
}
