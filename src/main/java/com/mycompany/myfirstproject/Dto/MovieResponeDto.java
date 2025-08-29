package com.mycompany.myfirstproject.Dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponeDto {
    private Long id;

    private String title;
    private String description;
    private String language;
    private String country;
}
