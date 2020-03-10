package com.company;

public class Main {

    public static void main(String[] args)
    {
        Animal dog = new Animal("dog");
        dog.name = "Akita";

        Animal lion = new Animal("lion");
        lion.name = "leo";

        dog.feed();

        Human me = new Human();
        me.firstName = "Michal";
        me.lastName = "Sak";
        me.pet = dog;

        me.pet.feed();


        System.out.println(me.pet.name);


    }
}
