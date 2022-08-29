package org.lessons.lesson2;

public class Lesson2 {
    public static void main(String[] args) {

/*
        int number1 = -50;
        int number2 = 10;
        boolean result = number1 == number2;

        if(result){
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers aren't equal");
        }

        if(number1 > 0){
            System.out.println("Число положительное");
        } else if (number1 == 0) {
            System.out.println("Число равно нулю");
        } else {
            System.out.println("Число отрицательное");
        }
*/

//        создание объекта (экземпляра) класса String
        String name1 = new String("Peter");
        String name2 = new String("Peter");

//в переменной name1,2 хранятся не данные созданного объекта, а адрес этого объекта. Поэтому сравнивать значения адресов не имеет смысла.
/*
        if(name1 == name2){
            System.out.println("Имена совпадают");
        } else {
            System.out.println("Имена не совпадают");
        }

        if (name1.equals(name2)){
            System.out.println("Имена " + name1 + " и " + name2 + " совпадают");
        } else {
            System.out.println("Имена " + name1 + " и " + name2 + " не совпадают");
        }
*/

        /*
        Булева логика.
        A && B - логическое умножение (логическое И). И А, и В должны быть истинны, иначе ложь.
        A || B - логическое сложение (логическое ИЛИ). Или А, или В, или А и В должны быть истинны (истинно хотя бы А или В), иначе ложь.
        !А - логическое отрицание ("не А"). Истинно, если А - ложь.
        */

        String[] cats = new String[4];

        cats[0] = "Мура";
        cats[1] = "Бетти";
        cats[2] = "Буся";
        cats[3] = "Гамма";

//Такое использование массива не зависит от количества элементов в нем - перебираются все элементы
/*
        for(String cat: cats){
            System.out.println(cat + ", иди ко мне!");
        }
*/

/*
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i] + ", твой номер в массиве " + (i + 1));
        }

//        вывести номера кошек в обратном порядке
        for (int j = (cats.length - 1); j >= 0; j--){
            System.out.println((j+1) + ". " + cats[j]);
        }
//        вывести первых имена первых 3 кошек
        for (int k = 0; k < 3; k++){
            System.out.println(cats[k]);
        }
*/

/*
        int count1 = 1;
        while (count1 <= 10){
            if(count1 > 3){
                break;
            } else {
                System.out.println(count1);
            }
            count1++;
        }
*/
//        Прерывание итерации - при значении 6 произойдет переход к проверке условия
/*
        int count2 = 1;
        while (count2 <= 10){
            if(count2 == 6){
                count2++;
                continue;
            }
            System.out.println(count2);
            count2++;
        }
*/
//        Вывести на экран все числа до 100, которые делятся нацело на 3.
/*
        int count3 = 100;
        while (count3 > 0){
            if((count3 % 3) == 0){
                System.out.println(count3);
            }
            count3--;
        }
*/
//        Вывести имена, Alex заменить на Леха, если встречается имя Peter, прекратить выполнение программы
        String[] names = {"John", /*"Peter",*/ "Paul", "Alex", "Peter", "George"};
        for (String name : names){
            if(name.equals("Alex")){
                System.out.println("Леха");
            } else if(!name.equals("Peter")){
                System.out.println(name);
            } else{
                break;
            }
        }

    }
}
