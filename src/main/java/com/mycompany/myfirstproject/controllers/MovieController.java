package com.mycompany.myfirstproject.controllers;

import com.mycompany.myfirstproject.dto.MovieReponseDTO;
import com.mycompany.myfirstproject.dto.MovieRequestDTO;
import com.mycompany.myfirstproject.entity.Movie;
import com.mycompany.myfirstproject.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


//localhost:8080           /api/movies
@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController{

    private final MovieService movieService;


    @GetMapping
    public ResponseEntity<List<MovieReponseDTO>> getAllMovies(){
        List<MovieReponseDTO> movies =  movieService.getMyMovies();
        return ResponseEntity.ok(movies);
    }






    @GetMapping("/{id}")
    public ResponseEntity<MovieReponseDTO> getSpecificMovie1(@PathVariable Long id){

        MovieReponseDTO retrivedMovie = movieService.getMovieFromId(id);

        return ResponseEntity.ok(retrivedMovie);
    }




    @PostMapping
    public ResponseEntity<MovieReponseDTO> createNewMovie(@RequestBody MovieRequestDTO body){
        MovieReponseDTO movieResponseDTO  = movieService.createMovie(body);
        return ResponseEntity.ok(movieResponseDTO);
    }

}

