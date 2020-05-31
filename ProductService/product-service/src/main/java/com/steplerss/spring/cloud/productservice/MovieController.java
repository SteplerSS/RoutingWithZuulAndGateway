package com.steplerss.spring.cloud.productservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

	private static List<Movie> movieList = new ArrayList<>();
	static {
		movieList.add(new Movie(1, "movie-1", "summary-1"));
	}

	@GetMapping("/categories")
	public ResponseEntity<?> getMovies() {
		return ResponseEntity.ok(movieList);
	}
}
