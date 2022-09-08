package org.lessons.lesson4;

public class Lesson4 {
    public static void main(String[] args) {
//        ctrl+alt+v - introduce local variable (press after new Animal("Тигр");)
        Horse horse = new Horse();
        System.out.println(horse.getTeethCount());
        Tiger tiger = new Tiger();
        System.out.println(tiger.getTeethCount());
        horse.makeSound();
        tiger.makeSound();

        Birch birch = new Birch(20, true);
        Pine pine = new Pine(30);

        birch.makeSound();
        pine.makeSound();

    }
}
