package com.mycompany.myfirstproject.controller.java;

import com.mycompany.myfirstproject.entity.Movie;
import com.mycompany.myfirstproject.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController{

    private final MovieService movieService;


    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        List<Movie> movies =  movieService.getMyMovies();
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getSpecificMovie1(@PathVariable Long id){

        Movie retrivedMovie = movieService.getMovieFromId(id);

        return ResponseEntity.ok(retrivedMovie);
    }

    @PostMapping
    public ResponseEntity<Movie> createNewMovie(@RequestBody Movie body){
        //some processing
        Movie movie = movieService.createMovie(body);
        return ResponseEntity.ok(movie);
    }

}
