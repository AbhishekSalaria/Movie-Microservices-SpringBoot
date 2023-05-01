package io.movie.microservice.moviecatalogservice.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.movie.microservice.moviecatalogservice.Models.CatalogItem;
import io.movie.microservice.moviecatalogservice.Models.Movie;
import io.movie.microservice.moviecatalogservice.Models.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId) {
		
		UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratings/users/"+userId,UserRating.class);
				
		return ratings.getRating().stream().map(
				rating -> {
					Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getId(),Movie.class);
					return new CatalogItem(movie.getName(), rating.getRatings());
				}).collect(Collectors.toList());
	}
}
