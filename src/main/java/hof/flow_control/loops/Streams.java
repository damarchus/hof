package main.java.hof.flow_control.loops;

import java.util.Arrays;

public class Streams {

    public static void main(String[] args) {
//        Arrays.stream(args).forEach(System.out::println);


        Arrays.stream(args)
                .filter(arg -> arg.length() < 4)
                .distinct()
                .map(arg -> "parameter " + arg + " is awesome")
                .sorted()
                .forEach(System.out::println);
    }

}