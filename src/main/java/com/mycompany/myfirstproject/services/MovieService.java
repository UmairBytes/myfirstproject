package com.mycompany.myfirstproject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MovieService {

    public List<Map<String,String>> getAllMovies(){

        double num = Math.floor(Math.random()*100);

        boolean isSubscribedUser = num>90.0;

        if(isSubscribedUser){
            return getMoviesForSubscribedUsers();
        }

        return getMoviesForPhugatUsers();
    }

    private List<Map<String,String>> getMoviesForSubscribedUsers(){
        List<Map<String,String>> listOfMovies = new ArrayList<>();
        listOfMovies.add(Map.of("id","123","name","bahubali"));
        listOfMovies.add(Map.of("id","124","name","RRR"));

        return listOfMovies;
    }

    private List<Map<String,String>> getMoviesForPhugatUsers(){
        List<Map<String,String>> listOfMovies = new ArrayList<>();
        listOfMovies.add(Map.of("id","112","name","suryavansham"));
        listOfMovies.add(Map.of("id","114","name","koi mil gaya"));

        return listOfMovies;
    }

}
