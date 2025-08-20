package com.mycompany.myfirstproject.controllers;

import org.springframework.web.bind.annotation.*;


//localhost:8080           /api/movies
@RestController
@RequestMapping("/api/movies")
public class MovieController{

    @GetMapping
    public String getAllMovies(){
        return "<h1  style=\"color:red;\">here is your list of all movies</h1> <script>alert(\"running javascript\")</script>";

    }

    @GetMapping("/bahubali")
    public String getSpecificMovie(){
        return "Here is your bahubali volue katappa";
    }

    @GetMapping("/{id}")
    public String getSpecificMovie1(@PathVariable String id){
        return "Here is your "+id+"movie";
    }


    @PostMapping
    public String createNewMovie(){
        //some processing
        double randomid = Math.floor(Math.random()*100);
        return "movie successfully created with id "+randomid;
    }
}

