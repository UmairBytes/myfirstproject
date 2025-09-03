package com.mycompany.myfirstproject.controller.java;

import com.mycompany.myfirstproject.dto.MovieRequestDto;
import com.mycompany.myfirstproject.dto.MovieResponseDto;
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
    public ResponseEntity<MovieResponseDto> getSpecificMovie1(@PathVariable Long id){

        MovieResponseDto retrivedMovie = movieService.getMovieFromId(id);

        return ResponseEntity.ok(retrivedMovie);
    }

    @PostMapping
    public ResponseEntity<MovieResponseDto> createNewMovie(@RequestBody MovieRequestDto body){
        MovieResponseDto savedMovie = movieService.createMovie(body);
        return ResponseEntity.ok(savedMovie);
    }

}
