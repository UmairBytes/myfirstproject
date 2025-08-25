package com.mycompany.myfirstproject.controllers;

import com.mycompany.myfirstproject.entity.Movie;
import com.mycompany.myfirstproject.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


//localhost:8080           /api/movies
@RestController
@RequestMapping("/api/movies")
public class MovieController{

    @Autowired
    private MovieService movieService;






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

