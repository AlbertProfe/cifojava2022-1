package com.company;


import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {


        //I don't know the value of the fields of this person david
        //branch1
        Person david = new Person();
        Scanner reader = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();

        while (true) {
            System.out.println("Add person?");
            String isQuit = reader.next();
            if ( isQuit.equals("quit") ) break;


            System.out.println("What is your name");
            String name = reader.nextLine();
            System.out.println("What is your surnname");
            String surname = reader.nextLine();
            System.out.println("What is your age");
            int age = reader.nextInt();

            //Person newperson = new Person (name, surname, age, false);
            people.add( new Person (name, surname, age, false));


        }

        System.out.println("People size: " + people.size());
        System.out.println("People: " + people);

        Person alex = new Person("Alex", "Lopez", 25, true, new Car ("Jaguar", 1966));
        //alex.printPerson();
        System.out.println(alex);

        Car citroen = new Car ("Citroen Picasa", 2010);

        alex.sayHello();

        alex.printName();

        System.out.println("Alex age to drive: " + alex.idAdult());

        System.out.println("David age to drive: " + david.idAdult());

        david.printName();

        hello(reader);

        david.setName("David");
        david.setSurname ("Webb");
        david.setAge(25);
        david.setVegan(true);

        System.out.println( david.dogs.isEmpty() );

        david.dogs.add(new Dog("Toby"));
        //david.printPerson();
        System.out.println(david);
    }

    public static void hello (Scanner reader){
        System.out.println("Hello I am a static method");

        reader.nextLine();


    }
}
