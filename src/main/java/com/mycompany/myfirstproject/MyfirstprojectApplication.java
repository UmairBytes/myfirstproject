package com.mycompany.myfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class MyfirstprojectApplication {

	public static void main(String[] args) {
        System.out.println("Hello World");
		SpringApplication.run(MyfirstprojectApplication.class, args);
//        System.out.println("Chalo World");
//        Movies movieObj = new Movies();
//        System.out.println(movieObj.getAllMovies());
	}

}
//localhost:8080           /api/movies
@RestController
@RequestMapping("/api/movies")
class Movies{

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
