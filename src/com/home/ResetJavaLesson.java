package com.home;

import java.util.ArrayList;

public class ResetJavaLesson {

    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList();

        Movie m1 = new Movie("肖申克的救赎","2012","marta");
        Movie m2 = new Movie("爱与往事","2022","durbot");
        Movie m3 = new Movie("被风吹过的秋天","2009","waste");

        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);

        Movie m = getMovieByYear(movieList,"2000");
        if(m == null) {
            System.out.println("null");
        } else {
            System.out.println(m.getName());
        }

    }

    public static Movie getMovieByYear(ArrayList<Movie> movies, String movieYear) {
        for (int i = 0; i < movies.size(); i++) {
            Movie m = movies.get(i);
            if(m.getYear().equals(movieYear)) {
                return m;
            }
        }

        return null;
    }


}
