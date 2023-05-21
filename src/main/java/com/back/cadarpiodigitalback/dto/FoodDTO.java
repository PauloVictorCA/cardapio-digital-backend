package com.back.cadarpiodigitalback.dto;

import com.back.cadarpiodigitalback.entities.Food;

public class FoodDTO {
	
	private Long id;
	private String title;
	private String url_image;
	private Double price;
	
	public FoodDTO() {
	}
		
	public FoodDTO(Food entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.url_image = entity.getUrl_image();
		this.price = entity.getPrice();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl_image() {
		return url_image;
	}
	public void setUrl_image(String url_image) {
		this.url_image = url_image;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
