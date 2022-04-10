package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FindByMap implements FindAble{

    @Override
    public void findMoviesByActor(List<Movies> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter actor's name: ");
        String inputName = scanner.nextLine();
        JsonIO.getMovies().stream().
    }

    @Override
    public void findMoviesByDirector(List<Movies> movies) {
        JsonIO.getMovies().stream().sorted(Comparator.comparing(x -> x.getDirector().getFullName())).forEach(System.out::println);
    }

    @Override
    public void findMoviesByYear(List<Movies> movies, int name) {
        JsonIO.getMovies().stream().filter(x -> x.getYear() == name).forEach(System.out::println);
    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter actor's name: ");
        String inputName = scanner.nextLine();
        JsonIO.getMovies().stream().filter(x -> x.getName().contains(inputName)).forEach(System.out::println);
    }

    @Override
    public void showActorRoles(List<Movies> movies) {

    }
}
