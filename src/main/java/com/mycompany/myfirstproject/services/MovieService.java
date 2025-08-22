package com.mycompany.myfirstproject.services;

import com.mycompany.myfirstproject.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MovieService {

    private final MovieRepository movieRepo = new MovieRepository();

    public List<Map<String,String>> getAllMovies(){

        double num = Math.floor(Math.random()*100);

        boolean isSubscribedUser = num>90.0;



        if(isSubscribedUser){
            return  movieRepo.getMoviesForSubscribedUsers();
        }

        return movieRepo.getMoviesForPhugatUsers();
    }



}
