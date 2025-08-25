package com.mycompany.myfirstproject.services;

import com.mycompany.myfirstproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MovieService {

    public MovieService(MovieRepository movieRepo){
        System.out.println("Initializing Movie Service");
    }

    @Autowired
    private MovieRepository movieRepo;

    public List<Map<String,String>> getAllMovies(){

        double num = Math.floor(Math.random()*100);

        boolean isSubscribedUser = num>90.0;



        if(isSubscribedUser){
//            return  movieRepo.getMoviesForSubscribedUsers();
            return null;
        }

//        return movieRepo.getMoviesForPhugatUsers();
        return null;
    }

}
