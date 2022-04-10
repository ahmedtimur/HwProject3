package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Movies> movies = JsonIO.getMovies();
    private static final SortAble SORT_ABLE =  new MovieStore();
    private static final FindAble FIND_ABLE =  new FindByMap();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws InputException {

        SORT_ABLE.printAllMovies(movies);

        while (true) {
            commands();
            int inputNumbers = SCANNER.nextInt();
            if (inputNumbers == 1) {
                System.out.println("Printing all movies...");
                System.out.println();
                SORT_ABLE.printAllMovies(movies);
            }
            else if (inputNumbers == 2) {
                System.out.println("Printing all matched movies...");
                System.out.println();
                SORT_ABLE.findMovie(movies);
            }
            else if (inputNumbers == 3) {
                System.out.println("Printing all sorted by year movies...");
                System.out.println();
                SORT_ABLE.sortByYear(movies);
            }
            else if(inputNumbers == 4) {
                System.out.println("Printing all sorted by name movies...");
                System.out.println();
                SORT_ABLE.sortByName(movies);
            }
            else if(inputNumbers == 5) {
                System.out.println("Printing all sorted by director movies...");
                System.out.println();
                SORT_ABLE.sortByDirector(movies);
            }
            else if(inputNumbers == 6) {
                FIND_ABLE.findMoviesByActor(movies);
                System.out.println("Printing all sorted by actor's name movies...");
                System.out.println();
            }
            else if(inputNumbers == 7) {
                System.out.println("Printing all sorted by director's name movies...");
                System.out.println();
                FIND_ABLE.findMoviesByDirector(movies);
            }
            else if(inputNumbers == 8) {
                System.out.print("Write year ");
                int a = 0;
                try {
                    String b = SCANNER.next();
                    a = Integer.parseInt(b);
                } catch (Exception e) {
                    System.out.println("Wrong, try again");
                    e.printStackTrace();
                }

                System.out.println("Printing " + a + " year's movie...");
                System.out.println();
                FIND_ABLE.findMoviesByYear(movies, a);
            }
            else if(inputNumbers == 9) {
                FIND_ABLE.findMoviesAndRoleByActor(movies);
                System.out.println("Printing all sorted by actor's name movies and roles...");

            }
        }
    }

    static void commands() {
        System.out.println("--------------Commands-----------------------");
        System.out.println("Press 1 to print catalog");
        System.out.println("Press 2 to Find a Movie by full or part name");
        System.out.println("Press 3 to sort by year");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by director");
        System.out.println("Press 6 to find movies by actor's name");
        System.out.println("Press 7 to find movies by director's name");
        System.out.println("Press 8 to find movies by year");
        System.out.println("Press 9 to List all movies and roles by actor's name");
        System.out.println("Press 10 to sorted List of all actors with his roles");
        System.out.println("To quit press 0");
        System.out.println("---------------------------------------------");
    }

//    static int getInt() {
//        System.out.print("Write year ");
//        int a = 0;
//        try {
//            String b = SCANNER.next();
//            a = Integer.parseInt(b);
//        } catch (Exception e) {
//            System.out.println("Wrong, try again");
//            e.printStackTrace();
//        }
//        return a;
//    }
}
