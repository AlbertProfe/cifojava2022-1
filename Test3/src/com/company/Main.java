package com.company;


public class Main {

    public static void main(String[] args) {

        hello();
        //I dont know the value of the fields of this person david
        Person david = new Person();

        Person alex = new Person("Alex", "Lopez", 25, true, new Car ("Jaguar", 1966));
        //alex.printPerson();

        Car citroen = new Car ("Citroen Picassa", 2010);

        david.setCar(citroen);

        System.out.println("Person: " + david);

        alex.sayHello();

        alex.printName();

        System.out.println("Alex age to drive: " + alex.idAdult());

        System.out.println("David age to drive: " + david.idAdult());

        david.printName();

        hello();

        david.setName("David");
        david.setSurname ("Webb");
        david.setAge(25);
        david.setVegan(true);

        System.out.println( david.dogs.isEmpty() );

        david.dogs.add(new Dog("Toby"));
        //david.printPerson();
    }

    public static void hello (){
        System.out.println("Hello I am a static method");
    }
}
