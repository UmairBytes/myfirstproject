package com.mycompany.myfirstproject.dto;


import com.mycompany.myfirstproject.entity.Movie;

public class MovieMapper{
    public static MovieReponseDTO toResponseDTO(Movie movie){

        return new MovieReponseDTO(
                movie.getId(),
                movie.getTitle(),
                movie.getDescription()
        );

    }

    public static Movie toEntity(MovieRequestDTO movieRequest){
        Movie movie = new Movie();

        movie.setTitle(movieRequest.name());
        movie.setDescription(movieRequest.description());

        return movie;
    }
}
