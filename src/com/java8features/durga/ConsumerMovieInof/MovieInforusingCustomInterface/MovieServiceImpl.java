package com.java8features.durga.ConsumerMovieInof.MovieInforusingCustomInterface;

import java.util.ArrayList;

public class MovieServiceImpl {
    public static void main(String[] args) {
        ArrayList<MovieCustom> movies = new ArrayList<>();
        populate(movies);
        MovieService movieService = movieCustom -> {
            System.out.println("Name of movie: "+movieCustom.movieName);
            System.out.println("Name of actor: "+movieCustom.actor);
            System.out.println("Name of actress: "+movieCustom.actress);
        };
        for(MovieCustom movie:movies) {
            movieService.movieInfo(movie);
        }
    }
    public static void populate(ArrayList<MovieCustom> movies) {
        movies.add(addMovie("dunkirk", "Harry Styles", "Jeniffer"));
        movies.add(addMovie("Inception", "Leonardo", "Wiglet"));
        movies.add(addMovie("Dark Knight", "Christian Bale", "Robin"));
    }
    public static MovieCustom addMovie(String movieName, String actor, String actress) {
        return new MovieCustom(movieName, actor, actress);
    }
}
