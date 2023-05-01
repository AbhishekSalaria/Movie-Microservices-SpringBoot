package io.movie.microservice.moviecatalogservice.Models;

import org.springframework.stereotype.Component;

@Component
public class CatalogItem {

	private String name;
	private int rating;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public CatalogItem(String name, int rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	public CatalogItem() {
		super();
		// TODO Auto-generated constructor stub
	}
}
