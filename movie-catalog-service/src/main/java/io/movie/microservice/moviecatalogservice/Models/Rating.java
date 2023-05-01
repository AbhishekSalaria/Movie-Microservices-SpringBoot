package io.movie.microservice.moviecatalogservice.Models;

public class Rating {
	
	private String id;
	private int ratings;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public Rating(String id, int ratings) {
		super();
		this.id = id;
		this.ratings = ratings;
	}
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

}
