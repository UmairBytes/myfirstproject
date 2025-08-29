package com.mycompany.myfirstproject.Dto;

import com.mycompany.myfirstproject.entity.Movie;

public class PostMapper {
    public static Movie DtoTo(MovieResponeDto movieDto){
        Movie movie = new Movie();
        movie.setId(movieDto.getId());
        movie.setCountry(movieDto.getCountry());
        movie.setLanguage(movieDto.getLanguage());
        return movie;
    }
}
