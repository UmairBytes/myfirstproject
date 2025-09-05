package com.mycompany.myfirstproject.dto;

import com.mycompany.myfirstproject.entity.Movie;

public class MovieMapper {
    public static MovieResponseDto toResponseDto(Movie movie){
        return new MovieResponseDto(
                movie.getId(),
                movie.getTitle(),
                movie.getRating(),
                movie.getDescription()
        );
    }

    public static Movie toEntity(MovieRequestDto movieResponseDto){
        Movie movie = new Movie();
        movie.setTitle(movieResponseDto.title());
        movie.setDescription(movieResponseDto.description());
        return movie;
    }

    public static Movie toEntityUpdate(MovieUpdateDto movieUpdate){
        Movie movie = new Movie();
        movie.setBoxOffice(movieUpdate.collection());
        movie.setRating(movieUpdate.rating());
        movie.setReleaseDate(movieUpdate.releaseDate());

        return movie;
    }
}
