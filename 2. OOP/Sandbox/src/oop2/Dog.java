package oop2;

import oop1.example.Animal;

public class Dog extends Animal {
    public void print() {
        System.out.println("DOG " + name);
        System.out.println(isHungry);
    }
}
