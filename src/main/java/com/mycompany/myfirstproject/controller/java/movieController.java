package com.mycompany.myfirstproject.controller.java;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movies")
public class movieController{

    @GetMapping
    public String getAllMovies(){
        return "Here is your List of all Movies";
    }

    @GetMapping("/{id}")
    public String getSpecificMovie(@PathVariable String id){
        return "Here is your requested " + id + " movie ";
    }

    @PostMapping
    public String createNewMovie(){
        double randamId= Math.floor(Math.random()*100);
        return "Movie sucessfully created with id " + randamId;
    }
}
