package com.mycompany.myfirstproject.controller.java;

import com.mycompany.myfirstproject.dto.MovieRequestDto;
import com.mycompany.myfirstproject.dto.MovieResponseDto;
import com.mycompany.myfirstproject.dto.MovieUpdateDto;
import com.mycompany.myfirstproject.entity.Movie;
import com.mycompany.myfirstproject.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController{

    private final MovieService movieService;


//    @GetMapping
//    public ResponseEntity<List<MovieResponseDto>> getAllMovies(){
//        List<MovieResponseDto> movies =  movieService.getMyMovies();
//        return ResponseEntity.ok(movies);
//    }

    @GetMapping
    public ResponseEntity<Page<MovieResponseDto>> getAllMovies(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int pageSize) {

        Page<MovieResponseDto> movies = movieService.getMyMovies(pageNumber, pageSize);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieResponseDto> getSpecificMovie1(@PathVariable Long id){

        MovieResponseDto retrievedMovie = movieService.getMovieFromId(id);

        return ResponseEntity.ok(retrievedMovie);
    }

    @PostMapping
    public ResponseEntity<MovieResponseDto> createNewMovie(@RequestBody MovieRequestDto body){
        MovieResponseDto savedMovie = movieService.createMovie(body);
        return ResponseEntity.ok(savedMovie);
    }

    @PatchMapping("/{id}")
    public MovieResponseDto changeMovie(@PathVariable Long id, @RequestBody MovieUpdateDto body){
        return movieService.changeInfo(id, body);
    }

    @PutMapping("/{id}")
    public MovieResponseDto putNewMovie(@PathVariable Long id, @RequestBody MovieRequestDto body){
        return movieService.createMovieById(id, body);
    }

    @DeleteMapping("/{id}")
   public void deleteSpecificMovie(@PathVariable Long id){
        System.out.println("Trying to delete movie");
        movieService.deleteMovieById(id);
        System.out.println("Movie deleted successfully");
    }

}
