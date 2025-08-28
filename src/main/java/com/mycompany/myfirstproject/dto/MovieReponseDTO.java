package com.mycompany.myfirstproject.dto;


import com.mycompany.myfirstproject.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieReponseDTO {
    private Long id;
    // Basic details
    private String name;
    private String description;
}


