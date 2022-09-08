package org.lessons.lesson4;

public class Horse extends Animal{

    public Horse() {
        super(24);
    }

//    ctrl+i - добавить реализацию метода (implementation)
//    или alt+ins - добавить override
    @Override
    public void makeSound() {
        System.out.println("Лошадь ржет");
    }
}
