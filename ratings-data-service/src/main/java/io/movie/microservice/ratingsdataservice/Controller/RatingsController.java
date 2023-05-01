package io.movie.microservice.ratingsdataservice.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.movie.microservice.ratingsdataservice.Model.Rating;
import io.movie.microservice.ratingsdataservice.Model.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingsController {
	
	@GetMapping("/users/{userId}")
	public UserRating getRatings(@PathVariable String userId) {
		List<Rating> ratings =  Arrays.asList(
				new Rating("1",4),
				new Rating("2",5));
		
		UserRating userRating = new UserRating();
		userRating.setRating(ratings);
		return userRating;
	}
}
