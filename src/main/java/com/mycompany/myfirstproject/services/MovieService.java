package com.mycompany.myfirstproject.services;

import com.mycompany.myfirstproject.dto.MovieMapper;
import com.mycompany.myfirstproject.dto.MovieReponseDTO;
import com.mycompany.myfirstproject.dto.MovieRequestDTO;
import com.mycompany.myfirstproject.entity.Movie;
import com.mycompany.myfirstproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepo;

    public List<MovieReponseDTO> getMyMovies(){

        List <Movie>movies =  movieRepo.findAll();
        List <MovieReponseDTO> responseList = new ArrayList<>();
        for(Movie mov : movies){
            responseList.add(MovieMapper.toResponseDTO(mov));
        }
        return responseList;


    }

   public MovieReponseDTO getMovieFromId(Long id){
        Movie movie =  movieRepo.findById(id).orElseThrow();
        MovieReponseDTO dto = MovieMapper.toResponseDTO(movie);
        return dto;


    }

    public MovieReponseDTO createMovie(MovieRequestDTO moviedtoObj){
          Movie movieObj = MovieMapper.toEntity(moviedtoObj);

          movieRepo.save(movieObj);
          return MovieMapper.toResponseDTO(movieObj);

    }


}
