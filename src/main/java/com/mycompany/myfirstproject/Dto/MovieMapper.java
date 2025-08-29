package com.mycompany.myfirstproject.Dto;

import com.mycompany.myfirstproject.entity.Movie;

public class MovieMapper {
    public static MovieResponeDto toDto(Movie movie){
        MovieResponeDto dto = new MovieResponeDto();
        dto.setId(movie.getId());
        dto.setTitle(movie.getTitle());
        dto.setDescription(movie.getDescription());
        dto.setCountry(movie.getCountry());
//        dto.setLanguage(movie.getLanguage());
        return dto;

    }
}
