package com.mycompany.myfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

    public string getAllMovies(){
        return "Here is your List of all Movies"
    }

}
