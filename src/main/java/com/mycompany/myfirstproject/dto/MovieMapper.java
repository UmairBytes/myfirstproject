package com.mycompany.myfirstproject.dto;


import com.mycompany.myfirstproject.entity.Movie;

public class MovieMapper{
    public static MovieReponseDTO toDTO(Movie movie){
        MovieReponseDTO dto = new MovieReponseDTO();
        dto.setId(movie.getId());
        dto.setName(movie.getTitle());
        dto.setDescription(movie.getDescription());

        return dto;
    }
}
