package com.mycompany.myfirstproject.services;

import com.mycompany.myfirstproject.dto.MovieMapper;
import com.mycompany.myfirstproject.dto.MovieReponseDTO;
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

    public List<Movie> getMyMovies(){

        return movieRepo.findAll();

    }

   public MovieReponseDTO getMovieFromId(Long id){
        Movie movie =  movieRepo.findById(id).orElseThrow();
        MovieReponseDTO dto = MovieMapper.toDTO(movie);
        return dto;


    }

    public Movie createMovie(Movie movieObj){
        return movieRepo.save(movieObj);

    }


}
