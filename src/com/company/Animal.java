package com.company;

import java.io.File;

public class Animal
{
    String name;
    final String species;
    private Double weight = 7.5;
    File pic;

    static final Double Default_dog_weight;

    static {
        Default_dog_weight = 8.0;
    }

    public Animal(String species) {
        this.species = species;
        if(species =="dog"){
            this.weight = 8.0;}
            else if (species == "lion"){
                this.weight = 190.0;}
                else if (species =="mouse") {
                    this.weight = 0.05;
                }


    }

    void feed()
    {
        weight++;
        System.out.println("thx for food bro, my weight is now" + weight);
    }

}
