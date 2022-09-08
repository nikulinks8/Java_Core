package org.lessons.lesson4;

public class Birch extends DeciduousTree {
    public Birch(int height, boolean hasleaf) {
        super(height, hasleaf);
    }

    public void makeSound () {
        System.out.println("Березка шумит листьями");
    }
}
