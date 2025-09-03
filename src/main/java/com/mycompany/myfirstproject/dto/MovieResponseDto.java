package com.mycompany.myfirstproject.dto;

public record MovieResponseDto (
        long id,
        String title,
        double rating,
        String description
){
}
