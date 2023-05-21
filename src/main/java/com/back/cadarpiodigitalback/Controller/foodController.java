package com.back.cadarpiodigitalback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.back.cadarpiodigitalback.dto.FoodDTO;
import com.back.cadarpiodigitalback.dto.SaveFoodDTO;
import com.back.cadarpiodigitalback.service.FoodService;
import com.back.cadarpiodigitalback.service.SaveFoodService;

@RestController
@RequestMapping(value = "/food")
public class foodController {
	
	@Autowired
	private FoodService foodService;
	
	@Autowired
	private SaveFoodService saveFoodService;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping
	public List<FoodDTO> findAll(){
		List<FoodDTO> result = foodService.buscarFoods();
		return result;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping
	public void saveFood(@RequestBody SaveFoodDTO body) {
		saveFoodService.salvarObjeto(body.getTitle(), body.getUrl_image(), body.getPrice());
	}
	
}
