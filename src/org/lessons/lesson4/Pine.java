package org.lessons.lesson4;

public class Pine extends ConiferousTree {
    public Pine(int height) {
        super(height);
    }

    public void makeSound() {
        System.out.println("Сосна, раскачиваясь, скрипит");
    }
}
