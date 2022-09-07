package org.lessons.lesson3;

public class Cat {
    private boolean isMale;

    public Cat (boolean isMale){
        this.isMale = isMale;
    }

    public void sayMeow(){
        if(isMale){
        System.out.println("Кот мяукает");
        }else {
            System.out.println("Кошка мяукает");
        }
    }
}
