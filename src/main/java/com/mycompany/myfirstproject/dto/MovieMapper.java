package com.mycompany.myfirstproject.dto;


import com.mycompany.myfirstproject.entity.Movie;

public class MovieMapper{
    public static MovieReponseDTO toResponseDTO(Movie movie){
        MovieReponseDTO dto = new MovieReponseDTO();
        dto.setId(movie.getId());
        dto.setName(movie.getTitle());
        dto.setDescription(movie.getDescription());

        return dto;
    }

    public static Movie toEntity(MovieRequestDTO movieRequest){
        Movie movie = new Movie();

        movie.setTitle(movieRequest.name());
        movie.setDescription(movieRequest.description());

        return movie;
    }
}
