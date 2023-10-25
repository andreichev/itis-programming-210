package oop4;

public class Cat implements Pet {
    String name;
    boolean isHungry = true;

    Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        isHungry = false;
    }

    @Override
    public void voice() {
        System.out.println("MEOW");
    }
}
