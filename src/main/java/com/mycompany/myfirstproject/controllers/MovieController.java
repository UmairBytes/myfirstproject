package com.mycompany.myfirstproject.controllers;

import com.mycompany.myfirstproject.services.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


//localhost:8080           /api/movies
@RestController
@RequestMapping("/api/movies")
public class MovieController{

    private final MovieService movieService = new MovieService();

    @GetMapping("/")
    public List<Map<String,String>> getAllMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping("/bahubali")
    public String getSpecificMovie(){
        return "Here is your bahubali volue katappa";
    }

    @GetMapping("/{id}")
    public Map<String,String> getSpecificMovie1(@PathVariable String id){
        Map<String,String> mpp = new HashMap<>();
        mpp.put("id","123");
        mpp.put("name","nanu");

        return mpp;
    }




    @PostMapping
    public String createNewMovie(){
        //some processing
        double randomid = Math.floor(Math.random()*100);
        return "movie successfully created with id "+randomid;
    }
}

