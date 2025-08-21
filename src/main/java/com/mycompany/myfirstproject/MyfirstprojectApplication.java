package com.mycompany.myfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class MyfirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
        System.out.println("this is my first web page");
	}

    @RestController
    @RequestMapping("/api/movies")
    public static class movies{

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
}


