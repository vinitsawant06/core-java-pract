package com.java8features.durga.ConsumerMovieInof;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieImpl {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        populate(movies);
        Consumer<Movie> movieConsumer = movie -> {
            System.out.println("Movie is: "+movie.movieName);
            System.out.println("Actor is: "+movie.actor);
            System.out.println("Actress is:"+movie.actress);
        };
        for(Movie movie: movies) {
            movieConsumer.accept(movie);
        }
    }
    public static void populate(ArrayList<Movie> movies) {
        movies.add(addMovie("Dunkirk", "Harry Styles", "Jennifer"));
        movies.add(addMovie("Inception", "Leonardo", "Winglet"));
        movies.add(addMovie("Dark Knight", "Christian Bale", "Robin"));
    }
    public static Movie addMovie(String movieName, String actor, String actress) {
        return new Movie(movieName, actor, actress);
    }
}
