package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();

        while (true) {
            String command = ask(scanner, "Option?");
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add(scanner,db);
            } else if (command.equals("Observation")) {
                observation(scanner,db);
            } else if (command.equals("Show")) {
                show(scanner,db);
            } else if (command.equals("Statistics")) {
                statistics(scanner,db);
            } else {
                System.out.println("Unknown command!");
            }
        }
    }

    public static String ask(Scanner input, String option) {
        return null;
    }

    public static void add(Scanner input, BirdDatabase db) {

    }

    public static void observation(Scanner input, BirdDatabase db) {

    }

    public static void show(Scanner input, BirdDatabase db) {

    }

    public static void statistics(Scanner input, BirdDatabase db) {

    }

}