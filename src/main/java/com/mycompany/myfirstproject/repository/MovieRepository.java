package com.mycompany.myfirstproject.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class MovieRepository {

    public MovieRepository(){
        System.out.println("Initializing Movie Repository");
    }

    public List<Map<String,String>> getMoviesForSubscribedUsers(){
        List<Map<String,String>> listOfMovies = new ArrayList<>();
        listOfMovies.add(Map.of("id","123","name","bahubali"));
        listOfMovies.add(Map.of("id","124","name","RRR"));

        return listOfMovies;
    }

    public List<Map<String,String>> getMoviesForPhugatUsers(){
        List<Map<String,String>> listOfMovies = new ArrayList<>();
        listOfMovies.add(Map.of("id","112","name","suryavansham"));
        listOfMovies.add(Map.of("id","114","name","koi mil gaya"));

        return listOfMovies;
    }
}

//public ---access
//private -- withing class
//protect -- same class ya uske children
//default --- within package


//SRP


//select * from movies
//
//        select * from films
//
//
//        dbCollect.getMovies()
