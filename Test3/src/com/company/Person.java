package com.company;

import java.util.ArrayList;


public class Person {

    //here we write our attributes
    String name;
    String surname;
    int age;
    boolean vegan;
    Car car;
    ArrayList<Dog> dogs =  new ArrayList<Dog>();

    public Person (){}

    //constructor
    public Person (String name, String surname, int age, boolean vegan, Car car) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.vegan = vegan;
        this.car = car;
    }
    public Person (String name, String surname, int age, boolean vegan) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.vegan = vegan;

    }

    //methods non-static
    public boolean idAdult (){

        boolean isAdult = false;
        if ( this.age > 18 ) isAdult = true;

        // clean code
        //boolean isAdult = this.age > 18;

        return isAdult;
    }

    public String sayHello(){
        return "Hello";
    }

    public String sayHelloPerson(){
        return "Hello " + this.name;
    }

    public void printName () {
        System.out.println("This person's name is: " + " "  + this.name  + " "  + this.surname);
        Main.hello();
    }

    public void printPerson (){
        System.out.println( this.getName() + " " + this.getSurname() + " "
                + this.car.make + " " + this.car.year + " " +  this.dogs.get(0).getName()) ;

    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname (){
        return this.surname;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public boolean getVegan (){
        return this.vegan;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge (){
        return this.age;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
