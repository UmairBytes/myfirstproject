package com.mycompany.myfirstproject.services;

import com.mycompany.myfirstproject.entity.Movie;
import com.mycompany.myfirstproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepo;

    public Movie createMovie(Movie movieObj){
        Movie returnedMoviefromDB = movieRepo.save(movieObj);
        return returnedMoviefromDB;
    }

    public Movie getMovieFromId(Long id){
        Movie movie = movieRepo.findById(id).orElseThrow();
        return movie;
    }
}
