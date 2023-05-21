package com.back.cadarpiodigitalback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.back.cadarpiodigitalback.entities.Food;

public interface FoodRepository extends JpaRepository <Food, Long> {
	
}
