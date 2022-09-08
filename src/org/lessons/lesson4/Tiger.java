package org.lessons.lesson4;

public class Tiger extends Animal{

    public Tiger() {
        super(32);
    }

    @Override
    public void makeSound() {
        System.out.println("Тигр рычит");
    }
}
