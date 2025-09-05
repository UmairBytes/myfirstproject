
package com.mycompany.myfirstproject.services;

import com.mycompany.myfirstproject.dto.MovieMapper;
import com.mycompany.myfirstproject.dto.MovieRequestDto;
import com.mycompany.myfirstproject.dto.MovieResponseDto;
import com.mycompany.myfirstproject.dto.MovieUpdateDto;
import com.mycompany.myfirstproject.entity.Movie;
import com.mycompany.myfirstproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepo;

//    public List<MovieResponseDto> getMyMovies(){
//
//        List <Movie>movies =  movieRepo.findAll();
//        List <MovieResponseDto> responseList = new ArrayList<>();
//        for(Movie mov : movies){
//            responseList.add(MovieMapper.toResponseDto(mov));
//        }
//        return responseList;
//    }

    public Page<MovieResponseDto> getMyMovies(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);

        Page<Movie> moviesPage = movieRepo.findAll(pageable);

        // map entities -> DTOs while keeping pagination metadata
        Page<MovieResponseDto> dtoPage = moviesPage.map(MovieMapper::toResponseDto);

        return dtoPage;
    }

    public MovieResponseDto getMovieFromId(Long id){
        Movie movie =  movieRepo.findById(id).orElseThrow();
        return MovieMapper.toResponseDto(movie);
    }

    public MovieResponseDto createMovie(MovieRequestDto movieObj){
        Movie newMovie = MovieMapper.toEntity(movieObj);
        movieRepo.save(newMovie);
        return MovieMapper.toResponseDto(newMovie);
    }

    public void deleteMovieById(Long id){
        movieRepo.deleteById(id);
    }

    public MovieResponseDto changeInfo(Long id, MovieUpdateDto body){
        Movie movie = movieRepo.findById(id).orElseThrow();
        Movie newMovie = MovieMapper.toEntityUpdate(body);
        if(newMovie.getRating() != 0){
            movie.setRating(newMovie.getRating());
        }
        if(newMovie.getReleaseDate() != null){
            movie.setReleaseDate(newMovie.getReleaseDate());
        }
        if(newMovie.getBoxOffice() != 0){
            movie.setBoxOffice(newMovie.getBoxOffice());
        }
        Movie changedMovie = movieRepo.save(movie);
        return MovieMapper.toResponseDto(changedMovie);
    }

    public MovieResponseDto createMovieById(Long id, MovieRequestDto body){
        Movie movie = movieRepo.findById(id).orElseThrow();
        Movie newMovie = MovieMapper.toEntity(body);
        newMovie.setId(movie.getId());
        Movie createNewMovie = movieRepo.save(newMovie);
        return MovieMapper.toResponseDto(createNewMovie);
    }

}


