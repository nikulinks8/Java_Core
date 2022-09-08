package org.lessons.lesson4;

public abstract class Animal {
    private int teethCount;

//    Alt + Insert – автогенерация всего и вся, методов, конструкторов, классов
    public Animal(int teethCount) {
        this.teethCount = teethCount;
    }

    public int getTeethCount() {
        return teethCount;
    }
// abstract значит, что этот метод не имеет реализации в классе, но должен быть реализован во всех наследующих классах
    public abstract void makeSound();
}
