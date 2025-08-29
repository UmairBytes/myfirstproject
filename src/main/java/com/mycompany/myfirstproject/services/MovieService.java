
package com.mycompany.myfirstproject.services;

import com.mycompany.myfirstproject.Dto.MovieMapper;
import com.mycompany.myfirstproject.Dto.MovieResponeDto;
import com.mycompany.myfirstproject.Dto.PostMapper;
import com.mycompany.myfirstproject.entity.Movie;
import com.mycompany.myfirstproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepo;

    public List<Movie> getMyMovies(){

        return movieRepo.findAll();

    }

    public MovieResponeDto getMovieFromId(Long id){
        Movie movie =  movieRepo.findById(id).orElseThrow();
        MovieResponeDto dto = MovieMapper.toDto(movie);
        return dto;

    }

    public MovieResponeDto createMovie(MovieResponeDto movieDto){
        Movie actualMovie = PostMapper.DtoTo(movieDto);

        movieRepo.save(actualMovie);

        return movieDto;

    }


}


