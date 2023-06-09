package io.movie.microservice.movieinfoservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.movie.microservice.movieinfoservice.Model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
	
	@GetMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		return new Movie(movieId,"Transformers");
	}

}
